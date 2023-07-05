package com.ipeakoin.dto.req.v1;

import com.ipeakoin.dto.req.LimitReq;

/**
 * @author klover
 * description AccountsReq
 * date 2023/6/30 17:43
 */
public class AccountsReq extends LimitReq {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AccountsReq)) {
            return false;
        }

        AccountsReq that = (AccountsReq) o;

        return getId() != null ? getId().equals(that.getId()) : that.getId() == null;
    }

    @Override
    public int hashCode() {
        return getId() != null ? getId().hashCode() : 0;
    }

    @Override
    public String toString() {
        return "AccountsReq{" +
                "id='" + id + '\'' +
                ", limit=" + limit +
                ", page=" + page +
                ", accessToken='" + accessToken + '\'' +
                '}';
    }
}