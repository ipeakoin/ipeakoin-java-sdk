package com.ipeakoin.v1.auth.dto.res;

import java.io.Serializable;

/**
 * CodeRes
 *
 * @author klover
 * @date 2024/4/11 21:11
 */
public class CodeRes implements Serializable {
    /**
     * 接口响应时间戳
     */
    private Integer timestamp;
    /**
     * state参数
     */
    private String state;
    /**
     * code作为换取access token的票据, code只能使用一次, 10分钟未被使用自动过期
     */
    private String code;

    public Integer getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Integer timestamp) {
        this.timestamp = timestamp;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "CodeRes{" +
                "timestamp=" + timestamp +
                ", state='" + state + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}
