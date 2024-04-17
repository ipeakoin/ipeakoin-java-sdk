package com.ipeakoin.v1.crypto.assets.dto.req;

import com.ipeakoin.utils.req.LimitReq;

/**
 * PayoutsReq
 *
 * @author klover
 * @date 2024/4/15 12:27
 */
public class PayoutsReq extends LimitReq {
    private String id;
    private String wireId;

    @Override
    public String toString() {
        return "PayoutsReq{" +
                "id='" + id + '\'' +
                ", wireId='" + wireId + '\'' +
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

    public String getWireId() {
        return wireId;
    }

    public void setWireId(String wireId) {
        this.wireId = wireId;
    }
}
