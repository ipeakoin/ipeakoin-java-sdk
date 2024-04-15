package com.ipeakoin.v1.crypto.assets.dto.req;

/**
 * CreateBlockchainAddressReq
 *
 * @author klover
 * @date 2024/4/15 12:15
 */
public class CreateBlockchainAddressReq {
    private String accountId;
    private String currency;
    private String chain;

    @Override
    public String toString() {
        return "CreateBlockchainAddressReq{" +
                "accountId='" + accountId + '\'' +
                ", currency='" + currency + '\'' +
                ", chain='" + chain + '\'' +
                '}';
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

    public String getChain() {
        return chain;
    }

    public void setChain(String chain) {
        this.chain = chain;
    }
}
