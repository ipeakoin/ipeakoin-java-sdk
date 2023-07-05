package com.ipeakoin.dto.req.v1;

import com.ipeakoin.dto.FileData;
import com.ipeakoin.dto.req.DefaultReq;

import java.util.List;

/**
 * @author klover
 * description UploadFileReq
 * date 2023/6/30 17:48
 */
public class UploadFileReq extends DefaultReq {
    /**
     * file
     */
    private List<FileData> files;

    public List<FileData> getFiles() {
        return files;
    }

    public void setFiles(List<FileData> files) {
        this.files = files;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UploadFileReq)) return false;

        UploadFileReq that = (UploadFileReq) o;

        return getFiles() != null ? getFiles().equals(that.getFiles()) : that.getFiles() == null;
    }

    @Override
    public int hashCode() {
        return getFiles() != null ? getFiles().hashCode() : 0;
    }

    @Override
    public String toString() {
        return "UploadFileReq{" +
                "files=" + files +
                ", accessToken='" + accessToken + '\'' +
                '}';
    }
}