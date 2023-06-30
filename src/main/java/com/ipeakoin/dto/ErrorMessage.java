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

    /**
     * error code
     */
    private Integer code;
    /**
     * error message
     */
    private String message;

    /**
     * error code
     *
     * @return Integer
     */
    public Integer getCode() {
        return code;
    }

    /**
     * error code
     *
     * @param code code
     */
    public void setCode(Integer code) {
        this.code = code;
    }

    /**
     * error message
     *
     * @return String
     */
    public String getMessage() {
        return message;
    }

    /**
     * error message
     *
     * @param message message
     */
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