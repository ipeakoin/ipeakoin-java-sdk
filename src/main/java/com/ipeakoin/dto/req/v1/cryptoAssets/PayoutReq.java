package com.ipeakoin.dto.req.v1.cryptoAssets;

import com.ipeakoin.dto.req.DefaultReq;

/**
 * @author klover
 * @description PayoutReq
 * @date 2023/7/20 14:13
 */
public class PayoutReq extends DefaultReq {
    private String accountId;
    private String wireId;
    private String amount;

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getWireId() {
        return wireId;
    }

    public void setWireId(String wireId) {
        this.wireId = wireId;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "PayoutReq{" +
                "accountId='" + accountId + '\'' +
                ", wireId='" + wireId + '\'' +
                ", amount='" + amount + '\'' +
                ", accessToken='" + accessToken + '\'' +
                '}';
    }
}
