package com.ipeakoin.v1.quantum.card.dto.req;

import java.math.BigDecimal;

/**
 * CardTransferInReq
 *
 * @author klover
 * @date 2024/4/15 11:39
 */
public class CardTransferInReq {
    private String cardId;
    private String clientTransactionId;
    private BigDecimal cost;

    @Override
    public String toString() {
        return "CardTransferInReq{" +
                "cardId='" + cardId + '\'' +
                ", clientTransactionId='" + clientTransactionId + '\'' +
                ", cost=" + cost +
                '}';
    }

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
}
