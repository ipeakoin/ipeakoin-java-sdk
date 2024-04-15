package com.ipeakoin.v1.crypto.assets.dto.req;

/**
 * WithdrawalReq
 *
 * @author klover
 * @date 2024/4/15 12:18
 */
public class WithdrawalReq {
    private String accountId;
    private String chain;
    private String currency;
    private String amount;
    private String address;

    @Override
    public String toString() {
        return "WithdrawalReq{" +
                "accountId='" + accountId + '\'' +
                ", chain='" + chain + '\'' +
                ", currency='" + currency + '\'' +
                ", amount='" + amount + '\'' +
                ", address='" + address + '\'' +
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

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
