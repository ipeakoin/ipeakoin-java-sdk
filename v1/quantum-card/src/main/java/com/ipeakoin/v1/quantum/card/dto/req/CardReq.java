package com.ipeakoin.v1.quantum.card.dto.req;

import com.ipeakoin.utils.req.LimitReq;

/**
 * CardReq
 *
 * @author klover
 * @date 2024/4/15 11:35
 */
public class CardReq extends LimitReq {
    private String id;
    private String accountId;
    private String label;

    @Override
    public String toString() {
        return "CardReq{" +
                "id='" + id + '\'' +
                ", accountId='" + accountId + '\'' +
                ", label='" + label + '\'' +
                ", limit=" + limit +
                ", page=" + page +
                '}';
    }

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
}
