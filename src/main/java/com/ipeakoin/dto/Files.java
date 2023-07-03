package com.ipeakoin.dto;

import lombok.Data;
import org.apache.http.entity.ContentType;

import java.io.InputStream;

/**
 * @author klover
 * @description Files
 * @date 2023/7/3 12:05
 */
@Data
public class Files {
    private InputStream stream;
    private String filename;

    public Files() {
    }

    public Files(String filename, InputStream stream) {
        this.filename = filename;
        this.stream = stream;
    }

}