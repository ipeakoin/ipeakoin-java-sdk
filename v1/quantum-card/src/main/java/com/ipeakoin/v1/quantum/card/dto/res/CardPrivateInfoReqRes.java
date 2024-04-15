package com.ipeakoin.v1.quantum.card.dto.res;

/**
 * CardPrivateInfoReqRes
 *
 * @author klover
 * @date 2024/4/15 11:42
 */
public class CardPrivateInfoReqRes {
    private String cardNo;
    private String cvv;
    private String expYear;
    private String expMonth;

    @Override
    public String toString() {
        return "CardPrivateInfoReqRes{" +
                "cardNo='" + cardNo + '\'' +
                ", cvv='" + cvv + '\'' +
                ", expYear='" + expYear + '\'' +
                ", expMonth='" + expMonth + '\'' +
                '}';
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public String getExpYear() {
        return expYear;
    }

    public void setExpYear(String expYear) {
        this.expYear = expYear;
    }

    public String getExpMonth() {
        return expMonth;
    }

    public void setExpMonth(String expMonth) {
        this.expMonth = expMonth;
    }
}
