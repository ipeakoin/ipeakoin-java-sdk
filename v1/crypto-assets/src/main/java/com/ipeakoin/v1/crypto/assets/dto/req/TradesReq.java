package com.ipeakoin.v1.crypto.assets.dto.req;

import com.ipeakoin.utils.req.LimitReq;

/**
 * TradesReq
 *
 * @author klover
 * @date 2024/4/15 12:22
 */
public class TradesReq extends LimitReq {
    private String accountId;
    private String id;
    private String currency;

    @Override
    public String toString() {
        return "TradesReq{" +
                "accountId='" + accountId + '\'' +
                ", id='" + id + '\'' +
                ", currency='" + currency + '\'' +
                ", limit=" + limit +
                ", page=" + page +
                '}';
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
