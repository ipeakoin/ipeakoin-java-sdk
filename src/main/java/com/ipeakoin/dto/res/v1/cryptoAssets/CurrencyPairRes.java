package com.ipeakoin.dto.res.v1.cryptoAssets;

import java.math.BigDecimal;

/**
 * @author klover
 * @description CurrencyPairRes
 * @date 2023/7/20 13:50
 */
public class CurrencyPairRes {
    private String symbol;
    private String baseCurrency;
    private BigDecimal baseMin;
    private BigDecimal baseMax;
    private String quoteCurrency;
    private BigDecimal quoteMin;
    private BigDecimal quoteMax;

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getBaseCurrency() {
        return baseCurrency;
    }

    public void setBaseCurrency(String baseCurrency) {
        this.baseCurrency = baseCurrency;
    }

    public BigDecimal getBaseMin() {
        return baseMin;
    }

    public void setBaseMin(BigDecimal baseMin) {
        this.baseMin = baseMin;
    }

    public BigDecimal getBaseMax() {
        return baseMax;
    }

    public void setBaseMax(BigDecimal baseMax) {
        this.baseMax = baseMax;
    }

    public String getQuoteCurrency() {
        return quoteCurrency;
    }

    public void setQuoteCurrency(String quoteCurrency) {
        this.quoteCurrency = quoteCurrency;
    }

    public BigDecimal getQuoteMin() {
        return quoteMin;
    }

    public void setQuoteMin(BigDecimal quoteMin) {
        this.quoteMin = quoteMin;
    }

    public BigDecimal getQuoteMax() {
        return quoteMax;
    }

    public void setQuoteMax(BigDecimal quoteMax) {
        this.quoteMax = quoteMax;
    }

    @Override
    public String toString() {
        return "CurrencyPairRes{" +
                "symbol='" + symbol + '\'' +
                ", baseCurrency='" + baseCurrency + '\'' +
                ", baseMin='" + baseMin + '\'' +
                ", baseMax='" + baseMax + '\'' +
                ", quoteCurrency='" + quoteCurrency + '\'' +
                ", quoteMin='" + quoteMin + '\'' +
                ", quoteMax='" + quoteMax + '\'' +
                '}';
    }
}
