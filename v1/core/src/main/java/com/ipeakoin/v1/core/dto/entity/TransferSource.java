package com.ipeakoin.v1.core.dto.entity;

import com.ipeakoin.v1.core.dto.enums.TransferTypeEnum;

/**
 * TransferSource
 *
 * @author klover
 * @date 2024/4/12 14:20
 */
public class TransferSource {
    private String id;
    private String currency;
    private TransferTypeEnum type;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public TransferTypeEnum getType() {
        return type;
    }

    public void setType(TransferTypeEnum type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "TransferSource{" +
                "id='" + id + '\'' +
                ", currency='" + currency + '\'' +
                ", type=" + type +
                '}';
    }
}
