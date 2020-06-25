package com.yanzhaoyl.shopp.common.pojo;

import java.io.Serializable;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Description: 封装httpClient响应结果
 * 
 * @author JourWon
 * @date Created on 2018年4月19日
 */

@Data
@AllArgsConstructor
@SuppressWarnings("serial")
public class HttpClientResult implements Serializable {


	public HttpClientResult(int statusCode, String content2) {
		this.code = statusCode;
		this.content = content2;
	}

	public HttpClientResult(int scInternalServerError) {
		this.code = scInternalServerError;
	}

	/**
	 * 响应状态码
	 */
	private int code;
	
	/**
	 * 响应头
	 */
	private Map<String, String> params;

	/**
	 * 响应数据
	 */
	private String content;
	
	/**
	 * 状态描述
	 */
	private String Message;

}
