package com.ipeakoin.dto.req.v1.cryptoAssets;

import com.ipeakoin.dto.req.DefaultReq;

/**
 * @author klover
 * @description PayoutInfoReq
 * @date 2023/7/20 14:15
 */
public class PayoutInfoReq extends DefaultReq {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "PayoutInfoReq{" +
                "id='" + id + '\'' +
                ", accessToken='" + accessToken + '\'' +
                '}';
    }
}
