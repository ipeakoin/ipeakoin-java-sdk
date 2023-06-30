package com.ipeakoin.httpclient.constant;

/**
 * @author klover
 * description Constant
 * date 2023/6/27 16:32
 */
public final class Constant {
    /**
     * X_ACCESS_TOKEN
     */
    public static final String X_ACCESS_TOKEN = "x-ipeakoin-access-token";

    /**
     * CONTENT_TYPE
     */
    public static final String CONTENT_TYPE = "Content-Type";

    /**
     * CONTENT_TYPE_VALUR
     */
    public static final String CONTENT_TYPE_VALUR = "application/json;charset=utf-8";

    /**
     * OS
     */
    public static final String OS = System.getProperty("os.name") + "/" + System.getProperty("os.version");

    /**
     * VERSION
     */
    public static final String VERSION = System.getProperty("java.version");

    /**
     * CHARSET
     */
    public static final String CHARSET = "UTF-8";

    /**
     * 出现连接/超时异常
     */
    public static final String HTTP_CONNECTION_TIMEOUT = "Connection/timeout exception occurred";

    /**
     * 执行内部代码时出现异常
     */
    public static final String HTTP_ERROR = "An exception occurred while executing internal code";
}