package com.ipeakoin.v1.core.dto.req;

import com.ipeakoin.v1.core.dto.entity.FileData;

import java.util.List;

/**
 * UploadFileReq
 *
 * @author klover
 * @date 2024/4/12 14:13
 */
public class UploadFileReq {
    /**
     * file
     */
    private List<FileData> files;

    @Override
    public String toString() {
        return "UploadFileReq{" +
                "files=" + files +
                '}';
    }

    public List<FileData> getFiles() {
        return files;
    }

    public void setFiles(List<FileData> files) {
        this.files = files;
    }
}
