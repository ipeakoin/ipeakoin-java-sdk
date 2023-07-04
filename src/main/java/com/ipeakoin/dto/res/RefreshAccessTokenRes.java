package com.ipeakoin.dto.res;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author klover
 * description RefreshAccessTokenRes
 * date 2023/6/29 16:16
 */
public class RefreshAccessTokenRes implements Serializable {
    /**
     * serial version UID
     */
    @Serial
    private static final long serialVersionUID = 1L;
    /**
     * Interface call credential
     */
    private String accessToken;
    /**
     * Certificate validity time, unit: second
     */
    private Integer expiresIn;
    /**
     * response time stamp
     */
    private Integer timestamp;

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public Integer getExpiresIn() {
        return expiresIn;
    }

    public void setExpiresIn(Integer expiresIn) {
        this.expiresIn = expiresIn;
    }

    public Integer getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Integer timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RefreshAccessTokenRes)) {
            return false;
        }

        RefreshAccessTokenRes that = (RefreshAccessTokenRes) o;

        if (getAccessToken() != null ? !getAccessToken().equals(that.getAccessToken()) : that.getAccessToken() != null) {
            return false;
        }
        if (getExpiresIn() != null ? !getExpiresIn().equals(that.getExpiresIn()) : that.getExpiresIn() != null) {
            return false;
        }
        return getTimestamp() != null ? getTimestamp().equals(that.getTimestamp()) : that.getTimestamp() == null;
    }

    @Override
    public int hashCode() {
        int result = getAccessToken() != null ? getAccessToken().hashCode() : 0;
        result = 31 * result + (getExpiresIn() != null ? getExpiresIn().hashCode() : 0);
        result = 31 * result + (getTimestamp() != null ? getTimestamp().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "RefreshAccessTokenRes{" +
                "accessToken='" + accessToken + '\'' +
                ", expiresIn=" + expiresIn +
                ", timestamp=" + timestamp +
                '}';
    }
}