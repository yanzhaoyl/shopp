package com.yanzhaoyl.shopp.taobao.util;

import java.util.List;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;

import lombok.Data;

public class CommodityCategory {
	public static void main(String[] args) {
		String str = "{\r\n" + "    \"itemcats_get_response\": {\r\n" + "        \"item_cats\": {\r\n"
				+ "            \"item_cat\": [\r\n" + "                {\r\n"
				+ "                    \"cid\": 121266001,\r\n" + "                    \"is_parent\": true,\r\n"
				+ "                    \"name\": \"众筹\",\r\n" + "                    \"parent_cid\": 0\r\n"
				+ "                },\r\n" + "                {\r\n" + "                    \"cid\": 120886001,\r\n"
				+ "                    \"is_parent\": true,\r\n" + "                    \"name\": \"公益\",\r\n"
				+ "                    \"parent_cid\": 0\r\n" + "                },\r\n" + "                {\r\n"
				+ "                    \"cid\": 98,\r\n" + "                    \"is_parent\": true,\r\n"
				+ "                    \"name\": \"包装\",\r\n" + "                    \"parent_cid\": 0\r\n"
				+ "                },\r\n" + "                {\r\n" + "                    \"cid\": 120950002,\r\n"
				+ "                    \"is_parent\": true,\r\n" + "                    \"name\": \"天猫点券\",\r\n"
				+ "                    \"parent_cid\": 0\r\n" + "                },\r\n" + "                {\r\n"
				+ "                    \"cid\": 50802001,\r\n" + "                    \"is_parent\": true,\r\n"
				+ "                    \"name\": \"数字阅读\",\r\n" + "                    \"parent_cid\": 0\r\n"
				+ "                },\r\n" + "                {\r\n" + "                    \"cid\": 120894001,\r\n"
				+ "                    \"is_parent\": true,\r\n" + "                    \"name\": \"淘女郎\",\r\n"
				+ "                    \"parent_cid\": 0\r\n" + "                },\r\n" + "                {\r\n"
				+ "                    \"cid\": 50023722,\r\n" + "                    \"is_parent\": true,\r\n"
				+ "                    \"name\": \"隐形眼镜/护理液\",\r\n" + "                    \"parent_cid\": 0\r\n"
				+ "                },\r\n" + "                {\r\n" + "                    \"cid\": 50026555,\r\n"
				+ "                    \"is_parent\": true,\r\n" + "                    \"name\": \"购物提货券\",\r\n"
				+ "                    \"parent_cid\": 0\r\n" + "                },\r\n" + "                {\r\n"
				+ "                    \"cid\": 50008075,\r\n" + "                    \"is_parent\": true,\r\n"
				+ "                    \"name\": \"餐饮美食卡券\",\r\n" + "                    \"parent_cid\": 0\r\n"
				+ "                },\r\n" + "                {\r\n" + "                    \"cid\": 50019095,\r\n"
				+ "                    \"is_parent\": true,\r\n" + "                    \"name\": \"线下消费卡\",\r\n"
				+ "                    \"parent_cid\": 0\r\n" + "                },\r\n" + "                {\r\n"
				+ "                    \"cid\": 50014927,\r\n" + "                    \"is_parent\": true,\r\n"
				+ "                    \"name\": \"教育培训\",\r\n" + "                    \"parent_cid\": 0\r\n"
				+ "                },\r\n" + "                {\r\n" + "                    \"cid\": 26,\r\n"
				+ "                    \"is_parent\": true,\r\n"
				+ "                    \"name\": \"汽车用品/电子/清洗/改装\",\r\n" + "                    \"parent_cid\": 0\r\n"
				+ "                },\r\n" + "                {\r\n" + "                    \"cid\": 50020808,\r\n"
				+ "                    \"is_parent\": true,\r\n" + "                    \"name\": \"家居饰品\",\r\n"
				+ "                    \"parent_cid\": 0\r\n" + "                },\r\n" + "                {\r\n"
				+ "                    \"cid\": 50020857,\r\n" + "                    \"is_parent\": true,\r\n"
				+ "                    \"name\": \"特色手工艺\",\r\n" + "                    \"parent_cid\": 0\r\n"
				+ "                },\r\n" + "                {\r\n" + "                    \"cid\": 50025707,\r\n"
				+ "                    \"is_parent\": true,\r\n"
				+ "                    \"name\": \"度假线路/签证送关/旅游服务\",\r\n" + "                    \"parent_cid\": 0\r\n"
				+ "                },\r\n" + "                {\r\n" + "                    \"cid\": 50024099,\r\n"
				+ "                    \"is_parent\": true,\r\n" + "                    \"name\": \"电子元器件市场\",\r\n"
				+ "                    \"parent_cid\": 0\r\n" + "                },\r\n" + "                {\r\n"
				+ "                    \"cid\": 30,\r\n" + "                    \"is_parent\": true,\r\n"
				+ "                    \"name\": \"男装\",\r\n" + "                    \"parent_cid\": 0\r\n"
				+ "                },\r\n" + "                {\r\n" + "                    \"cid\": 50008164,\r\n"
				+ "                    \"is_parent\": true,\r\n" + "                    \"name\": \"住宅家具\",\r\n"
				+ "                    \"parent_cid\": 0\r\n" + "                },\r\n" + "                {\r\n"
				+ "                    \"cid\": 50020611,\r\n" + "                    \"is_parent\": true,\r\n"
				+ "                    \"name\": \"商业/办公家具\",\r\n" + "                    \"parent_cid\": 0\r\n"
				+ "                },\r\n" + "                {\r\n" + "                    \"cid\": 50010788,\r\n"
				+ "                    \"is_parent\": true,\r\n" + "                    \"name\": \"彩妆/香水/美妆工具\",\r\n"
				+ "                    \"parent_cid\": 0\r\n" + "                },\r\n" + "                {\r\n"
				+ "                    \"cid\": 1801,\r\n" + "                    \"is_parent\": true,\r\n"
				+ "                    \"name\": \"美容护肤/美体/精油\",\r\n" + "                    \"parent_cid\": 0\r\n"
				+ "                },\r\n" + "                {\r\n" + "                    \"cid\": 50023282,\r\n"
				+ "                    \"is_parent\": true,\r\n" + "                    \"name\": \"美发护发/假发\",\r\n"
				+ "                    \"parent_cid\": 0\r\n" + "                },\r\n" + "                {\r\n"
				+ "                    \"cid\": 1512,\r\n" + "                    \"is_parent\": false,\r\n"
				+ "                    \"name\": \"手机\",\r\n" + "                    \"parent_cid\": 0\r\n"
				+ "                },\r\n" + "                {\r\n" + "                    \"cid\": 14,\r\n"
				+ "                    \"is_parent\": true,\r\n"
				+ "                    \"name\": \"数码相机/单反相机/摄像机\",\r\n" + "                    \"parent_cid\": 0\r\n"
				+ "                },\r\n" + "                {\r\n" + "                    \"cid\": 1201,\r\n"
				+ "                    \"is_parent\": false,\r\n"
				+ "                    \"name\": \"MP3/MP4/iPod/录音笔\",\r\n"
				+ "                    \"parent_cid\": 0\r\n" + "                },\r\n" + "                {\r\n"
				+ "                    \"cid\": 1101,\r\n" + "                    \"is_parent\": false,\r\n"
				+ "                    \"name\": \"笔记本电脑\",\r\n" + "                    \"parent_cid\": 0\r\n"
				+ "                },\r\n" + "                {\r\n" + "                    \"cid\": 50019780,\r\n"
				+ "                    \"is_parent\": false,\r\n" + "                    \"name\": \"平板电脑/MID\",\r\n"
				+ "                    \"parent_cid\": 0\r\n" + "                },\r\n" + "                {\r\n"
				+ "                    \"cid\": 50018222,\r\n" + "                    \"is_parent\": true,\r\n"
				+ "                    \"name\": \"DIY电脑\",\r\n" + "                    \"parent_cid\": 0\r\n"
				+ "                },\r\n" + "                {\r\n" + "                    \"cid\": 11,\r\n"
				+ "                    \"is_parent\": true,\r\n"
				+ "                    \"name\": \"电脑硬件/显示器/电脑周边\",\r\n" + "                    \"parent_cid\": 0\r\n"
				+ "                },\r\n" + "                {\r\n" + "                    \"cid\": 50018264,\r\n"
				+ "                    \"is_parent\": true,\r\n" + "                    \"name\": \"网络设备/网络相关\",\r\n"
				+ "                    \"parent_cid\": 0\r\n" + "                },\r\n" + "                {\r\n"
				+ "                    \"cid\": 50008090,\r\n" + "                    \"is_parent\": true,\r\n"
				+ "                    \"name\": \"3C数码配件\",\r\n" + "                    \"parent_cid\": 0\r\n"
				+ "                },\r\n" + "                {\r\n" + "                    \"cid\": 50012164,\r\n"
				+ "                    \"is_parent\": true,\r\n"
				+ "                    \"name\": \"闪存卡/U盘/存储/移动硬盘\",\r\n" + "                    \"parent_cid\": 0\r\n"
				+ "                },\r\n" + "                {\r\n" + "                    \"cid\": 50007218,\r\n"
				+ "                    \"is_parent\": true,\r\n" + "                    \"name\": \"办公设备/耗材/相关服务\",\r\n"
				+ "                    \"parent_cid\": 0\r\n" + "                },\r\n" + "                {\r\n"
				+ "                    \"cid\": 50018004,\r\n" + "                    \"is_parent\": true,\r\n"
				+ "                    \"name\": \"文具电教/文化用品/商务用品\",\r\n" + "                    \"parent_cid\": 0\r\n"
				+ "                },\r\n" + "                {\r\n" + "                    \"cid\": 20,\r\n"
				+ "                    \"is_parent\": true,\r\n" + "                    \"name\": \"电玩/配件/游戏/攻略\",\r\n"
				+ "                    \"parent_cid\": 0\r\n" + "                },\r\n" + "                {\r\n"
				+ "                    \"cid\": 50022703,\r\n" + "                    \"is_parent\": true,\r\n"
				+ "                    \"name\": \"大家电\",\r\n" + "                    \"parent_cid\": 0\r\n"
				+ "                },\r\n" + "                {\r\n" + "                    \"cid\": 50011972,\r\n"
				+ "                    \"is_parent\": true,\r\n" + "                    \"name\": \"影音电器\",\r\n"
				+ "                    \"parent_cid\": 0\r\n" + "                },\r\n" + "                {\r\n"
				+ "                    \"cid\": 50012100,\r\n" + "                    \"is_parent\": true,\r\n"
				+ "                    \"name\": \"生活电器\",\r\n" + "                    \"parent_cid\": 0\r\n"
				+ "                },\r\n" + "                {\r\n" + "                    \"cid\": 50012082,\r\n"
				+ "                    \"is_parent\": true,\r\n" + "                    \"name\": \"厨房电器\",\r\n"
				+ "                    \"parent_cid\": 0\r\n" + "                },\r\n" + "                {\r\n"
				+ "                    \"cid\": 50002768,\r\n" + "                    \"is_parent\": true,\r\n"
				+ "                    \"name\": \"个人护理/保健/按摩器材\",\r\n" + "                    \"parent_cid\": 0\r\n"
				+ "                },\r\n" + "                {\r\n" + "                    \"cid\": 27,\r\n"
				+ "                    \"is_parent\": true,\r\n" + "                    \"name\": \"家装主材\",\r\n"
				+ "                    \"parent_cid\": 0\r\n" + "                },\r\n" + "                {\r\n"
				+ "                    \"cid\": 124912001,\r\n" + "                    \"is_parent\": false,\r\n"
				+ "                    \"name\": \"合约机\",\r\n" + "                    \"parent_cid\": 0\r\n"
				+ "                },\r\n" + "                {\r\n" + "                    \"cid\": 50020332,\r\n"
				+ "                    \"is_parent\": true,\r\n" + "                    \"name\": \"基础建材\",\r\n"
				+ "                    \"parent_cid\": 0\r\n" + "                },\r\n" + "                {\r\n"
				+ "                    \"cid\": 50020485,\r\n" + "                    \"is_parent\": true,\r\n"
				+ "                    \"name\": \"五金/工具\",\r\n" + "                    \"parent_cid\": 0\r\n"
				+ "                },\r\n" + "                {\r\n" + "                    \"cid\": 50026535,\r\n"
				+ "                    \"is_parent\": true,\r\n" + "                    \"name\": \"医疗及健康服务\",\r\n"
				+ "                    \"parent_cid\": 0\r\n" + "                },\r\n" + "                {\r\n"
				+ "                    \"cid\": 50020579,\r\n" + "                    \"is_parent\": true,\r\n"
				+ "                    \"name\": \"电子/电工\",\r\n" + "                    \"parent_cid\": 0\r\n"
				+ "                },\r\n" + "                {\r\n" + "                    \"cid\": 50011949,\r\n"
				+ "                    \"is_parent\": true,\r\n"
				+ "                    \"name\": \"特价酒店/特色客栈/公寓旅馆\",\r\n" + "                    \"parent_cid\": 0\r\n"
				+ "                },\r\n" + "                {\r\n" + "                    \"cid\": 21,\r\n"
				+ "                    \"is_parent\": true,\r\n" + "                    \"name\": \"居家日用\",\r\n"
				+ "                    \"parent_cid\": 0\r\n" + "                },\r\n" + "                {\r\n"
				+ "                    \"cid\": 50016349,\r\n" + "                    \"is_parent\": true,\r\n"
				+ "                    \"name\": \"厨房/烹饪用具\",\r\n" + "                    \"parent_cid\": 0\r\n"
				+ "                },\r\n" + "                {\r\n" + "                    \"cid\": 50016348,\r\n"
				+ "                    \"is_parent\": true,\r\n" + "                    \"name\": \"家庭/个人清洁工具\",\r\n"
				+ "                    \"parent_cid\": 0\r\n" + "                },\r\n" + "                {\r\n"
				+ "                    \"cid\": 50008163,\r\n" + "                    \"is_parent\": true,\r\n"
				+ "                    \"name\": \"床上用品\",\r\n" + "                    \"parent_cid\": 0\r\n"
				+ "                },\r\n" + "                {\r\n" + "                    \"cid\": 35,\r\n"
				+ "                    \"is_parent\": true,\r\n" + "                    \"name\": \"奶粉/辅食/营养品/零食\",\r\n"
				+ "                    \"parent_cid\": 0\r\n" + "                },\r\n" + "                {\r\n"
				+ "                    \"cid\": 50014812,\r\n" + "                    \"is_parent\": true,\r\n"
				+ "                    \"name\": \"婴童用品\",\r\n" + "                    \"parent_cid\": 0\r\n"
				+ "                },\r\n" + "                {\r\n" + "                    \"cid\": 50022517,\r\n"
				+ "                    \"is_parent\": true,\r\n" + "                    \"name\": \"孕妇装/孕产妇用品/营养\",\r\n"
				+ "                    \"parent_cid\": 0\r\n" + "                },\r\n" + "                {\r\n"
				+ "                    \"cid\": 50008165,\r\n" + "                    \"is_parent\": true,\r\n"
				+ "                    \"name\": \"童装/婴儿装/亲子装\",\r\n" + "                    \"parent_cid\": 0\r\n"
				+ "                },\r\n" + "                {\r\n" + "                    \"cid\": 50020275,\r\n"
				+ "                    \"is_parent\": true,\r\n" + "                    \"name\": \"传统滋补营养品\",\r\n"
				+ "                    \"parent_cid\": 0\r\n" + "                },\r\n" + "                {\r\n"
				+ "                    \"cid\": 50002766,\r\n" + "                    \"is_parent\": true,\r\n"
				+ "                    \"name\": \"零食/坚果/特产\",\r\n" + "                    \"parent_cid\": 0\r\n"
				+ "                },\r\n" + "                {\r\n" + "                    \"cid\": 50016422,\r\n"
				+ "                    \"is_parent\": true,\r\n"
				+ "                    \"name\": \"粮油米面/南北干货/调味品\",\r\n" + "                    \"parent_cid\": 0\r\n"
				+ "                },\r\n" + "                {\r\n" + "                    \"cid\": 121380001,\r\n"
				+ "                    \"is_parent\": true,\r\n" + "                    \"name\": \"机票/小交通/增值服务\",\r\n"
				+ "                    \"parent_cid\": 0\r\n" + "                },\r\n" + "                {\r\n"
				+ "                    \"cid\": 121536003,\r\n" + "                    \"is_parent\": true,\r\n"
				+ "                    \"name\": \"数字娱乐\",\r\n" + "                    \"parent_cid\": 0\r\n"
				+ "                },\r\n" + "                {\r\n" + "                    \"cid\": 121536007,\r\n"
				+ "                    \"is_parent\": true,\r\n" + "                    \"name\": \"全球购代购市场\",\r\n"
				+ "                    \"parent_cid\": 0\r\n" + "                },\r\n" + "                {\r\n"
				+ "                    \"cid\": 40,\r\n" + "                    \"is_parent\": true,\r\n"
				+ "                    \"name\": \"腾讯QQ专区\",\r\n" + "                    \"parent_cid\": 0\r\n"
				+ "                },\r\n" + "                {\r\n" + "                    \"cid\": 50010728,\r\n"
				+ "                    \"is_parent\": true,\r\n"
				+ "                    \"name\": \"运动/瑜伽/健身/球迷用品\",\r\n" + "                    \"parent_cid\": 0\r\n"
				+ "                },\r\n" + "                {\r\n" + "                    \"cid\": 50013886,\r\n"
				+ "                    \"is_parent\": true,\r\n"
				+ "                    \"name\": \"户外/登山/野营/旅行用品\",\r\n" + "                    \"parent_cid\": 0\r\n"
				+ "                },\r\n" + "                {\r\n" + "                    \"cid\": 50011699,\r\n"
				+ "                    \"is_parent\": true,\r\n" + "                    \"name\": \"运动服/休闲服装\",\r\n"
				+ "                    \"parent_cid\": 0\r\n" + "                },\r\n" + "                {\r\n"
				+ "                    \"cid\": 25,\r\n" + "                    \"is_parent\": true,\r\n"
				+ "                    \"name\": \"玩具/童车/益智/积木/模型\",\r\n" + "                    \"parent_cid\": 0\r\n"
				+ "                },\r\n" + "                {\r\n" + "                    \"cid\": 50011665,\r\n"
				+ "                    \"is_parent\": true,\r\n"
				+ "                    \"name\": \"网游装备/游戏币/帐号/代练\",\r\n" + "                    \"parent_cid\": 0\r\n"
				+ "                },\r\n" + "                {\r\n" + "                    \"cid\": 50008907,\r\n"
				+ "                    \"is_parent\": true,\r\n" + "                    \"name\": \"手机号码/套餐/增值业务\",\r\n"
				+ "                    \"parent_cid\": 0\r\n" + "                },\r\n" + "                {\r\n"
				+ "                    \"cid\": 99,\r\n" + "                    \"is_parent\": true,\r\n"
				+ "                    \"name\": \"网络游戏点卡\",\r\n" + "                    \"parent_cid\": 0\r\n"
				+ "                },\r\n" + "                {\r\n" + "                    \"cid\": 23,\r\n"
				+ "                    \"is_parent\": true,\r\n" + "                    \"name\": \"古董/邮币/字画/收藏\",\r\n"
				+ "                    \"parent_cid\": 0\r\n" + "                },\r\n" + "                {\r\n"
				+ "                    \"cid\": 50007216,\r\n" + "                    \"is_parent\": true,\r\n"
				+ "                    \"name\": \"鲜花速递/花卉仿真/绿植园艺\",\r\n" + "                    \"parent_cid\": 0\r\n"
				+ "                },\r\n" + "                {\r\n" + "                    \"cid\": 50004958,\r\n"
				+ "                    \"is_parent\": true,\r\n" + "                    \"name\": \"移动/联通/电信充值中心\",\r\n"
				+ "                    \"parent_cid\": 0\r\n" + "                },\r\n" + "                {\r\n"
				+ "                    \"cid\": 50011740,\r\n" + "                    \"is_parent\": true,\r\n"
				+ "                    \"name\": \"流行男鞋\",\r\n" + "                    \"parent_cid\": 0\r\n"
				+ "                },\r\n" + "                {\r\n" + "                    \"cid\": 16,\r\n"
				+ "                    \"is_parent\": true,\r\n" + "                    \"name\": \"女装/女士精品\",\r\n"
				+ "                    \"parent_cid\": 0\r\n" + "                },\r\n" + "                {\r\n"
				+ "                    \"cid\": 50006843,\r\n" + "                    \"is_parent\": true,\r\n"
				+ "                    \"name\": \"女鞋\",\r\n" + "                    \"parent_cid\": 0\r\n"
				+ "                },\r\n" + "                {\r\n" + "                    \"cid\": 50006842,\r\n"
				+ "                    \"is_parent\": true,\r\n" + "                    \"name\": \"箱包皮具/热销女包/男包\",\r\n"
				+ "                    \"parent_cid\": 0\r\n" + "                },\r\n" + "                {\r\n"
				+ "                    \"cid\": 1625,\r\n" + "                    \"is_parent\": true,\r\n"
				+ "                    \"name\": \"女士内衣/男士内衣/家居服\",\r\n" + "                    \"parent_cid\": 0\r\n"
				+ "                },\r\n" + "                {\r\n" + "                    \"cid\": 50010404,\r\n"
				+ "                    \"is_parent\": true,\r\n"
				+ "                    \"name\": \"服饰配件/皮带/帽子/围巾\",\r\n" + "                    \"parent_cid\": 0\r\n"
				+ "                },\r\n" + "                {\r\n" + "                    \"cid\": 50011397,\r\n"
				+ "                    \"is_parent\": true,\r\n" + "                    \"name\": \"珠宝/钻石/翡翠/黄金\",\r\n"
				+ "                    \"parent_cid\": 0\r\n" + "                },\r\n" + "                {\r\n"
				+ "                    \"cid\": 28,\r\n" + "                    \"is_parent\": true,\r\n"
				+ "                    \"name\": \"ZIPPO/瑞士军刀/眼镜\",\r\n" + "                    \"parent_cid\": 0\r\n"
				+ "                },\r\n" + "                {\r\n" + "                    \"cid\": 33,\r\n"
				+ "                    \"is_parent\": true,\r\n" + "                    \"name\": \"书籍/杂志/报纸\",\r\n"
				+ "                    \"parent_cid\": 0\r\n" + "                },\r\n" + "                {\r\n"
				+ "                    \"cid\": 34,\r\n" + "                    \"is_parent\": true,\r\n"
				+ "                    \"name\": \"音乐/影视/明星/音像\",\r\n" + "                    \"parent_cid\": 0\r\n"
				+ "                },\r\n" + "                {\r\n" + "                    \"cid\": 50017300,\r\n"
				+ "                    \"is_parent\": true,\r\n" + "                    \"name\": \"乐器/吉他/钢琴/配件\",\r\n"
				+ "                    \"parent_cid\": 0\r\n" + "                },\r\n" + "                {\r\n"
				+ "                    \"cid\": 29,\r\n" + "                    \"is_parent\": true,\r\n"
				+ "                    \"name\": \"宠物/宠物食品及用品\",\r\n" + "                    \"parent_cid\": 0\r\n"
				+ "                },\r\n" + "                {\r\n" + "                    \"cid\": 2813,\r\n"
				+ "                    \"is_parent\": true,\r\n" + "                    \"name\": \"成人用品/情趣用品\",\r\n"
				+ "                    \"parent_cid\": 0\r\n" + "                },\r\n" + "                {\r\n"
				+ "                    \"cid\": 50012029,\r\n" + "                    \"is_parent\": true,\r\n"
				+ "                    \"name\": \"运动鞋new\",\r\n" + "                    \"parent_cid\": 0\r\n"
				+ "                },\r\n" + "                {\r\n" + "                    \"cid\": 50013864,\r\n"
				+ "                    \"is_parent\": true,\r\n"
				+ "                    \"name\": \"饰品/流行首饰/时尚饰品新\",\r\n" + "                    \"parent_cid\": 0\r\n"
				+ "                },\r\n" + "                {\r\n" + "                    \"cid\": 50014811,\r\n"
				+ "                    \"is_parent\": true,\r\n" + "                    \"name\": \"网店/网络服务/软件\",\r\n"
				+ "                    \"parent_cid\": 0\r\n" + "                },\r\n" + "                {\r\n"
				+ "                    \"cid\": 50023724,\r\n" + "                    \"is_parent\": true,\r\n"
				+ "                    \"name\": \"其他\",\r\n" + "                    \"parent_cid\": 0\r\n"
				+ "                },\r\n" + "                {\r\n" + "                    \"cid\": 50017652,\r\n"
				+ "                    \"is_parent\": true,\r\n" + "                    \"name\": \"服务市场\",\r\n"
				+ "                    \"parent_cid\": 0\r\n" + "                },\r\n" + "                {\r\n"
				+ "                    \"cid\": 50023575,\r\n" + "                    \"is_parent\": true,\r\n"
				+ "                    \"name\": \"房产/租房/新房/二手房/委托服务\",\r\n"
				+ "                    \"parent_cid\": 0\r\n" + "                },\r\n" + "                {\r\n"
				+ "                    \"cid\": 50023717,\r\n" + "                    \"is_parent\": true,\r\n"
				+ "                    \"name\": \"互联网医疗/保健用品\",\r\n" + "                    \"parent_cid\": 0\r\n"
				+ "                },\r\n" + "                {\r\n" + "                    \"cid\": 50023878,\r\n"
				+ "                    \"is_parent\": true,\r\n" + "                    \"name\": \"自用闲置转让\",\r\n"
				+ "                    \"parent_cid\": 0\r\n" + "                },\r\n" + "                {\r\n"
				+ "                    \"cid\": 50024186,\r\n" + "                    \"is_parent\": true,\r\n"
				+ "                    \"name\": \"保险\",\r\n" + "                    \"parent_cid\": 0\r\n"
				+ "                },\r\n" + "                {\r\n" + "                    \"cid\": 50024612,\r\n"
				+ "                    \"is_parent\": true,\r\n" + "                    \"name\": \"阿里健康送药服务\",\r\n"
				+ "                    \"parent_cid\": 0\r\n" + "                },\r\n" + "                {\r\n"
				+ "                    \"cid\": 50024971,\r\n" + "                    \"is_parent\": true,\r\n"
				+ "                    \"name\": \"新车/二手车\",\r\n" + "                    \"parent_cid\": 0\r\n"
				+ "                },\r\n" + "                {\r\n" + "                    \"cid\": 50025004,\r\n"
				+ "                    \"is_parent\": true,\r\n"
				+ "                    \"name\": \"个性定制/设计服务/DIY\",\r\n" + "                    \"parent_cid\": 0\r\n"
				+ "                },\r\n" + "                {\r\n" + "                    \"cid\": 50025110,\r\n"
				+ "                    \"is_parent\": true,\r\n" + "                    \"name\": \"电影/演出/体育赛事\",\r\n"
				+ "                    \"parent_cid\": 0\r\n" + "                },\r\n" + "                {\r\n"
				+ "                    \"cid\": 50025618,\r\n" + "                    \"is_parent\": true,\r\n"
				+ "                    \"name\": \"理财\",\r\n" + "                    \"parent_cid\": 0\r\n"
				+ "                },\r\n" + "                {\r\n" + "                    \"cid\": 50025705,\r\n"
				+ "                    \"is_parent\": true,\r\n"
				+ "                    \"name\": \"洗护清洁剂/卫生巾/纸/香薰\",\r\n" + "                    \"parent_cid\": 0\r\n"
				+ "                },\r\n" + "                {\r\n" + "                    \"cid\": 50025968,\r\n"
				+ "                    \"is_parent\": true,\r\n" + "                    \"name\": \"司法拍卖拍品专用\",\r\n"
				+ "                    \"parent_cid\": 0\r\n" + "                },\r\n" + "                {\r\n"
				+ "                    \"cid\": 50026316,\r\n" + "                    \"is_parent\": true,\r\n"
				+ "                    \"name\": \"咖啡/麦片/冲饮\",\r\n" + "                    \"parent_cid\": 0\r\n"
				+ "                },\r\n" + "                {\r\n" + "                    \"cid\": 50023804,\r\n"
				+ "                    \"is_parent\": true,\r\n" + "                    \"name\": \"装修设计/施工/监理\",\r\n"
				+ "                    \"parent_cid\": 0\r\n" + "                },\r\n" + "                {\r\n"
				+ "                    \"cid\": 50026800,\r\n" + "                    \"is_parent\": true,\r\n"
				+ "                    \"name\": \"保健食品/膳食营养补充食品\",\r\n" + "                    \"parent_cid\": 0\r\n"
				+ "                },\r\n" + "                {\r\n" + "                    \"cid\": 50050359,\r\n"
				+ "                    \"is_parent\": true,\r\n" + "                    \"name\": \"水产肉类/新鲜蔬果/熟食\",\r\n"
				+ "                    \"parent_cid\": 0\r\n" + "                },\r\n" + "                {\r\n"
				+ "                    \"cid\": 50074001,\r\n" + "                    \"is_parent\": true,\r\n"
				+ "                    \"name\": \"摩托车/装备/配件\",\r\n" + "                    \"parent_cid\": 0\r\n"
				+ "                },\r\n" + "                {\r\n" + "                    \"cid\": 50158001,\r\n"
				+ "                    \"is_parent\": true,\r\n" + "                    \"name\": \"网络店铺代金/优惠券\",\r\n"
				+ "                    \"parent_cid\": 0\r\n" + "                },\r\n" + "                {\r\n"
				+ "                    \"cid\": 50230002,\r\n" + "                    \"is_parent\": true,\r\n"
				+ "                    \"name\": \"服务商品\",\r\n" + "                    \"parent_cid\": 0\r\n"
				+ "                },\r\n" + "                {\r\n" + "                    \"cid\": 50454031,\r\n"
				+ "                    \"is_parent\": true,\r\n"
				+ "                    \"name\": \"景点门票/演艺演出/周边游\",\r\n" + "                    \"parent_cid\": 0\r\n"
				+ "                },\r\n" + "                {\r\n" + "                    \"cid\": 50468001,\r\n"
				+ "                    \"is_parent\": true,\r\n" + "                    \"name\": \"手表\",\r\n"
				+ "                    \"parent_cid\": 0\r\n" + "                },\r\n" + "                {\r\n"
				+ "                    \"cid\": 50510002,\r\n" + "                    \"is_parent\": true,\r\n"
				+ "                    \"name\": \"运动包/户外包/配件\",\r\n" + "                    \"parent_cid\": 0\r\n"
				+ "                },\r\n" + "                {\r\n" + "                    \"cid\": 50008141,\r\n"
				+ "                    \"is_parent\": true,\r\n" + "                    \"name\": \"酒类\",\r\n"
				+ "                    \"parent_cid\": 0\r\n" + "                },\r\n" + "                {\r\n"
				+ "                    \"cid\": 50734010,\r\n" + "                    \"is_parent\": true,\r\n"
				+ "                    \"name\": \"资产\",\r\n" + "                    \"parent_cid\": 0\r\n"
				+ "                },\r\n" + "                {\r\n" + "                    \"cid\": 50025111,\r\n"
				+ "                    \"is_parent\": true,\r\n" + "                    \"name\": \"本地化生活服务\",\r\n"
				+ "                    \"parent_cid\": 0\r\n" + "                },\r\n" + "                {\r\n"
				+ "                    \"cid\": 121938001,\r\n" + "                    \"is_parent\": false,\r\n"
				+ "                    \"name\": \"淘点点预定点菜\",\r\n" + "                    \"parent_cid\": 0\r\n"
				+ "                },\r\n" + "                {\r\n" + "                    \"cid\": 121940001,\r\n"
				+ "                    \"is_parent\": false,\r\n" + "                    \"name\": \"淘点点现金券\",\r\n"
				+ "                    \"parent_cid\": 0\r\n" + "                },\r\n" + "                {\r\n"
				+ "                    \"cid\": 122650005,\r\n" + "                    \"is_parent\": true,\r\n"
				+ "                    \"name\": \"童鞋/婴儿鞋/亲子鞋\",\r\n" + "                    \"parent_cid\": 0\r\n"
				+ "                },\r\n" + "                {\r\n" + "                    \"cid\": 122684003,\r\n"
				+ "                    \"is_parent\": true,\r\n" + "                    \"name\": \"自行车/骑行装备/零配件\",\r\n"
				+ "                    \"parent_cid\": 0\r\n" + "                },\r\n" + "                {\r\n"
				+ "                    \"cid\": 122718004,\r\n" + "                    \"is_parent\": true,\r\n"
				+ "                    \"name\": \"家庭保健\",\r\n" + "                    \"parent_cid\": 0\r\n"
				+ "                },\r\n" + "                {\r\n" + "                    \"cid\": 122852001,\r\n"
				+ "                    \"is_parent\": true,\r\n" + "                    \"name\": \"居家布艺\",\r\n"
				+ "                    \"parent_cid\": 0\r\n" + "                },\r\n" + "                {\r\n"
				+ "                    \"cid\": 122950001,\r\n" + "                    \"is_parent\": true,\r\n"
				+ "                    \"name\": \"节庆用品/礼品\",\r\n" + "                    \"parent_cid\": 0\r\n"
				+ "                },\r\n" + "                {\r\n" + "                    \"cid\": 122952001,\r\n"
				+ "                    \"is_parent\": true,\r\n" + "                    \"name\": \"餐饮具\",\r\n"
				+ "                    \"parent_cid\": 0\r\n" + "                },\r\n" + "                {\r\n"
				+ "                    \"cid\": 122928002,\r\n" + "                    \"is_parent\": true,\r\n"
				+ "                    \"name\": \"收纳整理\",\r\n" + "                    \"parent_cid\": 0\r\n"
				+ "                },\r\n" + "                {\r\n" + "                    \"cid\": 122966004,\r\n"
				+ "                    \"is_parent\": true,\r\n" + "                    \"name\": \"处方药\",\r\n"
				+ "                    \"parent_cid\": 0\r\n" + "                },\r\n" + "                {\r\n"
				+ "                    \"cid\": 123536002,\r\n" + "                    \"is_parent\": true,\r\n"
				+ "                    \"name\": \"阿里通信专属类目\",\r\n" + "                    \"parent_cid\": 0\r\n"
				+ "                },\r\n" + "                {\r\n" + "                    \"cid\": 123500005,\r\n"
				+ "                    \"is_parent\": true,\r\n" + "                    \"name\": \"资产（政府类专用）\",\r\n"
				+ "                    \"parent_cid\": 0\r\n" + "                },\r\n" + "                {\r\n"
				+ "                    \"cid\": 123690003,\r\n" + "                    \"is_parent\": true,\r\n"
				+ "                    \"name\": \"精制中药材\",\r\n" + "                    \"parent_cid\": 0\r\n"
				+ "                },\r\n" + "                {\r\n" + "                    \"cid\": 124024001,\r\n"
				+ "                    \"is_parent\": true,\r\n"
				+ "                    \"name\": \"农业生产资料（农村淘宝专用）\",\r\n" + "                    \"parent_cid\": 0\r\n"
				+ "                },\r\n" + "                {\r\n" + "                    \"cid\": 124044001,\r\n"
				+ "                    \"is_parent\": true,\r\n"
				+ "                    \"name\": \"品牌台机/品牌一体机/服务器\",\r\n" + "                    \"parent_cid\": 0\r\n"
				+ "                },\r\n" + "                {\r\n" + "                    \"cid\": 124050001,\r\n"
				+ "                    \"is_parent\": true,\r\n" + "                    \"name\": \"全屋定制\",\r\n"
				+ "                    \"parent_cid\": 0\r\n" + "                },\r\n" + "                {\r\n"
				+ "                    \"cid\": 124242008,\r\n" + "                    \"is_parent\": true,\r\n"
				+ "                    \"name\": \"智能设备\",\r\n" + "                    \"parent_cid\": 0\r\n"
				+ "                },\r\n" + "                {\r\n" + "                    \"cid\": 124354002,\r\n"
				+ "                    \"is_parent\": true,\r\n" + "                    \"name\": \"电动车/配件/交通工具\",\r\n"
				+ "                    \"parent_cid\": 0\r\n" + "                },\r\n" + "                {\r\n"
				+ "                    \"cid\": 124466001,\r\n" + "                    \"is_parent\": true,\r\n"
				+ "                    \"name\": \"农用物资\",\r\n" + "                    \"parent_cid\": 0\r\n"
				+ "                },\r\n" + "                {\r\n" + "                    \"cid\": 124468001,\r\n"
				+ "                    \"is_parent\": true,\r\n" + "                    \"name\": \"农机/农具/农膜\",\r\n"
				+ "                    \"parent_cid\": 0\r\n" + "                },\r\n" + "                {\r\n"
				+ "                    \"cid\": 124470001,\r\n" + "                    \"is_parent\": true,\r\n"
				+ "                    \"name\": \"畜牧/养殖物资\",\r\n" + "                    \"parent_cid\": 0\r\n"
				+ "                },\r\n" + "                {\r\n" + "                    \"cid\": 124470006,\r\n"
				+ "                    \"is_parent\": true,\r\n" + "                    \"name\": \"整车(经销商)\",\r\n"
				+ "                    \"parent_cid\": 0\r\n" + "                },\r\n" + "                {\r\n"
				+ "                    \"cid\": 124484008,\r\n" + "                    \"is_parent\": true,\r\n"
				+ "                    \"name\": \"模玩/动漫/周边/cos/桌游\",\r\n" + "                    \"parent_cid\": 0\r\n"
				+ "                },\r\n" + "                {\r\n" + "                    \"cid\": 124458005,\r\n"
				+ "                    \"is_parent\": true,\r\n" + "                    \"name\": \"茶\",\r\n"
				+ "                    \"parent_cid\": 0\r\n" + "                },\r\n" + "                {\r\n"
				+ "                    \"cid\": 124568010,\r\n" + "                    \"is_parent\": true,\r\n"
				+ "                    \"name\": \"室内设计师\",\r\n" + "                    \"parent_cid\": 0\r\n"
				+ "                },\r\n" + "                {\r\n" + "                    \"cid\": 124750013,\r\n"
				+ "                    \"is_parent\": true,\r\n" + "                    \"name\": \"俪人购(俪人购专用)\",\r\n"
				+ "                    \"parent_cid\": 0\r\n" + "                },\r\n" + "                {\r\n"
				+ "                    \"cid\": 124698018,\r\n" + "                    \"is_parent\": true,\r\n"
				+ "                    \"name\": \"装修服务\",\r\n" + "                    \"parent_cid\": 0\r\n"
				+ "                },\r\n" + "                {\r\n" + "                    \"cid\": 124844002,\r\n"
				+ "                    \"is_parent\": true,\r\n" + "                    \"name\": \"拍卖会专用\",\r\n"
				+ "                    \"parent_cid\": 0\r\n" + "                },\r\n" + "                {\r\n"
				+ "                    \"cid\": 124868003,\r\n" + "                    \"is_parent\": true,\r\n"
				+ "                    \"name\": \"盒马\",\r\n" + "                    \"parent_cid\": 0\r\n"
				+ "                },\r\n" + "                {\r\n" + "                    \"cid\": 124852003,\r\n"
				+ "                    \"is_parent\": true,\r\n" + "                    \"name\": \"二手数码\",\r\n"
				+ "                    \"parent_cid\": 0\r\n" + "                },\r\n" + "                {\r\n"
				+ "                    \"cid\": 125102006,\r\n" + "                    \"is_parent\": true,\r\n"
				+ "                    \"name\": \"到家业务\",\r\n" + "                    \"parent_cid\": 0\r\n"
				+ "                },\r\n" + "                {\r\n" + "                    \"cid\": 125406001,\r\n"
				+ "                    \"is_parent\": true,\r\n" + "                    \"name\": \"享淘卡\",\r\n"
				+ "                    \"parent_cid\": 0\r\n" + "                },\r\n" + "                {\r\n"
				+ "                    \"cid\": 126252002,\r\n" + "                    \"is_parent\": true,\r\n"
				+ "                    \"name\": \"门店O2O\",\r\n" + "                    \"parent_cid\": 0\r\n"
				+ "                },\r\n" + "                {\r\n" + "                    \"cid\": 126488005,\r\n"
				+ "                    \"is_parent\": true,\r\n" + "                    \"name\": \"天猫零售O2O\",\r\n"
				+ "                    \"parent_cid\": 0\r\n" + "                },\r\n" + "                {\r\n"
				+ "                    \"cid\": 126488008,\r\n" + "                    \"is_parent\": true,\r\n"
				+ "                    \"name\": \"阿里健康B2B平台\",\r\n" + "                    \"parent_cid\": 0\r\n"
				+ "                },\r\n" + "                {\r\n" + "                    \"cid\": 126602002,\r\n"
				+ "                    \"is_parent\": true,\r\n" + "                    \"name\": \"生活娱乐充值\",\r\n"
				+ "                    \"parent_cid\": 0\r\n" + "                },\r\n" + "                {\r\n"
				+ "                    \"cid\": 126700003,\r\n" + "                    \"is_parent\": true,\r\n"
				+ "                    \"name\": \"家装灯饰光源\",\r\n" + "                    \"parent_cid\": 0\r\n"
				+ "                },\r\n" + "                {\r\n" + "                    \"cid\": 126762001,\r\n"
				+ "                    \"is_parent\": true,\r\n" + "                    \"name\": \"美容美体仪器\",\r\n"
				+ "                    \"parent_cid\": 0\r\n" + "                },\r\n" + "                {\r\n"
				+ "                    \"cid\": 127076003,\r\n" + "                    \"is_parent\": true,\r\n"
				+ "                    \"name\": \"平台充值活动(仅内部店铺)\",\r\n" + "                    \"parent_cid\": 0\r\n"
				+ "                },\r\n" + "                {\r\n" + "                    \"cid\": 127492006,\r\n"
				+ "                    \"is_parent\": true,\r\n" + "                    \"name\": \"标准件/零部件/工业耗材\",\r\n"
				+ "                    \"parent_cid\": 0\r\n" + "                },\r\n" + "                {\r\n"
				+ "                    \"cid\": 127484003,\r\n" + "                    \"is_parent\": true,\r\n"
				+ "                    \"name\": \"润滑/胶粘/试剂/实验室耗材\",\r\n" + "                    \"parent_cid\": 0\r\n"
				+ "                },\r\n" + "                {\r\n" + "                    \"cid\": 127508003,\r\n"
				+ "                    \"is_parent\": true,\r\n" + "                    \"name\": \"机械设备\",\r\n"
				+ "                    \"parent_cid\": 0\r\n" + "                },\r\n" + "                {\r\n"
				+ "                    \"cid\": 127458007,\r\n" + "                    \"is_parent\": true,\r\n"
				+ "                    \"name\": \"搬运/仓储/物流设备\",\r\n" + "                    \"parent_cid\": 0\r\n"
				+ "                },\r\n" + "                {\r\n" + "                    \"cid\": 127442006,\r\n"
				+ "                    \"is_parent\": true,\r\n" + "                    \"name\": \"纺织面料/辅料/配套\",\r\n"
				+ "                    \"parent_cid\": 0\r\n" + "                },\r\n" + "                {\r\n"
				+ "                    \"cid\": 127450004,\r\n" + "                    \"is_parent\": true,\r\n"
				+ "                    \"name\": \"金属材料及制品\",\r\n" + "                    \"parent_cid\": 0\r\n"
				+ "                },\r\n" + "                {\r\n" + "                    \"cid\": 127452002,\r\n"
				+ "                    \"is_parent\": true,\r\n" + "                    \"name\": \"橡塑材料及制品\",\r\n"
				+ "                    \"parent_cid\": 0\r\n" + "                },\r\n" + "                {\r\n"
				+ "                    \"cid\": 127588002,\r\n" + "                    \"is_parent\": true,\r\n"
				+ "                    \"name\": \"阿里云云市场\",\r\n" + "                    \"parent_cid\": 0\r\n"
				+ "                },\r\n" + "                {\r\n" + "                    \"cid\": 127876007,\r\n"
				+ "                    \"is_parent\": true,\r\n" + "                    \"name\": \"清洗/食品/商业设备\",\r\n"
				+ "                    \"parent_cid\": 0\r\n" + "                },\r\n" + "                {\r\n"
				+ "                    \"cid\": 127878006,\r\n" + "                    \"is_parent\": true,\r\n"
				+ "                    \"name\": \"新制造\",\r\n" + "                    \"parent_cid\": 0\r\n"
				+ "                },\r\n" + "                {\r\n" + "                    \"cid\": 127882008,\r\n"
				+ "                    \"is_parent\": true,\r\n" + "                    \"name\": \"菜鸟驿站生活店\",\r\n"
				+ "                    \"parent_cid\": 0\r\n" + "                },\r\n" + "                {\r\n"
				+ "                    \"cid\": 127924022,\r\n" + "                    \"is_parent\": true,\r\n"
				+ "                    \"name\": \"零售通\",\r\n" + "                    \"parent_cid\": 0\r\n"
				+ "                },\r\n" + "                {\r\n" + "                    \"cid\": 201136401,\r\n"
				+ "                    \"is_parent\": true,\r\n" + "                    \"name\": \"闲鱼优品\",\r\n"
				+ "                    \"parent_cid\": 0\r\n" + "                },\r\n" + "                {\r\n"
				+ "                    \"cid\": 201149009,\r\n" + "                    \"is_parent\": true,\r\n"
				+ "                    \"name\": \"旅行购物\",\r\n" + "                    \"parent_cid\": 0\r\n"
				+ "                },\r\n" + "                {\r\n" + "                    \"cid\": 201162107,\r\n"
				+ "                    \"is_parent\": true,\r\n"
				+ "                    \"name\": \"汽车零部件/养护/美容/维保\",\r\n" + "                    \"parent_cid\": 0\r\n"
				+ "                },\r\n" + "                {\r\n" + "                    \"cid\": 201156706,\r\n"
				+ "                    \"is_parent\": true,\r\n" + "                    \"name\": \"商务/设计服务\",\r\n"
				+ "                    \"parent_cid\": 0\r\n" + "                },\r\n" + "                {\r\n"
				+ "                    \"cid\": 201160314,\r\n" + "                    \"is_parent\": true,\r\n"
				+ "                    \"name\": \"口碑/饿了么本地生活\",\r\n" + "                    \"parent_cid\": 0\r\n"
				+ "                },\r\n" + "                {\r\n" + "                    \"cid\": 201175701,\r\n"
				+ "                    \"is_parent\": true,\r\n" + "                    \"name\": \"淘小铺\",\r\n"
				+ "                    \"parent_cid\": 0\r\n" + "                },\r\n" + "                {\r\n"
				+ "                    \"cid\": 201207402,\r\n" + "                    \"is_parent\": true,\r\n"
				+ "                    \"name\": \"婴童尿裤\",\r\n" + "                    \"parent_cid\": 0\r\n"
				+ "                },\r\n" + "                {\r\n" + "                    \"cid\": 201236409,\r\n"
				+ "                    \"is_parent\": false,\r\n" + "                    \"name\": \"店铺经营主体变更\",\r\n"
				+ "                    \"parent_cid\": 0\r\n" + "                },\r\n" + "                {\r\n"
				+ "                    \"cid\": 201273575,\r\n" + "                    \"is_parent\": true,\r\n"
				+ "                    \"name\": \"OTC药品/国际医药\",\r\n" + "                    \"parent_cid\": 0\r\n"
				+ "                },\r\n" + "                {\r\n" + "                    \"cid\": 50024153,\r\n"
				+ "                    \"is_parent\": true,\r\n" + "                    \"name\": \"计生用品\",\r\n"
				+ "                    \"parent_cid\": 0\r\n" + "                },\r\n" + "                {\r\n"
				+ "                    \"cid\": 50023721,\r\n" + "                    \"is_parent\": true,\r\n"
				+ "                    \"name\": \"医疗器械\",\r\n" + "                    \"parent_cid\": 0\r\n"
				+ "                },\r\n" + "                {\r\n" + "                    \"cid\": 201310232,\r\n"
				+ "                    \"is_parent\": true,\r\n" + "                    \"name\": \"能源出行\",\r\n"
				+ "                    \"parent_cid\": 0\r\n" + "                },\r\n" + "                {\r\n"
				+ "                    \"cid\": 201304427,\r\n" + "                    \"is_parent\": true,\r\n"
				+ "                    \"name\": \"民生服务\",\r\n" + "                    \"parent_cid\": 0\r\n"
				+ "                },\r\n" + "                {\r\n" + "                    \"cid\": 201307427,\r\n"
				+ "                    \"is_parent\": true,\r\n" + "                    \"name\": \"购物金\",\r\n"
				+ "                    \"parent_cid\": 0\r\n" + "                },\r\n" + "                {\r\n"
				+ "                    \"cid\": 201173506,\r\n" + "                    \"is_parent\": true,\r\n"
				+ "                    \"name\": \"兑换卡\",\r\n" + "                    \"parent_cid\": 0\r\n"
				+ "                }\r\n" + "            ]\r\n" + "        },\r\n"
				+ "        \"request_id\": \"4e7k8zduwjut\"\r\n" + "    }\r\n" + "}";
		
		
		String str2 = "{\r\n" + 
				"	\"itemcats_get_response\": {\r\n" + 
				"		\"item_cats\": {\r\n" + 
				"			\"item_cat\": [{\r\n" + 
				"				\"cid\": 50011153,\r\n" + 
				"				\"is_parent\": false,\r\n" + 
				"				\"name\": \"背心\\/马甲\",\r\n" + 
				"				\"parent_cid\": 30\r\n" + 
				"			}, {\r\n" + 
				"				\"cid\": 50000436,\r\n" + 
				"				\"is_parent\": false,\r\n" + 
				"				\"name\": \"T恤\",\r\n" + 
				"				\"parent_cid\": 30\r\n" + 
				"			}, {\r\n" + 
				"				\"cid\": 50010402,\r\n" + 
				"				\"is_parent\": false,\r\n" + 
				"				\"name\": \"Polo衫\",\r\n" + 
				"				\"parent_cid\": 30\r\n" + 
				"			}, {\r\n" + 
				"				\"cid\": 50011123,\r\n" + 
				"				\"is_parent\": false,\r\n" + 
				"				\"name\": \"衬衫\",\r\n" + 
				"				\"parent_cid\": 30\r\n" + 
				"			}, {\r\n" + 
				"				\"cid\": 50000557,\r\n" + 
				"				\"is_parent\": false,\r\n" + 
				"				\"name\": \"针织衫\\/毛衣\",\r\n" + 
				"				\"parent_cid\": 30\r\n" + 
				"			}, {\r\n" + 
				"				\"cid\": 50010167,\r\n" + 
				"				\"is_parent\": false,\r\n" + 
				"				\"name\": \"牛仔裤\",\r\n" + 
				"				\"parent_cid\": 30\r\n" + 
				"			}, {\r\n" + 
				"				\"cid\": 3035,\r\n" + 
				"				\"is_parent\": false,\r\n" + 
				"				\"name\": \"休闲裤\",\r\n" + 
				"				\"parent_cid\": 30\r\n" + 
				"			}, {\r\n" + 
				"				\"cid\": 50025885,\r\n" + 
				"				\"is_parent\": false,\r\n" + 
				"				\"name\": \"棉裤\",\r\n" + 
				"				\"parent_cid\": 30\r\n" + 
				"			}, {\r\n" + 
				"				\"cid\": 50025884,\r\n" + 
				"				\"is_parent\": false,\r\n" + 
				"				\"name\": \"羽绒裤\",\r\n" + 
				"				\"parent_cid\": 30\r\n" + 
				"			}, {\r\n" + 
				"				\"cid\": 50011127,\r\n" + 
				"				\"is_parent\": false,\r\n" + 
				"				\"name\": \"皮裤\",\r\n" + 
				"				\"parent_cid\": 30\r\n" + 
				"			}, {\r\n" + 
				"				\"cid\": 50010158,\r\n" + 
				"				\"is_parent\": false,\r\n" + 
				"				\"name\": \"夹克\",\r\n" + 
				"				\"parent_cid\": 30\r\n" + 
				"			}, {\r\n" + 
				"				\"cid\": 50010159,\r\n" + 
				"				\"is_parent\": false,\r\n" + 
				"				\"name\": \"卫衣\",\r\n" + 
				"				\"parent_cid\": 30\r\n" + 
				"			}, {\r\n" + 
				"				\"cid\": 50011159,\r\n" + 
				"				\"is_parent\": false,\r\n" + 
				"				\"name\": \"风衣\",\r\n" + 
				"				\"parent_cid\": 30\r\n" + 
				"			}, {\r\n" + 
				"				\"cid\": 50025883,\r\n" + 
				"				\"is_parent\": false,\r\n" + 
				"				\"name\": \"毛呢大衣\",\r\n" + 
				"				\"parent_cid\": 30\r\n" + 
				"			}, {\r\n" + 
				"				\"cid\": 50011165,\r\n" + 
				"				\"is_parent\": false,\r\n" + 
				"				\"name\": \"棉衣\",\r\n" + 
				"				\"parent_cid\": 30\r\n" + 
				"			}, {\r\n" + 
				"				\"cid\": 50011161,\r\n" + 
				"				\"is_parent\": false,\r\n" + 
				"				\"name\": \"皮衣\",\r\n" + 
				"				\"parent_cid\": 30\r\n" + 
				"			}, {\r\n" + 
				"				\"cid\": 50011167,\r\n" + 
				"				\"is_parent\": false,\r\n" + 
				"				\"name\": \"羽绒服\",\r\n" + 
				"				\"parent_cid\": 30\r\n" + 
				"			}, {\r\n" + 
				"				\"cid\": 50010160,\r\n" + 
				"				\"is_parent\": false,\r\n" + 
				"				\"name\": \"西服\",\r\n" + 
				"				\"parent_cid\": 30\r\n" + 
				"			}, {\r\n" + 
				"				\"cid\": 50011129,\r\n" + 
				"				\"is_parent\": false,\r\n" + 
				"				\"name\": \"西裤\",\r\n" + 
				"				\"parent_cid\": 30\r\n" + 
				"			}, {\r\n" + 
				"				\"cid\": 50011130,\r\n" + 
				"				\"is_parent\": false,\r\n" + 
				"				\"name\": \"西服套装\",\r\n" + 
				"				\"parent_cid\": 30\r\n" + 
				"			}, {\r\n" + 
				"				\"cid\": 50001748,\r\n" + 
				"				\"is_parent\": false,\r\n" + 
				"				\"name\": \"民族服装\",\r\n" + 
				"				\"parent_cid\": 30\r\n" + 
				"			}, {\r\n" + 
				"				\"cid\": 124730001,\r\n" + 
				"				\"is_parent\": true,\r\n" + 
				"				\"name\": \"套装\",\r\n" + 
				"				\"parent_cid\": 30\r\n" + 
				"			}, {\r\n" + 
				"				\"cid\": 201302509,\r\n" + 
				"				\"is_parent\": true,\r\n" + 
				"				\"name\": \"民族服装（新）\",\r\n" + 
				"				\"parent_cid\": 30\r\n" + 
				"			}, {\r\n" + 
				"				\"cid\": 201310125,\r\n" + 
				"				\"is_parent\": false,\r\n" + 
				"				\"name\": \"卫裤\",\r\n" + 
				"				\"parent_cid\": 30\r\n" + 
				"			}]\r\n" + 
				"		},\r\n" + 
				"		\"request_id\": \"8ijemwwnslwn\"\r\n" + 
				"	}\r\n" + 
				"}";
		
		
		str2 = "{\r\n" + 
				"	\"itemcats_get_response\": {\r\n" + 
				"		\"item_cats\": {\r\n" + 
				"			\"item_cat\": [{\r\n" + 
				"				\"cid\": 50017905,\r\n" + 
				"				\"is_parent\": false,\r\n" + 
				"				\"name\": \"游戏掌机\",\r\n" + 
				"				\"parent_cid\": 20\r\n" + 
				"			}, {\r\n" + 
				"				\"cid\": 50017906,\r\n" + 
				"				\"is_parent\": false,\r\n" + 
				"				\"name\": \"家用游戏机\",\r\n" + 
				"				\"parent_cid\": 20\r\n" + 
				"			}, {\r\n" + 
				"				\"cid\": 50012068,\r\n" + 
				"				\"is_parent\": false,\r\n" + 
				"				\"name\": \"游戏手柄\",\r\n" + 
				"				\"parent_cid\": 20\r\n" + 
				"			}, {\r\n" + 
				"				\"cid\": 50012834,\r\n" + 
				"				\"is_parent\": true,\r\n" + 
				"				\"name\": \"游戏软件\",\r\n" + 
				"				\"parent_cid\": 20\r\n" + 
				"			}, {\r\n" + 
				"				\"cid\": 50012079,\r\n" + 
				"				\"is_parent\": false,\r\n" + 
				"				\"name\": \"方向盘\",\r\n" + 
				"				\"parent_cid\": 20\r\n" + 
				"			}, {\r\n" + 
				"				\"cid\": 50012080,\r\n" + 
				"				\"is_parent\": false,\r\n" + 
				"				\"name\": \"摇杆\",\r\n" + 
				"				\"parent_cid\": 20\r\n" + 
				"			}, {\r\n" + 
				"				\"cid\": 50012160,\r\n" + 
				"				\"is_parent\": true,\r\n" + 
				"				\"name\": \"PSP专用配件\",\r\n" + 
				"				\"parent_cid\": 20\r\n" + 
				"			}, {\r\n" + 
				"				\"cid\": 50012161,\r\n" + 
				"				\"is_parent\": true,\r\n" + 
				"				\"name\": \"WII\\/WIIU专用配件\",\r\n" + 
				"				\"parent_cid\": 20\r\n" + 
				"			}, {\r\n" + 
				"				\"cid\": 50012162,\r\n" + 
				"				\"is_parent\": true,\r\n" + 
				"				\"name\": \"PS主机专用配件\",\r\n" + 
				"				\"parent_cid\": 20\r\n" + 
				"			}, {\r\n" + 
				"				\"cid\": 50012163,\r\n" + 
				"				\"is_parent\": true,\r\n" + 
				"				\"name\": \"DS\\/3DS专用配件\",\r\n" + 
				"				\"parent_cid\": 20\r\n" + 
				"			}, {\r\n" + 
				"				\"cid\": 50018082,\r\n" + 
				"				\"is_parent\": true,\r\n" + 
				"				\"name\": \"XBOX专用配件\",\r\n" + 
				"				\"parent_cid\": 20\r\n" + 
				"			}, {\r\n" + 
				"				\"cid\": 50018224,\r\n" + 
				"				\"is_parent\": true,\r\n" + 
				"				\"name\": \"世嘉 DC\\/MD\\/SS\\/SEGA 专用配件\",\r\n" + 
				"				\"parent_cid\": 20\r\n" + 
				"			}, {\r\n" + 
				"				\"cid\": 50018225,\r\n" + 
				"				\"is_parent\": true,\r\n" + 
				"				\"name\": \"任天堂NGC\\/FC\\/N64\\/SFC 专用配件\",\r\n" + 
				"				\"parent_cid\": 20\r\n" + 
				"			}, {\r\n" + 
				"				\"cid\": 50018230,\r\n" + 
				"				\"is_parent\": true,\r\n" + 
				"				\"name\": \"任天堂掌机配件\",\r\n" + 
				"				\"parent_cid\": 20\r\n" + 
				"			}, {\r\n" + 
				"				\"cid\": 50025710,\r\n" + 
				"				\"is_parent\": true,\r\n" + 
				"				\"name\": \"PSV专用配件\",\r\n" + 
				"				\"parent_cid\": 20\r\n" + 
				"			}, {\r\n" + 
				"				\"cid\": 126214002,\r\n" + 
				"				\"is_parent\": true,\r\n" + 
				"				\"name\": \"任天堂 SWITCH配件\",\r\n" + 
				"				\"parent_cid\": 20\r\n" + 
				"			}, {\r\n" + 
				"				\"cid\": 50018079,\r\n" + 
				"				\"is_parent\": false,\r\n" + 
				"				\"name\": \"其他配件\",\r\n" + 
				"				\"parent_cid\": 20\r\n" + 
				"			}, {\r\n" + 
				"				\"cid\": 126518004,\r\n" + 
				"				\"is_parent\": true,\r\n" + 
				"				\"name\": \"游戏软件平台\",\r\n" + 
				"				\"parent_cid\": 20\r\n" + 
				"			}, {\r\n" + 
				"				\"cid\": 201301201,\r\n" + 
				"				\"is_parent\": false,\r\n" + 
				"				\"name\": \"手柄充电器\",\r\n" + 
				"				\"parent_cid\": 20\r\n" + 
				"			}, {\r\n" + 
				"				\"cid\": 201302301,\r\n" + 
				"				\"is_parent\": false,\r\n" + 
				"				\"name\": \"手柄硅胶套\",\r\n" + 
				"				\"parent_cid\": 20\r\n" + 
				"			}]\r\n" + 
				"		},\r\n" + 
				"		\"request_id\": \"3qwkmkrxj3ll\"\r\n" + 
				"	}\r\n" + 
				"}";
		
		str2 = "{\r\n" + 
				"	\"itemcats_get_response\": {\r\n" + 
				"		\"item_cats\": {\r\n" + 
				"			\"item_cat\": [{\r\n" + 
				"				\"cid\": 2801,\r\n" + 
				"				\"is_parent\": true,\r\n" + 
				"				\"name\": \"节日\\/派对庆典用品\",\r\n" + 
				"				\"parent_cid\": 21\r\n" + 
				"			}, {\r\n" + 
				"				\"cid\": 50009206,\r\n" + 
				"				\"is_parent\": true,\r\n" + 
				"				\"name\": \"家用五金工具\",\r\n" + 
				"				\"parent_cid\": 21\r\n" + 
				"			}, {\r\n" + 
				"				\"cid\": 50010099,\r\n" + 
				"				\"is_parent\": true,\r\n" + 
				"				\"name\": \"伞\\/雨具\\/防雨\\/防潮\",\r\n" + 
				"				\"parent_cid\": 21\r\n" + 
				"			}, {\r\n" + 
				"				\"cid\": 50010464,\r\n" + 
				"				\"is_parent\": true,\r\n" + 
				"				\"name\": \"扇\\/迷你风扇\\/配件\\/冰垫\\/冰贴\",\r\n" + 
				"				\"parent_cid\": 21\r\n" + 
				"			}, {\r\n" + 
				"				\"cid\": 50012512,\r\n" + 
				"				\"is_parent\": true,\r\n" + 
				"				\"name\": \"保暖贴\\/怀炉\\/保暖用品\",\r\n" + 
				"				\"parent_cid\": 21\r\n" + 
				"			}, {\r\n" + 
				"				\"cid\": 50008275,\r\n" + 
				"				\"is_parent\": true,\r\n" + 
				"				\"name\": \"钟\",\r\n" + 
				"				\"parent_cid\": 21\r\n" + 
				"			}, {\r\n" + 
				"				\"cid\": 50003948,\r\n" + 
				"				\"is_parent\": true,\r\n" + 
				"				\"name\": \"家居健康用品\",\r\n" + 
				"				\"parent_cid\": 21\r\n" + 
				"			}, {\r\n" + 
				"				\"cid\": 50016434,\r\n" + 
				"				\"is_parent\": true,\r\n" + 
				"				\"name\": \"创意礼品\",\r\n" + 
				"				\"parent_cid\": 21\r\n" + 
				"			}, {\r\n" + 
				"				\"cid\": 50012514,\r\n" + 
				"				\"is_parent\": true,\r\n" + 
				"				\"name\": \"防护用品\",\r\n" + 
				"				\"parent_cid\": 21\r\n" + 
				"			}, {\r\n" + 
				"				\"cid\": 50006528,\r\n" + 
				"				\"is_parent\": true,\r\n" + 
				"				\"name\": \"鞋用品\",\r\n" + 
				"				\"parent_cid\": 21\r\n" + 
				"			}, {\r\n" + 
				"				\"cid\": 50023068,\r\n" + 
				"				\"is_parent\": true,\r\n" + 
				"				\"name\": \"美体\\/塑身塑形\\/增高用具\",\r\n" + 
				"				\"parent_cid\": 21\r\n" + 
				"			}, {\r\n" + 
				"				\"cid\": 50025838,\r\n" + 
				"				\"is_parent\": true,\r\n" + 
				"				\"name\": \"驱虫用品\",\r\n" + 
				"				\"parent_cid\": 21\r\n" + 
				"			}, {\r\n" + 
				"				\"cid\": 50025839,\r\n" + 
				"				\"is_parent\": true,\r\n" + 
				"				\"name\": \"香薰用品\",\r\n" + 
				"				\"parent_cid\": 21\r\n" + 
				"			}, {\r\n" + 
				"				\"cid\": 123004002,\r\n" + 
				"				\"is_parent\": true,\r\n" + 
				"				\"name\": \"毛巾\\/浴巾\\/浴袍\",\r\n" + 
				"				\"parent_cid\": 21\r\n" + 
				"			}, {\r\n" + 
				"				\"cid\": 50026403,\r\n" + 
				"				\"is_parent\": false,\r\n" + 
				"				\"name\": \"香包\\/香囊\",\r\n" + 
				"				\"parent_cid\": 21\r\n" + 
				"			}, {\r\n" + 
				"				\"cid\": 50025864,\r\n" + 
				"				\"is_parent\": false,\r\n" + 
				"				\"name\": \"书写板\",\r\n" + 
				"				\"parent_cid\": 21\r\n" + 
				"			}, {\r\n" + 
				"				\"cid\": 121368025,\r\n" + 
				"				\"is_parent\": false,\r\n" + 
				"				\"name\": \"挂历\",\r\n" + 
				"				\"parent_cid\": 21\r\n" + 
				"			}, {\r\n" + 
				"				\"cid\": 121456022,\r\n" + 
				"				\"is_parent\": false,\r\n" + 
				"				\"name\": \"台历\",\r\n" + 
				"				\"parent_cid\": 21\r\n" + 
				"			}, {\r\n" + 
				"				\"cid\": 124232009,\r\n" + 
				"				\"is_parent\": false,\r\n" + 
				"				\"name\": \"家居智能设备\",\r\n" + 
				"				\"parent_cid\": 21\r\n" + 
				"			}, {\r\n" + 
				"				\"cid\": 124180005,\r\n" + 
				"				\"is_parent\": false,\r\n" + 
				"				\"name\": \"家居智能用品\",\r\n" + 
				"				\"parent_cid\": 21\r\n" + 
				"			}, {\r\n" + 
				"				\"cid\": 50025851,\r\n" + 
				"				\"is_parent\": false,\r\n" + 
				"				\"name\": \"电热毯\",\r\n" + 
				"				\"parent_cid\": 21\r\n" + 
				"			}, {\r\n" + 
				"				\"cid\": 121408018,\r\n" + 
				"				\"is_parent\": false,\r\n" + 
				"				\"name\": \"热水袋\",\r\n" + 
				"				\"parent_cid\": 21\r\n" + 
				"			}, {\r\n" + 
				"				\"cid\": 50006277,\r\n" + 
				"				\"is_parent\": false,\r\n" + 
				"				\"name\": \"其它\",\r\n" + 
				"				\"parent_cid\": 21\r\n" + 
				"			}, {\r\n" + 
				"				\"cid\": 201022003,\r\n" + 
				"				\"is_parent\": false,\r\n" + 
				"				\"name\": \"居家日用套装\",\r\n" + 
				"				\"parent_cid\": 21\r\n" + 
				"			}]\r\n" + 
				"		},\r\n" + 
				"		\"request_id\": \"haly6dmmpbue\"\r\n" + 
				"	}\r\n" + 
				"}";
		
		str2 = "{\r\n" + 
				"	\"itemcats_get_response\": {\r\n" + 
				"		\"item_cats\": {\r\n" + 
				"			\"item_cat\": [{\r\n" + 
				"				\"cid\": 50010850,\r\n" + 
				"				\"is_parent\": false,\r\n" + 
				"				\"name\": \"连衣裙\",\r\n" + 
				"				\"parent_cid\": 16\r\n" + 
				"			}, {\r\n" + 
				"				\"cid\": 50000671,\r\n" + 
				"				\"is_parent\": false,\r\n" + 
				"				\"name\": \"T恤\",\r\n" + 
				"				\"parent_cid\": 16\r\n" + 
				"			}, {\r\n" + 
				"				\"cid\": 162104,\r\n" + 
				"				\"is_parent\": false,\r\n" + 
				"				\"name\": \"衬衫\",\r\n" + 
				"				\"parent_cid\": 16\r\n" + 
				"			}, {\r\n" + 
				"				\"cid\": 1622,\r\n" + 
				"				\"is_parent\": true,\r\n" + 
				"				\"name\": \"裤子\",\r\n" + 
				"				\"parent_cid\": 16\r\n" + 
				"			}, {\r\n" + 
				"				\"cid\": 162205,\r\n" + 
				"				\"is_parent\": false,\r\n" + 
				"				\"name\": \"牛仔裤\",\r\n" + 
				"				\"parent_cid\": 16\r\n" + 
				"			}, {\r\n" + 
				"				\"cid\": 1623,\r\n" + 
				"				\"is_parent\": false,\r\n" + 
				"				\"name\": \"半身裙\",\r\n" + 
				"				\"parent_cid\": 16\r\n" + 
				"			}, {\r\n" + 
				"				\"cid\": 50013196,\r\n" + 
				"				\"is_parent\": false,\r\n" + 
				"				\"name\": \"马夹\",\r\n" + 
				"				\"parent_cid\": 16\r\n" + 
				"			}, {\r\n" + 
				"				\"cid\": 162116,\r\n" + 
				"				\"is_parent\": false,\r\n" + 
				"				\"name\": \"蕾丝衫\\/雪纺衫\",\r\n" + 
				"				\"parent_cid\": 16\r\n" + 
				"			}, {\r\n" + 
				"				\"cid\": 50000697,\r\n" + 
				"				\"is_parent\": false,\r\n" + 
				"				\"name\": \"毛针织衫\",\r\n" + 
				"				\"parent_cid\": 16\r\n" + 
				"			}, {\r\n" + 
				"				\"cid\": 50011277,\r\n" + 
				"				\"is_parent\": false,\r\n" + 
				"				\"name\": \"短外套\",\r\n" + 
				"				\"parent_cid\": 16\r\n" + 
				"			}, {\r\n" + 
				"				\"cid\": 50008897,\r\n" + 
				"				\"is_parent\": false,\r\n" + 
				"				\"name\": \"西装\",\r\n" + 
				"				\"parent_cid\": 16\r\n" + 
				"			}, {\r\n" + 
				"				\"cid\": 50008898,\r\n" + 
				"				\"is_parent\": false,\r\n" + 
				"				\"name\": \"卫衣\\/绒衫\",\r\n" + 
				"				\"parent_cid\": 16\r\n" + 
				"			}, {\r\n" + 
				"				\"cid\": 162103,\r\n" + 
				"				\"is_parent\": false,\r\n" + 
				"				\"name\": \"毛衣\",\r\n" + 
				"				\"parent_cid\": 16\r\n" + 
				"			}, {\r\n" + 
				"				\"cid\": 50008901,\r\n" + 
				"				\"is_parent\": false,\r\n" + 
				"				\"name\": \"风衣\",\r\n" + 
				"				\"parent_cid\": 16\r\n" + 
				"			}, {\r\n" + 
				"				\"cid\": 50013194,\r\n" + 
				"				\"is_parent\": false,\r\n" + 
				"				\"name\": \"毛呢外套\",\r\n" + 
				"				\"parent_cid\": 16\r\n" + 
				"			}, {\r\n" + 
				"				\"cid\": 50008900,\r\n" + 
				"				\"is_parent\": false,\r\n" + 
				"				\"name\": \"棉衣\\/棉服\",\r\n" + 
				"				\"parent_cid\": 16\r\n" + 
				"			}, {\r\n" + 
				"				\"cid\": 50008899,\r\n" + 
				"				\"is_parent\": false,\r\n" + 
				"				\"name\": \"羽绒服\",\r\n" + 
				"				\"parent_cid\": 16\r\n" + 
				"			}, {\r\n" + 
				"				\"cid\": 50008904,\r\n" + 
				"				\"is_parent\": false,\r\n" + 
				"				\"name\": \"皮衣\",\r\n" + 
				"				\"parent_cid\": 16\r\n" + 
				"			}, {\r\n" + 
				"				\"cid\": 50008905,\r\n" + 
				"				\"is_parent\": false,\r\n" + 
				"				\"name\": \"皮草\",\r\n" + 
				"				\"parent_cid\": 16\r\n" + 
				"			}, {\r\n" + 
				"				\"cid\": 50000852,\r\n" + 
				"				\"is_parent\": false,\r\n" + 
				"				\"name\": \"中老年女装\",\r\n" + 
				"				\"parent_cid\": 16\r\n" + 
				"			}, {\r\n" + 
				"				\"cid\": 1629,\r\n" + 
				"				\"is_parent\": false,\r\n" + 
				"				\"name\": \"大码女装\",\r\n" + 
				"				\"parent_cid\": 16\r\n" + 
				"			}, {\r\n" + 
				"				\"cid\": 1624,\r\n" + 
				"				\"is_parent\": true,\r\n" + 
				"				\"name\": \"套装\\/学生校服\\/工作制服\",\r\n" + 
				"				\"parent_cid\": 16\r\n" + 
				"			}, {\r\n" + 
				"				\"cid\": 50011404,\r\n" + 
				"				\"is_parent\": true,\r\n" + 
				"				\"name\": \"婚纱\\/旗袍\\/礼服\",\r\n" + 
				"				\"parent_cid\": 16\r\n" + 
				"			}, {\r\n" + 
				"				\"cid\": 50008906,\r\n" + 
				"				\"is_parent\": true,\r\n" + 
				"				\"name\": \"唐装\\/民族服装\\/舞台服装\",\r\n" + 
				"				\"parent_cid\": 16\r\n" + 
				"			}, {\r\n" + 
				"				\"cid\": 121412004,\r\n" + 
				"				\"is_parent\": false,\r\n" + 
				"				\"name\": \"背心吊带\",\r\n" + 
				"				\"parent_cid\": 16\r\n" + 
				"			}, {\r\n" + 
				"				\"cid\": 121434004,\r\n" + 
				"				\"is_parent\": false,\r\n" + 
				"				\"name\": \"抹胸\",\r\n" + 
				"				\"parent_cid\": 16\r\n" + 
				"			}, {\r\n" + 
				"				\"cid\": 201241307,\r\n" + 
				"				\"is_parent\": false,\r\n" + 
				"				\"name\": \"POLO衫\",\r\n" + 
				"				\"parent_cid\": 16\r\n" + 
				"			}, {\r\n" + 
				"				\"cid\": 201247207,\r\n" + 
				"				\"is_parent\": false,\r\n" + 
				"				\"name\": \"连体衣\\/裤\",\r\n" + 
				"				\"parent_cid\": 16\r\n" + 
				"			}]\r\n" + 
				"		},\r\n" + 
				"		\"request_id\": \"x7g0k0eyd4de\"\r\n" + 
				"	}\r\n" + 
				"}";
		JSONObject jsonObject = JSON.parseObject(str2);

		JSONObject object = jsonObject.getJSONObject("itemcats_get_response").getJSONObject("item_cats");

		JSONArray jsonArray = object.getJSONArray("item_cat");

//		System.out.println(jsonArray.size());

//		for (int i = 0; i < jsonArray.size(); i++) {
//			jsonArray.getJSONObject(i).get("cid");
//			jsonArray.getJSONObject(i).get("is_parent");
//			jsonArray.getJSONObject(i).get("name");
//			jsonArray.getJSONObject(i).get("parent_cid");
//			System.out.println();
//
//		}
//		JSONArray转成对象集合
		String JSONStr = JSON.toJSONString(jsonArray);
		List<JavaBean> busLineList = JSON.parseObject(JSONStr, new TypeReference<List<JavaBean>>() {
		});

		for (JavaBean javaBean : busLineList) {
			System.out.println(javaBean.getCid() + ":" + javaBean.getIs_parent() + ":" + javaBean.getName() + ":"
					+ javaBean.getParent_cid());
		}
	}
}

@Data
class JavaBean {
	private String cid;
	private String is_parent;
	private String name;
	private String parent_cid;
}
