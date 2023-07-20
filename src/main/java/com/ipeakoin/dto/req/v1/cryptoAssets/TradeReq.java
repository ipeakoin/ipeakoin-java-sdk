package com.ipeakoin.dto.req.v1.cryptoAssets;

import com.ipeakoin.dto.req.DefaultReq;

/**
 * @author klover
 * @description TradeReq
 * @date 2023/7/20 14:10
 */
public class TradeReq extends DefaultReq {
    private String accountId;
    private String baseCurrency;
    private String quoteCurrency;
    private String side;
    private String rfqCurrency;
    private String rfqAmount;
    private String quoteId;

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getBaseCurrency() {
        return baseCurrency;
    }

    public void setBaseCurrency(String baseCurrency) {
        this.baseCurrency = baseCurrency;
    }

    public String getQuoteCurrency() {
        return quoteCurrency;
    }

    public void setQuoteCurrency(String quoteCurrency) {
        this.quoteCurrency = quoteCurrency;
    }

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public String getRfqCurrency() {
        return rfqCurrency;
    }

    public void setRfqCurrency(String rfqCurrency) {
        this.rfqCurrency = rfqCurrency;
    }

    public String getRfqAmount() {
        return rfqAmount;
    }

    public void setRfqAmount(String rfqAmount) {
        this.rfqAmount = rfqAmount;
    }

    public String getQuoteId() {
        return quoteId;
    }

    public void setQuoteId(String quoteId) {
        this.quoteId = quoteId;
    }

    @Override
    public String toString() {
        return "TradeReq{" +
                "accountId='" + accountId + '\'' +
                ", baseCurrency='" + baseCurrency + '\'' +
                ", quoteCurrency='" + quoteCurrency + '\'' +
                ", side='" + side + '\'' +
                ", rfqCurrency='" + rfqCurrency + '\'' +
                ", rfqAmount='" + rfqAmount + '\'' +
                ", quoteId='" + quoteId + '\'' +
                ", accessToken='" + accessToken + '\'' +
                '}';
    }
}
