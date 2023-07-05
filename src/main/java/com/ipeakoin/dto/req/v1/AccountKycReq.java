package com.ipeakoin.dto.req.v1;

import com.ipeakoin.dto.req.DefaultReq;

/**
 * @author klover
 * description AccountKycReq
 * date 2023/6/30 17:49
 */
public class AccountKycReq extends DefaultReq {
    private String accountId;

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AccountKycReq)) return false;

        AccountKycReq that = (AccountKycReq) o;

        return getAccountId() != null ? getAccountId().equals(that.getAccountId()) : that.getAccountId() == null;
    }

    @Override
    public int hashCode() {
        return getAccountId() != null ? getAccountId().hashCode() : 0;
    }

    @Override
    public String toString() {
        return "AccountKycReq{" +
                "accountId='" + accountId + '\'' +
                ", accessToken='" + accessToken + '\'' +
                '}';
    }
}