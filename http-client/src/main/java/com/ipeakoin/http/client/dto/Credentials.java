package com.ipeakoin.http.client.dto;


import org.apache.hc.client5.http.config.RequestConfig;

/**
 * Credentials
 *
 * @author klover
 * @date 2024/4/11 20:35
 */
public class Credentials {
    private String clientId;
    private String clientSecret;
    private String baseurl;
    /**
     * 自定义请求设置
     */
    private RequestConfig requestConfig;

    public Credentials(String clientId, String clientSecret, String baseurl) {
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.baseurl = baseurl;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getClientSecret() {
        return clientSecret;
    }

    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    public String getBaseurl() {
        return baseurl;
    }

    public void setBaseurl(String baseurl) {
        this.baseurl = baseurl;
    }

    public RequestConfig getRequestConfig() {
        return requestConfig;
    }

    public void setRequestConfig(RequestConfig requestConfig) {
        this.requestConfig = requestConfig;
    }

    @Override
    public String toString() {
        return "Credentials{" +
                "clientId='" + clientId + '\'' +
                ", clientSecret='" + clientSecret + '\'' +
                ", baseurl='" + baseurl + '\'' +
                ", requestConfig=" + requestConfig +
                '}';
    }
}
