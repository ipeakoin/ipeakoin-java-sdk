package com.ipeakoin.service;

import com.ipeakoin.dto.ApiException;
import com.ipeakoin.dto.ApiResponse;
import com.ipeakoin.dto.Files;
import com.ipeakoin.dto.req.v1.UploadFileReq;
import com.ipeakoin.dto.res.AccessTokenRes;
import com.ipeakoin.dto.res.CodeRes;
import com.ipeakoin.dto.res.RefreshAccessTokenRes;
import com.ipeakoin.dto.res.v1.UploadFileRes;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.HttpMultipartMode;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;


public class ClientTest {

    @Test
    public void getAccessToken() {
        Client service = new Client.Builder()
                .config("ipeakoin1ab59eccfbc78d1b", "93fc39d77ef6a3a7b5f26b83fbbebe81", "http://127.0.0.1:3000")
                .build(false);

        try {
            ApiResponse<CodeRes> code = service.getCode();
            ApiResponse<AccessTokenRes> accessToken = service.getAccessToken(code.getData().getCode());
            // 主动关闭 http 连接池
            service.closeHttpClient();
            System.out.println(accessToken.getData());
        } catch (ApiException e) {
            System.out.println(e.getErrorMessage());
            e.printStackTrace();
        }
    }

    @Test
    public void refreshAccessToken() {
        Client service = new Client.Builder()
                .config("ipeakoin1ab59eccfbc78d1b", "93fc39d77ef6a3a7b5f26b83fbbebe81", "http://127.0.0.1:3000")
                .build();

        try {
            ApiResponse<RefreshAccessTokenRes> res = service.refreshAccessToken("12c4aec847b969b11a610a7ced6027506e88699fc1868893b2396ffb329a01b2");
            System.out.println(res.getData());
        } catch (ApiException e) {
            System.out.println(e.getErrorMessage());
            e.printStackTrace();
        }

    }

    @Test
    public void uploadFile() {
        Client service = new Client.Builder()
                .config("http://127.0.0.1:3000")
                .build();

        try {
            service.setAccessToken("d1984e8775898b623c4309845c1d3f9a6c87d315");
            UploadFileReq req = new UploadFileReq();
            InputStream fileInputStream = new FileInputStream("D:\\workspace\\ipeakoin-java-sdk\\src\\test\\java\\com\\ipeakoin\\service\\1.jpg");
            InputStream fileInputStream2 = new FileInputStream("D:\\workspace\\ipeakoin-java-sdk\\src\\test\\java\\com\\ipeakoin\\service\\1.jpg");
            Files file1 = new Files("1.jpg", fileInputStream);
            Files file2 = new Files("2.jpg", fileInputStream2);
            ArrayList<Files> files = new ArrayList<>();
            files.add(file1);
            files.add(file2);
            req.setFiles(files);
            ApiResponse<UploadFileRes> res = service.v1().uploadFile(req);
            System.out.println(res.getData());
        } catch (ApiException e) {
            System.out.println(e.getErrorMessage());
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}