package com.ipeakoin.v1.crypto.assets.dto.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Bill
 *
 * @author klover
 * @date 2024/4/15 12:19
 */
public class Bill {
    private String id;
    private String accountId;
    private String balanceId;
    private String side;
    private String currency;
    private BigDecimal amount;
    private BigDecimal fee;
    private String status;
    private Date createTime;
    private Date updateTime;

    @Override
    public String toString() {
        return "Bill{" +
                "id='" + id + '\'' +
                ", accountId='" + accountId + '\'' +
                ", balanceId='" + balanceId + '\'' +
                ", side='" + side + '\'' +
                ", currency='" + currency + '\'' +
                ", amount=" + amount +
                ", fee=" + fee +
                ", status='" + status + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }

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

    public String getBalanceId() {
        return balanceId;
    }

    public void setBalanceId(String balanceId) {
        this.balanceId = balanceId;
    }

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getFee() {
        return fee;
    }

    public void setFee(BigDecimal fee) {
        this.fee = fee;
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

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
