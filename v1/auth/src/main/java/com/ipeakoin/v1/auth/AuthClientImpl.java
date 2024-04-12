package com.ipeakoin.v1.auth;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ipeakoin.http.client.HttpRequestsBase;
import com.ipeakoin.http.client.dto.Credentials;
import com.ipeakoin.http.client.dto.res.ApiException;
import com.ipeakoin.v1.auth.dto.res.AccessTokenRes;
import com.ipeakoin.v1.auth.dto.res.CodeRes;
import com.ipeakoin.v1.auth.dto.res.RefreshAccessTokenRes;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;

import java.util.HashMap;
import java.util.Map;

import static com.ipeakoin.http.client.HttpRequestsBase.buildEntity;

/**
 * AuthClientImpl
 *
 * @author klover
 * @date 2024/4/11 20:48
 */
public class AuthClientImpl implements AuthClient {
    private final CloseableHttpClient httpClient;
    private final Credentials credentials;
    private final HttpRequestsBase service;

    public AuthClientImpl(CloseableHttpClient httpClient, ObjectMapper mapper, Credentials credentials) {
        this.credentials = credentials;
        this.httpClient = httpClient;
        this.service = new HttpRequestsBase.Builder().build(this.httpClient, credentials.getBaseurl(), mapper, credentials.getRequestConfig());
    }

    /**
     * 获取code
     *
     * @param state       {@link String}
     * @param redirectUri {@link String}
     * @return {@link CodeRes}
     * @throws ApiException error
     */
    @Override
    public CodeRes getCode(String state, String redirectUri) throws ApiException {
        String url = String.format("/open-api/oauth/authorize?clientId=%s&state=%s&redirectUri=%s", this.credentials.getClientId(), state == null ? "" : state, redirectUri == null ? "" : redirectUri);
        return this.service.authInvokeAPI(url, "GET", null, null, CodeRes.class);
    }

    /**
     * 获取access token
     *
     * @param code {@link String}
     * @return {@link AccessTokenRes}
     * @throws ApiException error
     */
    @Override
    public AccessTokenRes getAccessToken(String code) throws ApiException {
        String uri = "/open-api/oauth/access-token";
        Map<String, String> map = new HashMap<>(3);
        map.put("clientId", this.credentials.getClientId());
        map.put("clientSecret", this.credentials.getClientSecret());
        map.put("code", code);

        return this.service.authInvokeAPI(uri, "POST", buildEntity(map), null, AccessTokenRes.class);
    }

    /**
     * 刷新access token
     *
     * @param refreshToken {@link String}
     * @return {@link RefreshAccessTokenRes}
     * @throws ApiException error
     */
    @Override
    public RefreshAccessTokenRes refreshAccessToken(String refreshToken) throws ApiException {
        String uri = "/open-api/oauth/refresh-token";
        Map<String, Object> map = new HashMap<>(2);
        map.put("clientId", this.credentials.getClientId());
        map.put("refreshToken", refreshToken);

        return this.service.authInvokeAPI(uri, "POST", buildEntity(map), null, RefreshAccessTokenRes.class);
    }
}
