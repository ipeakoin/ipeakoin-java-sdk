package com.ipeakoin.service.impl.v1;

import com.ipeakoin.dto.ApiException;
import com.ipeakoin.dto.ApiResponse;
import com.ipeakoin.dto.FileData;
import com.ipeakoin.dto.req.v1.*;
import com.ipeakoin.dto.res.ListRes;
import com.ipeakoin.dto.res.v1.*;
import com.ipeakoin.service.Client;
import junit.framework.TestCase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class V1ImplTest extends TestCase {
    private static Client service = new Client.Builder()
            .config("ipeakoin1ab59eccfbc78d1b", "93fc39d77ef6a3a7b5f26b83fbbebe81", "https://global.service.test.qbitnetwork.com")
            .build();

    private static String accessToken = "87d5535340b032ed8cf94240f3b62380d51c3a08";


    public void testCreateAccount() throws ApiException {
        ApiResponse<CreateAccountRes> account = service.v1().createAccount(new CreateAccountReq() {{
            this.setAccessToken(V1ImplTest.accessToken);
            this.setPhone("+8613100200011");
            this.setName("klover");
        }});
        System.out.println(account.getContent());
    }

    public void testGetAccounts() {
        try {
            AccountsReq req = new AccountsReq();
            req.setAccessToken(V1ImplTest.accessToken);
            ApiResponse<ListRes<Account>> accounts = service.v1().getAccounts(req);
            System.out.println(accounts.getContent());
        } catch (ApiException e) {
            System.out.println(e.getErrorMessage());
            e.printStackTrace();
        }
    }

    public void testGetUsers() throws ApiException {
        ApiResponse<ListRes<User>> users = service.v1().getUsers(new UsersReq() {{
            this.setAccessToken(V1ImplTest.accessToken);
            this.setLimit(1);
        }});
        System.out.println(users.getContent());
    }

    public void testUploadFile() throws ApiException, IOException {
        InputStream fileInputStream1 = Files.newInputStream(Paths.get("D:\\workspace\\ipeakoin-java-sdk\\src\\test\\java\\com\\ipeakoin\\service\\1.jpg"));
        FileData fileData1 = new FileData() {{
            this.setFilename("1.jpg");
            this.setStream(fileInputStream1);
        }};

        InputStream fileInputStream2 = Files.newInputStream(Paths.get("D:\\workspace\\ipeakoin-java-sdk\\src\\test\\java\\com\\ipeakoin\\service\\2.png"));
        FileData fileData2 = new FileData() {{
            this.setFilename("2.png");
            this.setStream(fileInputStream2);
        }};

        InputStream fileInputStream3 = Files.newInputStream(Paths.get("D:\\workspace\\ipeakoin-java-sdk\\src\\test\\java\\com\\ipeakoin\\service\\3.jpg"));
        FileData fileData3 = new FileData() {{
            this.setFilename("3.jpg");
            this.setStream(fileInputStream3);
        }};
        ApiResponse<List<String>> res = service.v1().uploadFile(new UploadFileReq() {{
            this.setAccessToken(V1ImplTest.accessToken);
            this.setFiles(new ArrayList<FileData>() {{
                this.add(fileData1);
                this.add(fileData2);
                this.add(fileData3);
            }});
        }});
        System.out.println(res.getContent());
    }

    public void testOcrIdCardFace() throws ApiException {
        ApiResponse<OcrIdCardFaceRes> res = service.v1().ocrIdCardFace(new OcrReq() {{
            this.setAccessToken(V1ImplTest.accessToken);
            this.setImage("28e01a1e-3ea1-4d51-950b-6e3b2122a5e7");
        }});
        System.out.println(res.getContent());
    }

    public void testOcrIdCardBack() throws ApiException {
        ApiResponse<OcrIdCardBackRes> res = service.v1().ocrIdCardBack(new OcrReq() {{
            this.setAccessToken(V1ImplTest.accessToken);
            this.setImage("640cac41-665a-4fb3-ac1c-8da01c7b18de");
        }});
        System.out.println(res.getContent());
    }

    public void testOcrPassport() throws ApiException {
        ApiResponse<OcrPassportRes> res = service.v1().ocrPassport(new OcrReq() {{
            this.setAccessToken(V1ImplTest.accessToken);
            this.setImage("8cd94a84-8b73-4e9d-9a24-66ef81b5be90");
        }});
        System.out.println(res.getContent());
    }

    public void testSubmitAccountKyc() throws ApiException {
        ApiResponse<String> res = service.v1().submitAccountKyc(new SubmitAccountKycReq());
        System.out.println(res.getContent());
    }

    public void testResetAccountKyc() throws ApiException {
        ApiResponse<Boolean> res = service.v1().resetAccountKyc(new ResetAccountKycReq());
        System.out.println(res.getContent());
    }

    public void testGetFaceAuthUrl() throws ApiException {
        ApiResponse<String> res = service.v1().getFaceAuthUrl(new FaceAuthUrlReq());
        System.out.println(res.getContent());
    }

    public void testFaceAuth() throws ApiException {
        ApiResponse<Boolean> res = service.v1().faceAuth(new FaceAuthReq());
        System.out.println(res.getContent());
    }

    public void testGetAccountKyc() throws ApiException {
        ApiResponse<AccountKycRes> res = service.v1().getAccountKyc(new AccountKycReq());
        System.out.println(res.getContent());
    }

    public void testGetBalances() throws ApiException {
        ApiResponse<ListRes<Balance>> res = service.v1().getBalances(new BalancesReq());
        System.out.println(res.getContent());
    }

    public void testCreateTransfer() throws ApiException {
        ApiResponse<TransferRes> res = service.v1().createTransfer(new CreateTransferReq());
        System.out.println(res.getContent());
    }

    public void testGetTransfer() throws ApiException {
        ApiResponse<TransferRes> res = service.v1().getTransfer(new TransferReq());
        System.out.println(res.getContent());
    }

    public void testTriggerWebhook() throws ApiException {
        ApiResponse<Boolean> res = service.v1().triggerWebhook(new TriggerWebhookReq());
        System.out.println(res.getContent());
    }
}