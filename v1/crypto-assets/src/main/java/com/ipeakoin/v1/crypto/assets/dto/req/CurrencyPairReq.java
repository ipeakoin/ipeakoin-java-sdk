package com.ipeakoin.v1.crypto.assets.dto.req;

/**
 * CurrencyPairReq
 *
 * @author klover
 * @date 2024/4/15 12:20
 */
public class CurrencyPairReq {
    private String fromCurrency;
    private String toCurrency;

    @Override
    public String toString() {
        return "CurrencyPairReq{" +
                "fromCurrency='" + fromCurrency + '\'' +
                ", toCurrency='" + toCurrency + '\'' +
                '}';
    }

    public String getFromCurrency() {
        return fromCurrency;
    }

    public void setFromCurrency(String fromCurrency) {
        this.fromCurrency = fromCurrency;
    }

    public String getToCurrency() {
        return toCurrency;
    }

    public void setToCurrency(String toCurrency) {
        this.toCurrency = toCurrency;
    }
}
