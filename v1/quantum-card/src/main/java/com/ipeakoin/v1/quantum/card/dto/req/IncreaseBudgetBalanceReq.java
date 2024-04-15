package com.ipeakoin.v1.quantum.card.dto.req;

import java.math.BigDecimal;

/**
 * IncreaseBudgetBalanceReq
 *
 * @author klover
 * @date 2024/4/15 11:30
 */
public class IncreaseBudgetBalanceReq {
    private String budgetId;
    private BigDecimal cost;
    private String clientTransactionId;

    public String getBudgetId() {
        return budgetId;
    }

    public void setBudgetId(String budgetId) {
        this.budgetId = budgetId;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public String getClientTransactionId() {
        return clientTransactionId;
    }

    public void setClientTransactionId(String clientTransactionId) {
        this.clientTransactionId = clientTransactionId;
    }

    @Override
    public String toString() {
        return "IncreaseBudgetBalanceReq{" +
                "budgetId='" + budgetId + '\'' +
                ", cost=" + cost +
                ", clientTransactionId='" + clientTransactionId + '\'' +
                '}';
    }
}
