package com.ipeakoin.v1.core.dto.req;

import com.ipeakoin.v1.core.dto.entity.Conditions;

/**
 * TriggerWebhookReq
 *
 * @author klover
 * @date 2024/4/12 14:23
 */
public class TriggerWebhookReq {
    private String type;
    private Conditions conditions;

    @Override
    public String toString() {
        return "TriggerWebhookReq{" +
                "type='" + type + '\'' +
                ", conditions=" + conditions +
                '}';
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Conditions getConditions() {
        return conditions;
    }

    public void setConditions(Conditions conditions) {
        this.conditions = conditions;
    }
}
