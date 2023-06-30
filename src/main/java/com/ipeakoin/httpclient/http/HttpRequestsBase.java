package com.ipeakoin.httpclient.http;

import com.alibaba.fastjson2.JSON;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ipeakoin.dto.ApiException;
import com.ipeakoin.dto.ApiResponse;
import com.ipeakoin.dto.ErrorMessage;
import com.ipeakoin.httpclient.constant.Constant;
import com.ipeakoin.httpclient.dto.Res;
import jakarta.ws.rs.client.Entity;
import jakarta.ws.rs.core.GenericType;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.StatusLine;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.HashMap;
import java.util.Map;

import static java.util.Objects.requireNonNull;

/**
 * @author klover
 * description HttpRequestsBase
 * date 2023/6/27 16:31
 */
public class HttpRequestsBase {
    private final CloseableHttpClient httpClient;
    private String accessToken;

    public HttpRequestsBase(CloseableHttpClient httpClient) {
        this.httpClient = requireNonNull(httpClient);
    }

    /**
     * 添加 accessToken
     *
     * @param accessToken {@link String}
     */
    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    /**
     * Service构造器
     */
    public static class Builder {
        /**
         * @param httpClient httpClient
         * @return HttpRequestsBase
         */
        public HttpRequestsBase build(CloseableHttpClient httpClient) {
            return new HttpRequestsBase(httpClient);
        }
    }

    /**
     * 代理请求 参数处理
     *
     * @param path       路径
     * @param method     请求方式
     * @param params     请求参数
     * @param <T>        返回泛型
     * @param returnType 返回参数类型
     * @return {@link ApiResponse<T>}
     */
    public <T> ApiResponse<T> invokeAPI(String path, String method, Map<String, Object> params, GenericType<T> returnType) throws ApiException {
        Res res = null;
        switch (method) {
            case "POST":
                res = this.postRequest(path, params);
                break;
            case "GET":
                res = this.getRequest(path, params);
                break;
            case "PUT":
                res = this.putRequest(path, params);
                break;
            case "DELETE":
                res = this.deleteRequest(path, params);
                break;
            default:
                throw new ApiException(500, "Method parameter error");
        }

        int status = res.getStatus();
        if (status >= 200 && status < 300) {
            try {
                Object o = new ObjectMapper().readValue(res.getContent(), returnType.getRawType());
                return new ApiResponse<>(res.getHeaders(), (T) o);
            } catch (JsonProcessingException e) {
                throw new RuntimeException(e);
            }
        }
        throw new ApiException(status, res.getContent(), res.getHeaders(), delErrorMessage(res.getContent()));
    }

