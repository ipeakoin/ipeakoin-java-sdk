package com.ipeakoin.service;

import com.ipeakoin.service.dto.CodeOutput;
import org.junit.jupiter.api.Test;

class ClientTest {

    @Test
    void getAccessToken() {
        Client service = new Client.Builder()
                .config("ipeakoin1ab59eccfbc78d1b", "93fc39d77ef6a3a7b5f26b83fbbebe81", "http://127.0.0.1:3000")
                .build();

        CodeOutput code = service.getCode();
        System.out.println(code);
    }
}