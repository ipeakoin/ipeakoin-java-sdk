package com.ipeakoin.service.dto;

/**
 * @author klover
 * description Address
 * date 2023/6/29 14:39
 */
public class Address {
    /**
     * 地址栏第一行
     */
    private String addressLine1;
    /**
     * 地址栏第二行
     */
    private String addressLine2;
    /**
     * 城市
     */
    private String city;
    /**
     * ISO_3166-1 二位字母代码， 如CN, US等
     */
    private String country;
    /**
     * 邮编
     */
    private String postalCode;
    /**
     * 州或省
     */
    private String state;

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
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

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Address{" +
                "addressLine1='" + addressLine1 + '\'' +
                ", addressLine2='" + addressLine2 + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}