package com.ipeakoin.service;

import com.ipeakoin.dto.ApiException;
import com.ipeakoin.dto.ApiResponse;
import com.ipeakoin.dto.req.CodeReq;
import com.ipeakoin.dto.res.AccessTokenRes;
import com.ipeakoin.dto.res.CodeRes;
import com.ipeakoin.dto.res.RefreshAccessTokenRes;
import com.ipeakoin.httpclient.MyHttpClientBuilder;
import com.ipeakoin.service.impl.ClientImpl;
import com.ipeakoin.service.v1.V1;
import com.ipeakoin.service.v2.V2;
import org.apache.http.impl.client.CloseableHttpClient;

/**
 * @author klover
 * description Client
 * date 2023/6/27 15:50
 */
public interface Client {
    /**
     * Service构造器
     */
    class Builder {
        private String clientId;
        private String clientSecret;
        private String baseurl;

        /**
         * 配置
         *
         * @param baseurl baseurl
         * @return Client.Builder
         */
        public Client.Builder config(String baseurl) {
            return this.config(null, null, baseurl);
        }

        /**
         * 配置
         *
         * @param clientId     clientId
         * @param clientSecret clientSecret
         * @param baseurl      baseurl
         * @return Client.Builder
         */
        public Client.Builder config(String clientId, String clientSecret, String baseurl) {
            this.clientId = clientId;
            this.clientSecret = clientSecret;
            this.baseurl = baseurl;
            return this;
        }

        /**
         * 构造服务
         *
         * @param httpClient {@link CloseableHttpClient}
         * @return Client
         */
        public Client build(CloseableHttpClient httpClient) {
            return new ClientImpl(httpClient, clientId, clientSecret, baseurl);
        }

        /**
         * 构造服务
         *
         * @return Client
         */
        public Client build() {
            CloseableHttpClient httpClient = MyHttpClientBuilder.create().build();
            return this.build(httpClient);
        }
    }

    /**
     * 关闭http 请求连接池
     */
    void closeHttpClient();

    /**
     * 获取code
     *
     * @return {@link ApiResponse<CodeRes>}
     * @throws ApiException error
     */
    ApiResponse<CodeRes> getCode() throws ApiException;

    /**
     * 获取code
     *
     * @param input {@link CodeReq}
     * @return {@link ApiResponse<CodeRes>}
     * @throws ApiException error
     */
    ApiResponse<CodeRes> getCode(CodeReq input) throws ApiException;

    /**
     * 获取access token
     *
     * @param code {@link String}
     * @return {@link ApiResponse<AccessTokenRes>}
     * @throws ApiException error
     */
    ApiResponse<AccessTokenRes> getAccessToken(String code) throws ApiException;

    /**
     * 刷新access token
     *
     * @param refreshToken {@link String}
     * @return {@link ApiResponse<RefreshAccessTokenRes>}
     * @throws ApiException error
     */
    ApiResponse<RefreshAccessTokenRes> refreshAccessToken(String refreshToken) throws ApiException;

    /**
     * V1 版接口
     *
     * @return {@link V1}
     */
    V1 v1();

    /**
     * V2 版接口
     *
     * @return {@link V2}
     */
    V2 v2();
}