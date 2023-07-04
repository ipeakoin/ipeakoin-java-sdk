package com.ipeakoin.dto.req.v1;

import com.ipeakoin.dto.req.DefaultReq;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author klover
 * description AccountKycReq
 * date 2023/6/30 17:49
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class AccountKycReq extends DefaultReq {
    private String accountId;
}