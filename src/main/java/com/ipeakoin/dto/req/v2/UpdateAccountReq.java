package com.ipeakoin.dto.req.v2;

import com.ipeakoin.dto.req.DefaultReq;

/**
 * UpdateAccountReq
 *
 * @author klover
 * @date 2023/12/27 19:49
 */
public class UpdateAccountReq extends DefaultReq implements Cloneable{
    private String id;
    private String email;

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "UpdateAccountReq{" +
                "id='" + id + '\'' +
                ", email='" + email + '\'' +
                ", accessToken='" + accessToken + '\'' +
                '}';
    }


    @Override
    public UpdateAccountReq clone() {
        try {
            UpdateAccountReq clone = (UpdateAccountReq) super.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
