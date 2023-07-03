package com.ipeakoin.dto.res.v1;

import lombok.Data;

/**
 * @author klover
 * description UploadFileRes
 * date 2023/6/30 17:44
 */
@Data
public class UploadFileRes {
    private Integer code;
    private String message;
    /**
     * image id
     */
    private String[] data;
}