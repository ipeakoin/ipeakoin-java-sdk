package com.ipeakoin.dto.req.v1.cryptoAssets;

import com.ipeakoin.dto.req.LimitReq;

/**
 * @author klover
 * @description PayoutsReq
 * @date 2023/7/20 14:13
 */
public class PayoutsReq extends LimitReq {
    private String id;
    private String wireId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getWireId() {
        return wireId;
    }

    public void setWireId(String wireId) {
        this.wireId = wireId;
    }

    @Override
    public String toString() {
        return "PayoutsReq{" +
                "id='" + id + '\'' +
                ", wireId='" + wireId + '\'' +
                ", limit=" + limit +
                ", page=" + page +
                ", accessToken='" + accessToken + '\'' +
                '}';
    }
}
