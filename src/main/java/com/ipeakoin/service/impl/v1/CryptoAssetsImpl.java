package com.ipeakoin.service.impl.v1;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ipeakoin.httpclient.http.HttpRequestsBase;
import com.ipeakoin.service.v1.CryptoAssets;

/**
 * @author klover
 * @description CryptoAssetsImpl
 * @date 2023/7/17 15:43
 */
public class CryptoAssetsImpl implements CryptoAssets {
    /**
     * http service
     */
    private final HttpRequestsBase service;

    private final ObjectMapper mapper;

    public CryptoAssetsImpl(HttpRequestsBase service, ObjectMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }
}
