package com.ipeakoin.http.client;

import com.ipeakoin.http.client.dto.res.HttpRes;
import org.apache.hc.core5.http.ClassicHttpResponse;
import org.apache.hc.core5.http.Header;
import org.apache.hc.core5.http.HttpEntity;
import org.apache.hc.core5.http.HttpException;
import org.apache.hc.core5.http.io.HttpClientResponseHandler;
import org.apache.hc.core5.http.io.entity.EntityUtils;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * MyHttpClientResponseHandler
 *
 * @author klover
 * @date 2024/4/11 19:57
 */
public class MyHttpClientResponseHandler implements HttpClientResponseHandler<HttpRes> {
    @Override
    public HttpRes handleResponse(ClassicHttpResponse response) throws HttpException, IOException {
        int statusCode = response.getCode();
        String reason = response.getReasonPhrase();
        // 整理返回值
        HttpEntity entity = response.getEntity();
        String res = EntityUtils.toString(entity, "UTF-8");
        Header[] headers = response.getHeaders();

        HttpRes output = new HttpRes();
        output.setStatus(statusCode);
        output.setReason(reason);
        output.setContent(res);
        output.setHeaders(this.dealResponseHeaders(headers));
        return output;
    }

    /**
     * 请求头参数处理
     *
     * @param headers {@link Header[]}
     * @return {@link Map}
     */
    private Map<String, String> dealResponseHeaders(Header[] headers) {
        Map<String, String> responseHeaders = new HashMap<>(0);
        for (Header header : headers) {
            responseHeaders.put(header.getName(), header.getValue());
        }
        return responseHeaders;
    }
}
