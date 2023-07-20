package com.ipeakoin.dto.req.v1.card;

import com.ipeakoin.dto.req.LimitReq;

/**
 * @author klover
 * @description BudgetsReq
 * @date 2023/7/17 17:16
 */
public class BudgetsReq extends LimitReq {
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
        return "BudgetsReq{" +
                "id='" + id + '\'' +
                ", accountId='" + accountId + '\'' +
                ", limit=" + limit +
                ", page=" + page +
                ", accessToken='" + accessToken + '\'' +
                '}';
    }
}
