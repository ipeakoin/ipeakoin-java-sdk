package com.ipeakoin.dto.req.v1;

import com.ipeakoin.dto.Files;
import lombok.Data;

import java.util.List;

/**
 * @author klover
 * description UploadFileReq
 * date 2023/6/30 17:48
 */
@Data
public class UploadFileReq {
    /**
     * file
     */
    private List<Files> files;
}