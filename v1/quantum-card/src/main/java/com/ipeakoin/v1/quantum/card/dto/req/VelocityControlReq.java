package com.ipeakoin.v1.quantum.card.dto.req;

/**
 * VelocityControlReq
 *
 * @author klover
 * @date 2024/4/15 11:40
 */
public class VelocityControlReq {
    private String cardId;
    private String accountId;
    private String type;
    private String limit;

    @Override
    public String toString() {
        return "VelocityControlReq{" +
                "cardId='" + cardId + '\'' +
                ", accountId='" + accountId + '\'' +
                ", type='" + type + '\'' +
                ", limit='" + limit + '\'' +
                '}';
    }

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
}
