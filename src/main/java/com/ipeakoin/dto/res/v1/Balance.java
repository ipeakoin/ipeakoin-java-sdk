package com.ipeakoin.dto.res.v1;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author klover
 * @description Balance
 * @date 2023/7/13 21:10
 */
public class Balance {
    private String id;
    private String accountId;
    private BigDecimal available;
    private BigDecimal pending;
    private BigDecimal frozen;
    private String currency;
    private String status;
    private Date createTime;
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

    public BigDecimal getAvailable() {
        return available;
    }

    public void setAvailable(BigDecimal available) {
        this.available = available;
    }

    public BigDecimal getPending() {
        return pending;
    }

    public void setPending(BigDecimal pending) {
        this.pending = pending;
    }

    public BigDecimal getFrozen() {
        return frozen;
    }

    public void setFrozen(BigDecimal frozen) {
        this.frozen = frozen;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
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

    public String getWalletType() {
        return walletType;
    }

    public void setWalletType(String walletType) {
        this.walletType = walletType;
    }

    @Override
    public String toString() {
        return "Balance{" +
                "id='" + id + '\'' +
                ", accountId='" + accountId + '\'' +
                ", available=" + available +
                ", pending=" + pending +
                ", frozen=" + frozen +
                ", currency='" + currency + '\'' +
                ", status='" + status + '\'' +
                ", createTime=" + createTime +
                ", walletType='" + walletType + '\'' +
                '}';
    }
}
