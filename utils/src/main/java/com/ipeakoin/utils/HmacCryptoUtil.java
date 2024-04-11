package com.ipeakoin.utils;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.security.Key;
import java.util.Formatter;

/**
 * HmacCryptoUtil
 *
 * @author klover
 * @date 2024/4/11 15:35
 */
public class HmacCryptoUtil {
    private static final String ALGORITHM = "HmacSHA256";

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
