package com.ipeakoin.v2.quantum.card.dto.entity;

import java.math.BigDecimal;

/**
 * balance
 *
 * @author klover
 * @date 2024/4/15 10:10
 */
public class CardBalance {
    private BigDecimal available;
    private BigDecimal pending;
    private BigDecimal frozen;
    private String currency;

    @Override
    public String toString() {
        return "CardBalance{" +
                "available=" + available +
                ", pending=" + pending +
                ", frozen=" + frozen +
                ", currency='" + currency + '\'' +
                '}';
    }

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
}
