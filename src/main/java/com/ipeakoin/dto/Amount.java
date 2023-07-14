package com.ipeakoin.dto;

import java.math.BigDecimal;

/**
 * @author klover
 * @description Amount
 * @date 2023/7/13 22:44
 */
public class Amount {
    private BigDecimal amount;
    private String currency;

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Override
    public String toString() {
        return "Amount{" +
                "amount=" + amount +
                ", currency='" + currency + '\'' +
                '}';
    }
}
