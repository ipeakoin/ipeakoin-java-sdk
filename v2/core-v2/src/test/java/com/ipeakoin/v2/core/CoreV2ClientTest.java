package com.ipeakoin.v2.core;

import com.ipeakoin.http.client.dto.res.ApiException;
import junit.framework.TestCase;

public class CoreV2ClientTest extends TestCase {
    private static CoreV2Client service = new CoreV2Client.Builder()
            .Credentials("http://127.0.0.1:3000")
            .build();

    static {
        service.setAccessToken("d14652e68bb45196f191eec0b35cdadac4ca3b45");
    }

    public void testDeleteAccount() throws ApiException {
        Boolean res = service.deleteAccount("c0e0822d-5e73-4f8d-9805-4b0814812dbe");
        System.out.println(res);
    }

    public void testUpdateAccount() throws ApiException {
        Boolean res = service.updateAccount("c0e0822d-5e73-4f8d-9805-4b0814812dbe", "111@qq.com");
        System.out.println(res);
    }
}