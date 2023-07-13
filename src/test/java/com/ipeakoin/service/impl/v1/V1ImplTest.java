package com.ipeakoin.service.impl.v1;

import com.ipeakoin.dto.ApiException;
import com.ipeakoin.dto.ApiResponse;
import com.ipeakoin.dto.req.v1.AccountsReq;
import com.ipeakoin.dto.res.ListRes;
import com.ipeakoin.dto.res.v1.Accounts;
import com.ipeakoin.service.Client;
import junit.framework.TestCase;

public class V1ImplTest extends TestCase {
    private static Client service = new Client.Builder()
            .config("ipeakoin1ab59eccfbc78d1b", "93fc39d77ef6a3a7b5f26b83fbbebe81", "http://127.0.0.1:3000")
            .build();

    private String accessToken = "434182ee5990c119585ad088c50c6e0f821091c1";


    public void testCreateAccount() {
    }

    public void testGetAccounts() {
        try {
            AccountsReq req = new AccountsReq();
            req.setAccessToken(this.accessToken);
            ApiResponse<ListRes<Accounts>> accounts = service.v1().getAccounts(req);
            System.out.println(accounts.getContent().getData());
        } catch (ApiException e) {
            System.out.println(e.getErrorMessage());
            e.printStackTrace();
        }
    }
}