package com.yanzhaoyl.shopp.common.service;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class SpasBase64Js {
	public static String run(String str) {
		// java 中调用 js 脚本
		ScriptEngineManager manager = new ScriptEngineManager();
		ScriptEngine engine = manager.getEngineByName("JavaScript");
		String scriptContent = "var base64EncodeChars = \"ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/\";\r\n" + 
				"var base64DecodeChars = new Array(\r\n" + 
				"     -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,\r\n" + 
				"     -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,\r\n" + 
				"     -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63,\r\n" + 
				"     52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1,\r\n" + 
				"     -1,   0,   1,   2,   3,   4,   5,   6,   7,   8,   9, 10, 11, 12, 13, 14,\r\n" + 
				"     15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1,\r\n" + 
				"     -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40,\r\n" + 
				"     41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1);\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"function utf16to8(str) {\r\n" + 
				"     var out, i, len, c;\r\n" + 
				"\r\n" + 
				"     out = \"\";\r\n" + 
				"     len = str.length;\r\n" + 
				"     for(i = 0; i < len; i++) {\r\n" + 
				"         c = str.charCodeAt(i);\r\n" + 
				"         if ((c >= 0x0001) && (c <= 0x007F)) {\r\n" + 
				"             out += str.charAt(i);\r\n" + 
				"         } else if (c > 0x07FF) {\r\n" + 
				"             out += String.fromCharCode(0xE0 | ((c >> 12) & 0x0F));\r\n" + 
				"             out += String.fromCharCode(0x80 | ((c >>   6) & 0x3F));\r\n" + 
				"             out += String.fromCharCode(0x80 | ((c >>   0) & 0x3F));\r\n" + 
				"         } else {\r\n" + 
				"             out += String.fromCharCode(0xC0 | ((c >>   6) & 0x1F));\r\n" + 
				"             out += String.fromCharCode(0x80 | ((c >>   0) & 0x3F));\r\n" + 
				"         }\r\n" + 
				"     }\r\n" + 
				"     return out;\r\n" + 
				"}\r\n" + 
				"\r\n" + 
				"function utf8to16(str) {\r\n" + 
				"     var out, i, len, c;\r\n" + 
				"     var char2, char3;\r\n" + 
				"\r\n" + 
				"     out = \"\";\r\n" + 
				"     len = str.length;\r\n" + 
				"     i = 0;\r\n" + 
				"     while(i < len) {\r\n" + 
				"         c = str.charCodeAt(i++);\r\n" + 
				"         switch(c >> 4)\r\n" + 
				"         { \r\n" + 
				"           case 0: case 1: case 2: case 3: case 4: case 5: case 6: case 7:\r\n" + 
				"             // 0xxxxxxx\r\n" + 
				"             out += str.charAt(i-1);\r\n" + 
				"             break;\r\n" + 
				"           case 12: case 13:\r\n" + 
				"             // 110x xxxx    10xx xxxx\r\n" + 
				"             char2 = str.charCodeAt(i++);\r\n" + 
				"             out += String.fromCharCode(((c & 0x1F) << 6) | (char2 & 0x3F));\r\n" + 
				"             break;\r\n" + 
				"           case 14:\r\n" + 
				"             // 1110 xxxx   10xx xxxx   10xx xxxx\r\n" + 
				"             char2 = str.charCodeAt(i++);\r\n" + 
				"             char3 = str.charCodeAt(i++);\r\n" + 
				"             out += String.fromCharCode(((c & 0x0F) << 12) |\r\n" + 
				"                                            ((char2 & 0x3F) << 6) |\r\n" + 
				"                                            ((char3 & 0x3F) << 0));\r\n" + 
				"             break;\r\n" + 
				"         }\r\n" + 
				"     }\r\n" + 
				"\r\n" + 
				"     return out;\r\n" + 
				"}\r\n" + 
				"\r\n" + 
				"function base64encode(str) {\r\n" + 
				"     var out, i, len;\r\n" + 
				"     var c1, c2, c3;\r\n" + 
				"\r\n" + 
				"     len = str.length;\r\n" + 
				"     i = 0;\r\n" + 
				"     out = \"\";\r\n" + 
				"     while(i < len) {\r\n" + 
				"         c1 = str.charCodeAt(i++) & 0xff;\r\n" + 
				"         if(i == len)\r\n" + 
				"         {\r\n" + 
				"             out += base64EncodeChars.charAt(c1 >> 2);\r\n" + 
				"             out += base64EncodeChars.charAt((c1 & 0x3) << 4);\r\n" + 
				"             out += \"==\";\r\n" + 
				"             break;\r\n" + 
				"         }\r\n" + 
				"         c2 = str.charCodeAt(i++);\r\n" + 
				"         if(i == len)\r\n" + 
				"         {\r\n" + 
				"             out += base64EncodeChars.charAt(c1 >> 2);\r\n" + 
				"             out += base64EncodeChars.charAt(((c1 & 0x3)<< 4) | ((c2 & 0xF0) >> 4));\r\n" + 
				"             out += base64EncodeChars.charAt((c2 & 0xF) << 2);\r\n" + 
				"             out += \"=\";\r\n" + 
				"             break;\r\n" + 
				"         }\r\n" + 
				"         c3 = str.charCodeAt(i++);\r\n" + 
				"         out += base64EncodeChars.charAt(c1 >> 2);\r\n" + 
				"         out += base64EncodeChars.charAt(((c1 & 0x3)<< 4) | ((c2 & 0xF0) >> 4));\r\n" + 
				"         out += base64EncodeChars.charAt(((c2 & 0xF) << 2) | ((c3 & 0xC0) >>6));\r\n" + 
				"         out += base64EncodeChars.charAt(c3 & 0x3F);\r\n" + 
				"     }\r\n" + 
				"     return out;\r\n" + 
				"}\r\n" + 
				"\r\n" + 
				"function base64decode(str) {\r\n" + 
				"     var c1, c2, c3, c4;\r\n" + 
				"     var i, len, out;\r\n" + 
				"\r\n" + 
				"     len = str.length;\r\n" + 
				"     i = 0;\r\n" + 
				"     out = \"\";\r\n" + 
				"     while(i < len) {\r\n" + 
				"         /* c1 */\r\n" + 
				"         do {\r\n" + 
				"             c1 = base64DecodeChars[str.charCodeAt(i++) & 0xff];\r\n" + 
				"         } while(i < len && c1 == -1);\r\n" + 
				"         if(c1 == -1)\r\n" + 
				"             break;\r\n" + 
				"\r\n" + 
				"         /* c2 */\r\n" + 
				"         do {\r\n" + 
				"             c2 = base64DecodeChars[str.charCodeAt(i++) & 0xff];\r\n" + 
				"         } while(i < len && c2 == -1);\r\n" + 
				"         if(c2 == -1)\r\n" + 
				"             break;\r\n" + 
				"\r\n" + 
				"         out += String.fromCharCode((c1 << 2) | ((c2 & 0x30) >> 4));\r\n" + 
				"\r\n" + 
				"         /* c3 */\r\n" + 
				"         do {\r\n" + 
				"             c3 = str.charCodeAt(i++) & 0xff;\r\n" + 
				"             if(c3 == 61)\r\n" + 
				"                 return out;\r\n" + 
				"             c3 = base64DecodeChars[c3];\r\n" + 
				"         } while(i < len && c3 == -1);\r\n" + 
				"         if(c3 == -1)\r\n" + 
				"             break;\r\n" + 
				"\r\n" + 
				"         out += String.fromCharCode(((c2 & 0XF) << 4) | ((c3 & 0x3C) >> 2));\r\n" + 
				"\r\n" + 
				"         /* c4 */\r\n" + 
				"         do {\r\n" + 
				"             c4 = str.charCodeAt(i++) & 0xff;\r\n" + 
				"             if(c4 == 61)\r\n" + 
				"                 return out;\r\n" + 
				"             c4 = base64DecodeChars[c4];\r\n" + 
				"         } while(i < len && c4 == -1);\r\n" + 
				"         if(c4 == -1)\r\n" + 
				"             break;\r\n" + 
				"         out += String.fromCharCode(((c3 & 0x03) << 6) | c4);\r\n" + 
				"     }\r\n" + 
				"     return out;\r\n" + 
				"}";
		try {
			// 注册脚本
			engine.eval(scriptContent);
		} catch (ScriptException e) {
			e.printStackTrace();
		}
		Invocable invocable = (Invocable) engine;

		String invokeFunction = null;
		try {
			// 调用注册函数 invokeFunction() 第一个参数是调用函数的名称，其它参数是该函数需要传入的参数列表
			invokeFunction = invocable.invokeFunction("base64encode", str).toString();
		} catch (NoSuchMethodException | ScriptException e) {
			e.printStackTrace();
		}
		return invokeFunction;

	}
}
