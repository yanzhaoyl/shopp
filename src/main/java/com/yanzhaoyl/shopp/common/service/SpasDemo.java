package com.yanzhaoyl.shopp.common.service;

import java.util.HashMap;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.yanzhaoyl.shopp.common.pojo.HttpClientResult;
import com.yanzhaoyl.shopp.common.util.HttpClientUtils;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SpasDemo {
	public static void main(String[] args) {

		// 用户密码
		String userName = "刘佳伟";
		String passWord = "ljw6683";
		String url_host = "https://spas.ncs-cyber.com.cn:9898";

		// 请求头
		Map<String, String> headers = new HashMap<String, String>();

		// 请求参数
		Map<String, String> params = new HashMap<String, String>();
		
		// 响应结果
		HttpClientResult result;

		headers.put("Referer", "https://spas.ncs-cyber.com.cn:9898/login.jsp");

		try {
			result = HttpClientUtils.doPost(url_host + "/login/getRandomStr", headers, null);

			//删除无用的 请求头内容
//			headers.remove("Referer");
			
			String cookie = result.getParams().get("Set-Cookie");
			if (result.getParams().get("Set-Cookie") != null) {
				headers.put("Cookie", cookie);
			}

			// 解析响应结果 获取 盐值
			String salt = JSON.parseObject(JSON.parseObject(result.getContent()).getString("result"))
					.getString("randomStr");
			// 密码 md5 加密 后,加上 盐值 , 进行Base64 转码
			String encode_pass = SpasBase64Js.run(SpasMd5Js.run(passWord) + salt);


			params.put("username", userName);
			params.put("password", encode_pass);
			// 发送 登录 请求
			result = HttpClientUtils.doPost(url_host + "/login/checkLogin", headers, params);
			// 清空参数
			params.clear();
			
			System.out.println(result.getMessage() + result.getContent());

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
