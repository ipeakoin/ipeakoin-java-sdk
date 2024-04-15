package com.ipeakoin.v1.quantum.card.dto.entity;

/**
 * Budget
 *
 * @author klover
 * @date 2024/4/15 11:27
 */
public class Budget {
    private String id;
    private String accountId;
    private String name;
    private String balanceId;
    private String expiryDate;
    private String createTime;
    private String status;

    @Override
    public String toString() {
        return "Budget{" +
                "id='" + id + '\'' +
                ", accountId='" + accountId + '\'' +
                ", name='" + name + '\'' +
                ", balanceId='" + balanceId + '\'' +
                ", expiryDate='" + expiryDate + '\'' +
                ", createTime='" + createTime + '\'' +
                ", status='" + status + '\'' +
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBalanceId() {
        return balanceId;
    }

    public void setBalanceId(String balanceId) {
        this.balanceId = balanceId;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
