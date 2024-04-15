package com.ipeakoin.v1.core;

import com.ipeakoin.http.client.dto.res.ApiException;
import com.ipeakoin.utils.JsonUtil;
import com.ipeakoin.utils.entity.Address;
import com.ipeakoin.utils.res.PageRes;
import com.ipeakoin.v1.core.dto.entity.*;
import com.ipeakoin.v1.core.dto.enums.TransferTypeEnum;
import com.ipeakoin.v1.core.dto.req.*;
import com.ipeakoin.v1.core.dto.res.*;
import junit.framework.TestCase;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CoreClientImplTest extends TestCase {
    private static CoreClient service = new CoreClient.Builder()
            .Credentials("http://127.0.0.1:3000")
            .build();

    static {
        service.setAccessToken("d14652e68bb45196f191eec0b35cdadac4ca3b45");
    }

    public void testAccountFeeRates() throws ApiException {
        List<AccountFeeRatesRes> res = service.accountFeeRates();
        System.out.println(JsonUtil.toJSONString(res));
    }

    public void testCreateAccount() throws ApiException {
        CreateAccountRes res = service.createAccount(new CreateAccountReq() {{
            this.setPhone("+8613100200014");
            this.setName("klover");
        }});
        System.out.println(JsonUtil.toJSONString(res));
    }

    public void testGetAccounts() throws ApiException {
        PageRes<Account> res = service.getAccounts(null);
        System.out.println(JsonUtil.toJSONString(res));
    }

    public void testGetUsers() throws ApiException {
        PageRes<User> res = service.getUsers(new UsersReq() {{
            this.setLimit(1);
            this.setAccountId("c0e0822d-5e73-4f8d-9805-4b0814812dbe");
        }});
        System.out.println(JsonUtil.toJSONString(res));
    }

    public void testUploadFile() throws ApiException, IOException {
        InputStream fileInputStream1 = Files.newInputStream(Paths.get("D:\\workspace\\npm\\ipeakoin-java-sdk\\v1\\core\\src\\test\\java\\com\\ipeakoin\\v1\\core\\1.jpg"));
        FileData fileData1 = new FileData() {{
            this.setFilename("1.jpg");
            this.setStream(fileInputStream1);
        }};

        InputStream fileInputStream2 = Files.newInputStream(Paths.get("D:\\workspace\\npm\\ipeakoin-java-sdk\\v1\\core\\src\\test\\java\\com\\ipeakoin\\v1\\core\\2.png"));
        FileData fileData2 = new FileData() {{
            this.setFilename("2.png");
            this.setStream(fileInputStream2);
        }};

        InputStream fileInputStream3 = Files.newInputStream(Paths.get("D:\\workspace\\npm\\ipeakoin-java-sdk\\v1\\core\\src\\test\\java\\com\\ipeakoin\\v1\\core\\3.jpg"));
        FileData fileData3 = new FileData() {{
            this.setFilename("3.jpg");
            this.setStream(fileInputStream3);
        }};

        List<String> res = service.uploadFile(new ArrayList<FileData>() {{
            this.add(fileData1);
            this.add(fileData2);
            this.add(fileData3);
        }});
        System.out.println(JsonUtil.toJSONString(res));
    }

    public void testOcrIdCardFace() throws ApiException {
        OcrIdCardFaceRes res = service.ocrIdCardFace("54845666-dbfa-4157-8d84-d9b8477114c2");
        System.out.println(JsonUtil.toJSONString(res));
    }

    public void testOcrIdCardBack() throws ApiException {
        OcrIdCardBackRes res = service.ocrIdCardBack("8d6a1ac2-79db-4d55-8aeb-3e543fc8b19d");
        System.out.println(JsonUtil.toJSONString(res));
    }

    public void testOcrPassport() throws ApiException {
        OcrPassportRes res = service.ocrPassport("9187cd31-daac-4c58-8c5f-44b82ebb8162");
        System.out.println(JsonUtil.toJSONString(res));
    }

    public void testSubmitAccountKyc() throws ApiException {
        Address address = new Address() {{
            this.setAddressLine1("39#");
            this.setAddressLine2("");
            this.setCity("杭州");
            this.setCountry("中国");
            this.setState("浙江");
            this.setPostalCode("330000");
        }};

        Address addressEn = new Address() {{
            this.setAddressLine1("39#");
            this.setAddressLine2("");
            this.setCity("hangzhou");
            this.setCountry("CN");
            this.setState("zhejiang");
            this.setPostalCode("330000");
        }};

        Name name = new Name() {{
            this.setFirstName("klover");
            this.setLastName("w");
        }};

        Identification identification = new Identification() {{
            this.setType("CN-RIC");
            this.setFrontAttachmentId("28e01a1e-3ea1-4d51-950b-6e3b2122a5e7");
            this.setBackAttachmentId("640cac41-665a-4fb3-ac1c-8da01c7b18de");
            this.setNumber("130521200005181914");
            this.setStartDate("2022-01-01");
            this.setExpirationDate("2025-01-01");
        }};
        String res = service.submitAccountKyc(new SubmitAccountKycReq() {{
            this.setAddress(address);
            this.setAddressEn(addressEn);
            this.setName(name);
            this.setIdentification(identification);
            this.setAccountId("111869c1-6ab5-4431-aaa0-cfbede1eae0e");
            this.setDob("1996-12-04");
            this.setNationality("CN");
        }});
        System.out.println(res);
    }

    public void testResetAccountKyc() throws ApiException {
        Boolean res = service.resetAccountKyc("111869c1-6ab5-4431-aaa0-cfbede1eae0e");
        System.out.println(res);
    }

    public void testGetFaceAuthUrl() throws ApiException {
        String res = service.getFaceAuthUrl("c0e0822d-5e73-4f8d-9805-4b0814812dbe");
        System.out.println(res);
    }

    public void testFaceAuth() throws ApiException, IOException {
        InputStream stream = Files.newInputStream(Paths.get("D:\\workspace\\npm\\ipeakoin-java-sdk\\v1\\core\\src\\test\\java\\com\\ipeakoin\\v1\\core\\face.mp4"));
        FileData file = new FileData() {{
            this.setStream(stream);
            this.setFilename("face.mp4");
        }};
        Boolean res = service.faceAuth(new FaceAuthReq() {{
            this.setAccountId("c0e0822d-5e73-4f8d-9805-4b0814812dbe");
            this.setFile(file);
        }});
        System.out.println(res);
    }

    public void testGetAccountKyc() throws ApiException {
        AccountKycRes res = service.getAccountKyc("111869c1-6ab5-4431-aaa0-cfbede1eae0e");
        System.out.println(JsonUtil.toJSONString(res));
    }

    public void testGetBalances() throws ApiException {
        PageRes<Balance> res = service.getBalances(null);
        System.out.println(JsonUtil.toJSONString(res));
    }

    public void testCreateTransfer() throws ApiException {
        TransferSource source = new TransferSource() {{
            this.setType(TransferTypeEnum.quantum_account);
        }};
        TransferDestination destination = new TransferDestination() {{
            this.setType(TransferTypeEnum.quantum_sub_account);
            this.setId("c0e0822d-5e73-4f8d-9805-4b0814812dbe");
        }};
        TransferRes res = service.createTransfer(new CreateTransferReq() {{
            this.setSource(source);
            this.setDestination(destination);
            this.setAmount(BigDecimal.valueOf(100).toString());
        }});
        System.out.println(JsonUtil.toJSONString(res));
    }

    public void testGetTransfer() throws ApiException {
        TransferRes res = service.getTransfer("eac18788-792e-49b2-8cc6-1e82b18753f1");
        System.out.println(JsonUtil.toJSONString(res));
    }

    public void testTriggerWebhook() throws ApiException {
        Conditions conditions = new Conditions() {{
            this.setChain("ETH");
            this.setTransactionHash("0x7816198be4832f9d3faceb3249b030cbad2a14c6fbbd2f0885f7ad23223bfcca");
        }};
        Boolean res = service.triggerWebhook(new TriggerWebhookReq() {{
            this.setType("AssetsDeposit");
            this.setConditions(conditions);
        }});
        System.out.println(res);
    }
}