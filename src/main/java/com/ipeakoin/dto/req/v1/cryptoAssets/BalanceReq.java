package com.ipeakoin.dto.req.v1.cryptoAssets;

import com.ipeakoin.dto.req.DefaultReq;

/**
 * @author klover
 * @description BalanceReq
 * @date 2023/7/20 13:52
 */
public class BalanceReq extends DefaultReq {
    private String id;
    private String accountId;
    private String currency;

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

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Override
    public String toString() {
        return "BalanceReq{" +
                "id='" + id + '\'' +
                ", accountId='" + accountId + '\'' +
                ", currency='" + currency + '\'' +
                ", accessToken='" + accessToken + '\'' +
                '}';
    }
}
