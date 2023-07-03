package com.ipeakoin.service.impl.v1;

import com.ipeakoin.dto.ApiException;
import com.ipeakoin.dto.ApiResponse;
import com.ipeakoin.dto.FileData;
import com.ipeakoin.dto.req.v1.FaceAuthReq;
import com.ipeakoin.dto.req.v1.UploadFileReq;
import com.ipeakoin.dto.res.BooleanRes;
import com.ipeakoin.dto.res.v1.UploadFileRes;
import com.ipeakoin.service.Client;
import junit.framework.TestCase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;

public class V1ImplTest extends TestCase {

    public void testSetService() {
    }

    public void testCreateAccount() {
    }

    public void testGetAccounts() {
    }

    public void testGetUsers() {
    }

    public void testUploadFile() {
        Client service = new Client.Builder()
                .config("http://127.0.0.1:3000")
                .build();

        try {
            service.setAccessToken("d1984e8775898b623c4309845c1d3f9a6c87d315");
            UploadFileReq req = new UploadFileReq();
            InputStream fileInputStream = new FileInputStream("D:\\workspace\\ipeakoin-java-sdk\\src\\test\\java\\com\\ipeakoin\\service\\1.jpg");
            InputStream fileInputStream2 = new FileInputStream("D:\\workspace\\ipeakoin-java-sdk\\src\\test\\java\\com\\ipeakoin\\service\\1.jpg");
            FileData file1 = new FileData("1.jpg", fileInputStream);
            FileData file2 = new FileData("2.jpg", fileInputStream2);
            ArrayList<FileData> files = new ArrayList<>();
            files.add(file1);
            files.add(file2);
            req.setFiles(files);
            ApiResponse<UploadFileRes> res = service.v1().uploadFile(req);
            System.out.println(res.getData());
        } catch (ApiException e) {
            System.out.println(e.getErrorMessage());
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public void testOcrIdCardFace() {
    }

    public void testOcrIdCardBack() {
    }

    public void testOcrPassport() {
    }

    public void testSubmitAccountKyc() {
    }

    public void testResetAccountKyc() {
    }

    public void testGetFaceAuthUrl() {
    }

    public void testFaceAuth() {
        Client service = new Client.Builder()
                .config("http://127.0.0.1:3000")
                .build();

        try {
            service.setAccessToken("d1984e8775898b623c4309845c1d3f9a6c87d315");
            FaceAuthReq req = new FaceAuthReq();
            InputStream fileInputStream = new FileInputStream("D:\\workspace\\ipeakoin-java-sdk\\src\\test\\java\\com\\ipeakoin\\service\\face.mp4");
            FileData file = new FileData("face.mp4", fileInputStream);
            req.setAccountId("32b74f5a-260d-41ab-9d54-dd994b9f0a3e");
            req.setFile(file);

            ApiResponse<BooleanRes> res = service.v1().faceAuth(req);
            System.out.println(res.getData());
        } catch (ApiException e) {
            System.out.println(e.getErrorMessage());
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public void testGetAccountKyc() {
    }

    public void testGetBalances() {
    }

    public void testCreateTransfer() {
    }

    public void testGetTransfer() {
    }

    public void testTriggerWebhook() {
    }
}