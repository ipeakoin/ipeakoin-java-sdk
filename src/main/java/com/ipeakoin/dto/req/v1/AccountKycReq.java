package com.ipeakoin.dto.req.v1;

import com.ipeakoin.dto.req.DefaultReq;

/**
 * @author klover
 * description AccountKycReq
 * date 2023/6/30 17:49
 */
public class AccountKycReq extends DefaultReq {
    private String accountId;

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    @Override
    public String toString() {
        return "AccountKycReq{" +
                "accountId='" + accountId + '\'' +
                ", accessToken='" + accessToken + '\'' +
                '}';
    }
}