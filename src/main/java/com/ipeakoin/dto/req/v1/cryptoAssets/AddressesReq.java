package com.ipeakoin.dto.req.v1.cryptoAssets;

import com.ipeakoin.dto.req.LimitReq;

/**
 * @author klover
 * @description AddressesReq
 * @date 2023/7/20 13:53
 */
public class AddressesReq extends LimitReq {
    private String accountId;
    private String chain;
    private String currency;

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getChain() {
        return chain;
    }

    public void setChain(String chain) {
        this.chain = chain;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Override
    public String toString() {
        return "AddressesReq{" +
                "accountId='" + accountId + '\'' +
                ", chain='" + chain + '\'' +
                ", currency='" + currency + '\'' +
                ", limit=" + limit +
                ", page=" + page +
                ", accessToken='" + accessToken + '\'' +
                '}';
    }
}
