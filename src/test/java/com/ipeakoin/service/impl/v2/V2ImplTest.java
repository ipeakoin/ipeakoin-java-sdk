package com.ipeakoin.service.impl.v2;

import com.ipeakoin.dto.ApiException;
import com.ipeakoin.dto.ApiResponse;
import com.ipeakoin.dto.req.v2.DeleteAccountReq;
import com.ipeakoin.dto.req.v2.UpdateAccountReq;
import com.ipeakoin.service.Client;
import junit.framework.TestCase;

public class V2ImplTest extends TestCase {
    private static Client service = new Client.Builder()
            .config("ipeakoin1ab59eccfbc78d1b", "93fc39d77ef6a3a7b5f26b83fbbebe81", "http://127.0.0.1:3000")
            .build();

    private static String accessToken = "3ee80920910541024a5ad91b9ac9a6c8b863e40e";

    public void testDeleteAccount() throws ApiException {
        ApiResponse<Boolean> res = service.v2().deleteAccount(new DeleteAccountReq() {{
            this.setId("c97551e3-1c90-42f6-9bc2-2557ed1d1943");
            this.setAccessToken(V2ImplTest.accessToken);
        }});
        System.out.println(res);
    }

    public void testUpdateAccount() throws ApiException {
        ApiResponse<Boolean> res = service.v2().updateAccount(new UpdateAccountReq() {{
            this.setEmail("11@qq.com");
            this.setId("c97551e3-1c90-42f6-9bc2-2557ed1d1943");
            this.setAccessToken(V2ImplTest.accessToken);
        }});
        System.out.println(res);
    }
}