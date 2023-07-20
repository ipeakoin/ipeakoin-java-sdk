package com.ipeakoin.dto.req.v1.card;

import com.ipeakoin.dto.req.DefaultReq;

/**
 * @author klover
 * @description CreateBudgetReq
 * @date 2023/7/18 16:04
 */
public class CreateBudgetReq extends DefaultReq {
    private String accountId;
    private String name;
    private String cost;

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "CreateBudgetReq{" +
                "accountId='" + accountId + '\'' +
                ", name='" + name + '\'' +
                ", cost='" + cost + '\'' +
                ", accessToken='" + accessToken + '\'' +
                '}';
    }
}
