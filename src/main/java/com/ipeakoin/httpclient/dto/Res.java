package com.ipeakoin.httpclient.dto;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author klover
 * description ResponseOutput
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

    @Override
    public String toString() {
        return "ResponseOutput{" +
                "status=" + status +
                ", reason='" + reason + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}