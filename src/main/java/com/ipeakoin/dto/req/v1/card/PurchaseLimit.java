package com.ipeakoin.dto.req.v1.card;

/**
 * @author klover
 * @description PurchaseLimit
 * @date 2023/7/19 16:05
 */
public class PurchaseLimit {
    private String day;
    private String single;
    private String lifetime;

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

    @Override
    public String toString() {
        return "PurchaseLimit{" +
                "day='" + day + '\'' +
                ", single='" + single + '\'' +
                ", lifetime='" + lifetime + '\'' +
                '}';
    }
}
