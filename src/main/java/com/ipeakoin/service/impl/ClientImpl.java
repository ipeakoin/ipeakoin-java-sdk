package com.ipeakoin.service.impl;

import com.ipeakoin.dto.ApiException;
import com.ipeakoin.dto.ApiResponse;
import com.ipeakoin.httpclient.http.HttpRequestsBase;
import com.ipeakoin.service.Client;
import com.ipeakoin.dto.res.CodeRes;
import jakarta.ws.rs.core.GenericType;
import org.apache.http.impl.client.CloseableHttpClient;

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
    private final CloseableHttpClient httpClient;
    /**
     * 是否主动关闭连接池
     */
    private final Boolean isCloseHttpClient;

    public ClientImpl(CloseableHttpClient httpClient, String clientId, String clientSecret, String baseurl, Boolean isCloseHttpClient) {
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.baseurl = baseurl;
        this.httpClient = httpClient;
        this.isCloseHttpClient = isCloseHttpClient;
    }

    /**
     * 关闭http 请求连接池
     */
    @Override
    public void closeHttpClient() {
        try {
            httpClient.close();
        } catch (Exception e) {
        }
    }

    /**
     * 获取code
     *
     * @return {@link ApiResponse< CodeRes >}
     * @throws {@link ApiException}
     */
    @Override
    public ApiResponse<CodeRes> getCode() throws ApiException {

        HttpRequestsBase service = new HttpRequestsBase.Builder().build(this.httpClient, "");
        String uri = this.baseurl + "/open-api/oauth/authorize";
        HashMap<String, Object> map = new HashMap<>(2);
        map.put("clientId", clientId);
        map.put("clientSecret", clientSecret);
        GenericType<CodeRes> returnType = new GenericType<>() {
        };
        ApiResponse<CodeRes> api = service.invokeAPI(uri, "GET", map, returnType);
        if (this.isCloseHttpClient) {
            this.closeHttpClient();
        }
        return api;
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