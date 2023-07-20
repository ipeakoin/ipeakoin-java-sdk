package com.ipeakoin.dto.req.v1.card;

import com.ipeakoin.dto.req.LimitReq;

/**
 * @author klover
 * @description CardReq
 * @date 2023/7/18 16:10
 */
public class CardReq extends LimitReq {
    private String id;
    private String accountId;
    private String label;

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

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return "CardReq{" +
                "id='" + id + '\'' +
                ", accountId='" + accountId + '\'' +
                ", label='" + label + '\'' +
                ", limit=" + limit +
                ", page=" + page +
                ", accessToken='" + accessToken + '\'' +
                '}';
    }
}
