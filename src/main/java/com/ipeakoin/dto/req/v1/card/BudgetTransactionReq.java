package com.ipeakoin.dto.req.v1.card;

import com.ipeakoin.dto.req.LimitReq;

/**
 * @author klover
 * @description BudgetTransactionReq
 * @date 2023/7/18 16:07
 */
public class BudgetTransactionReq extends LimitReq {
    private String id;
    private String accountId;

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

    @Override
    public String toString() {
        return "BudgetTransactionReq{" +
                "id='" + id + '\'' +
                ", accountId='" + accountId + '\'' +
                ", limit=" + limit +
                ", page=" + page +
                ", accessToken='" + accessToken + '\'' +
                '}';
    }
}
