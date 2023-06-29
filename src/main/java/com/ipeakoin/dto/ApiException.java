package com.ipeakoin.dto;

import java.io.Serial;
import java.util.Map;

/**
 * @author klover
 * description ApiException
 * date 2023/6/28 16:45
 */
public class ApiException extends Exception {
    /**
     * serial version UID
     */
    @Serial
    private static final long serialVersionUID = 1L;

    private int code = 0;

    private Map<String, String> responseHeaders = null;

    private ErrorMessage errorMessage = null;

    public ApiException() {
    }

    public ApiException(Throwable throwable) {
        super(throwable);
    }

    public ApiException(String message) {
        super(message);
    }

    public ApiException(String message, Throwable throwable, int code, Map<String, String> responseHeaders, ErrorMessage responseBody) {
        super(message, throwable);
        this.code = code;
        this.responseHeaders = responseHeaders;
        this.errorMessage = responseBody;
    }

    public ApiException(String message, int code, Map<String, String> responseHeaders, ErrorMessage responseBody) {
        this(message, (Throwable) null, code, responseHeaders, responseBody);
    }

    public ApiException(String message, Throwable throwable, int code, Map<String, String> responseHeaders) {
        this(message, throwable, code, responseHeaders, null);
    }

    public ApiException(int code, Map<String, String> responseHeaders, ErrorMessage responseBody) {
        this((String) null, (Throwable) null, code, responseHeaders, responseBody);
    }

    public ApiException(int code, String message) {
        super(message);
        this.code = code;
    }

    public ApiException(int code, String message, Map<String, String> responseHeaders, ErrorMessage responseBody) {
        this(code, message);
        this.responseHeaders = responseHeaders;
        this.errorMessage = responseBody;
    }

    public int getCode() {
        return this.code;
    }

    public Map<String, String> getResponseHeaders() {
        return this.responseHeaders;
    }

    public ErrorMessage getErrorMessage() {
        return this.errorMessage;
    }
}