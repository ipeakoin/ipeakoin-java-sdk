package com.ipeakoin.v2.quantum.card.dto.req;

import com.ipeakoin.utils.req.LimitReq;

/**
 * CardsReq
 *
 * @author klover
 * @date 2024/4/15 10:16
 */
public class CardsReq extends LimitReq {
    private String id;
    private String accountId;
    private String label;
    private String status;

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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "CardsReq{" +
                "id='" + id + '\'' +
                ", accountId='" + accountId + '\'' +
                ", label='" + label + '\'' +
                ", status='" + status + '\'' +
                ", limit=" + limit +
                ", page=" + page +
                '}';
    }
}
