package com.ipeakoin.dto.req.v2;

import com.ipeakoin.dto.req.DefaultReq;

/**
 * @author klover
 * @description CardInfoReq
 * @date 2023/7/21 9:46
 */
public class CardInfoReq extends DefaultReq {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "CardInfoReq{" +
                "id='" + id + '\'' +
                ", accessToken='" + accessToken + '\'' +
                '}';
    }
}
