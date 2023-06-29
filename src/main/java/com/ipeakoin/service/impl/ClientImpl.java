package com.ipeakoin.service.impl;

import com.ipeakoin.dto.ApiException;
import com.ipeakoin.dto.ApiResponse;
import com.ipeakoin.httpclient.dto.Res;
import com.ipeakoin.httpclient.http.HttpRequestsBase;
import com.ipeakoin.service.Client;
import com.ipeakoin.service.dto.CodeContentOutput;
import com.ipeakoin.service.dto.CodeOutput;
import jakarta.ws.rs.core.GenericType;

import java.util.HashMap;

/**
 * @author klover
 * description IPeakoinClientImpl
 * date 2023/6/27 16:23
 */
public class ClientImpl implements Client {
    private final String clientId;
    private final String clientSecret;
    private final String baseurl;

    public ClientImpl(String clientId, String clientSecret, String baseurl) {
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.baseurl = baseurl;
    }

    /**
     * 获取code
     *
     * @return {@link ApiResponse<CodeContentOutput>}
     * @throws {@link ApiException}
     */
    @Override
    public ApiResponse<CodeContentOutput> getCode() throws ApiException {
        HttpRequestsBase service = new HttpRequestsBase.Builder().config("").build();
        try {
            String uri = this.baseurl + "/open-api/oauth/authorize";
            HashMap<String, Object> map = new HashMap<>(2);
            map.put("clientId", clientId);
            map.put("clientSecret", clientSecret);
            GenericType<CodeContentOutput> returnType = new GenericType<>() {
            };
            return service.invokeAPI(uri, "GET", map, returnType);
        } finally {
            service.close();
        }
    }

    /**
     * 获取access token
     *
     * @param code code
     */
    @Override
    public void getAccessToken(String code) {

    }
}