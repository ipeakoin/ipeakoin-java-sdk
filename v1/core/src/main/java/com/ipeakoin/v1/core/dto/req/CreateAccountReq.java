package com.ipeakoin.v1.core.dto.req;

/**
 * CreateAccountReq
 *
 * @author klover
 * @date 2024/4/12 14:06
 */
public class CreateAccountReq {
    private String phone;
    private String email;
    private String name;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "CreateAccountReq{" +
                "phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
