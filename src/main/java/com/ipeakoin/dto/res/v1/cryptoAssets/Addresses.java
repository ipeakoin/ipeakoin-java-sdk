package com.ipeakoin.dto.res.v1.cryptoAssets;

/**
 * @author klover
 * @description Addresses
 * @date 2023/7/20 14:01
 */
public class Addresses {
    private String currency;
    private String chain;
    private String address;
    private String selected;

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getChain() {
        return chain;
    }

    public void setChain(String chain) {
        this.chain = chain;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSelected() {
        return selected;
    }

    public void setSelected(String selected) {
        this.selected = selected;
    }

    @Override
    public String toString() {
        return "Addresses{" +
                "currency='" + currency + '\'' +
                ", chain='" + chain + '\'' +
                ", address='" + address + '\'' +
                ", selected='" + selected + '\'' +
                '}';
    }
}
