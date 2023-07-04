package com.ipeakoin.dto.res;


/**
 * @author klover
 * description StringRes
 * date 2023/7/3 18:16
 */
public class StringRes extends Res {
    private Boolean data;

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
        if (!(o instanceof StringRes)) {
            return false;
        }

        StringRes stringRes = (StringRes) o;

        return getData() != null ? getData().equals(stringRes.getData()) : stringRes.getData() == null;
    }

    @Override
    public int hashCode() {
        return getData() != null ? getData().hashCode() : 0;
    }

    @Override
    public String toString() {
        return "StringRes{" +
                "data=" + data +
                ", code=" + code +
                ", message='" + message + '\'' +
                '}';
    }
}