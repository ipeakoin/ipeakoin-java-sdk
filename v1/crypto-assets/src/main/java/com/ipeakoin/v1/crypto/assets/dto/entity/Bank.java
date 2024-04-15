package com.ipeakoin.v1.crypto.assets.dto.entity;

/**
 * Bank
 *
 * @author klover
 * @date 2024/4/15 12:25
 */
public class Bank {
    private String city;
    private String country;
    private String bankName;

    @Override
    public String toString() {
        return "Bank{" +
                "city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", bankName='" + bankName + '\'' +
                '}';
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }
}
