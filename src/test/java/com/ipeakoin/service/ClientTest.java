package com.ipeakoin.service;

import com.ipeakoin.dto.ApiException;
import com.ipeakoin.dto.ApiResponse;
import com.ipeakoin.dto.res.AccessTokenRes;
import com.ipeakoin.dto.res.CodeRes;
import com.ipeakoin.dto.res.RefreshAccessTokenRes;
import org.junit.Test;


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
}