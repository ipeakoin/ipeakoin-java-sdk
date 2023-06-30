package com.ipeakoin.dto;

import java.util.Map;

/**
 * @author klover
 * description ApiException
 * date 2023/6/28 16:45
 */
public class ApiException extends Exception {
    /**
     * http status
     */
    private int code = 0;

    /**
     * res headers
     */
    private Map<String, String> responseHeaders = null;

    /**
     * res error message
     */
    private ErrorMessage errorMessage = null;

    /**
     * ApiException
     */
    public ApiException() {
    }

    /**
     * ApiException
     *
     * @param throwable {@link Throwable}
     */
    public ApiException(Throwable throwable) {
        super(throwable);
    }

    /**
     * ApiException
     *
     * @param message String
     */
    public ApiException(String message) {
        super(message);
    }

    /**
     * ApiException
     *
     * @param message         {@link String}
     * @param throwable       {@link Throwable}
     * @param code            {@link int}
     * @param responseHeaders {@link Map}
     * @param responseBody    {@link ErrorMessage}
     */
    public ApiException(String message, Throwable throwable, int code, Map<String, String> responseHeaders, ErrorMessage responseBody) {
        super(message, throwable);
        this.code = code;
        this.responseHeaders = responseHeaders;
        this.errorMessage = responseBody;
    }

    /**
     * ApiException
     *
     * @param message         {@link String}
     * @param code            {@link int}
     * @param responseHeaders {@link Map}
     * @param responseBody    {@link ErrorMessage}
     */
    public ApiException(String message, int code, Map<String, String> responseHeaders, ErrorMessage responseBody) {
        this(message, (Throwable) null, code, responseHeaders, responseBody);
    }

    /**
     * ApiException
     *
     * @param message         {@link String}
     * @param throwable       {@link Throwable}
     * @param code            {@link int}
     * @param responseHeaders {@link Map}
     */
    public ApiException(String message, Throwable throwable, int code, Map<String, String> responseHeaders) {
        this(message, throwable, code, responseHeaders, null);
    }

    /**
     * ApiException
     *
     * @param code            {@link int}
     * @param responseHeaders {@link Map}
     * @param responseBody    {@link ErrorMessage}
     */
    public ApiException(int code, Map<String, String> responseHeaders, ErrorMessage responseBody) {
        this((String) null, (Throwable) null, code, responseHeaders, responseBody);
    }

    /**
     * ApiException
     *
     * @param code    {@link int}
     * @param message {@link String}
     */
    public ApiException(int code, String message) {
        super(message);
        this.code = code;
    }

    /**
     * ApiException
     *
     * @param code            {@link int}
     * @param message         {@link String}
     * @param responseHeaders {@link Map}
     * @param responseBody    {@link ErrorMessage}
     */
    public ApiException(int code, String message, Map<String, String> responseHeaders, ErrorMessage responseBody) {
        this(code, message);
        this.responseHeaders = responseHeaders;
        this.errorMessage = responseBody;
    }

    /**
     * get code
     *
     * @return int
     */
    public int getCode() {
        return this.code;
    }

    /**
     * getResponseHeaders
     *
     * @return Map<String, String>
     */
    public Map<String, String> getResponseHeaders() {
        return this.responseHeaders;
    }

    /**
     * getErrorMessage
     *
     * @return ErrorMessage
     */
    public ErrorMessage getErrorMessage() {
        return this.errorMessage;
    }
}