package com.ipeakoin.v1.core.dto.req;

import com.ipeakoin.utils.req.LimitReq;

/**
 * BalancesReq
 *
 * @author klover
 * @date 2024/4/12 14:19
 */
public class BalancesReq extends LimitReq {
    private String id;
    private String accountId;
    private String walletType;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getWalletType() {
        return walletType;
    }

    public void setWalletType(String walletType) {
        this.walletType = walletType;
    }

    @Override
    public String toString() {
        return "BalancesReq{" +
                "id='" + id + '\'' +
                ", accountId='" + accountId + '\'' +
                ", walletType='" + walletType + '\'' +
                ", limit=" + limit +
                ", page=" + page +
                '}';
    }
}
