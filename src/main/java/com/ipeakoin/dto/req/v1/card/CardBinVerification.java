package com.ipeakoin.dto.req.v1.card;

/**
 * @author klover
 * @description CardBinVerification
 * @date 2023/7/19 16:04
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
