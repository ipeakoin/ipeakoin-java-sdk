package com.ipeakoin.v1.crypto.assets.dto.req;

/**
 * EstimateQuoteReq
 *
 * @author klover
 * @date 2024/4/15 12:21
 */
public class EstimateQuoteReq {
    private String accountId;
    private String baseCurrency;
    private String quoteCurrency;
    private String side;
    private String rfqCurrency;
    private String rfqAmount;

    @Override
    public String toString() {
        return "EstimateQuoteReq{" +
                "accountId='" + accountId + '\'' +
                ", baseCurrency='" + baseCurrency + '\'' +
                ", quoteCurrency='" + quoteCurrency + '\'' +
                ", side='" + side + '\'' +
                ", rfqCurrency='" + rfqCurrency + '\'' +
                ", rfqAmount='" + rfqAmount + '\'' +
                '}';
    }

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
}
