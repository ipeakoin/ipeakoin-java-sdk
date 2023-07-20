package com.ipeakoin.dto.req.v1.cryptoAssets;

import com.ipeakoin.dto.req.DefaultReq;

import java.math.BigDecimal;

/**
 * @author klover
 * @description WithdrawalReq
 * @date 2023/7/20 14:04
 */
public class WithdrawalReq extends DefaultReq {
    private String accountId;
    private String chain;
    private String currency;
    private String amount;
    private String address;

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

    @Override
    public String toString() {
        return "WithdrawalReq{" +
                "accountId='" + accountId + '\'' +
                ", chain='" + chain + '\'' +
                ", currency='" + currency + '\'' +
                ", amount=" + amount +
                ", address='" + address + '\'' +
                ", accessToken='" + accessToken + '\'' +
                '}';
    }
}
