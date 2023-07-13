package com.ipeakoin.dto.res;

import java.util.List;

/**
 * @author klover
 * description LimitRes
 * date 2023/7/4 17:36
 */
public class ListRes<T> {
    protected Integer total;
    protected Integer pageTotal;

    private List<T> data;

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

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
}