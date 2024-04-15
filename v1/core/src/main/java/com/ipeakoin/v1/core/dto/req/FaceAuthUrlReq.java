package com.ipeakoin.v1.core.dto.req;

/**
 * FaceAuthUrlReq
 *
 * @author klover
 * @date 2024/4/12 14:17
 */
public class FaceAuthUrlReq {
    private String accountId;

    @Override
    public String toString() {
        return "FaceAuthUrlReq{" +
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
