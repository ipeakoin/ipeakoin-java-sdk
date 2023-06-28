package com.ipeakoin.httpclient;

import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;

/**
 * @author klover
 * description MyHttpClientBuilder
 * date 2023/6/27 16:31
 */
public class MyHttpClientBuilder extends HttpClientBuilder {
    private MyHttpClientBuilder() {
        super();
    }

    public static MyHttpClientBuilder create() {
        return new MyHttpClientBuilder();
    }

    @Override
    public CloseableHttpClient build() {
        return super.build();
    }
}