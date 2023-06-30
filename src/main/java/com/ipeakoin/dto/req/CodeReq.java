package com.ipeakoin.dto.req;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author klover
 * description CodeReq
 * date 2023/6/29 16:05
 */
public class CodeReq implements Serializable {
    /**
     * serial version UID
     */
    @Serial
    private static final long serialVersionUID = 1L;

    private String state;
    private String redirectUri;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getRedirectUri() {
        return redirectUri;
    }

    public void setRedirectUri(String redirectUri) {
        this.redirectUri = redirectUri;
    }

    @Override
    public String toString() {
        return "CodeReq{" +
                "state='" + state + '\'' +
                ", redirectUri='" + redirectUri + '\'' +
                '}';
    }
}