package com.ipeakoin.v1.crypto.assets.dto.req;

import com.ipeakoin.utils.req.LimitReq;

/**
 * BalanceReq
 *
 * @author klover
 * @date 2024/4/15 12:13
 */
public class BalanceReq {
    private String id;
    private String accountId;
    private String currency;

    @Override
    public String toString() {
        return "BalanceReq{" +
                "id='" + id + '\'' +
                ", accountId='" + accountId + '\'' +
                ", currency='" + currency + '\'' +
                '}';
    }

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
}
