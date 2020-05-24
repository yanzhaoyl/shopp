package com.yanzhaoyl.shopp.taobao.pojo.enums;

import lombok.Getter;

@Getter
public enum TaobaoEnum {
	// 内容为空
	CONTENT_EMPTY(50001, "宝贝数据为空，请重新查询");

	private Integer code;
	private String message;

	TaobaoEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
