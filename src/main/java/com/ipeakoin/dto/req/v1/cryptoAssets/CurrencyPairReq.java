package com.ipeakoin.dto.req.v1.cryptoAssets;

import com.ipeakoin.dto.req.DefaultReq;

/**
 * @author klover
 * @description CurrencyPairReq
 * @date 2023/7/20 13:50
 */
public class CurrencyPairReq extends DefaultReq {
    private String fromCurrency;
    private String toCurrency;

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

    @Override
    public String toString() {
        return "CurrencyPairReq{" +
                "fromCurrency='" + fromCurrency + '\'' +
                ", toCurrency='" + toCurrency + '\'' +
                ", accessToken='" + accessToken + '\'' +
                '}';
    }
}
