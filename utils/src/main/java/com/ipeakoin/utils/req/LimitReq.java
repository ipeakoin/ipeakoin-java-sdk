package com.ipeakoin.utils.req;

/**
 * LimitReq
 *
 * @author klover
 * @date 2024/4/12 14:11
 */
public class LimitReq {
    protected Integer limit;
    protected Integer page;

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }
}
