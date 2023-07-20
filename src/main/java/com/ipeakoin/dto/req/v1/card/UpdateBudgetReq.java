package com.ipeakoin.dto.req.v1.card;

import com.ipeakoin.dto.req.DefaultReq;

/**
 * @author klover
 * @description UpdateBudgetReq
 * @date 2023/7/18 16:03
 */
public class UpdateBudgetReq extends DefaultReq {
    private String budgetId;
    private String name;

    public String getBudgetId() {
        return budgetId;
    }

    public void setBudgetId(String budgetId) {
        this.budgetId = budgetId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "UpdateBudgetReq{" +
                "budgetId='" + budgetId + '\'' +
                ", name='" + name + '\'' +
                ", accessToken='" + accessToken + '\'' +
                '}';
    }
}
