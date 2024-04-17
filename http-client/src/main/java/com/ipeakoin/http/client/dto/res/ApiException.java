package com.ipeakoin.http.client.dto.res;

import java.util.Map;

/**
 * ApiException
 *
 * @author klover
 * @date 2024/4/11 19:05
 */
public class ApiException extends Exception {
    /**
     * http status
     */
    private int status = 0;

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
     * @param status          {@link int}
     * @param responseHeaders {@link Map}
     * @param responseBody    {@link ErrorMessage}
     */
    public ApiException(String message, Throwable throwable, int status, Map<String, String> responseHeaders, ErrorMessage responseBody) {
        super(message, throwable);
        this.status = status;
        this.responseHeaders = responseHeaders;
        this.errorMessage = responseBody;
    }

    /**
     * ApiException
     *
     * @param message         {@link String}
     * @param status          {@link int}
     * @param responseHeaders {@link Map}
     * @param responseBody    {@link ErrorMessage}
     */
    public ApiException(String message, int status, Map<String, String> responseHeaders, ErrorMessage responseBody) {
        this(message, (Throwable) null, status, responseHeaders, responseBody);
    }

    /**
     * ApiException
     *
     * @param message         {@link String}
     * @param throwable       {@link Throwable}
     * @param status          {@link int}
     * @param responseHeaders {@link Map}
     */
    public ApiException(String message, Throwable throwable, int status, Map<String, String> responseHeaders) {
        this(message, throwable, status, responseHeaders, null);
    }

    /**
     * ApiException
     *
     * @param status            {@link int}
     * @param responseHeaders {@link Map}
     * @param responseBody    {@link ErrorMessage}
     */
    public ApiException(int status, Map<String, String> responseHeaders, ErrorMessage responseBody) {
        this((String) null, (Throwable) null, status, responseHeaders, responseBody);
    }

    /**
     * ApiException
     *
     * @param status  {@link int}
     * @param message {@link String}
     */
    public ApiException(int status, String message) {
        super(message);
        this.status = status;
    }

    /**
     * ApiException
     *
     * @param status          {@link int}
     * @param message         {@link String}
     * @param responseHeaders {@link Map}
     * @param responseBody    {@link ErrorMessage}
     */
    public ApiException(int status, String message, Map<String, String> responseHeaders, ErrorMessage responseBody) {
        this(status, message);
        this.responseHeaders = responseHeaders;
        this.errorMessage = responseBody;
    }

    /**
     * get status
     *
     * @return int
     */
    public int getStatus() {
        return this.status;
    }

    /**
     * getResponseHeaders
     *
     * @return Map
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
