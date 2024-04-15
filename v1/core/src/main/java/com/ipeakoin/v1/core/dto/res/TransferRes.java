package com.ipeakoin.v1.core.dto.res;

import com.ipeakoin.v1.core.dto.entity.Amount;
import com.ipeakoin.v1.core.dto.entity.TransferDestination;
import com.ipeakoin.v1.core.dto.entity.TransferSource;

import java.util.Date;

/**
 * TransferRes
 *
 * @author klover
 * @date 2024/4/12 14:22
 */
public class TransferRes {
    private String id;
    private String accountId;
    private TransferSource source;
    private TransferDestination destination;
    private Amount amount;
    private Amount settled;
    private Amount fee;
    private String status;
    private Date createTime;
    private Date updateTime;

    @Override
    public String toString() {
        return "TransferRes{" +
                "id='" + id + '\'' +
                ", accountId='" + accountId + '\'' +
                ", source=" + source +
                ", destination=" + destination +
                ", amount=" + amount +
                ", settled=" + settled +
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

    public TransferSource getSource() {
        return source;
    }

    public void setSource(TransferSource source) {
        this.source = source;
    }

    public TransferDestination getDestination() {
        return destination;
    }

    public void setDestination(TransferDestination destination) {
        this.destination = destination;
    }

    public Amount getAmount() {
        return amount;
    }

    public void setAmount(Amount amount) {
        this.amount = amount;
    }

    public Amount getSettled() {
        return settled;
    }

    public void setSettled(Amount settled) {
        this.settled = settled;
    }

    public Amount getFee() {
        return fee;
    }

    public void setFee(Amount fee) {
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
