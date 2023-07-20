package com.ipeakoin.dto.req.v1.cryptoAssets;

import com.ipeakoin.dto.req.LimitReq;

/**
 * @author klover
 * @description TradesReq
 * @date 2023/7/20 14:06
 */
public class TradesReq extends LimitReq {
    private String accountId;
    private String id;
    private String currency;

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
