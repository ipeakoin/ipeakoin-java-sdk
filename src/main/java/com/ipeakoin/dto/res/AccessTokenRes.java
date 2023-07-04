package com.ipeakoin.dto.res;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author klover
 * description AccessTokenRes
 * date 2023/6/29 16:11
 */
public class AccessTokenRes implements Serializable {
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
     * refresh token(valid for 30 days, reauthorization is required after refresh token expires)
     */
    private String refreshToken;
    /**
     * Certificate validity time, unit: second
     */
    private Long expiresIn;
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

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    public Long getExpiresIn() {
        return expiresIn;
    }

    public void setExpiresIn(Long expiresIn) {
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
        if (!(o instanceof AccessTokenRes)) {
            return false;
        }

        AccessTokenRes that = (AccessTokenRes) o;

        if (getAccessToken() != null ? !getAccessToken().equals(that.getAccessToken()) : that.getAccessToken() != null) {
            return false;
        }
        if (getRefreshToken() != null ? !getRefreshToken().equals(that.getRefreshToken()) : that.getRefreshToken() != null) {
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
        result = 31 * result + (getRefreshToken() != null ? getRefreshToken().hashCode() : 0);
        result = 31 * result + (getExpiresIn() != null ? getExpiresIn().hashCode() : 0);
        result = 31 * result + (getTimestamp() != null ? getTimestamp().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "AccessTokenRes{" +
                "accessToken='" + accessToken + '\'' +
                ", refreshToken='" + refreshToken + '\'' +
                ", expiresIn=" + expiresIn +
                ", timestamp=" + timestamp +
                '}';
    }
}