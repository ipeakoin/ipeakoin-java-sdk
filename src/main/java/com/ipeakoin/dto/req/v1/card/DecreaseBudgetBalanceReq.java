package com.ipeakoin.dto.req.v1.card;

import com.ipeakoin.dto.req.DefaultReq;

import java.math.BigDecimal;

/**
 * @author klover
 * @description DecreaseBudgetBalanceReq
 * @date 2023/7/18 16:07
 */
public class DecreaseBudgetBalanceReq extends DefaultReq {
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
        return "DecreaseBudgetBalanceReq{" +
                "budgetId='" + budgetId + '\'' +
                ", cost=" + cost +
                ", clientTransactionId='" + clientTransactionId + '\'' +
                ", accessToken='" + accessToken + '\'' +
                '}';
    }
}
