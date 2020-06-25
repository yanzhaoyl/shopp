package com.yanzhaoyl.shopp.common.service;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class SpasMd5Js {
	public static String run(String pass) {
		// java 中调用 js 脚本
		ScriptEngineManager manager = new ScriptEngineManager();
		ScriptEngine engine = manager.getEngineByName("JavaScript");
		String scriptContent = "/**\r\n" + " * 对文本进行MD5加密js脚本\r\n" + " */\r\n" + " \r\n"
				+ "var hexcase = 0; /* hex output format. 0 - lowercase; 1 - uppercase */\r\n"
				+ "var b64pad = \"\"; /* base-64 pad character. \"=\" for strict RFC compliance */\r\n"
				+ "var chrsz = 8; /* bits per input character. 8 - ASCII; 16 - Unicode */\r\n" + "/*\r\n"
				+ "* These are the functions you'll usually want to call\r\n"
				+ "* They take string arguments and return either hex or base-64 encoded strings\r\n" + "*/\r\n"
				+ "function hex_md5(s){ return binl2hex(core_md5(str2binl(s), s.length * chrsz));}\r\n"
				+ "function b64_md5(s){ return binl2b64(core_md5(str2binl(s), s.length * chrsz));}\r\n"
				+ "function hex_hmac_md5(key, data) { return binl2hex(core_hmac_md5(key, data)); }\r\n"
				+ "function b64_hmac_md5(key, data) { return binl2b64(core_hmac_md5(key, data)); }\r\n"
				+ "/* Backwards compatibility - same as hex_md5() */\r\n"
				+ "function calcMD5(s){ return binl2hex(core_md5(str2binl(s), s.length * chrsz));}\r\n" + "/*\r\n"
				+ "* Perform a simple self-test to see if the VM is working\r\n" + "*/\r\n"
				+ "function md5_vm_test()\r\n" + "{\r\n"
				+ "    return hex_md5(\"abc\") == \"900150983cd24fb0d6963f7d28e17f72\";\r\n" + "}\r\n" + "/*\r\n"
				+ "* Calculate the MD5 of an array of little-endian words, and a bit length\r\n" + "*/\r\n"
				+ "function core_md5(x, len)\r\n" + "{\r\n" + "    /* append padding */\r\n"
				+ "    x[len >> 5] |= 0x80 << ((len) % 32);\r\n" + "    x[(((len + 64) >>> 9) << 4) + 14] = len;\r\n"
				+ "    var a = 1732584193;\r\n" + "    var b = -271733879;\r\n" + "    var c = -1732584194;\r\n"
				+ "    var d = 271733878;\r\n" + "    for(var i = 0; i < x.length; i += 16)\r\n" + "    {\r\n"
				+ "        var olda = a;\r\n" + "        var oldb = b;\r\n" + "        var oldc = c;\r\n"
				+ "        var oldd = d;\r\n" + "        a = md5_ff(a, b, c, d, x[i+ 0], 7 , -680876936);\r\n"
				+ "        d = md5_ff(d, a, b, c, x[i+ 1], 12, -389564586);\r\n"
				+ "        c = md5_ff(c, d, a, b, x[i+ 2], 17, 606105819);\r\n"
				+ "        b = md5_ff(b, c, d, a, x[i+ 3], 22, -1044525330);\r\n"
				+ "        a = md5_ff(a, b, c, d, x[i+ 4], 7 , -176418897);\r\n"
				+ "        d = md5_ff(d, a, b, c, x[i+ 5], 12, 1200080426);\r\n"
				+ "        c = md5_ff(c, d, a, b, x[i+ 6], 17, -1473231341);\r\n"
				+ "        b = md5_ff(b, c, d, a, x[i+ 7], 22, -45705983);\r\n"
				+ "        a = md5_ff(a, b, c, d, x[i+ 8], 7 , 1770035416);\r\n"
				+ "        d = md5_ff(d, a, b, c, x[i+ 9], 12, -1958414417);\r\n"
				+ "        c = md5_ff(c, d, a, b, x[i+10], 17, -42063);\r\n"
				+ "        b = md5_ff(b, c, d, a, x[i+11], 22, -1990404162);\r\n"
				+ "        a = md5_ff(a, b, c, d, x[i+12], 7 , 1804603682);\r\n"
				+ "        d = md5_ff(d, a, b, c, x[i+13], 12, -40341101);\r\n"
				+ "        c = md5_ff(c, d, a, b, x[i+14], 17, -1502002290);\r\n"
				+ "        b = md5_ff(b, c, d, a, x[i+15], 22, 1236535329);\r\n"
				+ "        a = md5_gg(a, b, c, d, x[i+ 1], 5 , -165796510);\r\n"
				+ "        d = md5_gg(d, a, b, c, x[i+ 6], 9 , -1069501632);\r\n"
				+ "        c = md5_gg(c, d, a, b, x[i+11], 14, 643717713);\r\n"
				+ "        b = md5_gg(b, c, d, a, x[i+ 0], 20, -373897302);\r\n"
				+ "        a = md5_gg(a, b, c, d, x[i+ 5], 5 , -701558691);\r\n"
				+ "        d = md5_gg(d, a, b, c, x[i+10], 9 , 38016083);\r\n"
				+ "        c = md5_gg(c, d, a, b, x[i+15], 14, -660478335);\r\n"
				+ "        b = md5_gg(b, c, d, a, x[i+ 4], 20, -405537848);\r\n"
				+ "        a = md5_gg(a, b, c, d, x[i+ 9], 5 , 568446438);\r\n"
				+ "        d = md5_gg(d, a, b, c, x[i+14], 9 , -1019803690);\r\n"
				+ "        c = md5_gg(c, d, a, b, x[i+ 3], 14, -187363961);\r\n"
				+ "        b = md5_gg(b, c, d, a, x[i+ 8], 20, 1163531501);\r\n"
				+ "        a = md5_gg(a, b, c, d, x[i+13], 5 , -1444681467);\r\n"
				+ "        d = md5_gg(d, a, b, c, x[i+ 2], 9 , -51403784);\r\n"
				+ "        c = md5_gg(c, d, a, b, x[i+ 7], 14, 1735328473);\r\n"
				+ "        b = md5_gg(b, c, d, a, x[i+12], 20, -1926607734);\r\n"
				+ "        a = md5_hh(a, b, c, d, x[i+ 5], 4 , -378558);\r\n"
				+ "        d = md5_hh(d, a, b, c, x[i+ 8], 11, -2022574463);\r\n"
				+ "        c = md5_hh(c, d, a, b, x[i+11], 16, 1839030562);\r\n"
				+ "        b = md5_hh(b, c, d, a, x[i+14], 23, -35309556);\r\n"
				+ "        a = md5_hh(a, b, c, d, x[i+ 1], 4 , -1530992060);\r\n"
				+ "        d = md5_hh(d, a, b, c, x[i+ 4], 11, 1272893353);\r\n"
				+ "        c = md5_hh(c, d, a, b, x[i+ 7], 16, -155497632);\r\n"
				+ "        b = md5_hh(b, c, d, a, x[i+10], 23, -1094730640);\r\n"
				+ "        a = md5_hh(a, b, c, d, x[i+13], 4 , 681279174);\r\n"
				+ "        d = md5_hh(d, a, b, c, x[i+ 0], 11, -358537222);\r\n"
				+ "        c = md5_hh(c, d, a, b, x[i+ 3], 16, -722521979);\r\n"
				+ "        b = md5_hh(b, c, d, a, x[i+ 6], 23, 76029189);\r\n"
				+ "        a = md5_hh(a, b, c, d, x[i+ 9], 4 , -640364487);\r\n"
				+ "        d = md5_hh(d, a, b, c, x[i+12], 11, -421815835);\r\n"
				+ "        c = md5_hh(c, d, a, b, x[i+15], 16, 530742520);\r\n"
				+ "        b = md5_hh(b, c, d, a, x[i+ 2], 23, -995338651);\r\n"
				+ "        a = md5_ii(a, b, c, d, x[i+ 0], 6 , -198630844);\r\n"
				+ "        d = md5_ii(d, a, b, c, x[i+ 7], 10, 1126891415);\r\n"
				+ "        c = md5_ii(c, d, a, b, x[i+14], 15, -1416354905);\r\n"
				+ "        b = md5_ii(b, c, d, a, x[i+ 5], 21, -57434055);\r\n"
				+ "        a = md5_ii(a, b, c, d, x[i+12], 6 , 1700485571);\r\n"
				+ "        d = md5_ii(d, a, b, c, x[i+ 3], 10, -1894986606);\r\n"
				+ "        c = md5_ii(c, d, a, b, x[i+10], 15, -1051523);\r\n"
				+ "        b = md5_ii(b, c, d, a, x[i+ 1], 21, -2054922799);\r\n"
				+ "        a = md5_ii(a, b, c, d, x[i+ 8], 6 , 1873313359);\r\n"
				+ "        d = md5_ii(d, a, b, c, x[i+15], 10, -30611744);\r\n"
				+ "        c = md5_ii(c, d, a, b, x[i+ 6], 15, -1560198380);\r\n"
				+ "        b = md5_ii(b, c, d, a, x[i+13], 21, 1309151649);\r\n"
				+ "        a = md5_ii(a, b, c, d, x[i+ 4], 6 , -145523070);\r\n"
				+ "        d = md5_ii(d, a, b, c, x[i+11], 10, -1120210379);\r\n"
				+ "        c = md5_ii(c, d, a, b, x[i+ 2], 15, 718787259);\r\n"
				+ "        b = md5_ii(b, c, d, a, x[i+ 9], 21, -343485551);\r\n" + "        a = safe_add(a, olda);\r\n"
				+ "        b = safe_add(b, oldb);\r\n" + "        c = safe_add(c, oldc);\r\n"
				+ "        d = safe_add(d, oldd);\r\n" + "    }\r\n" + "    return Array(a, b, c, d);\r\n" + "}\r\n"
				+ "/*\r\n" + "* These functions implement the four basic operations the algorithm uses.\r\n" + "*/\r\n"
				+ "function md5_cmn(q, a, b, x, s, t)\r\n" + "{\r\n"
				+ "    return safe_add(bit_rol(safe_add(safe_add(a, q), safe_add(x, t)), s),b);\r\n" + "}\r\n"
				+ "function md5_ff(a, b, c, d, x, s, t)\r\n" + "{\r\n"
				+ "    return md5_cmn((b & c) | ((~b) & d), a, b, x, s, t);\r\n" + "}\r\n"
				+ "function md5_gg(a, b, c, d, x, s, t)\r\n" + "{\r\n"
				+ "    return md5_cmn((b & d) | (c & (~d)), a, b, x, s, t);\r\n" + "}\r\n"
				+ "function md5_hh(a, b, c, d, x, s, t)\r\n" + "{\r\n"
				+ "    return md5_cmn(b ^ c ^ d, a, b, x, s, t);\r\n" + "}\r\n"
				+ "function md5_ii(a, b, c, d, x, s, t)\r\n" + "{\r\n"
				+ "    return md5_cmn(c ^ (b | (~d)), a, b, x, s, t);\r\n" + "}\r\n" + "/*\r\n"
				+ "* Calculate the HMAC-MD5, of a key and some data\r\n" + "*/\r\n"
				+ "function core_hmac_md5(key, data)\r\n" + "{\r\n" + "    var bkey = str2binl(key);\r\n"
				+ "    if(bkey.length > 16) bkey = core_md5(bkey, key.length * chrsz);\r\n"
				+ "    var ipad = Array(16), opad = Array(16);\r\n" + "    for(var i = 0; i < 16; i++)\r\n"
				+ "    {\r\n" + "        ipad[i] = bkey[i] ^ 0x36363636;\r\n"
				+ "        opad[i] = bkey[i] ^ 0x5C5C5C5C;\r\n" + "    }\r\n"
				+ "    var hash = core_md5(ipad.concat(str2binl(data)), 512 + data.length * chrsz);\r\n"
				+ "    return core_md5(opad.concat(hash), 512 + 128);\r\n" + "}\r\n" + "/*\r\n"
				+ "* Add integers, wrapping at 2^32. This uses 16-bit operations internally\r\n"
				+ "* to work around bugs in some JS interpreters.\r\n" + "*/\r\n" + "function safe_add(x, y)\r\n"
				+ "{\r\n" + "    var lsw = (x & 0xFFFF) + (y & 0xFFFF);\r\n"
				+ "    var msw = (x >> 16) + (y >> 16) + (lsw >> 16);\r\n"
				+ "    return (msw << 16) | (lsw & 0xFFFF);\r\n" + "}\r\n" + "/*\r\n"
				+ "* Bitwise rotate a 32-bit number to the left.\r\n" + "*/\r\n" + "function bit_rol(num, cnt)\r\n"
				+ "{\r\n" + "    return (num << cnt) | (num >>> (32 - cnt));\r\n" + "}\r\n" + "/*\r\n"
				+ "* Convert a string to an array of little-endian words\r\n"
				+ "* If chrsz is ASCII, characters >255 have their hi-byte silently ignored.\r\n" + "*/\r\n"
				+ "function str2binl(str)\r\n" + "{\r\n" + "    var bin = Array();\r\n"
				+ "    var mask = (1 << chrsz) - 1;\r\n" + "    for(var i = 0; i < str.length * chrsz; i += chrsz)\r\n"
				+ "    bin[i>>5] |= (str.charCodeAt(i / chrsz) & mask) << (i%32);\r\n" + "    return bin;\r\n" + "}\r\n"
				+ "/*\r\n" + "* Convert an array of little-endian words to a hex string.\r\n" + "*/\r\n"
				+ "function binl2hex(binarray)\r\n" + "{\r\n"
				+ "    var hex_tab = hexcase ? \"0123456789ABCDEF\" : \"0123456789abcdef\";\r\n"
				+ "    var str = \"\";\r\n" + "    for(var i = 0; i < binarray.length * 4; i++)\r\n" + "    {\r\n"
				+ "        str += hex_tab.charAt((binarray[i>>2] >> ((i%4)*8+4)) & 0xF) +\r\n"
				+ "        hex_tab.charAt((binarray[i>>2] >> ((i%4)*8 )) & 0xF);\r\n" + "    }\r\n"
				+ "    return str;\r\n" + "}\r\n" + "/*\r\n"
				+ "* Convert an array of little-endian words to a base-64 string\r\n" + "*/\r\n"
				+ "function binl2b64(binarray)\r\n" + "{\r\n"
				+ "    var tab = \"ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/\";\r\n"
				+ "    var str = \"\";\r\n" + "    for(var i = 0; i < binarray.length * 4; i += 3)\r\n" + "    {\r\n"
				+ "        var triplet = (((binarray[i >> 2] >> 8 * ( i %4)) & 0xFF) << 16)\r\n"
				+ "        | (((binarray[i+1 >> 2] >> 8 * ((i+1)%4)) & 0xFF) << 8 )\r\n"
				+ "        | ((binarray[i+2 >> 2] >> 8 * ((i+2)%4)) & 0xFF);\r\n"
				+ "        for(var j = 0; j < 4; j++)\r\n" + "        {\r\n"
				+ "            if(i * 8 + j * 6 > binarray.length * 32) str += b64pad;\r\n"
				+ "            else str += tab.charAt((triplet >> 6*(3-j)) & 0x3F);\r\n" + "        }\r\n" + "    }\r\n"
				+ "    return str;\r\n" + "}";

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
			invokeFunction = invocable.invokeFunction("hex_md5", pass).toString();
		} catch (NoSuchMethodException | ScriptException e) {
			e.printStackTrace();
		}
		return invokeFunction;

	}
}
