package com.ipeakoin.dto.req.v2;

import com.ipeakoin.dto.req.DefaultReq;

/**
 * DeleteAccountReq
 *
 * @author klover
 * @date 2023/12/27 19:47
 */
public class DeleteAccountReq extends DefaultReq {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "DeleteAccountReq{" +
                "id='" + id + '\'' +
                ", accessToken='" + accessToken + '\'' +
                '}';
    }
}
