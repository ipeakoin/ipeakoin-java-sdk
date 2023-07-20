package com.ipeakoin.service.impl.v1;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ipeakoin.httpclient.http.HttpRequestsBase;
import com.ipeakoin.service.v1.GlobalAccount;

/**
 * @author klover
 * @description GlobalAccountImpl
 * @date 2023/7/17 15:41
 */
public class GlobalAccountImpl implements GlobalAccount {
    /**
     * http service
     */
    private final HttpRequestsBase service;

    private final ObjectMapper mapper;

    public GlobalAccountImpl(HttpRequestsBase service, ObjectMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }
}
