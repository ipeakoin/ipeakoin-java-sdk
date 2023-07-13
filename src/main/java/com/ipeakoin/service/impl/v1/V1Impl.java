package com.ipeakoin.service.impl.v1;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.TypeReference;
import com.ipeakoin.dto.ApiException;
import com.ipeakoin.dto.ApiResponse;
import com.ipeakoin.dto.req.v1.*;
import com.ipeakoin.dto.res.ListRes;
import com.ipeakoin.dto.res.v1.Accounts;
import com.ipeakoin.dto.res.v1.CreateAccount;
import com.ipeakoin.httpclient.constant.Constant;
import com.ipeakoin.httpclient.http.HttpRequestsBase;
import com.ipeakoin.service.v1.V1;
import com.ipeakoin.utils.Util;
import org.apache.http.entity.StringEntity;

import javax.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;

/**
 * @author klover
 * description V1
 * date 2023/6/29 16:59
 */
public class V1Impl implements V1 {
    /**
     * http service
     */
    private final HttpRequestsBase service;

    /**
     * v1
     *
     * @param service {@link HttpRequestsBase}
     */
    public V1Impl(HttpRequestsBase service) {
        this.service = service;
    }

    /**
     * Create a account
     *
     * @param input {@link CreateAccountReq}
     * @return {@link ApiResponse< CreateAccount >}
     * @throws ApiException error
     */
    @Override
    public ApiResponse<CreateAccount> createAccount(CreateAccountReq input) throws ApiException {
        String uri = "/open-api/v1/accounts/register";
        GenericType<ApiResponse<CreateAccount>> returnType = new GenericType<>() {
        };
        String jsonString = JSON.toJSONString(input);
        StringEntity entity = new StringEntity(jsonString, Constant.CHARSET);

        return this.service.invokeAPI(uri, "POST", entity, input.getAccessToken(), returnType);
    }

