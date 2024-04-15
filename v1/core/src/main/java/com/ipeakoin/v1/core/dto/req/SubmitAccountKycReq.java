package com.ipeakoin.v1.core.dto.req;

import com.ipeakoin.utils.entity.Address;
import com.ipeakoin.v1.core.dto.entity.Identification;
import com.ipeakoin.v1.core.dto.entity.Name;

/**
 * SubmitAccountKycReq
 *
 * @author klover
 * @date 2024/4/12 14:15
 */
public class SubmitAccountKycReq {
    private String accountId;
    private Address address;
    private Address addressEn;
    private Name name;
    private String dob;
    private String nationality;
    private Identification identification;

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
                '}';
    }

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

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public Identification getIdentification() {
        return identification;
    }

    public void setIdentification(Identification identification) {
        this.identification = identification;
    }
}
