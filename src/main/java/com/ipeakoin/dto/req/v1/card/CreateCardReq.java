package com.ipeakoin.dto.req.v1.card;

import com.ipeakoin.dto.Address;
import com.ipeakoin.dto.req.DefaultReq;

import java.math.BigDecimal;

/**
 * @author klover
 * @description CreateCardReq
 * @date 2023/7/18 16:12
 */
public class CreateCardReq extends DefaultReq {
    /**
     * 账户id
     */
    private String accountId;
    /**
     * 卡类型(储值卡, 额度卡)
     */
    private String type;
    /**
     * 卡bin
     */
    private String bin;
    /**
     * 批量的数目
     */
    private int batchCount;
    /**
     * 开卡的金额,默认为10USD
     */
    private BigDecimal cost;
    /**
     * 卡地址
     */
    private Address cardAddress;
    /**
     * 持卡人名
     */
    private String firstName;
    /**
     * 持卡人姓
     */
    private String lastName;
    /**
     * 持卡人邮箱
     */
    private String email;
    /**
     * 手机号区号
     */
    private String phoneCode;
    /**
     * 持卡人手机号
     */
    private String phone;
    /**
     * 使用场景
     */
    private String useType;
    /**
     * Client交易id(方便关联订单)
     */
    private String clientTransactionId;
    /**
     * 标签
     */
    private String label;

    /**
     * The UUID of the Budget.
     */
    private String budgetId;

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

    public int getBatchCount() {
        return batchCount;
    }

    public void setBatchCount(int batchCount) {
        this.batchCount = batchCount;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public Address getCardAddress() {
        return cardAddress;
    }

    public void setCardAddress(Address cardAddress) {
        this.cardAddress = cardAddress;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneCode() {
        return phoneCode;
    }

    public void setPhoneCode(String phoneCode) {
        this.phoneCode = phoneCode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUseType() {
        return useType;
    }

    public void setUseType(String useType) {
        this.useType = useType;
    }

    public String getClientTransactionId() {
        return clientTransactionId;
    }

    public void setClientTransactionId(String clientTransactionId) {
        this.clientTransactionId = clientTransactionId;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getBudgetId() {
        return budgetId;
    }

    public void setBudgetId(String budgetId) {
        this.budgetId = budgetId;
    }

    @Override
    public String toString() {
        return "CreateCardReq{" +
                "accountId='" + accountId + '\'' +
                ", type='" + type + '\'' +
                ", bin='" + bin + '\'' +
                ", batchCount=" + batchCount +
                ", cost=" + cost +
                ", cardAddress=" + cardAddress +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phoneCode='" + phoneCode + '\'' +
                ", phone='" + phone + '\'' +
                ", useType='" + useType + '\'' +
                ", clientTransactionId='" + clientTransactionId + '\'' +
                ", label='" + label + '\'' +
                ", budgetId='" + budgetId + '\'' +
                ", accessToken='" + accessToken + '\'' +
                '}';
    }
}
