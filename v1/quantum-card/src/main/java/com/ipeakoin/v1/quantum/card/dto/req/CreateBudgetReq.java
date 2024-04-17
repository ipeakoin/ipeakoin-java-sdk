package com.ipeakoin.v1.quantum.card.dto.req;

/**
 * CreateBudgetReq
 *
 * @author klover
 * @date 2024/4/15 11:29
 */
public class CreateBudgetReq {
    private String accountId;
    private String name;
    private String cost;

    @Override
    public String toString() {
        return "CreateBudgetReq{" +
                "accountId='" + accountId + '\'' +
                ", name='" + name + '\'' +
                ", cost='" + cost + '\'' +
                '}';
    }

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
}
