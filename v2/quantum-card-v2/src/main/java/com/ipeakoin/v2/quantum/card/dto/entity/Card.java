package com.ipeakoin.v2.quantum.card.dto.entity;

import com.ipeakoin.utils.entity.Address;

import java.util.Date;

/**
 * Card
 *
 * @author klover
 * @date 2024/4/15 10:10
 */
public class Card {
    private String id;
    private String accountId;
    private String type;
    private String bin;
    private String last4;
    private String network;
    private String firstName;
    private String lastName;
    private String label;
    private Boolean ipr;
    private String status;
    private String budgetId;
    private Date createTime;
    private CardBalance balance;
    private Address billingAddress;
    private VelocityControl velocityControl;

    @Override
    public String toString() {
        return "Card{" +
                "id='" + id + '\'' +
                ", accountId='" + accountId + '\'' +
                ", type='" + type + '\'' +
                ", bin='" + bin + '\'' +
                ", last4='" + last4 + '\'' +
                ", network='" + network + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", label='" + label + '\'' +
                ", ipr=" + ipr +
                ", status='" + status + '\'' +
                ", budgetId='" + budgetId + '\'' +
                ", createTime=" + createTime +
                ", balance=" + balance +
                ", billingAddress=" + billingAddress +
                ", velocityControl=" + velocityControl +
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBin() {
        return bin;
    }

    public void setBin(String bin) {
        this.bin = bin;
    }

    public String getLast4() {
        return last4;
    }

    public void setLast4(String last4) {
        this.last4 = last4;
    }

    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Boolean getIpr() {
        return ipr;
    }

    public void setIpr(Boolean ipr) {
        this.ipr = ipr;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    public CardBalance getBalance() {
        return balance;
    }

    public void setBalance(CardBalance balance) {
        this.balance = balance;
    }

    public Address getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }

    public VelocityControl getVelocityControl() {
        return velocityControl;
    }

    public void setVelocityControl(VelocityControl velocityControl) {
        this.velocityControl = velocityControl;
    }
}
