package com.ipeakoin.v1.quantum.card.dto.entity;

/**
 * PurchaseLimit
 *
 * @author klover
 * @date 2024/4/15 11:34
 */
public class PurchaseLimit {
    private String day;
    private String single;
    private String lifetime;

    @Override
    public String toString() {
        return "PurchaseLimit{" +
                "day='" + day + '\'' +
                ", single='" + single + '\'' +
                ", lifetime='" + lifetime + '\'' +
                '}';
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getSingle() {
        return single;
    }

    public void setSingle(String single) {
        this.single = single;
    }

    public String getLifetime() {
        return lifetime;
    }

    public void setLifetime(String lifetime) {
        this.lifetime = lifetime;
    }
}
