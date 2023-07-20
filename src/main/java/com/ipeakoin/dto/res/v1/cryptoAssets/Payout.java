package com.ipeakoin.dto.res.v1.cryptoAssets;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author klover
 * @description Payout
 * @date 2023/7/20 14:13
 */
public class Payout {
    private String id;
    private String balanceId;
    private String currency;
    private BigDecimal amount;
    private BigDecimal fee;
    private String wireId;
    private String status;
    private String externalRef;
    private String createTime;
    private String updateTime;
    private String accountId;
    private Wire wire;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBalanceId() {
        return balanceId;
    }

    public void setBalanceId(String balanceId) {
        this.balanceId = balanceId;
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

    public String getWireId() {
        return wireId;
    }

    public void setWireId(String wireId) {
        this.wireId = wireId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getExternalRef() {
        return externalRef;
    }

    public void setExternalRef(String externalRef) {
        this.externalRef = externalRef;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public Wire getWire() {
        return wire;
    }

    public void setWire(Wire wire) {
        this.wire = wire;
    }

    @Override
    public String toString() {
        return "Payout{" +
                "id='" + id + '\'' +
                ", balanceId='" + balanceId + '\'' +
                ", currency='" + currency + '\'' +
                ", amount=" + amount +
                ", fee=" + fee +
                ", wireId='" + wireId + '\'' +
                ", status='" + status + '\'' +
                ", externalRef='" + externalRef + '\'' +
                ", createTime='" + createTime + '\'' +
                ", updateTime='" + updateTime + '\'' +
                ", accountId='" + accountId + '\'' +
                ", wire=" + wire +
                '}';
    }
}
