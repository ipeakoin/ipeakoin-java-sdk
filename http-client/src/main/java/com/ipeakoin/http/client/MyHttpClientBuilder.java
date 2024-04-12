package com.ipeakoin.http.client;

import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.HttpClientBuilder;

/**
 * MyHttpClientBuilder
 *
 * @author klover
 * @date 2024/4/11 18:52
 */
public class MyHttpClientBuilder extends HttpClientBuilder {
    private MyHttpClientBuilder() {
        super();
    }

    /**
     * create
     *
     * @return {@link MyHttpClientBuilder}
     */
    public static MyHttpClientBuilder create() {
        return new MyHttpClientBuilder();
    }
}
