package com.ipeakoin.v1.crypto.assets.dto.req;

import com.ipeakoin.utils.req.LimitReq;

/**
 * DepositsReq
 *
 * @author klover
 * @date 2024/4/15 12:16
 */
public class DepositsReq extends LimitReq {
    private String accountId;
    private String balanceId;
    private String currency;

    @Override
    public String toString() {
        return "DepositsReq{" +
                "accountId='" + accountId + '\'' +
                ", balanceId='" + balanceId + '\'' +
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
}
