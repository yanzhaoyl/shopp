package com.yanzhaoyl.shopp.taobao.service.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.taobao.api.ApiException;
import com.taobao.api.DefaultTaobaoClient;
import com.taobao.api.TaobaoClient;
import com.taobao.api.request.TbkDgMaterialOptionalRequest;
import com.taobao.api.response.TbkDgMaterialOptionalResponse;
import com.yanzhaoyl.shopp.taobao.service.OfficialService;
import com.yanzhaoyl.shopp.taobao.util.DataReinforce;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class OfficialServiceImpl implements OfficialService {

	@Value("${taobao.url}")
	private String url;
	@Value("${taobao.appkey}")
	private String appkey;
	@Value("${taobao.secret}")
	private String secret;

	/**
	 * 淘宝客-推广者-物料搜索
	 * [https://open.taobao.com/api.htm?docId=35896&docType=2&scopeId=16516]
	 */
	@Override
	public Object getCommodity() {
		// TODO 淘宝客-推广者-物料搜索
		url = "https://eco.taobao.com/router/rest";
		TaobaoClient client = new DefaultTaobaoClient(url, DataReinforce.decode(appkey), DataReinforce.decode(secret));
		TbkDgMaterialOptionalRequest req = new TbkDgMaterialOptionalRequest();
//		req.setStartDsr(10L);
//		req.setPageSize(20L);
//		req.setPageNo(1L);
//		req.setPlatform(1L);
//		req.setEndTkRate(1234L);
//		req.setStartTkRate(1234L);
//		req.setEndPrice(10L);
//		req.setStartPrice(10L);
//		req.setIsOverseas(false);
//		req.setIsTmall(false);
//		req.setSort("tk_rate_des");
//		req.setItemloc("杭州");
		req.setCat("16");
//		req.setQ("女装");
//		req.setMaterialId(2836L);
//		req.setHasCoupon(false);
//		req.setIp("13.2.33.4");
		req.setAdzoneId(110440000290L);
//		req.setNeedFreeShipment(true);
//		req.setNeedPrepay(true);
//		req.setIncludePayRate30(true);
//		req.setIncludeGoodRate(true);
//		req.setIncludeRfdRate(true);
//		req.setNpxLevel(2L);
//		req.setEndKaTkRate(1234L);
//		req.setStartKaTkRate(1234L);
//		req.setDeviceEncrypt("MD5");
//		req.setDeviceValue("xxx");
//		req.setDeviceType("IMEI");
//		req.setLockRateEndTime(1567440000000L);
//		req.setLockRateStartTime(1567440000000L);
//		req.setLongitude("121.473701");
//		req.setLatitude("31.230370");
//		req.setCityCode("310000");
//		req.setSellerIds("1,2,3,4");
		TbkDgMaterialOptionalResponse rsp = null;
		try {
			rsp = client.execute(req);
		} catch (ApiException e) {
			return "接口请求失败";
		}
		if (rsp.isSuccess()) {
			// 请求成功
			return rsp.getBody();
		} else {
			// 请求失败
			return "请求失败:" + rsp.getSubCode() + "->" + rsp.getSubMsg();
		}
	}

	/**
	 * 获取后台供卖家发布商品的标准商品类目
	 * [https://open.taobao.com/api.htm?spm=a219a.7386797.0.0.a31f669a3fD0Ys&source=search&docId=122&docType=2]
	 */
	@Override
	public Object getCommodityCategory() {
		
		return null;
	}

}