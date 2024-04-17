package com.ipeakoin.v1.crypto.assets.dto.req;

import com.ipeakoin.utils.req.LimitReq;

/**
 * WiresReq
 *
 * @author klover
 * @date 2024/4/15 12:24
 */
public class WiresReq extends LimitReq {
    private String id;
    private String username;

    @Override
    public String toString() {
        return "WiresReq{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
