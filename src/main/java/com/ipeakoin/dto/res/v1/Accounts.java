package com.ipeakoin.dto.res.v1;

import java.util.Date;

/**
 * @author klover
 * description AccountsData
 * date 2023/7/4 17:28
 */
public class Accounts {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Accounts)) return false;

        Accounts that = (Accounts) o;

        if (getId() != null ? !getId().equals(that.getId()) : that.getId() != null) return false;
        if (getCreateTime() != null ? !getCreateTime().equals(that.getCreateTime()) : that.getCreateTime() != null)
            return false;
        if (getType() != null ? !getType().equals(that.getType()) : that.getType() != null) return false;
        if (getStatus() != null ? !getStatus().equals(that.getStatus()) : that.getStatus() != null) return false;
        if (getName() != null ? !getName().equals(that.getName()) : that.getName() != null) return false;
        if (getDisplayId() != null ? !getDisplayId().equals(that.getDisplayId()) : that.getDisplayId() != null)
            return false;
        if (getKycStatus() != null ? !getKycStatus().equals(that.getKycStatus()) : that.getKycStatus() != null)
            return false;
        if (getCardKybStatus() != null ? !getCardKybStatus().equals(that.getCardKybStatus()) : that.getCardKybStatus() != null)
            return false;
        if (getGlobalAccountKybStatus() != null ? !getGlobalAccountKybStatus().equals(that.getGlobalAccountKybStatus()) : that.getGlobalAccountKybStatus() != null)
            return false;
        return getMessage() != null ? getMessage().equals(that.getMessage()) : that.getMessage() == null;
    }

    @Override
    public int hashCode() {
        int result = getId() != null ? getId().hashCode() : 0;
        result = 31 * result + (getCreateTime() != null ? getCreateTime().hashCode() : 0);
        result = 31 * result + (getType() != null ? getType().hashCode() : 0);
        result = 31 * result + (getStatus() != null ? getStatus().hashCode() : 0);
        result = 31 * result + (getName() != null ? getName().hashCode() : 0);
        result = 31 * result + (getDisplayId() != null ? getDisplayId().hashCode() : 0);
        result = 31 * result + (getKycStatus() != null ? getKycStatus().hashCode() : 0);
        result = 31 * result + (getCardKybStatus() != null ? getCardKybStatus().hashCode() : 0);
        result = 31 * result + (getGlobalAccountKybStatus() != null ? getGlobalAccountKybStatus().hashCode() : 0);
        result = 31 * result + (getMessage() != null ? getMessage().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "AccountsData{" +
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