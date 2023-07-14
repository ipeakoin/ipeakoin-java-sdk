package com.ipeakoin.dto.req.v1;

import com.ipeakoin.dto.req.LimitReq;

/**
 * @author klover
 * description BalancesReq
 * date 2023/6/30 17:49
 */
public class BalancesReq extends LimitReq {
    private String id;
    private String accountId;
    private String walletType;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getWalletType() {
        return walletType;
    }

    public void setWalletType(String walletType) {
        this.walletType = walletType;
    }

    @Override
    public String toString() {
        return "BalancesReq{" +
                "id='" + id + '\'' +
                ", accountId='" + accountId + '\'' +
                ", walletType='" + walletType + '\'' +
                ", limit=" + limit +
                ", page=" + page +
                ", accessToken='" + accessToken + '\'' +
                '}';
    }
}