package com.ipeakoin.dto.res;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author klover
 * description AccessTokenRes
 * date 2023/6/29 16:11
 */
@Data
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
}