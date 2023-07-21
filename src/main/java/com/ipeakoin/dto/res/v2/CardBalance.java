package com.ipeakoin.dto.res.v2;

import java.math.BigDecimal;

/**
 * @author klover
 * @description CardBalance
 * @date 2023/7/21 9:40
 */
public class CardBalance {
    private BigDecimal available;
    private BigDecimal pending;
    private BigDecimal frozen;
    private String currency;

    public BigDecimal getAvailable() {
        return available;
    }

    public void setAvailable(BigDecimal available) {
        this.available = available;
    }

    public BigDecimal getPending() {
        return pending;
    }

    public void setPending(BigDecimal pending) {
        this.pending = pending;
    }

    public BigDecimal getFrozen() {
        return frozen;
    }

    public void setFrozen(BigDecimal frozen) {
        this.frozen = frozen;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Override
    public String toString() {
        return "CardBalance{" +
                "available=" + available +
                ", pending=" + pending +
                ", frozen=" + frozen +
                ", currency='" + currency + '\'' +
                '}';
    }
}
