package com.ipeakoin.v1.crypto.assets.dto.res;

/**
 * CreateBlockchainAddressRes
 *
 * @author klover
 * @date 2024/4/15 12:16
 */
public class CreateBlockchainAddressRes {
    private String currency;
    private String chain;
    private String address;
    private Boolean selected;

    @Override
    public String toString() {
        return "CreateBlockchainAddressRes{" +
                "currency='" + currency + '\'' +
                ", chain='" + chain + '\'' +
                ", address='" + address + '\'' +
                ", selected=" + selected +
                '}';
    }

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
}
