package com.ipeakoin.dto.res;

import lombok.Data;

/**
 * @author klover
 * description BooleanRes
 * date 2023/6/30 17:47
 */
@Data
public class BooleanRes {
    private Integer code;
    private String message;
    private Boolean data;
}