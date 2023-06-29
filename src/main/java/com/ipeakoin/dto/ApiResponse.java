package com.ipeakoin.dto;

import java.util.Map;

/**
 * @author klover
 * description ApiResponse
 * date 2023/6/28 16:40
 */
public class ApiResponse<T> {
    private final Map<String, String> headers;

    private final T data;


    public ApiResponse(Map<String, String> headers) {
        this(headers, null);
    }

    public ApiResponse(Map<String, String> headers, T data) {
        this.headers = headers;
        this.data = data;
    }

    public Map<String, String> getHeaders() {
        return headers;
    }

    public T getData() {
        return data;
    }
}