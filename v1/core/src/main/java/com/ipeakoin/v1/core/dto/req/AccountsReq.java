package com.ipeakoin.v1.core.dto.req;

import com.ipeakoin.utils.req.LimitReq;

/**
 * AccountsReq
 *
 * @author klover
 * @date 2024/4/12 14:07
 */
public class AccountsReq extends LimitReq {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "AccountsReq{" +
                "id='" + id + '\'' +
                ", limit=" + limit +
                ", page=" + page +
                '}';
    }
}
