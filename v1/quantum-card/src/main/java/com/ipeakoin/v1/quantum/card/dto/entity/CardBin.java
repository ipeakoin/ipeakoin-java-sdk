package com.ipeakoin.v1.quantum.card.dto.entity;

/**
 * CardBin
 *
 * @author klover
 * @date 2024/4/15 11:33
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
}
