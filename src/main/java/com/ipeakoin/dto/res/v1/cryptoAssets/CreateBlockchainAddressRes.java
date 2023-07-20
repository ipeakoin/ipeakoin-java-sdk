package com.ipeakoin.dto.res.v1.cryptoAssets;

/**
 * @author klover
 * @description CreateBlockchainAddressRes
 * @date 2023/7/20 14:02
 */
public class CreateBlockchainAddressRes {
    private String currency;
    private String chain;
    private String address;
    private Boolean selected;

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

    public Boolean getSelected() {
        return selected;
    }

    public void setSelected(Boolean selected) {
        this.selected = selected;
    }

    @Override
    public String toString() {
        return "CreateBlockchainAddressRes{" +
                "currency='" + currency + '\'' +
                ", chain='" + chain + '\'' +
                ", address='" + address + '\'' +
                ", selected=" + selected +
                '}';
    }
}
