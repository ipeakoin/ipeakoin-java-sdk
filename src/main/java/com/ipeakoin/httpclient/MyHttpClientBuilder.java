package com.ipeakoin.httpclient;

import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;

/**
 * @author klover
 * description MyHttpClientBuilder
 * date 2023/6/27 16:31
 */
public class MyHttpClientBuilder extends HttpClientBuilder {
    /**
     * MyHttpClientBuilder
     */
    private MyHttpClientBuilder() {
        super();
    }

    /**
     * create
     *
     * @return MyHttpClientBuilder
     */
    public static MyHttpClientBuilder create() {
        return new MyHttpClientBuilder();
    }

    /**
     * build
     *
     * @return CloseableHttpClient
     */
    @Override
    public CloseableHttpClient build() {
        return super.build();
    }
}