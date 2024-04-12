package com.ipeakoin.v1.auth.dto.res;

import java.io.Serializable;

/**
 * AccessTokenRes
 *
 * @author klover
 * @date 2024/4/11 21:10
 */
public class AccessTokenRes implements Serializable {
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
    public String toString() {
        return "AccessTokenRes{" +
                "accessToken='" + accessToken + '\'' +
                ", refreshToken='" + refreshToken + '\'' +
                ", expiresIn=" + expiresIn +
                ", timestamp=" + timestamp +
                '}';
    }
}
