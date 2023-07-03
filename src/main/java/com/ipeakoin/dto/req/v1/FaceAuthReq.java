package com.ipeakoin.dto.req.v1;

import com.ipeakoin.dto.FileData;
import lombok.Data;

/**
 * @author klover
 * description FaceAuthReq
 * date 2023/6/30 17:49
 */
@Data
public class FaceAuthReq {
    private String accountId;
    private FileData file;
}