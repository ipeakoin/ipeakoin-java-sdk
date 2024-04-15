package com.ipeakoin.v2.core;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ipeakoin.http.client.MyHttpClientBuilder;
import com.ipeakoin.http.client.dto.Credentials;
import com.ipeakoin.http.client.dto.res.ApiException;
import com.ipeakoin.utils.JsonUtil;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;

/**
 * CoreV2Client
 *
 * @author klover
 * @date 2024/4/11 20:24
 */
public interface CoreV2Client {
    /**
     * Service构造器
     */
    class Builder {
        private Credentials credentials;

        Builder Credentials(Credentials credentials) {
            this.credentials = credentials;
            return this;
        }

        public Builder Credentials(String baseurl) {
            return Credentials(new Credentials(null, null, baseurl));
        }


        public CoreV2Client build(CloseableHttpClient httpClient) {
            return new CoreV2ClientImpl(httpClient, JsonUtil.getInstance(), this.credentials);
        }

        public CoreV2Client build(ObjectMapper mapper) {
            CloseableHttpClient httpClient = MyHttpClientBuilder.create().build();
            return new CoreV2ClientImpl(httpClient, JsonUtil.getInstance(), this.credentials);
        }

        public CoreV2Client build(CloseableHttpClient httpClient, ObjectMapper mapper) {
            return new CoreV2ClientImpl(httpClient, mapper, this.credentials);
        }

        public CoreV2Client build() {
            CloseableHttpClient httpClient = MyHttpClientBuilder.create().build();
            return this.build(httpClient);
        }
    }

    /**
     * 设置 accessToken
     *
     * @param accessToken accessToken
     */
    void setAccessToken(String accessToken);

    /**
     * Delete account
     *
     * @param id id
     * @return {@link Boolean}
     * @throws ApiException error
     */
    Boolean deleteAccount(String id) throws ApiException;

    /**
     * Update a account
     *
     * @param id id
     * @param email email
     * @return {@link Boolean}
     * @throws ApiException error
     */
    Boolean updateAccount(String id, String email) throws ApiException;
}
