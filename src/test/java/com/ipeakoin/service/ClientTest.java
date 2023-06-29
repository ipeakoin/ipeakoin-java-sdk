package com.ipeakoin.service;

import com.ipeakoin.dto.ApiException;
import com.ipeakoin.dto.ApiResponse;
import com.ipeakoin.service.dto.CodeContentOutput;
import org.junit.Test;


public class ClientTest {

    @Test
    public void getAccessToken() {
        Client service = new Client.Builder()
                .config("ipeakoin1ab59eccfbc78d1b", "93fc39d77ef6a3a7b5f26b83fbbebe81", "http://127.0.0.1:3000")
                .build();

        try {
            ApiResponse<CodeContentOutput> code = service.getCode();
            System.out.println(code.getData().getCode());
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }
}