package com.ipeakoin.dto.req.v1;

import com.ipeakoin.dto.FileData;
import com.ipeakoin.dto.req.DefaultReq;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * @author klover
 * description UploadFileReq
 * date 2023/6/30 17:48
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class UploadFileReq extends DefaultReq {
    /**
     * file
     */
    private List<FileData> files;
}