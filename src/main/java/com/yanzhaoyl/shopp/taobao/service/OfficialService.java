package com.yanzhaoyl.shopp.taobao.service;

/** 官方的接口 */
public interface OfficialService {
    /**
     * 淘宝客-推广者-物料搜索
     * @return
     */
	Object getCommodity();
	
	/**
     * 获取后台供卖家发布商品的标准商品类目
     * @return
     */
	Object getCommodityCategory();

}