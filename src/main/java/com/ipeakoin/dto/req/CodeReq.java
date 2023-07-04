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

    /**
     * state
     */
    private String state;
    /**
     * redirectUri
     */
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CodeReq)) return false;

        CodeReq codeReq = (CodeReq) o;

        if (getState() != null ? !getState().equals(codeReq.getState()) : codeReq.getState() != null) return false;
        return getRedirectUri() != null ? getRedirectUri().equals(codeReq.getRedirectUri()) : codeReq.getRedirectUri() == null;
    }

    @Override
    public int hashCode() {
        int result = getState() != null ? getState().hashCode() : 0;
        result = 31 * result + (getRedirectUri() != null ? getRedirectUri().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "CodeReq{" +
                "state='" + state + '\'' +
                ", redirectUri='" + redirectUri + '\'' +
                '}';
    }
}