package com.ipeakoin.dto.res.v1.card;

import com.ipeakoin.dto.req.v1.card.CardBinVerification;
import com.ipeakoin.dto.req.v1.card.PurchaseLimit;

/**
 * @author klover
 * @description CardBin
 * @date 2023/7/18 16:10
 */
public class CardBin {
    private String bin;
    private String type;
    private String cardType;
    private Boolean ipr;
    private String network;
    private String issuerCountry;
    private CardBinVerification verification;
    private PurchaseLimit purchaseLimit;

    public String getBin() {
        return bin;
    }

    public void setBin(String bin) {
        this.bin = bin;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public Boolean getIpr() {
        return ipr;
    }

    public void setIpr(Boolean ipr) {
        this.ipr = ipr;
    }

    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network;
    }

    public String getIssuerCountry() {
        return issuerCountry;
    }

    public void setIssuerCountry(String issuerCountry) {
        this.issuerCountry = issuerCountry;
    }

    public CardBinVerification getVerification() {
        return verification;
    }

    public void setVerification(CardBinVerification verification) {
        this.verification = verification;
    }

    public PurchaseLimit getPurchaseLimit() {
        return purchaseLimit;
    }

    public void setPurchaseLimit(PurchaseLimit purchaseLimit) {
        this.purchaseLimit = purchaseLimit;
    }

    @Override
    public String toString() {
        return "CardBin{" +
                "bin='" + bin + '\'' +
                ", type='" + type + '\'' +
                ", cardType='" + cardType + '\'' +
                ", ipr=" + ipr +
                ", network='" + network + '\'' +
                ", issuerCountry='" + issuerCountry + '\'' +
                ", verification=" + verification +
                ", purchaseLimit=" + purchaseLimit +
                '}';
    }
}
