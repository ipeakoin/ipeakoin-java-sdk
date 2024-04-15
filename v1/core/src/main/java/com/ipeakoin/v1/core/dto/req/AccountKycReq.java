package com.ipeakoin.v1.core.dto.req;

/**
 * AccountKycReq
 *
 * @author klover
 * @date 2024/4/12 14:18
 */
public class AccountKycReq {
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
                '}';
    }
}
