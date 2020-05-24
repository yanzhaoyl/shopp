package com.yanzhaoyl.shopp.taobao.util;

public class DataReinforce {

    /**
     * 加密，把一个字符串在原有的基础上+10
     * 
     * @param data 需要解密的原字符串
     * @return 返回解密后的新字符串
     */
    public static String encode(String data) {
        // 把字符串转为字节数组
        byte[] b = data.getBytes();
        // 遍历
        for (int i = 0; i < b.length; i++) {
            b[i] += 10;// 在原有的基础上+10
        }
        return new String(b);
    }

    /**
     * 解密：把一个加密后的字符串在原有基础上-10
     * 
     * @param data 加密后的字符串
     * @return 返回解密后的新字符串
     */
    public static String decode(String data) {
        // 把字符串转为字节数组
        byte[] b = data.getBytes();
        // 遍历
        for (int i = 0; i < b.length; i++) {
            b[i] -= 10;// 在原有的基础上-10
        }
        return new String(b);
    }

    
        public static void main(String[] args) {
             String data = "https://eco.taobao.com/router/rest";
    
             System.out.println("原值:" + data);
             String encode = DataReinforce.encode(data);
             System.out.println("加密: :" + encode + ":");
             System.out.println("加密 长度:" + encode.length());
             
             System.out.println("解密:" + DataReinforce.decode("r~~z}D99omy8~kylky8myw9|y~o|9|o}~"));
        }
}