package com.ipeakoin.utils.res;

import java.util.List;

/**
 * PageRes
 *
 * @author klover
 * @date 2024/4/12 14:09
 */
public class PageRes<T> {
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
