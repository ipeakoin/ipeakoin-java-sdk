package com.ipeakoin.v1.quantum.card.dto.entity;

/**
 * CardBinVerification
 *
 * @author klover
 * @date 2024/4/15 11:34
 */
public class CardBinVerification {
    private Boolean avs;
    private Boolean threeDs;

    public Boolean getAvs() {
        return avs;
    }

    public void setAvs(Boolean avs) {
        this.avs = avs;
    }

    public Boolean getThreeDs() {
        return threeDs;
    }

    public void setThreeDs(Boolean threeDs) {
        this.threeDs = threeDs;
    }

    @Override
    public String toString() {
        return "CardBinVerification{" +
                "avs=" + avs +
                ", threeDs=" + threeDs +
                '}';
    }
}
