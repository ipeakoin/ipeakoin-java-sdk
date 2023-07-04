package com.ipeakoin.dto.res;

/**
 * @author klover
 * description Res
 * date 2023/7/4 15:39
 */
public class Res {
    protected Integer code;
    protected String message;

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
}