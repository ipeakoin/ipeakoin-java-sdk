package com.ipeakoin.dto.res.v1;

import com.ipeakoin.dto.Amount;

import java.util.Date;

/**
 * @author klover
 * @description TransferRes
 * @date 2023/7/13 22:45
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

    @Override
    public String toString() {
        return "CreateTransferRes{" +
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
}
