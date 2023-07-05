package com.ipeakoin.dto.res.v1.list;

import com.ipeakoin.dto.res.v1.LimitRes;
import com.ipeakoin.dto.res.v1.data.AccountsData;

import java.util.List;

/**
 * @author klover
 * description AccountsList
 * date 2023/7/4 17:38
 */
public class AccountsList extends LimitRes {
    private List<AccountsData> data;

    public List<AccountsData> getData() {
        return data;
    }

    public void setData(List<AccountsData> data) {
        this.data = data;
    }
}