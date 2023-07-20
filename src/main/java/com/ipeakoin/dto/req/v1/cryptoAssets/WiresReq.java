package com.ipeakoin.dto.req.v1.cryptoAssets;

import com.ipeakoin.dto.req.LimitReq;

/**
 * @author klover
 * @description WiresReq
 * @date 2023/7/20 14:10
 */
public class WiresReq extends LimitReq {
    private String id;
    private String username;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "WiresReq{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", limit=" + limit +
                ", page=" + page +
                ", accessToken='" + accessToken + '\'' +
                '}';
    }
}
