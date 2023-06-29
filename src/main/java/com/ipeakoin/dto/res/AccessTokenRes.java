package com.ipeakoin.dto.res;

import lombok.Data;

/**
 * @author klover
 * description AccessTokenRes
 * date 2023/6/29 16:11
 */
@Data
public class AccessTokenRes {
    private String accessToken;
    private String refreshToken;
    private Long expiresIn;
    private Integer timestamp;
}