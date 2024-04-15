package com.ipeakoin.v1.core.dto.entity;

import java.io.InputStream;

/**
 * FileData
 *
 * @author klover
 * @date 2024/4/12 14:13
 */
public class FileData {
    private InputStream stream;
    private String filename;

    public InputStream getStream() {
        return stream;
    }

    public void setStream(InputStream stream) {
        this.stream = stream;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    @Override
    public String toString() {
        return "FileData{" +
                "stream=" + stream +
                ", filename='" + filename + '\'' +
                '}';
    }
}
