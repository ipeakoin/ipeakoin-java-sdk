package com.ipeakoin.dto.res.v1.cryptoAssets;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author klover
 * @description Deposit
 * @date 2023/7/20 13:46
 */
public class Deposit {
    private String id;
    private String accountId;
    private String balanceId;
    private String chain;
    private String currency;
    private BigDecimal amount;
    private BigDecimal fee;
    private String status;
    private String transactionHash;
    private Date createTime;
    private Date updateTime;
    private String to;

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

    public String getChain() {
        return chain;
    }

    public void setChain(String chain) {
        this.chain = chain;
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

    public String getTransactionHash() {
        return transactionHash;
    }

    public void setTransactionHash(String transactionHash) {
        this.transactionHash = transactionHash;
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

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    @Override
    public String toString() {
        return "Deposit{" +
                "id='" + id + '\'' +
                ", accountId='" + accountId + '\'' +
                ", balanceId='" + balanceId + '\'' +
                ", chain='" + chain + '\'' +
                ", currency='" + currency + '\'' +
                ", amount=" + amount +
                ", fee=" + fee +
                ", status='" + status + '\'' +
                ", transactionHash='" + transactionHash + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", to='" + to + '\'' +
                '}';
    }
}
