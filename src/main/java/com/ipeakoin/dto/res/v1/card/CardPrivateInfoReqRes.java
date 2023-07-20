package com.ipeakoin.dto.res.v1.card;

/**
 * @author klover
 * @description CardPrivateInfoReqRes
 * @date 2023/7/18 16:17
 */
public class CardPrivateInfoReqRes {
    private String cardNo;
    private String cvv;
    private String expYear;
    private String expMonth;

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

    @Override
    public String toString() {
        return "CardPrivateInfoReqRes{" +
                "cardNo='" + cardNo + '\'' +
                ", cvv='" + cvv + '\'' +
                ", expYear='" + expYear + '\'' +
                ", expMonth='" + expMonth + '\'' +
                '}';
    }
}
