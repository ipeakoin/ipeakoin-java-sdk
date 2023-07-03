package com.ipeakoin.dto;

import lombok.Data;

import java.io.InputStream;

/**
 * @author klover
 * @description FileData
 * @date 2023/7/3 12:05
 */
@Data
public class FileData {
    private InputStream stream;
    private String filename;

    public FileData() {
    }

    public FileData(String filename, InputStream stream) {
        this.filename = filename;
        this.stream = stream;
    }

}