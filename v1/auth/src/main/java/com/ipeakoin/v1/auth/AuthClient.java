package com.ipeakoin.v1.auth;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ipeakoin.http.client.MyHttpClientBuilder;
import com.ipeakoin.http.client.dto.Credentials;
import com.ipeakoin.http.client.dto.res.ApiException;
import com.ipeakoin.utils.JsonUtil;
import com.ipeakoin.v1.auth.dto.res.AccessTokenRes;
import com.ipeakoin.v1.auth.dto.res.CodeRes;
import com.ipeakoin.v1.auth.dto.res.RefreshAccessTokenRes;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;

/**
 * AuthClient
 *
 * @author klover
 * @date 2024/4/11 20:24
 */
public interface AuthClient {
    /**
     * Service构造器
     */
    class Builder {
        private Credentials credentials;

        AuthClient.Builder Credentials(Credentials credentials) {
            this.credentials = credentials;
            return this;
        }

        public AuthClient.Builder Credentials(String clientId, String clientSecret, String baseurl) {
            return Credentials(new Credentials(clientId, clientSecret, baseurl));
        }


        public AuthClient build(CloseableHttpClient httpClient) {
            return new AuthClientImpl(httpClient, JsonUtil.getInstance(), this.credentials);
        }

        public AuthClient build(ObjectMapper mapper) {
            CloseableHttpClient httpClient = MyHttpClientBuilder.create().build();
            return new AuthClientImpl(httpClient, JsonUtil.getInstance(), this.credentials);
        }

        public AuthClient build(CloseableHttpClient httpClient, ObjectMapper mapper) {
            return new AuthClientImpl(httpClient, mapper, this.credentials);
        }

        public AuthClient build() {
            CloseableHttpClient httpClient = MyHttpClientBuilder.create().build();
            return this.build(httpClient);
        }
    }

    /**
     * 获取code
     *
     * @return {@link CodeRes}
     * @throws ApiException error
     */
    default CodeRes getCode() throws ApiException {
        return getCode(null);
    }

    /**
     * 获取code
     *
     * @param state {@link String}
     * @return {@link CodeRes}
     * @throws ApiException error
     */
    default CodeRes getCode(String state) throws ApiException {
        return getCode(state, null);
    }

    /**
     * 获取code
     *
     * @param state       {@link String}
     * @param redirectUri {@link String}
     * @return {@link CodeRes}
     * @throws ApiException error
     */
    CodeRes getCode(String state, String redirectUri) throws ApiException;

    /**
     * 获取access token
     *
     * @param code {@link String}
     * @return {@link AccessTokenRes}
     * @throws ApiException error
     */
    AccessTokenRes getAccessToken(String code) throws ApiException;

    /**
     * 刷新access token
     *
     * @param refreshToken {@link String}
     * @return {@link RefreshAccessTokenRes}
     * @throws ApiException error
     */
    RefreshAccessTokenRes refreshAccessToken(String refreshToken) throws ApiException;
}
