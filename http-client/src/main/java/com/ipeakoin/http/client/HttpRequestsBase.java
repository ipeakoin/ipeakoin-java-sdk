package com.ipeakoin.http.client;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ipeakoin.http.client.dto.constant.Constant;
import com.ipeakoin.http.client.dto.res.ApiException;
import com.ipeakoin.http.client.dto.res.ErrorMessage;
import com.ipeakoin.http.client.dto.res.HttpRes;
import com.ipeakoin.utils.JsonUtil;
import org.apache.hc.client5.http.classic.methods.*;
import org.apache.hc.client5.http.config.RequestConfig;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.core5.http.HttpEntity;
import org.apache.hc.core5.http.io.entity.StringEntity;
import org.apache.hc.core5.util.Timeout;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import static java.util.Objects.requireNonNull;

/**
 * HttpRequestsBase
 *
 * @author klover
 * @date 2024/4/11 18:55
 */
public class HttpRequestsBase {
    private final CloseableHttpClient httpClient;
    private final String baseurl;

    private final ObjectMapper mapper;

    private RequestConfig requestConfig = RequestConfig.custom().setConnectionRequestTimeout(Timeout.of(10000, TimeUnit.MILLISECONDS)).build();

    /**
     * HttpRequestsBase
     *
     * @param httpClient httpClient
     * @param baseurl    String
     * @param mapper     ObjectMapper
     */
    public HttpRequestsBase(CloseableHttpClient httpClient, String baseurl, ObjectMapper mapper, RequestConfig requestConfig) {
        this.httpClient = requireNonNull(httpClient);
        this.baseurl = baseurl;
        this.mapper = mapper;
        if (requestConfig != null) {
            this.requestConfig = requestConfig;
        }
    }

    /**
     * Service构造器
     */
    public static class Builder {
        /**
         * @param httpClient httpClient
         * @return HttpRequestsBase
         */
        public HttpRequestsBase build(CloseableHttpClient httpClient, String baseurl, ObjectMapper mapper, RequestConfig requestConfig) {
            return new HttpRequestsBase(httpClient, baseurl, mapper, requestConfig);
        }
    }

    public static StringEntity buildEntity(Object params) {
        if (params instanceof String) {
            return new StringEntity((String) params, StandardCharsets.UTF_8);
        }
        String jsonString = JsonUtil.toJSONString(params);
        return new StringEntity(jsonString, StandardCharsets.UTF_8);
    }

    /**
     * 代理请求 参数处理
     *
     * @param path       路径
     * @param method     请求方式
     * @param entity     请求参数
     * @param <T>        返回泛型
     * @param returnType 返回参数类型
     * @return {@link <T>}
     * @throws ApiException error
     */
    public <T> T authInvokeAPI(String path, String method, HttpEntity entity, String accessToken, Class<T> returnType) throws ApiException {
        String s = invokeAPI(path, method, entity, accessToken);
        return JsonUtil.parse(s, returnType, this.mapper);
    }

    /**
     * 代理请求 参数处理
     *
     * @param path       路径
     * @param method     请求方式
     * @param entity     请求参数
     * @param <T>        返回泛型
     * @param returnType 返回参数类型
     * @return {@link <T>}
     * @throws ApiException error
     */
    public <T> T authInvokeAPI(String path, String method, HttpEntity entity, String accessToken, JavaType returnType) throws ApiException {
        String s = invokeAPI(path, method, entity, accessToken);
        return JsonUtil.parse(s, returnType, this.mapper);
    }

    /**
     * 代理请求 参数处理
     *
     * @param path       路径
     * @param method     请求方式
     * @param entity     请求参数
     * @param <T>        返回泛型
     * @param returnType 返回参数类型
     * @return {@link <T>}
     * @throws ApiException error
     */
    public <T> T invokeAPI(String path, String method, HttpEntity entity, String accessToken, JavaType returnType) throws ApiException {
        String s = invokeAPI(path, method, entity, accessToken);
        Map<String, Object> parse = JsonUtil.parse(s);
        return JsonUtil.convert(parse.get("data"), returnType, this.mapper);
    }

    /**
     * 代理请求 参数处理
     *
     * @param path       路径
     * @param method     请求方式
     * @param entity     请求参数
     * @param <T>        返回泛型
     * @param returnType 返回参数类型
     * @return {@link <T>}
     * @throws ApiException error
     */
    public <T> T invokeAPI(String path, String method, HttpEntity entity, String accessToken, Class<?> returnType) throws ApiException {
        JavaType javaType = JsonUtil.getCollectionType(returnType);
        return invokeAPI(path, method, entity, accessToken, javaType);
    }

    /**
     * 代理请求 参数处理
     *
     * @param path   路径
     * @param method 请求方式
     * @param entity 请求参数
     * @return {@link String}
     * @throws ApiException error
     */
    public String invokeAPI(String path, String method, HttpEntity entity, String accessToken) throws ApiException {
        HttpRes res = this.request(path, method, entity, accessToken);

        int status = res.getStatus();
        if (status >= 200 && status < 300) {
            return res.getContent();
        }
        throw new ApiException(status, res.getContent(), res.getHeaders(), JsonUtil.parse(res.getContent(), ErrorMessage.class, this.mapper));
    }

    /**
     * 请求 参数处理
     *
     * @param path   路径
     * @param method 请求方式
     * @param entity 请求参数
     * @return {@link HttpRes}
     * @throws ApiException error
     */
    public HttpRes request(String path, String method, HttpEntity entity, String accessToken) throws ApiException {
        String url = this.baseurl + path;
        HttpUriRequestBase base;
        switch (method) {
            case "POST":
            case "UPLOAD":
                base = new HttpPost(url);
                break;
            case "GET":
                base = new HttpGet(url);
                break;
            case "PUT":
                base = new HttpPut(url);
                break;
            case "DELETE":
                base = new HttpDelete(url);
                break;
            default:
                throw new ApiException(500, "Method parameter error");
        }
        if (!"UPLOAD".equals(method)) {
            // 设置传送的内容类型是json格式
            base.setHeader(Constant.CONTENT_TYPE, Constant.CONTENT_TYPE_VALUR);
        }
        return request(base, entity, accessToken);
    }

    /**
     * 请求 参数处理
     *
     * @param req         {@link HttpUriRequestBase}
     * @param entity      请求参数
     * @param accessToken token
     * @return {@link HttpRes}
     */
    private HttpRes request(HttpUriRequestBase req, HttpEntity entity, String accessToken) {
        try {
            if (accessToken != null) {
                req.setHeader(Constant.X_ACCESS_TOKEN, accessToken);
            }
            req.setConfig(this.requestConfig);
            if (entity != null) {
                req.setEntity(entity);
            }

            // 获取返回对象
            MyHttpClientResponseHandler myHttpClientResponseHandler = new MyHttpClientResponseHandler();
            return this.httpClient.execute(req, null, myHttpClientResponseHandler);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
