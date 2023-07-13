package com.ipeakoin.dto.res.v1;

/**
 * @author klover
 * description CreateAccountData
 * date 2023/7/4 15:50
 */
public class CreateAccount {
    private String accountId;
    private String userId;

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}