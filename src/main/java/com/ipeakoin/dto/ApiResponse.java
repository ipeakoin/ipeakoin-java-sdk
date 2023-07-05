package com.ipeakoin.dto;

import com.fasterxml.jackson.annotation.JsonAlias;

/**
 * @author klover
 * description ApiResponse
 * date 2023/6/28 16:40
 */
public class ApiResponse<T> {
    @JsonAlias("data")
    private T content;

    private Integer code;

    private String message;

    public ApiResponse() {
    }

    public ApiResponse(T content) {
        this.content = content;
    }

    public ApiResponse(T content, Integer code, String message) {
        this.content = content;
        this.code = code;
        this.message = message;
    }

    public T getContent() {
        return content;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setContent(T content) {
        this.content = content;
    }
}