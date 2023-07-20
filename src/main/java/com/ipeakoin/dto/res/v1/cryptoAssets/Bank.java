package com.ipeakoin.dto.res.v1.cryptoAssets;

/**
 * @author klover
 * @description Bank
 * @date 2023/7/20 19:08
 */
public class Bank {
    private String city;
    private String country;
    private String bankName;

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

    @Override
    public String toString() {
        return "Bank{" +
                "city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", bankName='" + bankName + '\'' +
                '}';
    }
}
