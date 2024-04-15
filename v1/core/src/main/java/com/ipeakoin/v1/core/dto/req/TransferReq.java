package com.ipeakoin.v1.core.dto.req;

/**
 * TransferReq
 *
 * @author klover
 * @date 2024/4/12 14:22
 */
public class TransferReq {
    private String id;

    @Override
    public String toString() {
        return "TransferReq{" +
                "id='" + id + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
