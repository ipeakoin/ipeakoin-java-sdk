package com.ipeakoin.service;

import com.ipeakoin.dto.ApiException;
import com.ipeakoin.dto.ApiResponse;
import com.ipeakoin.service.dto.CodeRes;
import com.ipeakoin.service.impl.ClientImpl;

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
         * @param clientId     clientId
         * @param clientSecret clientSecret
         * @param baseurl      baseurl
         * @return IPeakoinClient.Builder
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
         * @return IPeakoinClient
         */
        public Client build() {
            return new ClientImpl(clientId, clientSecret, baseurl);
        }
    }

    /**
     * 获取code
     *
     * @return {@link ApiResponse< CodeRes >}
     * @throws {@link ApiException}
     */
    ApiResponse<CodeRes> getCode() throws ApiException;

    /**
     * 获取access token
     *
     * @param code code
     */
    void getAccessToken(String code);
}