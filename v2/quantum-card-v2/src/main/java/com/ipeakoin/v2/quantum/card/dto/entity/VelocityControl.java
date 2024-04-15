package com.ipeakoin.v2.quantum.card.dto.entity;

/**
 * VelocityControl
 *
 * @author klover
 * @date 2024/4/15 10:14
 */
public class VelocityControl {
    private String type;
    private String limit;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    @Override
    public String toString() {
        return "VelocityControl{" +
                "type='" + type + '\'' +
                ", limit='" + limit + '\'' +
                '}';
    }
}
