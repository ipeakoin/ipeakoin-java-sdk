package com.ipeakoin.dto.req.v1;

import com.ipeakoin.dto.req.DefaultReq;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author klover
 * description TransferReq
 * date 2023/6/30 17:50
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class TransferReq extends DefaultReq {
    private String id;
}