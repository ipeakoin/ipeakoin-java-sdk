package com.ipeakoin.httpclient.dto;

import java.io.Serial;
import java.io.Serializable;
import java.util.Map;

/**
 * @author klover
 * description Res
 * date 2023/6/27 16:49
 */
public class Res implements Serializable {
    /**
     * serial version UID
     */
    @Serial
    private static final long serialVersionUID = 1L;

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

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Map<String, String> getHeaders() {
        return headers;
    }

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