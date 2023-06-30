package com.ipeakoin.dto.req;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author klover
 * description CodeReq
 * date 2023/6/29 16:05
 */
@Data
public class CodeReq implements Serializable {
    /**
     * serial version UID
     */
    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * state
     */
    private String state;
    /**
     * redirectUri
     */
    private String redirectUri;
}