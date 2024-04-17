package com.ipeakoin.v1.quantum.card.dto.req;

import com.ipeakoin.utils.req.LimitReq;

/**
 * CardTransactionReq
 *
 * @author klover
 * @date 2024/4/15 11:42
 */
public class CardTransactionReq extends LimitReq {
    private String accountId;
    private String cardId;
    private String type;
    private String status;
    private String startTime;
    private String endTime;

    @Override
    public String toString() {
        return "CardTransactionReq{" +
                "accountId='" + accountId + '\'' +
                ", cardId='" + cardId + '\'' +
                ", type='" + type + '\'' +
                ", status='" + status + '\'' +
                ", startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                ", limit=" + limit +
                ", page=" + page +
                '}';
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
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

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }
}
