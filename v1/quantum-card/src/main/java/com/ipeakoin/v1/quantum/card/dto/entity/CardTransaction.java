package com.ipeakoin.v1.quantum.card.dto.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 * CardTransaction
 *
 * @author klover
 * @date 2024/4/15 11:43
 */
public class CardTransaction {
    private String id;
    private String accountId;
    private String cardId;
    private String currency;
    private BigDecimal amount;
    private BigDecimal fee;
    private String clientTransactionId;
    private String type;
    private String status;
    private Date transactionTime;
    private String detail;
    private Date createTime;

    @Override
    public String toString() {
        return "CardTransaction{" +
                "id='" + id + '\'' +
                ", accountId='" + accountId + '\'' +
                ", cardId='" + cardId + '\'' +
                ", currency='" + currency + '\'' +
                ", amount=" + amount +
                ", fee=" + fee +
                ", clientTransactionId='" + clientTransactionId + '\'' +
                ", type='" + type + '\'' +
                ", status='" + status + '\'' +
                ", transactionTime=" + transactionTime +
                ", detail='" + detail + '\'' +
                ", createTime=" + createTime +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getFee() {
        return fee;
    }

    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    public String getClientTransactionId() {
        return clientTransactionId;
    }

    public void setClientTransactionId(String clientTransactionId) {
        this.clientTransactionId = clientTransactionId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getTransactionTime() {
        return transactionTime;
    }

    public void setTransactionTime(Date transactionTime) {
        this.transactionTime = transactionTime;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
