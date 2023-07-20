package com.ipeakoin.dto.res.v1.cryptoAssets;

import java.math.BigDecimal;

/**
 * @author klover
 * @description EstimateQuoteRes
 * @date 2023/7/20 14:05
 */
public class EstimateQuoteRes {
    private String id;
    private String quoteTime;
    private String baseCurrency;
    private BigDecimal baseAmount;
    private BigDecimal quoteAmount;
    private String quoteCurrency;
    private BigDecimal fee;
    private String side;
    private String rate;
    private BigDecimal rfqAmount;
    private String rfqCurrency;
    private String ttlMs;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getQuoteTime() {
        return quoteTime;
    }

    public void setQuoteTime(String quoteTime) {
        this.quoteTime = quoteTime;
    }

    public String getBaseCurrency() {
        return baseCurrency;
    }

    public void setBaseCurrency(String baseCurrency) {
        this.baseCurrency = baseCurrency;
    }

    public BigDecimal getBaseAmount() {
        return baseAmount;
    }

    public void setBaseAmount(BigDecimal baseAmount) {
        this.baseAmount = baseAmount;
    }

    public BigDecimal getQuoteAmount() {
        return quoteAmount;
    }

    public void setQuoteAmount(BigDecimal quoteAmount) {
        this.quoteAmount = quoteAmount;
    }

    public String getQuoteCurrency() {
        return quoteCurrency;
    }

    public void setQuoteCurrency(String quoteCurrency) {
        this.quoteCurrency = quoteCurrency;
    }

    public BigDecimal getFee() {
        return fee;
    }

    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public BigDecimal getRfqAmount() {
        return rfqAmount;
    }

    public void setRfqAmount(BigDecimal rfqAmount) {
        this.rfqAmount = rfqAmount;
    }

    public String getRfqCurrency() {
        return rfqCurrency;
    }

    public void setRfqCurrency(String rfqCurrency) {
        this.rfqCurrency = rfqCurrency;
    }

    public String getTtlMs() {
        return ttlMs;
    }

    public void setTtlMs(String ttlMs) {
        this.ttlMs = ttlMs;
    }

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "EstimateQuoteRes{" +
                "id='" + id + '\'' +
                ", quoteTime='" + quoteTime + '\'' +
                ", baseCurrency='" + baseCurrency + '\'' +
                ", baseAmount=" + baseAmount +
                ", quoteAmount=" + quoteAmount +
                ", quoteCurrency='" + quoteCurrency + '\'' +
                ", fee=" + fee +
                ", side='" + side + '\'' +
                ", rate='" + rate + '\'' +
                ", rfqAmount=" + rfqAmount +
                ", rfqCurrency='" + rfqCurrency + '\'' +
                ", ttlMs='" + ttlMs + '\'' +
                '}';
    }
}
