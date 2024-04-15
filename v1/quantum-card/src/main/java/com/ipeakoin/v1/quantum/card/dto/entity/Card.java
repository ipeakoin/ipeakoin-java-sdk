package com.ipeakoin.v1.quantum.card.dto.entity;

import com.ipeakoin.utils.entity.Address;

import java.util.Date;

/**
 * Card
 *
 * @author klover
 * @date 2024/4/15 11:36
 */
public class Card {
    private String id;
    private String accountId;
    private String userName;
    private String currency;
    private String provider;
    private String status;
    private String cardNoLastFour;
    private String token;
    private String label;
    private Address cardAddress;
    private String balanceId;
    private String budgetId;
    private Date createTime;
    private String useType;

    @Override
    public String toString() {
        return "Card{" +
                "id='" + id + '\'' +
                ", accountId='" + accountId + '\'' +
                ", userName='" + userName + '\'' +
                ", currency='" + currency + '\'' +
                ", provider='" + provider + '\'' +
                ", status='" + status + '\'' +
                ", cardNoLastFour='" + cardNoLastFour + '\'' +
                ", token='" + token + '\'' +
                ", label='" + label + '\'' +
                ", cardAddress=" + cardAddress +
                ", balanceId='" + balanceId + '\'' +
                ", budgetId='" + budgetId + '\'' +
                ", createTime=" + createTime +
                ", useType='" + useType + '\'' +
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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCardNoLastFour() {
        return cardNoLastFour;
    }

    public void setCardNoLastFour(String cardNoLastFour) {
        this.cardNoLastFour = cardNoLastFour;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Address getCardAddress() {
        return cardAddress;
    }

    public void setCardAddress(Address cardAddress) {
        this.cardAddress = cardAddress;
    }

    public String getBalanceId() {
        return balanceId;
    }

    public void setBalanceId(String balanceId) {
        this.balanceId = balanceId;
    }

    public String getBudgetId() {
        return budgetId;
    }

    public void setBudgetId(String budgetId) {
        this.budgetId = budgetId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUseType() {
        return useType;
    }

    public void setUseType(String useType) {
        this.useType = useType;
    }
}
