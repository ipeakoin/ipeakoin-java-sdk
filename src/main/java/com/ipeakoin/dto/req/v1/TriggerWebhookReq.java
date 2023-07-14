package com.ipeakoin.dto.req.v1;

import com.ipeakoin.dto.req.DefaultReq;
import com.ipeakoin.dto.res.v1.Conditions;

/**
 * @author klover
 * description TriggerWebhookReq
 * date 2023/6/30 17:50
 */
public class TriggerWebhookReq extends DefaultReq {
    private String type;
    private Conditions conditions;

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

    @Override
    public String toString() {
        return "TriggerWebhookReq{" +
                "type='" + type + '\'' +
                ", conditions=" + conditions +
                ", accessToken='" + accessToken + '\'' +
                '}';
    }
}