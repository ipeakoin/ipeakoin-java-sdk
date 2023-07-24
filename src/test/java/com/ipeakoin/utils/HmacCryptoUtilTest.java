package com.ipeakoin.utils;

import junit.framework.TestCase;

import java.util.HashMap;
import java.util.Map;

import static com.ipeakoin.utils.HmacCryptoUtil.encryptHmacSHA256;

public class HmacCryptoUtilTest extends TestCase {

    public void testEncryptHmacSHA256() {
        Map<String, String> address = new HashMap<>();
        address.put("addressLine1", "20 Barneson ave");
        address.put("addressLine2", "");
        address.put("city", "San Mateo");
        address.put("country", "US");
        address.put("postalCode", "94402");
        address.put("state", "California");

        Map<String, Object> data = new HashMap<>();
        data.put("id", "b9ce056b-c1f8-4f19-b014-d7be02a54598");
        data.put("accountId", "01eba490-5f9c-48a6-aa2d-7bcfdff0d720");
        data.put("token", "0ef85b24-866f-4c03-a7e8-459e3742642b");
        data.put("status", "Active");
        data.put("currency", "USD");
        data.put("provider", "PrepaidCard_493728");
        data.put("userName", "test test");
        data.put("createTime", "2023-05-31T07:29:46.784Z");
        data.put("label", "ce08100b-fca8-4a13-bbfc-c381aeaec5d0");
        data.put("useType", "79f22263-a3fe-4347-8a40-2af6bf422839");
        data.put("balanceId", "ab43462f-93b3-4540-8601-11d759948ee7");
        data.put("budgetId", null);
        data.put("cardAddress", address);
        String s = encryptHmacSHA256(data, "25d55ad283aa400af464c76d713c07ad");
        System.out.println(s.equals("22825d6c8cd5787ef14f46862b9ba6181d02178ace76ed814001b9e34ba2971d"));
    }
}