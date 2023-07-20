package com.ipeakoin.dto.req.v1.cryptoAssets;

import com.ipeakoin.dto.req.DefaultReq;

/**
 * @author klover
 * @description CreateBlockchainAddressReq
 * @date 2023/7/20 14:02
 */
public class CreateBlockchainAddressReq extends DefaultReq {
    private String accountId;
    private String currency;
    private String chain;

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

    public String getChain() {
        return chain;
    }

    public void setChain(String chain) {
        this.chain = chain;
    }

    @Override
    public String toString() {
        return "CreateBlockchainAddressReq{" +
                "accountId='" + accountId + '\'' +
                ", currency='" + currency + '\'' +
                ", chain='" + chain + '\'' +
                ", accessToken='" + accessToken + '\'' +
                '}';
    }
}
