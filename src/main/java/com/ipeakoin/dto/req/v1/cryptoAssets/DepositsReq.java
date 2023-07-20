package com.ipeakoin.dto.req.v1.cryptoAssets;

import com.ipeakoin.dto.req.LimitReq;

/**
 * @author klover
 * @description DepositsReq
 * @date 2023/7/20 13:45
 */
public class DepositsReq extends LimitReq {
    private String accountId;
    private String balanceId;
    private String currency;

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getBalanceId() {
        return balanceId;
    }

    public void setBalanceId(String balanceId) {
        this.balanceId = balanceId;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Override
    public String toString() {
        return "DepositsReq{" +
                "accountId='" + accountId + '\'' +
                ", balanceId='" + balanceId + '\'' +
                ", currency='" + currency + '\'' +
                ", limit=" + limit +
                ", page=" + page +
                ", accessToken='" + accessToken + '\'' +
                '}';
    }
}
