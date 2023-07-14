package com.ipeakoin.dto.res.v1;

import com.ipeakoin.dto.res.enums.TransferTypeEnum;

/**
 * @author klover
 * @description TransferSource
 * @date 2023/7/13 22:17
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
