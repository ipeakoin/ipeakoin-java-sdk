package com.ipeakoin.v1.core.dto.res;

/**
 * CreateAccountRes
 *
 * @author klover
 * @date 2024/4/12 14:06
 */
public class CreateAccountRes {
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

    @Override
    public String toString() {
        return "CreateAccountRes{" +
                "accountId='" + accountId + '\'' +
                ", userId='" + userId + '\'' +
                '}';
    }
}
