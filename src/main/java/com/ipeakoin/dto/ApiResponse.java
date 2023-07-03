package com.ipeakoin.dto;

import java.util.Map;

/**
 * @author klover
 * description ApiResponse
 * date 2023/6/28 16:40
 */
public class ApiResponse<T> {
    /**
     * res headers
     */
    private final Map<String, String> headers;

    /**
     * res body
     */
    private final T data;

    /**
     * ApiResponse
     *
     * @param headers headers
     */
    public ApiResponse(Map<String, String> headers) {
        this(headers, null);
    }

    /**
     * ApiResponse
     *
     * @param headers headers
     * @param data    data
     */
    public ApiResponse(Map<String, String> headers, T data) {
        this.headers = headers;
        this.data = data;
    }

    /**
     * getHeaders
     *
     * @return Map
     */
    public Map<String, String> getHeaders() {
        return headers;
    }

    /**
     * getData
     *
     * @return T
     */
    public T getData() {
        return data;
    }
}