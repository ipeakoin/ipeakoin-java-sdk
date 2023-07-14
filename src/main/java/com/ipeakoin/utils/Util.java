package com.ipeakoin.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ipeakoin.dto.ApiException;
import com.ipeakoin.dto.ApiResponse;

import java.util.HashMap;
import java.util.Map;

/**
 * @author klover
 * description util
 * date 2023/7/3 15:48
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

    /**
     * returnType
     *
     * @param mapper  mapper
     * @param generic generic
     * @return JavaType
     */
    public static JavaType returnType(ObjectMapper mapper, JavaType generic) {
        return mapper.getTypeFactory().constructParametricType(ApiResponse.class, generic);
    }

    /**
     * returnType
     *
     * @param mapper         mapper
     * @param parameterClass parameterClass
     * @return JavaType
     */
    public static JavaType returnType(ObjectMapper mapper, Class<?> parameterClass) {
        return mapper.getTypeFactory().constructParametricType(ApiResponse.class, parameterClass);
    }

    /**
     * json to string
     *
     * @param mapper mapper
     * @param value  value
     * @return
     * @throws RuntimeException
     */
    public static String JsonToString(ObjectMapper mapper, Object value) throws RuntimeException {
        try {
            return mapper.writeValueAsString(value);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * json to Map
     *
     * @param mapper mapper
     * @param value  value
     * @return RuntimeException
     */
    public static Map<String, Object> JsonToMap(ObjectMapper mapper, Object value) throws RuntimeException {
        try {
            return mapper.readValue(JsonToString(mapper, value), new TypeReference<HashMap<String, Object>>() {
            });
        } catch (JsonMappingException e) {
            throw new RuntimeException(e);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}