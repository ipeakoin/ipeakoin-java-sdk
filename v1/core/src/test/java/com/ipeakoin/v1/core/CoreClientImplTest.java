package com.ipeakoin.v1.core;

import com.ipeakoin.http.client.dto.res.ApiException;
import com.ipeakoin.utils.JsonUtil;
import com.ipeakoin.utils.res.PageRes;
import com.ipeakoin.v1.core.dto.entity.Account;
import com.ipeakoin.v1.core.dto.entity.Balance;
import com.ipeakoin.v1.core.dto.entity.User;
import com.ipeakoin.v1.core.dto.res.*;
import junit.framework.TestCase;

import java.util.List;

public class CoreClientImplTest extends TestCase {
    private static CoreClient service = new CoreClient.Builder()
            .Credentials("http://127.0.0.1:3000")
            .build();

    static {
        service.setAccessToken("3e9d11956542f2bcfcb4df7583948190b7b6bf40");
    }

    public void testAccountFeeRates() throws ApiException {
        List<AccountFeeRatesRes> res = service.accountFeeRates();
        System.out.println(JsonUtil.toJSONString(res));
    }

    public void testCreateAccount() throws ApiException {
        CreateAccountRes res = service.createAccount(null);
        System.out.println(JsonUtil.toJSONString(res));
    }

    public void testGetAccounts() throws ApiException {
        PageRes<Account> res = service.getAccounts(null);
        System.out.println(JsonUtil.toJSONString(res));
    }

    public void testGetUsers() throws ApiException {
        PageRes<User> res = service.getUsers(null);
        System.out.println(JsonUtil.toJSONString(res));
    }

    public void testUploadFile() throws ApiException {
        List<String> res = service.uploadFile(null);
        System.out.println(JsonUtil.toJSONString(res));
    }

    public void testOcrIdCardFace() throws ApiException {
        OcrIdCardFaceRes res = service.ocrIdCardFace(null);
        System.out.println(JsonUtil.toJSONString(res));
    }

    public void testOcrIdCardBack() throws ApiException {
        OcrIdCardBackRes res = service.ocrIdCardBack(null);
        System.out.println(JsonUtil.toJSONString(res));
    }

    public void testOcrPassport() throws ApiException {
        OcrPassportRes res = service.ocrPassport(null);
        System.out.println(JsonUtil.toJSONString(res));
    }

    public void testSubmitAccountKyc() throws ApiException {
        String res = service.submitAccountKyc(null);
        System.out.println(res);
    }

    public void testResetAccountKyc() throws ApiException {
        Boolean res = service.resetAccountKyc(null);
        System.out.println(res);
    }

    public void testGetFaceAuthUrl() throws ApiException {
        String res = service.getFaceAuthUrl(null);
        System.out.println(res);
    }

    public void testFaceAuth() throws ApiException {
        Boolean res = service.faceAuth(null);
        System.out.println(res);
    }

    public void testGetAccountKyc() throws ApiException {
        AccountKycRes res = service.getAccountKyc(null);
        System.out.println(JsonUtil.toJSONString(res));
    }

    public void testGetBalances() throws ApiException {
        PageRes<Balance> res = service.getBalances(null);
        System.out.println(JsonUtil.toJSONString(res));
    }

    public void testCreateTransfer() throws ApiException {
        TransferRes res = service.createTransfer(null);
        System.out.println(JsonUtil.toJSONString(res));
    }

    public void testGetTransfer() throws ApiException {
        TransferRes res = service.getTransfer(null);
        System.out.println(JsonUtil.toJSONString(res));
    }

    public void testTriggerWebhook() throws ApiException {
        Boolean res = service.triggerWebhook(null);
        System.out.println(res);
    }
}