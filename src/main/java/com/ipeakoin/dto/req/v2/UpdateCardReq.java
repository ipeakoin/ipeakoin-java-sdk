package com.ipeakoin.dto.req.v2;

import com.ipeakoin.dto.req.DefaultReq;

/**
 * @author klover
 * @description UpdateCardReq
 * @date 2023/7/27 19:48
 */
public class UpdateCardReq extends DefaultReq implements Cloneable{
    private String id;
    private String accountId;
    private String phoneCode;
    private String phone;

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

    @Override
    public String toString() {
        return "UpdateCardReq{" +
                "id='" + id + '\'' +
                ", accountId='" + accountId + '\'' +
                ", phoneCode='" + phoneCode + '\'' +
                ", phone='" + phone + '\'' +
                ", accessToken='" + accessToken + '\'' +
                '}';
    }


    @Override
    public UpdateCardReq clone() {
        try {
            UpdateCardReq clone = (UpdateCardReq) super.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
