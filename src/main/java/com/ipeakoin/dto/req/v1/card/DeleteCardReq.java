package com.ipeakoin.dto.req.v1.card;

import com.ipeakoin.dto.req.DefaultReq;

/**
 * @author klover
 * @description DeleteCardReq
 * @date 2023/7/18 16:13
 */
public class DeleteCardReq extends DefaultReq {
    private String cardId;

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    @Override
    public String toString() {
        return "DeleteCardReq{" +
                "cardId='" + cardId + '\'' +
                ", accessToken='" + accessToken + '\'' +
                '}';
    }
}
