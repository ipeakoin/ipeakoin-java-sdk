package com.ipeakoin.dto.req.v1;

import com.ipeakoin.dto.req.LimitReq;

/**
 * @author klover
 * description UsersReq
 * date 2023/6/30 17:44
 */
public class UsersReq extends LimitReq {
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
        return "UsersReq{" +
                "id='" + id + '\'' +
                ", accountId='" + accountId + '\'' +
                ", limit=" + limit +
                ", page=" + page +
                ", accessToken='" + accessToken + '\'' +
                '}';
    }
}