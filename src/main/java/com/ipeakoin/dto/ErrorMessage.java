package com.ipeakoin.dto;

import java.io.Serial;

/**
 * @author klover
 * description ErrorMessage
 * date 2023/6/29 14:51
 */
public class ErrorMessage {
    /**
     * serial version UID
     */
    @Serial
    private static final long serialVersionUID = 1L;

    private Integer code;
    private String message;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "ErrorMessage{" +
                "code=" + code +
                ", message='" + message + '\'' +
                '}';
    }
}