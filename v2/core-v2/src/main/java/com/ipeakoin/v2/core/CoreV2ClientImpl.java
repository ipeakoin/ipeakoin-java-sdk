package com.ipeakoin.v2.core;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ipeakoin.http.client.HttpRequestsBase;
import com.ipeakoin.http.client.dto.Credentials;
import com.ipeakoin.http.client.dto.res.ApiException;
import com.ipeakoin.v1.core.CoreClientImpl;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;

import static com.ipeakoin.http.client.HttpRequestsBase.buildEntity;

/**
 * CoreV2ClientImpl
 *
 * @author klover
 * @date 2024/4/11 20:48
 */
public class CoreV2ClientImpl extends CoreClientImpl implements CoreV2Client {
    private final CloseableHttpClient httpClient;
    private final Credentials credentials;
    private final HttpRequestsBase service;
    private String accessToken;

    public CoreV2ClientImpl(CloseableHttpClient httpClient, ObjectMapper mapper, Credentials credentials) {
        super(httpClient, mapper, credentials);
        this.credentials = credentials;
        this.httpClient = httpClient;
        this.service = new HttpRequestsBase.Builder().build(this.httpClient, credentials.getBaseurl(), mapper, credentials.getRequestConfig());
    }

    /**
     * 设置 accessToken
     *
     * @param accessToken accessToken
     */
    @Override
    public void setAccessToken(String accessToken) {
        super.setAccessToken(accessToken);
        this.accessToken = accessToken;
    }

    /**
     * Delete account
     *
     * @param id id
     * @return {@link Boolean}
     * @throws ApiException error
     */
    @Override
    public Boolean deleteAccount(String id) throws ApiException {
        String uri = String.format("/open-api/v2/accounts/%s", id);

        return this.service.invokeAPI(uri, "DELETE", null, this.accessToken, Boolean.class);
    }

    /**
     * Update a account
     *
     * @param id    id
     * @param email email
     * @return {@link Boolean}
     * @throws ApiException error
     */
    @Override
    public Boolean updateAccount(String id, String email) throws ApiException {
        String uri = String.format("/open-api/v2/accounts/%s", id);
        String str = String.format("{\"email\":\"%s\"}", email);
        return this.service.invokeAPI(uri, "PUT", buildEntity(str), this.accessToken, Boolean.class);
    }


}
