package com.ipeakoin.utils;

import com.ipeakoin.service.impl.ClientImpl;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.security.Key;
import java.util.Arrays;
import java.util.Formatter;
import java.util.Map;
import java.util.TreeMap;

import static com.ipeakoin.utils.Util.JsonToString;

/**
 * @author klover
 * description HmacCryptoUtil
 * date 2023/6/27 16:31
 */
public class HmacCryptoUtil {
    private static final String ALGORITHM = "HmacSHA256";

    /**
     * hmac-sha256签名
     *
     * @param data   待签名数据
     * @param secret 密钥
     * @return String
     */
    public static String encryptHmacSHA256(Map<String, Object> data, String secret) {
        try {
            String str = jsonToString(data);

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

    /**
     * json to string 并且排序
     *
     * @param data 待处理数据
     * @return String
     */
    private static String jsonToString(Map<String, Object> data) {
        String[] keys = data.keySet().toArray(new String[0]);
        Arrays.sort(keys);
        StringBuilder sb = new StringBuilder();
        for (String key : keys) {
            Object val = data.get(key);
            if (val == null) {
                val = "";
            }
            if (val instanceof Map<?, ?>) {
                val = JsonToString(ClientImpl.mapper, new TreeMap<>((Map<?, ?>) val));
            }
            sb.append(key).append("=").append(val).append("&");
        }
        String str = sb.toString();
        return str.substring(0, str.length() - 1);
    }
}