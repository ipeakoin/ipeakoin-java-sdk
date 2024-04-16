package com.ipeakoin.utils;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.security.Key;
import java.util.*;


/**
 * HmacCryptoUtil
 *
 * @author klover
 * @date 2024/4/11 15:35
 */
public class HmacCryptoUtil {
    private static final String ALGORITHM = "HmacSHA256";

    public static void main(String[] args) {
        Map<String, String> address = new HashMap<>();
        address.put("addressLine1", "20 Barneson ave");
        address.put("addressLine2", "");
        address.put("city", "San Mateo");
        address.put("country", "US");
        address.put("postalCode", "94402");
        address.put("state", "California");

        Map<String, Object> data = new HashMap<>();
        data.put("id", "b9ce056b-c1f8-4f19-b014-d7be02a54598");
        data.put("accountId", "01eba490-5f9c-48a6-aa2d-7bcfdff0d720");
        data.put("token", "0ef85b24-866f-4c03-a7e8-459e3742642b");
        data.put("status", "Active");
        data.put("currency", "USD");
        data.put("provider", "PrepaidCard_493728");
        data.put("userName", "test test");
        data.put("createTime", "2023-05-31T07:29:46.784Z");
        data.put("qbitCardNoLastFour", "1234");
        data.put("label", "ce08100b-fca8-4a13-bbfc-c381aeaec5d0");
        data.put("useType", "79f22263-a3fe-4347-8a40-2af6bf422839");
        data.put("balanceId", "ab43462f-93b3-4540-8601-11d759948ee7");
        data.put("budgetId", null);
        data.put("cardAddress", address);

        String s = encryptHmacSHA256(joinStr(data), "25d55ad283aa400af464c76d713c07ad");
        System.out.println(s);
    }

    /**
     * hmac-sha256签名
     *
     * @param str    待签名的名为
     * @param secret 密钥
     * @return String
     */
    public static String encryptHmacSHA256(String str, String secret) {
        try {
            Key sk = new SecretKeySpec(secret.getBytes(), ALGORITHM);
            Mac mac = Mac.getInstance(sk.getAlgorithm());
            mac.init(sk);

            byte[] bytes = mac.doFinal(str.getBytes());
            return bytesToHex(bytes);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public static String joinStr(Map<String, Object> data) {
        String[] keys = data.keySet().toArray(new String[0]);
        Arrays.sort(keys);
        StringBuilder sb = new StringBuilder();
        for (String key : keys) {
            Object val = data.get(key);
            if (val == null) {
                val = "";
            }
            if (val instanceof Map<?, ?>) {
                val = JsonUtil.toJSONString(new TreeMap<>((Map<?, ?>) val));
            }
            sb.append(key).append("=").append(val).append("&");
        }
        String str = sb.toString();
        return str.substring(0, str.length() - 1);
    }


    /**
     * bytes To Hex
     *
     * @param bytes 字节
     * @return String
     */
    private static String bytesToHex(byte[] bytes) {
        StringBuilder sb = new StringBuilder(bytes.length * 2);
        Formatter formatter = new Formatter(sb);
        for (byte b : bytes) {
            formatter.format("%02x", b);
        }
        return sb.toString();
    }
}
