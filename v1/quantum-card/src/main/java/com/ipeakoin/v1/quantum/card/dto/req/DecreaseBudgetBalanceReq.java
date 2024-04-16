package com.ipeakoin.v1.quantum.card.dto.req;

import java.math.BigDecimal;

/**
 * DecreaseBudgetBalanceReq
 *
 * @author klover
 * @date 2024/4/15 11:31
 */
public class DecreaseBudgetBalanceReq {
    private String budgetId;
    private Integer cost;
    private String clientTransactionId;

    @Override
    public String toString() {
        return "DecreaseBudgetBalanceReq{" +
                "budgetId='" + budgetId + '\'' +
                ", cost=" + cost +
                ", clientTransactionId='" + clientTransactionId + '\'' +
                '}';
    }

    public String getBudgetId() {
        return budgetId;
    }

    public void setBudgetId(String budgetId) {
        this.budgetId = budgetId;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public String getClientTransactionId() {
        return clientTransactionId;
    }

    public void setClientTransactionId(String clientTransactionId) {
        this.clientTransactionId = clientTransactionId;
    }
}
