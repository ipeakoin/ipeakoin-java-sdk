package com.ipeakoin.v1.core.dto.res;

/**
 * AccountFeeRatesRes
 *
 * @author klover
 * @date 2024/4/12 14:06
 */
public class AccountFeeRatesRes {
    private String type;
    private String method;
    private String rate;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "AccountFeeRatesRes{" +
                "type='" + type + '\'' +
                ", method='" + method + '\'' +
                ", rate='" + rate + '\'' +
                '}';
    }
}
