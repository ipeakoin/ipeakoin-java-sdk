package com.ipeakoin.dto.res;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author klover
 * description CodeRes
 * date 2023/6/27 17:27
 */
public class CodeRes implements Serializable {
    /**
     * serial version UID
     */
    @Serial
    private static final long serialVersionUID = 1L;

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
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CodeRes)) {
            return false;
        }

        CodeRes codeRes = (CodeRes) o;

        if (getTimestamp() != null ? !getTimestamp().equals(codeRes.getTimestamp()) : codeRes.getTimestamp() != null) {
            return false;
        }
        if (getState() != null ? !getState().equals(codeRes.getState()) : codeRes.getState() != null) {
            return false;
        }
        return getCode() != null ? getCode().equals(codeRes.getCode()) : codeRes.getCode() == null;
    }

    @Override
    public int hashCode() {
        int result = getTimestamp() != null ? getTimestamp().hashCode() : 0;
        result = 31 * result + (getState() != null ? getState().hashCode() : 0);
        result = 31 * result + (getCode() != null ? getCode().hashCode() : 0);
        return result;
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