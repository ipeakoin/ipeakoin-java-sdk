package com.ipeakoin.dto.res.v1;

/**
 * @author klover
 * description LimitRes
 * date 2023/7/4 17:36
 */
public class LimitRes {
    protected Integer total;
    protected Integer pageTotal;

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getPageTotal() {
        return pageTotal;
    }

    public void setPageTotal(Integer pageTotal) {
        this.pageTotal = pageTotal;
    }
}