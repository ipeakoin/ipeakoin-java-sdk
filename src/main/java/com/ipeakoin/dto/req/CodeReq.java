package com.ipeakoin.dto.req;

import lombok.Data;

/**
 * @author klover
 * description CodeReq
 * date 2023/6/29 16:05
 */
@Data
public class CodeReq {
    private String state;
    private String redirectUri;
}