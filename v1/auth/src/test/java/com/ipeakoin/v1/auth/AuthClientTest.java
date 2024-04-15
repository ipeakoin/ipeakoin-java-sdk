package com.ipeakoin.v1.auth;

import com.ipeakoin.http.client.dto.res.ApiException;
import com.ipeakoin.utils.JsonUtil;
import com.ipeakoin.v1.auth.dto.res.AccessTokenRes;
import com.ipeakoin.v1.auth.dto.res.CodeRes;
import com.ipeakoin.v1.auth.dto.res.RefreshAccessTokenRes;
import junit.framework.TestCase;

public class AuthClientTest extends TestCase {
    private static AuthClient service = new AuthClient.Builder()
            .Credentials("ipeakoin1ab59eccfbc78d1b", "93fc39d77ef6a3a7b5f26b83fbbebe81", "http://127.0.0.1:3000")
            .build();

    public void testGetCode() throws ApiException {
        CodeRes res = service.getCode();
        System.out.println(JsonUtil.toJSONString(res));
    }

    public void testGetAccessToken() throws ApiException {
        AccessTokenRes res = service.getAccessToken("be0ec3651e65154e1db4af8dcfd2ef7f");
        System.out.println(JsonUtil.toJSONString(res));
    }

    public void testRefreshAccessToken() throws ApiException {
        RefreshAccessTokenRes res = service.refreshAccessToken("74323196942eb80322bdf4fc38383df74946a5d402ecfc789b6f95e30435f6f9");
        System.out.println(JsonUtil.toJSONString(res));
    }
}