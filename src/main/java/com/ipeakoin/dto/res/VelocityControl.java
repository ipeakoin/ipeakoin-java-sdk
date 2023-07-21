package com.ipeakoin.dto.res;

/**
 * @author klover
 * @description VelocityControl
 * @date 2023/7/21 9:43
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
