package com.ipeakoin.dto;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author klover
 * description Address
 * date 2023/6/29 14:39
 */
@Data
public class Address implements Serializable {
    /**
     * serial version UID
     */
    @Serial
    private static final long serialVersionUID = 1L;
    /**
     * 地址栏第一行
     */
    private String addressLine1;
    /**
     * 地址栏第二行
     */
    private String addressLine2;
    /**
     * 城市
     */
    private String city;
    /**
     * ISO_3166-1 二位字母代码， 如CN, US等
     */
    private String country;
    /**
     * 邮编
     */
    private String postalCode;
    /**
     * 州或省
     */
    private String state;
}