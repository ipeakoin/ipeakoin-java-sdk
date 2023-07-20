package com.ipeakoin.dto.req.v1.card;

import com.ipeakoin.dto.req.DefaultReq;

/**
 * @author klover
 * @description SuspendCardReq
 * @date 2023/7/18 16:14
 */
public class SuspendCardReq extends DefaultReq {
    private String cardId;

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    @Override
    public String toString() {
        return "SuspendCardReq{" +
                "cardId='" + cardId + '\'' +
                ", accessToken='" + accessToken + '\'' +
                '}';
    }
}
