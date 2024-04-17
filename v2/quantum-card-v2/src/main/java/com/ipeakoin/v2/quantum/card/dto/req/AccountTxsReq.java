package com.ipeakoin.v2.quantum.card.dto.req;

import com.ipeakoin.utils.req.LimitReq;

/**
 * AccountTxsReq
 *
 * @author klover
 * @date 2024/4/15 10:23
 */
public class AccountTxsReq extends LimitReq {
    private String id;
    private String accountId;
    private String status;

    @Override
    public String toString() {
        return "AccountTxsReq{" +
                "id='" + id + '\'' +
                ", accountId='" + accountId + '\'' +
                ", status='" + status + '\'' +
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
