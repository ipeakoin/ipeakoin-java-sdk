package com.ipeakoin.dto.req.v2;

import com.ipeakoin.dto.req.LimitReq;

/**
 * AccountTxsReq
 *
 * @author klover
 * @date 2023/12/27 20:14
 */
public class AccountTxsReq extends LimitReq {
    private String id;
    private String accountId;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "AccountTxsReq{" +
                "id='" + id + '\'' +
                ", accountId='" + accountId + '\'' +
                ", status='" + status + '\'' +
                ", limit=" + limit +
                ", page=" + page +
                ", accessToken='" + accessToken + '\'' +
                '}';
    }
}