    /**
     * List all accounts
     *
     * @param input {@link CreateAccountReq}
     * @return {@link ApiResponse< ListRes < Accounts >>}
     * @throws ApiException error
     */
    @Override
    public ApiResponse<ListRes<Accounts>> getAccounts(AccountsReq input) throws ApiException {
        String uri = "/open-api/v1/accounts";
        GenericType<ApiResponse<ListRes<Accounts>>> returnType = new GenericType<>() {
        };
        Map<String, Object> map = JSON.parseObject(JSON.toJSONString(input), new TypeReference<HashMap<String, Object>>() {
        });

        return this.service.invokeAPI(Util.dealGetParams(map, uri), "GET", null, input.getAccessToken(), returnType);
    }

//    /**
//     * List all users
//     *
//     * @param input {@link CreateAccountReq}
//     * @return {@link ApiResponse<UsersRes>}
//     * @throws ApiException error
//     */
//    @Override
//    public ApiResponse<UsersRes> getUsers(UsersReq input) throws ApiException {
//        String uri = "/open-api/v1/users";
//        GenericType<UsersRes> returnType = new GenericType<>() {
//        };
//        Map<String, Object> map = JSON.parseObject(JSON.toJSONString(input), new TypeReference<HashMap<String, Object>>() {
//        });
//
//        return this.service.invokeAPI(Util.dealGetParams(map, uri), "GET", null, input.getAccessToken(), returnType);
//    }
//
//    /**
//     * Upload file
//     *
//     * @param input {@link CreateAccountReq}
//     * @return {@link ApiResponse<UploadFileRes>}
//     * @throws ApiException error
//     */
//    @Override
//    public ApiResponse<UploadFileRes> uploadFile(UploadFileReq input) throws ApiException {
//        String uri = "/open-api/v1/files/upload";
//
//        GenericType<UploadFileRes> returnType = new GenericType<>() {
//        };
//
//        MultipartEntityBuilder builder = MultipartEntityBuilder.create();
//        builder.setMode(HttpMultipartMode.RFC6532);
//
//        ContentType fileContentType;
//        for (FileData file : input.getFiles()) {
//            String mimeType = URLConnection.guessContentTypeFromName(file.getFilename());
//            if (mimeType == null) {
//                // guess this is a video uploading
//                fileContentType = ContentType.APPLICATION_OCTET_STREAM;
//            } else {
//                fileContentType = ContentType.create(mimeType);
//            }
//
//            builder.addBinaryBody("files", file.getStream(), fileContentType, file.getFilename());
//        }
//
//        HttpEntity httpEntity = builder.build();
//
//        return this.service.invokeAPI(uri, "UPLOAD", httpEntity, input.getAccessToken(), returnType);
//    }
//
//    /**
//     * OCR (ID card - Face)
//     *
//     * @param input {@link CreateAccountReq}
//     * @return {@link ApiResponse<OcrIdCardFaceRes>}
//     * @throws ApiException error
//     */
//    @Override
//    public ApiResponse<OcrIdCardFaceRes> ocrIdCardFace(OcrIdCardFaceReq input) throws ApiException {
//        String uri = "/open-api/v1/ocr/idcard/face";
//        GenericType<OcrIdCardFaceRes> returnType = new GenericType<>() {
//        };
//        String jsonString = JSON.toJSONString(input);
//        StringEntity entity = new StringEntity(jsonString, Constant.CHARSET);
//
//        return this.service.invokeAPI(uri, "POST", entity, input.getAccessToken(), returnType);
//    }
//
//    /**
//     * OCR (ID card - Back)
//     *
//     * @param input {@link CreateAccountReq}
//     * @return {@link ApiResponse<OcrIdCardBackRes>}
//     * @throws ApiException error
//     */
//    @Override
//    public ApiResponse<OcrIdCardBackRes> ocrIdCardBack(OcrIdCardBackReq input) throws ApiException {
//        String uri = "/open-api/v1/ocr/idcard/back";
//        GenericType<OcrIdCardBackRes> returnType = new GenericType<>() {
//        };
//        String jsonString = JSON.toJSONString(input);
//        StringEntity entity = new StringEntity(jsonString, Constant.CHARSET);
//
//        return this.service.invokeAPI(uri, "POST", entity, input.getAccessToken(), returnType);
//    }
//
//    /**
//     * OCR (Passport)
//     *
//     * @param input {@link CreateAccountReq}
//     * @return {@link ApiResponse<OcrPassportRes>}
//     * @throws ApiException error
//     */
//    @Override
//    public ApiResponse<OcrPassportRes> ocrPassport(OcrPassportReq input) throws ApiException {
//        String uri = "/open-api/v1/ocr/passport";
//        GenericType<OcrPassportRes> returnType = new GenericType<>() {
//        };
//        String jsonString = JSON.toJSONString(input);
//        StringEntity entity = new StringEntity(jsonString, Constant.CHARSET);
//
//        return this.service.invokeAPI(uri, "POST", entity, input.getAccessToken(), returnType);
//    }
//
//    /**
//     * Submit account KYC
//     *
//     * @param input {@link CreateAccountReq}
//     * @return {@link ApiResponse<SubmitAccountKycRes>}
//     * @throws ApiException error
//     */
//    @Override
//    public ApiResponse<SubmitAccountKycRes> submitAccountKyc(SubmitAccountKycReq input) throws ApiException {
//        String uri = "/open-api/v1/kyc/submit";
//        GenericType<SubmitAccountKycRes> returnType = new GenericType<>() {
//        };
//        String jsonString = JSON.toJSONString(input);
//        StringEntity entity = new StringEntity(jsonString, Constant.CHARSET);
//
//        return this.service.invokeAPI(uri, "POST", entity, input.getAccessToken(), returnType);
//    }
//
//    /**
//     * Reset account KYC
//     *
//     * @param input {@link CreateAccountReq}
//     * @return {@link ApiResponse<ResetAccountKycRes>}
//     * @throws ApiException error
//     */
//    @Override
//    public ApiResponse<ResetAccountKycRes> resetAccountKyc(ResetAccountKycReq input) throws ApiException {
//        String uri = "/open-api/v1/kyc/reset";
//        GenericType<ResetAccountKycRes> returnType = new GenericType<>() {
//        };
//        String jsonString = JSON.toJSONString(input);
//        StringEntity entity = new StringEntity(jsonString, Constant.CHARSET);
//
//        return this.service.invokeAPI(uri, "POST", entity, input.getAccessToken(), returnType);
//    }
//
//    /**
//     * Get a face authentication url
//     *
//     * @param input {@link CreateAccountReq}
//     * @return {@link ApiResponse<FaceAuthUrlRes>}
//     * @throws ApiException error
//     */
//    @Override
//    public ApiResponse<FaceAuthUrlRes> getFaceAuthUrl(FaceAuthUrlReq input) throws ApiException {
//        String uri = "/open-api/v1/kyc/face-auth-url";
//        GenericType<FaceAuthUrlRes> returnType = new GenericType<>() {
//        };
//        Map<String, Object> map = JSON.parseObject(JSON.toJSONString(input), new TypeReference<HashMap<String, Object>>() {
//        });
//
//        return this.service.invokeAPI(Util.dealGetParams(map, uri), "GET", null, input.getAccessToken(), returnType);
//    }
//
//    /**
//     * Face authentication
//     *
//     * @param input {@link CreateAccountReq}
//     * @return {@link ApiResponse< BooleanRes >}
//     * @throws ApiException error
//     */
//    @Override
//    public ApiResponse<BooleanRes> faceAuth(FaceAuthReq input) throws ApiException {
//        String uri = "/open-api/v1/kyc/face-auth";
//
//        GenericType<BooleanRes> returnType = new GenericType<>() {
//        };
//
//        MultipartEntityBuilder builder = MultipartEntityBuilder.create();
//        builder.setMode(HttpMultipartMode.RFC6532);
//
//        FileData file = input.getFile();
//
//        ContentType fileContentType;
//        String mimeType = URLConnection.guessContentTypeFromName(file.getFilename());
//        if (mimeType == null) {
//            // guess this is a video uploading
//            fileContentType = ContentType.APPLICATION_OCTET_STREAM;
//        } else {
//            fileContentType = ContentType.create(mimeType);
//        }
//
//        builder.addBinaryBody("file", file.getStream(), fileContentType, file.getFilename());
//        builder.addTextBody("accountId", input.getAccountId());
//
//        HttpEntity httpEntity = builder.build();
//
//        return this.service.invokeAPI(uri, "UPLOAD", httpEntity, input.getAccessToken(), returnType);
//    }
//
//    /**
//     * Get a account KYC
//     *
//     * @param input {@link CreateAccountReq}
//     * @return {@link ApiResponse<AccountKycRes>}
//     * @throws ApiException error
//     */
//    @Override
//    public ApiResponse<AccountKycRes> getAccountKyc(AccountKycReq input) throws ApiException {
//        String uri = String.format("/open-api/v1/kyc/%s", input.getAccountId());
//        GenericType<AccountKycRes> returnType = new GenericType<>() {
//        };
//        return this.service.invokeAPI(Util.dealGetParams(null, uri), "GET", null, input.getAccessToken(), returnType);
//    }
//
//    /**
//     * List all balances
//     *
//     * @param input {@link CreateAccountReq}
//     * @return {@link ApiResponse<BalancesRes>}
//     * @throws ApiException error
//     */
//    @Override
//    public ApiResponse<BalancesRes> getBalances(BalancesReq input) throws ApiException {
//        String uri = "/open-api/v1/balances";
//        GenericType<BalancesRes> returnType = new GenericType<>() {
//        };
//        Map<String, Object> map = JSON.parseObject(JSON.toJSONString(input), new TypeReference<HashMap<String, Object>>() {
//        });
//
//        return this.service.invokeAPI(Util.dealGetParams(map, uri), "GET", null, input.getAccessToken(), returnType);
//    }
//
//    /**
//     * Create a transfer
//     *
//     * @param input {@link CreateAccountReq}
//     * @return {@link ApiResponse<CreateTransferRes>}
//     * @throws ApiException error
//     */
//    @Override
//    public ApiResponse<CreateTransferRes> createTransfer(CreateTransferReq input) throws ApiException {
//        String uri = "/open-api/v1/asset/transfers";
//        GenericType<CreateTransferRes> returnType = new GenericType<>() {
//        };
//        String jsonString = JSON.toJSONString(input);
//        StringEntity entity = new StringEntity(jsonString, Constant.CHARSET);
//
//        return this.service.invokeAPI(uri, "POST", entity, input.getAccessToken(), returnType);
//    }
//
//    /**
//     * Get a transfer
//     *
//     * @param input {@link CreateAccountReq}
//     * @return {@link ApiResponse<TransferRes>}
//     * @throws ApiException error
//     */
//    @Override
//    public ApiResponse<TransferRes> getTransfer(TransferReq input) throws ApiException {
//        String uri = String.format("/open-api/v1/asset/transfers/%s", input.getId());
//        GenericType<TransferRes> returnType = new GenericType<>() {
//        };
//        return this.service.invokeAPI(Util.dealGetParams(null, uri), "GET", null, input.getAccessToken(), returnType);
//    }
//
//    /**
//     * Trigger webhook
//     *
//     * @param input {@link CreateAccountReq}
//     * @return {@link ApiResponse<TriggerWebhookRes>}
//     * @throws ApiException error
//     */
//    @Override
//    public ApiResponse<TriggerWebhookRes> triggerWebhook(TriggerWebhookReq input) throws ApiException {
//        String uri = "/open-api/v1/notifications/trigger";
//        GenericType<TriggerWebhookRes> returnType = new GenericType<>() {
//        };
//        String jsonString = JSON.toJSONString(input);
//        StringEntity entity = new StringEntity(jsonString, Constant.CHARSET);
//
//        return this.service.invokeAPI(uri, "POST", entity, input.getAccessToken(), returnType);
//    }
}