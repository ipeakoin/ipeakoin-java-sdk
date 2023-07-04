package com.ipeakoin.dto;

import java.io.InputStream;

/**
 * @author klover
 * description FileData
 * date 2023/7/3 12:05
 */
public class FileData {
    private InputStream stream;
    private String filename;

    public FileData() {
    }

    public FileData(String filename, InputStream stream) {
        this.filename = filename;
        this.stream = stream;
    }

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
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FileData)) {
            return false;
        }

        FileData fileData = (FileData) o;

        if (getStream() != null ? !getStream().equals(fileData.getStream()) : fileData.getStream() != null) {
            return false;
        }
        return getFilename() != null ? getFilename().equals(fileData.getFilename()) : fileData.getFilename() == null;
    }

    @Override
    public int hashCode() {
        int result = getStream() != null ? getStream().hashCode() : 0;
        result = 31 * result + (getFilename() != null ? getFilename().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "FileData{" +
                "stream=" + stream +
                ", filename='" + filename + '\'' +
                '}';
    }
}