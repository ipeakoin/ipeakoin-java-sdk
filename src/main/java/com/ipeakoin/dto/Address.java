package com.ipeakoin.dto;

import java.io.Serializable;

/**
 * @author klover
 * description Address
 * date 2023/6/29 14:39
 */
public class Address implements Serializable {
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
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Address)) {
            return false;
        }

        Address address = (Address) o;

        if (getAddressLine1() != null ? !getAddressLine1().equals(address.getAddressLine1()) : address.getAddressLine1() != null) {
            return false;
        }
        if (getAddressLine2() != null ? !getAddressLine2().equals(address.getAddressLine2()) : address.getAddressLine2() != null) {
            return false;
        }
        if (getCity() != null ? !getCity().equals(address.getCity()) : address.getCity() != null) {
            return false;
        }
        if (getCountry() != null ? !getCountry().equals(address.getCountry()) : address.getCountry() != null) {
            return false;
        }
        if (getPostalCode() != null ? !getPostalCode().equals(address.getPostalCode()) : address.getPostalCode() != null) {
            return false;
        }
        return getState() != null ? getState().equals(address.getState()) : address.getState() == null;
    }

    @Override
    public int hashCode() {
        int result = getAddressLine1() != null ? getAddressLine1().hashCode() : 0;
        result = 31 * result + (getAddressLine2() != null ? getAddressLine2().hashCode() : 0);
        result = 31 * result + (getCity() != null ? getCity().hashCode() : 0);
        result = 31 * result + (getCountry() != null ? getCountry().hashCode() : 0);
        result = 31 * result + (getPostalCode() != null ? getPostalCode().hashCode() : 0);
        result = 31 * result + (getState() != null ? getState().hashCode() : 0);
        return result;
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