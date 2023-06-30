package com.ipeakoin.dto.res;


import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author klover
 * description RefreshAccessTokenRes
 * date 2023/6/29 16:16
 */
@Data
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
}