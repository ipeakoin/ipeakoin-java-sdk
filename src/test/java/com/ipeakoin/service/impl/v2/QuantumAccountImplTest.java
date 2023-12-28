package com.ipeakoin.service.impl.v2;

import com.ipeakoin.dto.ApiException;
import com.ipeakoin.dto.ApiResponse;
import com.ipeakoin.dto.req.v2.AccountTxReq;
import com.ipeakoin.dto.req.v2.AccountTxsReq;
import com.ipeakoin.dto.res.ListRes;
import com.ipeakoin.dto.res.v2.AccountTxInfo;
import com.ipeakoin.service.Client;
import junit.framework.TestCase;

public class QuantumAccountImplTest extends TestCase {

    private static Client service = new Client.Builder()
            .config("ipeakoin1ab59eccfbc78d1b", "93fc39d77ef6a3a7b5f26b83fbbebe81", "http://127.0.0.1:3000")
            .build();

    private static String accessToken = "3ee80920910541024a5ad91b9ac9a6c8b863e40e";

    public void testGetAccountTransactions() throws ApiException {
        ApiResponse<ListRes<AccountTxInfo>> accountTransactions = service.v2().quantumAccount().getAccountTransactions(new AccountTxsReq() {{
            this.setAccessToken(QuantumAccountImplTest.accessToken);
        }});
        System.out.println(accountTransactions);
    }

    public void testGetAccountTransaction() throws ApiException {
        ApiResponse<AccountTxInfo> accountTransaction = service.v2().quantumAccount().getAccountTransaction(new AccountTxReq() {{
            this.setAccessToken(QuantumAccountImplTest.accessToken);
            this.setId("952cf10e-3e60-4ad4-92e9-0f74ffdd0bd1");
        }});
        System.out.println(accountTransaction);
    }
}