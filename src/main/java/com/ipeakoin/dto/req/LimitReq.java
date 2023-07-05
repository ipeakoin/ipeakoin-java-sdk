package com.ipeakoin.dto.req;

/**
 * @author klover
 * description LimitReq
 * date 2023/7/4 16:49
 */
public class LimitReq extends DefaultReq{
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