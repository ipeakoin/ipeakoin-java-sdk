package com.ipeakoin.service.impl;

import com.ipeakoin.dto.ApiException;
import com.ipeakoin.dto.ApiResponse;
import com.ipeakoin.dto.req.CodeReq;
import com.ipeakoin.dto.res.AccessTokenRes;
import com.ipeakoin.dto.res.RefreshAccessTokenRes;
import com.ipeakoin.httpclient.http.HttpRequestsBase;
import com.ipeakoin.service.Client;
import com.ipeakoin.dto.res.CodeRes;
import com.ipeakoin.service.impl.v1.V1Impl;
import com.ipeakoin.service.impl.v2.V2Impl;
import com.ipeakoin.service.v1.V1;
import com.ipeakoin.service.v2.V2;
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
    private HttpRequestsBase service;
    private String accessToken;
    /**
     * 是否主动关闭连接池
     */
    private final Boolean isCloseHttpClient;
    private static volatile V1 v1Service;
    private static volatile V2 v2Service;

    /**
     * ClientImpl
     *
     * @param httpClient        httpClient
     * @param clientId          clientId
     * @param clientSecret      clientSecret
     * @param baseurl           baseurl
     * @param isCloseHttpClient isCloseHttpClient
     */
    public ClientImpl(CloseableHttpClient httpClient, String clientId, String clientSecret, String baseurl, Boolean isCloseHttpClient) {
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.baseurl = baseurl;
        this.httpClient = httpClient;
        this.isCloseHttpClient = isCloseHttpClient;
        this.service = new HttpRequestsBase.Builder().build(this.httpClient);

    }

    /**
     * 添加 accessToken
     *
     * @param accessToken {@link String}
     */
    @Override
    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        this.service.setAccessToken(this.accessToken);
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
     * @return {@link ApiResponse<CodeRes>}
     * @throws ApiException error
     */
    @Override
    public ApiResponse<CodeRes> getCode() throws ApiException {
        return this.getCode(new CodeReq());
    }

    /**
     * 获取code
     *
     * @param input {@link CodeReq}
     * @return {@link ApiResponse<CodeRes>}
     * @throws ApiException error
     */
    @Override
    public ApiResponse<CodeRes> getCode(CodeReq input) throws ApiException {
        String uri = this.baseurl + "/open-api/oauth/authorize";
        HashMap<String, Object> map = new HashMap<>(2);
        map.put("clientId", clientId);
        if (input.getState() != null) {
            map.put("state", input.getState());
        }
        if (input.getRedirectUri() != null) {
            map.put("redirectUri", input.getRedirectUri());
        }
        GenericType<CodeRes> returnType = new GenericType<>() {
        };
        ApiResponse<CodeRes> api = this.service.invokeAPI(uri, "GET", map, returnType);
        if (this.isCloseHttpClient) {
            this.closeHttpClient();
        }
        return api;
    }

    /**
     * 获取access token
     *
     * @param code {@link String}
     * @return {@link ApiResponse<AccessTokenRes>}
     * @throws ApiException error
     */
    @Override
    public ApiResponse<AccessTokenRes> getAccessToken(String code) throws ApiException {
        String uri = this.baseurl + "/open-api/oauth/access-token";
        HashMap<String, Object> map = new HashMap<>(2);
        map.put("clientId", clientId);
        map.put("clientSecret", clientSecret);
        map.put("code", code);

        GenericType<AccessTokenRes> returnType = new GenericType<>() {
        };
        ApiResponse<AccessTokenRes> api = this.service.invokeAPI(uri, "POST", map, returnType);
        if (this.isCloseHttpClient) {
            this.closeHttpClient();
        }
        return api;
    }

    /**
     * 刷新access token
     *
     * @param refreshToken {@link String}
     * @return {@link ApiResponse<RefreshAccessTokenRes>}
     * @throws ApiException error
     */
    @Override
    public ApiResponse<RefreshAccessTokenRes> refreshAccessToken(String refreshToken) throws ApiException {
        String uri = this.baseurl + "/open-api/oauth/refresh-token";
        HashMap<String, Object> map = new HashMap<>(2);
        map.put("clientId", clientId);
        map.put("refreshToken", refreshToken);

        GenericType<RefreshAccessTokenRes> returnType = new GenericType<>() {
        };
        ApiResponse<RefreshAccessTokenRes> api = this.service.invokeAPI(uri, "POST", map, returnType);
        if (this.isCloseHttpClient) {
            this.closeHttpClient();
        }
        return api;
    }

    /**
     * V1 版接口
     *
     * @return {@link V1}
     */
    @Override
    public V1 v1() {
        if (v1Service == null) {
            synchronized (V1Impl.class) {
                if (v1Service == null) {
                    v1Service = new V1Impl(this.baseurl);
                }
            }
        }
        return v1Service;
    }

    /**
     * V2 版接口
     *
     * @return {@link V2}
     */
    @Override
    public V2 v2() {
        if (v2Service == null) {
            synchronized (V2Impl.class) {
                if (v2Service == null) {
                    v2Service = new V2Impl(this.baseurl);
                }
            }
        }
        return v2Service;
    }
}