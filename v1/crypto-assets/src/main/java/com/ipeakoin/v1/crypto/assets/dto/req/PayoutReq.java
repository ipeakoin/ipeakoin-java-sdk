package com.ipeakoin.v1.crypto.assets.dto.req;

import java.math.BigDecimal;

/**
 * PayoutReq
 *
 * @author klover
 * @date 2024/4/15 12:28
 */
public class PayoutReq {
    private String accountId;
    private String wireId;
    private BigDecimal amount;

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

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
