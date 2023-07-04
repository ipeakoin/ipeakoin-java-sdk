package com.ipeakoin.dto.res;

/**
 * @author klover
 * description BooleanRes
 * date 2023/6/30 17:47
 */
public class BooleanRes extends Res{
    private Integer code;
    private String message;
    private Boolean data;

    @Override
    public Integer getCode() {
        return code;
    }

    @Override
    public void setCode(Integer code) {
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public void setMessage(String message) {
        this.message = message;
    }

    public Boolean getData() {
        return data;
    }

    public void setData(Boolean data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BooleanRes)) {
            return false;
        }

        BooleanRes that = (BooleanRes) o;

        if (getCode() != null ? !getCode().equals(that.getCode()) : that.getCode() != null) {
            return false;
        }
        if (getMessage() != null ? !getMessage().equals(that.getMessage()) : that.getMessage() != null) {
            return false;
        }
        return getData() != null ? getData().equals(that.getData()) : that.getData() == null;
    }

    @Override
    public int hashCode() {
        int result = getCode() != null ? getCode().hashCode() : 0;
        result = 31 * result + (getMessage() != null ? getMessage().hashCode() : 0);
        result = 31 * result + (getData() != null ? getData().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "BooleanRes{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                ", code=" + code +
                ", message='" + message + '\'' +
                '}';
    }
}