package com.ipeakoin.dto.req.v1.card;

import java.math.BigDecimal;

/**
 * @author klover
 * @description CardTransferInReq
 * @date 2023/7/18 16:13
 */
public class CardTransferInReq extends DeleteCardReq {
    private String cardId;
    private String clientTransactionId;
    private BigDecimal cost;

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getClientTransactionId() {
        return clientTransactionId;
    }

    public void setClientTransactionId(String clientTransactionId) {
        this.clientTransactionId = clientTransactionId;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "CardTransferInReq{" +
                "cardId='" + cardId + '\'' +
                ", clientTransactionId='" + clientTransactionId + '\'' +
                ", cost=" + cost +
                ", accessToken='" + accessToken + '\'' +
                '}';
    }
}
