package com.ipeakoin.dto.req.v1.card;

import com.ipeakoin.dto.req.DefaultReq;

/**
 * @author klover
 * @description VelocityControlReq
 * @date 2023/7/20 20:02
 */
public class VelocityControlReq extends DefaultReq {
    private String cardId;
    private String accountId;
    private String type;
    private String limit;

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    @Override
    public String toString() {
        return "VelocityControlReq{" +
                "cardId='" + cardId + '\'' +
                ", accountId='" + accountId + '\'' +
                ", type='" + type + '\'' +
                ", limit='" + limit + '\'' +
                ", accessToken='" + accessToken + '\'' +
                '}';
    }
}