    /**
     * get 请求
     *
     * @param url   url
     * @param query 参数
     * @return String
     */
    public Res getRequest(String url, Map<String, Object> query) {
        CloseableHttpResponse response = null;
        try {
            StringBuilder uri = new StringBuilder(url);
            int i = 0;
            for (Map.Entry<String, Object> entry : query.entrySet()) {
                if (i == 0) {
                    uri.append("?");
                } else {
                    uri.append("&");
                }
                uri.append(entry.getKey()).append("=").append(entry.getValue());
                ++i;
            }

            // 构建Get请求对象
            HttpGet req = new HttpGet(uri.toString());
            // 设置传送的内容类型是json格式
            req.setHeader(Constant.CONTENT_TYPE, Constant.CONTENT_TYPE_VALUR);
            // 接收的内容类型也是json格式
            req.setHeader(Constant.X_ACCESS_TOKEN, this.accessToken);

            // 设置超时时间，其中connectionRequestTimout（从连接池获取连接的超时时间）、connetionTimeout（客户端和服务器建立连接的超时时间）、socketTimeout（客户端从服务器读取数据的超时时间），单位都是毫秒
            RequestConfig config = RequestConfig.custom().setConnectTimeout(10000).setConnectionRequestTimeout(3000)
                    .setSocketTimeout(20000).build();
            req.setConfig(config);
            // 获取返回对象
            response = this.httpClient.execute(req);
            return this.delResponse(response);
        } catch (SocketTimeoutException e) {
            e.printStackTrace();
            throw new RuntimeException(Constant.HTTP_CONNECTION_TIMEOUT);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(Constant.HTTP_ERROR);
        } finally {
            try {
                if (response != null) {
                    response.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * post 请求
     *
     * @param url    url
     * @param params 参数
     * @return String
     */
    public Res postRequest(String url, Map<String, Object> params) {
        CloseableHttpResponse response = null;
        try {
            // 构建Post请求对象
            HttpPost req = new HttpPost(url);

            // 设置传送的内容类型是json格式
            req.setHeader(Constant.CONTENT_TYPE, Constant.CONTENT_TYPE_VALUR);
            // 接收的内容类型也是json格式
            req.setHeader(Constant.X_ACCESS_TOKEN, this.accessToken);
            // 设置超时时间，其中connectionRequestTimout（从连接池获取连接的超时时间）、connetionTimeout（客户端和服务器建立连接的超时时间）、socketTimeout（客户端从服务器读取数据的超时时间），单位都是毫秒
            RequestConfig config = RequestConfig.custom().setConnectTimeout(10000).setConnectionRequestTimeout(3000).
                    setSocketTimeout(20000).build();
            req.setConfig(config);

            String jsonString = JSON.toJSONString(params);
            // 设置请求体
            req.setEntity(new StringEntity(jsonString, Constant.CHARSET));
            // 获取返回对象
            response = this.httpClient.execute(req);
            return this.delResponse(response);
        } catch (SocketTimeoutException e) {
            e.printStackTrace();
            throw new RuntimeException(Constant.HTTP_CONNECTION_TIMEOUT);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(Constant.HTTP_ERROR);
        } finally {
            try {
                if (response != null) {
                    response.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * put 请求
     *
     * @param url    url
     * @param params 参数
     * @return String
     */
    public Res putRequest(String url, Map<String, Object> params) {
        CloseableHttpResponse response = null;
        try {
            // 构建Put请求对象
            HttpPut req = new HttpPut(url);

            // 设置传送的内容类型是json格式
            req.setHeader(Constant.CONTENT_TYPE, Constant.CONTENT_TYPE_VALUR);
            // 接收的内容类型也是json格式
            req.setHeader(Constant.X_ACCESS_TOKEN, this.accessToken);
            // 设置超时时间，其中connectionRequestTimout（从连接池获取连接的超时时间）、connetionTimeout（客户端和服务器建立连接的超时时间）、socketTimeout（客户端从服务器读取数据的超时时间），单位都是毫秒
            RequestConfig config = RequestConfig.custom().setConnectTimeout(10000).setConnectionRequestTimeout(3000).
                    setSocketTimeout(20000).build();
            req.setConfig(config);

            String jsonString = JSON.toJSONString(params);

            // 设置请求体
            req.setEntity(new StringEntity(jsonString, Constant.CHARSET));
            // 获取返回对象
            response = this.httpClient.execute(req);
            return this.delResponse(response);
        } catch (SocketTimeoutException e) {
            e.printStackTrace();
            throw new RuntimeException(Constant.HTTP_CONNECTION_TIMEOUT);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(Constant.HTTP_ERROR);
        } finally {
            try {
                if (response != null) {
                    response.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * delete 请求
     *
     * @param url    url
     * @param params 参数
     * @return String
     */
    public Res deleteRequest(String url, Map<String, Object> params) {
        CloseableHttpResponse response = null;
        try {
            // 构建Delete请求对象
            HttpDeleteWithBody req = new HttpDeleteWithBody(url);

            // 设置传送的内容类型是json格式
            req.setHeader(Constant.CONTENT_TYPE, Constant.CONTENT_TYPE_VALUR);
            // 接收的内容类型也是json格式
            req.setHeader(Constant.X_ACCESS_TOKEN, this.accessToken);
            // 设置超时时间，其中connectionRequestTimout（从连接池获取连接的超时时间）、connetionTimeout（客户端和服务器建立连接的超时时间）、socketTimeout（客户端从服务器读取数据的超时时间），单位都是毫秒
            RequestConfig config = RequestConfig.custom().setConnectTimeout(10000).setConnectionRequestTimeout(3000).
                    setSocketTimeout(20000).build();
            req.setConfig(config);

            String jsonString = JSON.toJSONString(params);

            // 设置请求体
            req.setEntity(new StringEntity(jsonString, Constant.CHARSET));
            // 获取返回对象
            response = this.httpClient.execute(req);
            return this.delResponse(response);
        } catch (SocketTimeoutException e) {
            e.printStackTrace();
            throw new RuntimeException(Constant.HTTP_CONNECTION_TIMEOUT);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(Constant.HTTP_ERROR);
        } finally {
            try {
                if (response != null) {
                    response.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 处理返回
     */
    private Res delResponse(CloseableHttpResponse response) throws IOException {
        StatusLine statusLine = response.getStatusLine();
        int statusCode = statusLine.getStatusCode();
        String reason = statusLine.getReasonPhrase();
        // 整理返回值
        HttpEntity entity = response.getEntity();
        String res = EntityUtils.toString(entity, "UTF-8");

        Res output = new Res();
        output.setStatus(statusCode);
        output.setReason(reason);
        output.setContent(res);
        output.setHeaders(dealResponseHeaders(response));
        return output;
    }

    /**
     * 请求头参数处理
     *
     * @param response {@link CloseableHttpResponse}
     * @return {@link Map}
     */
    private Map<String, String> dealResponseHeaders(CloseableHttpResponse response) {
        Map<String, String> responseHeaders = new HashMap<>(0);
        for (Header header : response.getAllHeaders()) {
            responseHeaders.put(header.getName(), header.getValue());
        }
        return responseHeaders;
    }

    /**
     * 处理错误信息
     *
     * @param content {@link String}
     * @return {@link ErrorMessage}
     */
    private ErrorMessage delErrorMessage(String content) {
        if (content == null) {
            return null;
        }

        GenericType<ErrorMessage> returnType = new GenericType<>() {
        };

        Class<?> rawType = returnType.getRawType();
        try {
            return (ErrorMessage) new ObjectMapper().readValue(content, rawType);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
