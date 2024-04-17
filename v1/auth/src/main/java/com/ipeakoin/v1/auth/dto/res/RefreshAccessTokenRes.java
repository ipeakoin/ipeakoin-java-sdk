package com.ipeakoin.v1.auth.dto.res;

/**
 * RefreshAccessTokenRes
 *
 * @author klover
 * @date 2024/4/11 21:11
 */
public class RefreshAccessTokenRes {
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
    public String toString() {
        return "RefreshAccessTokenRes{" +
                "accessToken='" + accessToken + '\'' +
                ", expiresIn=" + expiresIn +
                ", timestamp=" + timestamp +
                '}';
    }
}
