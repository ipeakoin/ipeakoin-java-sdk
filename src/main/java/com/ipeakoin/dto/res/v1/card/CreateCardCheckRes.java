package com.ipeakoin.dto.res.v1.card;

/**
 * CreateCardCheckRes
 *
 * @author klover
 * @date 2023/12/27 17:06
 */
public class CreateCardCheckRes {
    private String key;
    private String reason;

    public String getKey() {
        return key;
    }

    public String getReason() {
        return reason;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public String toString() {
        return "CreateCardCheckRes{" +
                "key='" + key + '\'' +
                ", reason='" + reason + '\'' +
                '}';
    }
}
