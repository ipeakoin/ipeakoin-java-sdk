package com.ipeakoin.service.impl.v2;

import com.ipeakoin.service.v2.V2;

/**
 * @author klover
 * description V2
 * date 2023/6/29 16:58
 */
public class V2Impl implements V2 {
    /**
     * base url
     */
    private final String baseUrl;

    /**
     * v2
     *
     * @param baseUrl base url
     */
    public V2Impl(String baseUrl) {
        this.baseUrl = baseUrl;
    }
}