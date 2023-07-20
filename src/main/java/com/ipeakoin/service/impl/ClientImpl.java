package com.ipeakoin.service.impl;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.ipeakoin.dto.ApiException;
import com.ipeakoin.dto.ApiResponse;
import com.ipeakoin.dto.req.CodeReq;
import com.ipeakoin.dto.res.AccessTokenRes;
import com.ipeakoin.dto.res.CodeRes;
import com.ipeakoin.dto.res.RefreshAccessTokenRes;
import com.ipeakoin.httpclient.constant.Constant;
import com.ipeakoin.httpclient.http.HttpRequestsBase;
import com.ipeakoin.service.Client;
import com.ipeakoin.service.impl.v1.V1Impl;
import com.ipeakoin.service.impl.v2.V2Impl;
import com.ipeakoin.service.v1.V1;
import com.ipeakoin.service.v2.V2;
import com.ipeakoin.utils.Util;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;

import javax.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;

import static com.ipeakoin.utils.Util.JsonToString;

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
    private final HttpRequestsBase service;
    private static volatile V1 v1Service;
    private static volatile V2 v2Service;

    private static final ObjectMapper mapper = new ObjectMapper();

    static {
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
//        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }

    /**
     * ClientImpl
     *
     * @param httpClient   httpClient
     * @param clientId     clientId
     * @param clientSecret clientSecret
     * @param baseurl      baseurl
     */
    public ClientImpl(CloseableHttpClient httpClient, String clientId, String clientSecret, String baseurl) {
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.baseurl = baseurl;
        this.httpClient = httpClient;
        this.service = new HttpRequestsBase.Builder().build(this.httpClient, baseurl, mapper);
    }

    /**
     * 关闭http 请求连接池
     */
    @Override
    public void closeHttpClient() {
        try {
            this.service.closeHttpClient();
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
        String url = "/open-api/oauth/authorize";
        Map<String, Object> map = new HashMap<>(2);
        map.put("clientId", clientId);
        if (input.getState() != null) {
            map.put("state", input.getState());
        }
        if (input.getRedirectUri() != null) {
            map.put("redirectUri", input.getRedirectUri());
        }
        GenericType<CodeRes> returnType = new GenericType<CodeRes>() {
        };

        return this.service.authInvokeAPI(Util.dealGetParams(map, url), "GET", null, null, returnType);
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
        String uri = "/open-api/oauth/access-token";
        Map<String, Object> map = new HashMap<>(2);
        map.put("clientId", clientId);
        map.put("clientSecret", clientSecret);
        map.put("code", code);

        GenericType<AccessTokenRes> returnType = new GenericType<AccessTokenRes>() {
        };
        String jsonString = JsonToString(mapper, map);
        StringEntity entity = new StringEntity(jsonString, Constant.CHARSET);

        return this.service.authInvokeAPI(uri, "POST", entity, null, returnType);
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
        String uri = "/open-api/oauth/refresh-token";
        Map<String, Object> map = new HashMap<>(2);
        map.put("clientId", clientId);
        map.put("refreshToken", refreshToken);

        GenericType<RefreshAccessTokenRes> returnType = new GenericType<RefreshAccessTokenRes>() {
        };
        String jsonString = JsonToString(mapper, map);
        StringEntity entity = new StringEntity(jsonString, Constant.CHARSET);

        return this.service.authInvokeAPI(uri, "POST", entity, null, returnType);
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
                    v1Service = new V1Impl(this.service, this.mapper);
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
                    v2Service = new V2Impl(this.service);
                }
            }
        }
        return v2Service;
    }
}