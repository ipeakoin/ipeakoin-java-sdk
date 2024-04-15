package com.ipeakoin.v1.crypto.assets.dto.req;

/**
 * PayoutReq
 *
 * @author klover
 * @date 2024/4/15 12:28
 */
public class PayoutReq {
    private String accountId;
    private String wireId;
    private String amount;

    @Override
    public String toString() {
        return "PayoutReq{" +
                "accountId='" + accountId + '\'' +
                ", wireId='" + wireId + '\'' +
                ", amount='" + amount + '\'' +
                '}';
    }

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
}
