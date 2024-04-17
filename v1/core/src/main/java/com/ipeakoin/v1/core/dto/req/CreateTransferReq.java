package com.ipeakoin.v1.core.dto.req;

import com.ipeakoin.v1.core.dto.entity.TransferDestination;
import com.ipeakoin.v1.core.dto.entity.TransferSource;

/**
 * CreateTransferReq
 *
 * @author klover
 * @date 2024/4/12 14:20
 */
public class CreateTransferReq {
    private TransferSource source;
    private TransferDestination destination;
    private String amount;

    @Override
    public String toString() {
        return "CreateTransferReq{" +
                "source=" + source +
                ", destination=" + destination +
                ", amount='" + amount + '\'' +
                '}';
    }

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
}
