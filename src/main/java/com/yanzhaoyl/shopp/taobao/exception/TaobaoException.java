package com.yanzhaoyl.shopp.taobao.exception;

import com.yanzhaoyl.shopp.taobao.pojo.enums.TaobaoEnum;

import lombok.Data;

@Data
public class TaobaoException extends RuntimeException {

	private Integer code;

	public TaobaoException(TaobaoEnum taobaoEnum) {
		super(taobaoEnum.getMessage());
		this.code = taobaoEnum.getCode();
	}
}
