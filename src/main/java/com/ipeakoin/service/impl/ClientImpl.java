package com.ipeakoin.service.impl;

import com.ipeakoin.httpclient.dto.Res;
import com.ipeakoin.httpclient.http.HttpRequestsBase;
import com.ipeakoin.service.Client;
import com.ipeakoin.service.dto.CodeOutput;

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
     */
    @Override
    public CodeOutput getCode() {
        HttpRequestsBase service = new HttpRequestsBase.Builder().config("").build();
        try {
            String uri = this.baseurl + "/open-api/oauth/authorize";
            HashMap<String, Object> map = new HashMap<>(2);
            map.put("clientId", clientId);
            map.put("clientSecret", clientSecret);
            Res res = service.getRequest(uri, map);
            CodeOutput output = new CodeOutput();
//            output.setContent(JsonUtil.toBean(res.getContent(), CodeContentOutput.class));
            output.setReason(res.getReason());
            output.setStatus(res.getStatus());
            return output;
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