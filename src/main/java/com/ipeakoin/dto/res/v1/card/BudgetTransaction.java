package com.ipeakoin.dto.res.v1.card;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author klover
 * @description BudgetTransaction
 * @date 2023/7/18 16:08
 */
public class BudgetTransaction {
    private String id;
    private String accountId;
    private String budgetId;
    private String cardId;
    private BigDecimal amount;
    private BigDecimal fee;
    private String clientTransactionId;
    private String type;
    private String status;
    private Date transactionTime;
    private String detail;

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

    public String getBudgetId() {
        return budgetId;
    }

    public void setBudgetId(String budgetId) {
        this.budgetId = budgetId;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
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

    @Override
    public String toString() {
        return "BudgetTransaction{" +
                "id='" + id + '\'' +
                ", accountId='" + accountId + '\'' +
                ", budgetId='" + budgetId + '\'' +
                ", cardId='" + cardId + '\'' +
                ", amount=" + amount +
                ", fee=" + fee +
                ", clientTransactionId='" + clientTransactionId + '\'' +
                ", type='" + type + '\'' +
                ", status='" + status + '\'' +
                ", transactionTime=" + transactionTime +
                ", detail='" + detail + '\'' +
                '}';
    }
}
