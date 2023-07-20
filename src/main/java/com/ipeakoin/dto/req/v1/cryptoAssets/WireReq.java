package com.ipeakoin.dto.req.v1.cryptoAssets;

import com.ipeakoin.dto.Address;
import com.ipeakoin.dto.req.DefaultReq;
import com.ipeakoin.dto.res.v1.cryptoAssets.Bank;

/**
 * @author klover
 * @description WireReq
 * @date 2023/7/20 14:12
 */
public class WireReq extends DefaultReq {
    private String firstName;
    private String lastName;
    private String accountNumber;
    private String routingNumber;
    private String iban;
    private Bank bank;
    private Address billingAddress;

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

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getRoutingNumber() {
        return routingNumber;
    }

    public void setRoutingNumber(String routingNumber) {
        this.routingNumber = routingNumber;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public Address getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }

    @Override
    public String toString() {
        return "WireReq{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", routingNumber='" + routingNumber + '\'' +
                ", iban='" + iban + '\'' +
                ", bank=" + bank +
                ", billingAddress=" + billingAddress +
                ", accessToken='" + accessToken + '\'' +
                '}';
    }
}
