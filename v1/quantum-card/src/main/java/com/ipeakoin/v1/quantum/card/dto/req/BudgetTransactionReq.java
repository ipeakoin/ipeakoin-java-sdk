package com.ipeakoin.v1.quantum.card.dto.req;

/**
 * BudgetTransactionReq
 *
 * @author klover
 * @date 2024/4/15 11:31
 */
public class BudgetTransactionReq {
    private String id;
    private String accountId;

    @Override
    public String toString() {
        return "BudgetTransactionReq{" +
                "id='" + id + '\'' +
                ", accountId='" + accountId + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }
}
