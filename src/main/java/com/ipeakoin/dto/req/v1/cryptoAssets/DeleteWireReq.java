package com.ipeakoin.dto.req.v1.cryptoAssets;

import com.ipeakoin.dto.req.DefaultReq;

/**
 * @author klover
 * @description DeleteWireReq
 * @date 2023/7/20 14:12
 */
public class DeleteWireReq extends DefaultReq {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "DeleteWireReq{" +
                "id='" + id + '\'' +
                ", accessToken='" + accessToken + '\'' +
                '}';
    }
}
