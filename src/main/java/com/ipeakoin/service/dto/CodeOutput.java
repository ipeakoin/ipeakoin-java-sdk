package com.ipeakoin.service.dto;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author klover
 * description CodeOutput
 * date 2023/6/27 17:27
 */
public class CodeOutput implements Serializable {
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
    private CodeContentOutput content;

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

    public CodeContentOutput getContent() {
        return content;
    }

    public void setContent(CodeContentOutput content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "CodeOutput{" +
                "status=" + status +
                ", reason='" + reason + '\'' +
                ", content=" + content +
                '}';
    }
}