package com.ipeakoin.v1.core.dto.req;

import com.ipeakoin.utils.req.LimitReq;

/**
 * UsersReq
 *
 * @author klover
 * @date 2024/4/12 14:11
 */
public class UsersReq extends LimitReq {
    private String id;
    private String accountId;

    @Override
    public String toString() {
        return "UsersReq{" +
                "id='" + id + '\'' +
                ", accountId='" + accountId + '\'' +
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
}
