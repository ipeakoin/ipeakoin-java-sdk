package com.ipeakoin.dto.req.v1;

import com.ipeakoin.dto.req.DefaultReq;
import com.ipeakoin.dto.res.v1.TransferDestination;
import com.ipeakoin.dto.res.v1.TransferSource;

import java.math.BigDecimal;

/**
 * @author klover
 * description CreateTransferReq
 * date 2023/6/30 17:49
 */
public class CreateTransferReq extends DefaultReq {
    private TransferSource source;
    private TransferDestination destination;
    private String amount;

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

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "CreateTransferReq{" +
                "source=" + source +
                ", destination=" + destination +
                ", amount='" + amount + '\'' +
                ", accessToken='" + accessToken + '\'' +
                '}';
    }
}