package com.ipeakoin.v1.quantum.card.dto.res;

/**
 * CreateCardCheckRes
 *
 * @author klover
 * @date 2024/4/15 11:38
 */
public class CreateCardCheckRes {
    private String key;
    private String reason;

    @Override
    public String toString() {
        return "CreateCardCheckRes{" +
                "key='" + key + '\'' +
                ", reason='" + reason + '\'' +
                '}';
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
