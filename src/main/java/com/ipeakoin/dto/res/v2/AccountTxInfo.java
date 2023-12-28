package com.ipeakoin.dto.res.v2;

import java.util.Date;

/**
 * AccountTxInfo
 *
 * @author klover
 * @date 2023/12/27 20:14
 */
public class AccountTxInfo {
    private String id;
    private String accountId;
    private String currency;
    private String amount;
    private String fee;
    private String type;
    private String status;
    private Date createTime;

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

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getFee() {
        return fee;
    }

    public void setFee(String fee) {
        this.fee = fee;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "AccountTxInfo{" +
                "id='" + id + '\'' +
                ", accountId='" + accountId + '\'' +
                ", currency='" + currency + '\'' +
                ", amount='" + amount + '\'' +
                ", fee='" + fee + '\'' +
                ", type='" + type + '\'' +
                ", status='" + status + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}
