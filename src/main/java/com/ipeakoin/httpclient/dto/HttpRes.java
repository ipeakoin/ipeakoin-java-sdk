package com.ipeakoin.httpclient.dto;

import java.io.Serializable;
import java.util.Map;

/**
 * @author klover
 * description Res
 * date 2023/6/27 16:49
 */
public class HttpRes implements Serializable {
    /**
     * http 状态码
     */
    private int status;
    /**
     * 错误原因
     */
    private String reason;
    /**
     * 返回结果体
     */
    private String content;

    /**
     * 请求头
     */
    private Map<String, String> headers;

    /**
     * getStatus
     *
     * @return int
     */
    public int getStatus() {
        return status;
    }

    /**
     * setStatus
     *
     * @param status status
     */
    public void setStatus(int status) {
        this.status = status;
    }

    /**
     * getReason
     *
     * @return String
     */
    public String getReason() {
        return reason;
    }

    /**
     * setReason
     *
     * @param reason reason
     */
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * getContent
     *
     * @return String
     */
    public String getContent() {
        return content;
    }

    /**
     * setContent
     *
     * @param content content
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * getHeaders
     *
     * @return Map
     */
    public Map<String, String> getHeaders() {
        return headers;
    }

    /**
     * setHeaders
     *
     * @param headers headers
     */
    public void setHeaders(Map<String, String> headers) {
        this.headers = headers;
    }

    @Override
    public String toString() {
        return "Res{" +
                "status=" + status +
                ", reason='" + reason + '\'' +
                ", content='" + content + '\'' +
                ", headers=" + headers +
                '}';
    }
}