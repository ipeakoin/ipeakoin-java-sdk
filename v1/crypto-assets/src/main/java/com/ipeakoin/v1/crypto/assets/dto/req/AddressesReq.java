package com.ipeakoin.v1.crypto.assets.dto.req;

import com.ipeakoin.utils.req.LimitReq;

/**
 * AddressesReq
 *
 * @author klover
 * @date 2024/4/15 12:14
 */
public class AddressesReq extends LimitReq {
    private String accountId;
    private String chain;
    private String currency;

    @Override
    public String toString() {
        return "AddressesReq{" +
                "accountId='" + accountId + '\'' +
                ", chain='" + chain + '\'' +
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
}
