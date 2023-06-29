package com.ipeakoin.dto.res;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author klover
 * description CodeRes
 * date 2023/6/27 17:27
 */
@Data
public class CodeRes implements Serializable {
    /**
     * serial version UID
     */
    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * 接口响应时间戳
     */
    private Integer timestamp;
    /**
     * state参数
     */
    private String state;
    /**
     * code作为换取access token的票据, code只能使用一次, 10分钟未被使用自动过期
     */
    private String code;
}