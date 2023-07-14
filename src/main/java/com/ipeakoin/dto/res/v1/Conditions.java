package com.ipeakoin.dto.res.v1;

/**
 * @author klover
 * @description conditions
 * @date 2023/7/13 22:57
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
        return "conditions{" +
                "chain='" + chain + '\'' +
                ", transactionHash='" + transactionHash + '\'' +
                '}';
    }
}
