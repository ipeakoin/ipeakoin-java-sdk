package com.ipeakoin.httpclient.http;

import net.jcip.annotations.NotThreadSafe;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;

import java.net.URI;

/**
 * @author klover
 * description HttpDeleteWithBody
 * date 2023/6/27 16:31
 */
@NotThreadSafe
public class HttpDeleteWithBody extends HttpEntityEnclosingRequestBase {
    /**
     * METHOD_NAME
     */
    public static final String METHOD_NAME = "DELETE";

    /**
     * getMethod
     *
     * @return String
     */
    public String getMethod() {
        return METHOD_NAME;
    }

    /**
     * HttpDeleteWithBody
     *
     * @param uri uri
     */
    public HttpDeleteWithBody(final String uri) {
        super();
        setURI(URI.create(uri));
    }

    /**
     * HttpDeleteWithBody
     *
     * @param uri uri
     */
    public HttpDeleteWithBody(final URI uri) {
        super();
        setURI(uri);
    }

    /**
     * HttpDeleteWithBody
     */
    public HttpDeleteWithBody() {
        super();
    }
}