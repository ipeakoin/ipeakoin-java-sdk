package com.ipeakoin.dto;

import lombok.Data;

import java.io.Serial;

/**
 * @author klover
 * description ErrorMessage
 * date 2023/6/29 14:51
 */
@Data
public class ErrorMessage {
    /**
     * serial version UID
     */
    @Serial
    private static final long serialVersionUID = 1L;

    private Integer code;
    private String message;
}