package com.ipeakoin.utils;

import java.util.Map;
import java.util.Objects;

/**
 * Util
 *
 * @author klover
 * @date 2024/4/11 15:30
 */

public class Util {
    /**
     * 处理get 请求参数
     *
     * @param map 参数
     * @param url 链接
     * @return String
     */
    public static String dealGetParams(Map<String, Object> map, String url) {
        if (map == null) {
            return url;
        }
        StringBuilder uri = new StringBuilder(url);
        int i = 0;
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            if (entry.getValue() == null) continue;
            if (Objects.equals(entry.getKey(), "accessToken")) continue;
            if (i == 0) {
                uri.append("?");
            } else {
                uri.append("&");
            }
            uri.append(entry.getKey()).append("=").append(entry.getValue());
            ++i;
        }

        return uri.toString();
    }
}
