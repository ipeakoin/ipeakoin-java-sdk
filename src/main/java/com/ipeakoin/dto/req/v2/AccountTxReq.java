package com.ipeakoin.dto.req.v2;

import com.ipeakoin.dto.req.DefaultReq;

/**
 * AccountTxReq
 *
 * @author klover
 * @date 2023/12/27 20:15
 */
public class AccountTxReq extends DefaultReq {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "AccountTxReq{" +
                "id='" + id + '\'' +
                ", accessToken='" + accessToken + '\'' +
                '}';
    }
}
