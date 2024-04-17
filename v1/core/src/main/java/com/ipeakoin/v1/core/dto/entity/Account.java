package com.ipeakoin.v1.core.dto.entity;

import java.util.Date;

/**
 * Account
 *
 * @author klover
 * @date 2024/4/12 14:08
 */
public class Account {
    /**
     * 账户 ID
     */
    private String id;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 账户类型
     */
    private String type;

    /**
     * 状态
     */
    private String status;

    /**
     * 认证名字
     */
    private String name;

    /**
     * 分配的唯一数字ID
     */
    private String displayId;

    /**
     * kyc 状态
     */
    private String kycStatus;

    /**
     * 量子卡业务kyb状态
     */
    private String cardKybStatus;

    /**
     * 全球账户业务kyb状态
     */
    private String globalAccountKybStatus;

    /**
     * KYC失败原因
     */
    private String message;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDisplayId() {
        return displayId;
    }

    public void setDisplayId(String displayId) {
        this.displayId = displayId;
    }

    public String getKycStatus() {
        return kycStatus;
    }

    public void setKycStatus(String kycStatus) {
        this.kycStatus = kycStatus;
    }

    public String getCardKybStatus() {
        return cardKybStatus;
    }

    public void setCardKybStatus(String cardKybStatus) {
        this.cardKybStatus = cardKybStatus;
    }

    public String getGlobalAccountKybStatus() {
        return globalAccountKybStatus;
    }

    public void setGlobalAccountKybStatus(String globalAccountKybStatus) {
        this.globalAccountKybStatus = globalAccountKybStatus;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id='" + id + '\'' +
                ", createTime=" + createTime +
                ", type='" + type + '\'' +
                ", status='" + status + '\'' +
                ", name='" + name + '\'' +
                ", displayId='" + displayId + '\'' +
                ", kycStatus='" + kycStatus + '\'' +
                ", cardKybStatus='" + cardKybStatus + '\'' +
                ", globalAccountKybStatus='" + globalAccountKybStatus + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
