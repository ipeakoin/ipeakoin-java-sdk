package com.ipeakoin.dto.req.v1;

import com.ipeakoin.dto.Address;
import com.ipeakoin.dto.Identification;
import com.ipeakoin.dto.Name;
import com.ipeakoin.dto.req.DefaultReq;

/**
 * @author klover
 * description SubmitAccountKycReq
 * date 2023/6/30 17:48
 */
public class SubmitAccountKycReq extends DefaultReq {
    private String accountId;
    private Address address;
    private Address addressEn;
    private Name name;
    private String dob;
    private String nationality;
    private Identification identification;

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Address getAddressEn() {
        return addressEn;
    }

    public void setAddressEn(Address addressEn) {
        this.addressEn = addressEn;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public Identification getIdentification() {
        return identification;
    }

    public void setIdentification(Identification identification) {
        this.identification = identification;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    @Override
    public String toString() {
        return "SubmitAccountKycReq{" +
                "accountId='" + accountId + '\'' +
                ", address=" + address +
                ", addressEn=" + addressEn +
                ", name=" + name +
                ", dob='" + dob + '\'' +
                ", nationality='" + nationality + '\'' +
                ", identification=" + identification +
                ", accessToken='" + accessToken + '\'' +
                '}';
    }
}