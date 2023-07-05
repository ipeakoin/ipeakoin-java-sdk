package com.ipeakoin.dto.req.v1;

import com.ipeakoin.dto.req.DefaultReq;

/**
 * @author klover
 * description TransferReq
 * date 2023/6/30 17:50
 */
public class TransferReq extends DefaultReq {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TransferReq)) return false;

        TransferReq that = (TransferReq) o;

        return getId() != null ? getId().equals(that.getId()) : that.getId() == null;
    }

    @Override
    public int hashCode() {
        return getId() != null ? getId().hashCode() : 0;
    }

    @Override
    public String toString() {
        return "TransferReq{" +
                "id='" + id + '\'' +
                ", accessToken='" + accessToken + '\'' +
                '}';
    }
}