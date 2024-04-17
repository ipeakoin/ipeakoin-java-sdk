package com.ipeakoin.v1.core.dto.entity;

/**
 * Conditions
 *
 * @author klover
 * @date 2024/4/12 14:23
 */
public class Conditions {
    private String chain;
    private String transactionHash;

    public String getChain() {
        return chain;
    }

    public void setChain(String chain) {
        this.chain = chain;
    }

    public String getTransactionHash() {
        return transactionHash;
    }

    public void setTransactionHash(String transactionHash) {
        this.transactionHash = transactionHash;
    }

    @Override
    public String toString() {
        return "Conditions{" +
                "chain='" + chain + '\'' +
                ", transactionHash='" + transactionHash + '\'' +
                '}';
    }
}
