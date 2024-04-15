package com.ipeakoin.v1.core.dto.req;

/**
 * ResetAccountKycReq
 *
 * @author klover
 * @date 2024/4/12 14:16
 */
public class ResetAccountKycReq {
    private String accountId;

    @Override
    public String toString() {
        return "ResetAccountKycReq{" +
                "accountId='" + accountId + '\'' +
                '}';
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }
}
