package com.ipeakoin.service.impl.v2;

import com.ipeakoin.httpclient.http.HttpRequestsBase;
import com.ipeakoin.service.v2.V2;

/**
 * @author klover
 * description V2
 * date 2023/6/29 16:58
 */
public class V2Impl implements V2 {
    private final HttpRequestsBase service;

    /**
     * v2
     *
     * @param service http service
     */
    public V2Impl(HttpRequestsBase service) {
        this.service = service;
    }
}