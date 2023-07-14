package com.ipeakoin.service.impl.v1;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.TypeReference;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ipeakoin.dto.ApiException;
import com.ipeakoin.dto.ApiResponse;
import com.ipeakoin.dto.FileData;
import com.ipeakoin.dto.req.v1.*;
import com.ipeakoin.dto.res.ListRes;
import com.ipeakoin.dto.res.v1.*;
import com.ipeakoin.httpclient.constant.Constant;
import com.ipeakoin.httpclient.http.HttpRequestsBase;
import com.ipeakoin.service.v1.V1;
import com.ipeakoin.utils.Util;
import org.apache.http.HttpEntity;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.entity.mime.HttpMultipartMode;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import javax.ws.rs.core.GenericType;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.ipeakoin.utils.Util.returnType;

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

    private final ObjectMapper mapper;

    /**
     * v1
     *
     * @param service {@link HttpRequestsBase}
     */
    public V1Impl(HttpRequestsBase service, ObjectMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    /**
     * Create a account
     *
     * @param input {@link CreateAccountReq}
     * @return {@link CreateAccountRes}
     * @throws ApiException error
     */
    @Override
    public ApiResponse<CreateAccountRes> createAccount(CreateAccountReq input) throws ApiException {
        String uri = "/open-api/v1/accounts/register";
        String jsonString = JSON.toJSONString(input);
        StringEntity entity = new StringEntity(jsonString, Constant.CHARSET);

        return this.service.invokeAPI(uri, "POST", entity, input.getAccessToken(), returnType(mapper, CreateAccountRes.class));
    }

    /**
     * List all accounts
     *
     * @param input {@link AccountsReq}
     * @return {@link ListRes<Account>}
     * @throws ApiException error
     */
    @Override
    public ApiResponse<ListRes<Account>> getAccounts(AccountsReq input) throws ApiException {
        String uri = "/open-api/v1/accounts";

        JavaType generic = mapper.getTypeFactory().constructParametricType(ListRes.class, Account.class);
        Map<String, Object> map = JSON.parseObject(JSON.toJSONString(input), new TypeReference<HashMap<String, Object>>() {
        });

        return this.service.invokeAPI(Util.dealGetParams(map, uri), "GET", null, input.getAccessToken(), returnType(mapper, generic));
    }

    /**
     * List all users
     *
     * @param input {@link UsersReq}
     * @return {@link ListRes<User>}
     * @throws ApiException error
     */
    @Override
    public ApiResponse<ListRes<User>> getUsers(UsersReq input) throws ApiException {
        String uri = "/open-api/v1/users";

        JavaType generic = mapper.getTypeFactory().constructParametricType(ListRes.class, User.class);

        Map<String, Object> map = JSON.parseObject(JSON.toJSONString(input), new TypeReference<HashMap<String, Object>>() {
        });

        return this.service.invokeAPI(Util.dealGetParams(map, uri), "GET", null, input.getAccessToken(), returnType(mapper, generic));
    }

    /**
     * Upload file
     *
     * @param input {@link UploadFileReq}
     * @return {@link List<String>}
     * @throws ApiException error
     */
    @Override
    public ApiResponse<List<String>> uploadFile(UploadFileReq input) throws ApiException {
        String uri = "/open-api/v1/files/upload";

        GenericType<ApiResponse<List<String>>> returnType = new GenericType<ApiResponse<List<String>>>() {
        };

        MultipartEntityBuilder builder = MultipartEntityBuilder.create();
        builder.setMode(HttpMultipartMode.RFC6532);

        ContentType fileContentType;
        for (FileData file : input.getFiles()) {
            String mimeType = URLConnection.guessContentTypeFromName(file.getFilename());
            if (mimeType == null) {
                // guess this is a video uploading
                fileContentType = ContentType.APPLICATION_OCTET_STREAM;
            } else {
                fileContentType = ContentType.create(mimeType);
            }

            builder.addBinaryBody("files", file.getStream(), fileContentType, file.getFilename());
        }

        HttpEntity httpEntity = builder.build();

        return this.service.invokeAPI(uri, "UPLOAD", httpEntity, input.getAccessToken(), returnType);
    }

    /**
     * OCR (ID card - Face)
     *
     * @param input {@link OcrReq}
     * @return {@link OcrIdCardFaceRes}
     * @throws ApiException error
     */
    @Override
    public ApiResponse<OcrIdCardFaceRes> ocrIdCardFace(OcrReq input) throws ApiException {
        String uri = "/open-api/v1/ocr/idcard/face";

        String jsonString = JSON.toJSONString(input);
        StringEntity entity = new StringEntity(jsonString, Constant.CHARSET);

        return this.service.invokeAPI(uri, "POST", entity, input.getAccessToken(), returnType(mapper, OcrIdCardFaceRes.class));
    }

    /**
     * OCR (ID card - Back)
     *
     * @param input {@link OcrReq}
     * @return {@link OcrIdCardBackRes}
     * @throws ApiException error
     */
    @Override
    public ApiResponse<OcrIdCardBackRes> ocrIdCardBack(OcrReq input) throws ApiException {
        String uri = "/open-api/v1/ocr/idcard/back";

        String jsonString = JSON.toJSONString(input);
        StringEntity entity = new StringEntity(jsonString, Constant.CHARSET);

        return this.service.invokeAPI(uri, "POST", entity, input.getAccessToken(), returnType(mapper, OcrIdCardBackRes.class));
    }

    /**
     * OCR (Passport)
     *
     * @param input {@link OcrReq}
     * @return {@link OcrPassportRes}
     * @throws ApiException error
     */
    @Override
    public ApiResponse<OcrPassportRes> ocrPassport(OcrReq input) throws ApiException {
        String uri = "/open-api/v1/ocr/passport";

        String jsonString = JSON.toJSONString(input);
        StringEntity entity = new StringEntity(jsonString, Constant.CHARSET);

        return this.service.invokeAPI(uri, "POST", entity, input.getAccessToken(), returnType(mapper, OcrPassportRes.class));
    }

    /**
     * Submit account KYC
     *
     * @param input {@link SubmitAccountKycReq}
     * @return {@link String}
     * @throws ApiException error
     */
    @Override
    public ApiResponse<String> submitAccountKyc(SubmitAccountKycReq input) throws ApiException {
        String uri = "/open-api/v1/kyc/submit";

        String jsonString = JSON.toJSONString(input);
        StringEntity entity = new StringEntity(jsonString, Constant.CHARSET);

        return this.service.invokeAPI(uri, "POST", entity, input.getAccessToken(), returnType(mapper, String.class));
    }

    /**
     * Reset account KYC
     *
     * @param input {@link ResetAccountKycReq}
     * @return {@link Boolean}
     * @throws ApiException error
     */
    @Override
    public ApiResponse<Boolean> resetAccountKyc(ResetAccountKycReq input) throws ApiException {
        String uri = "/open-api/v1/kyc/reset";

        String jsonString = JSON.toJSONString(input);
        StringEntity entity = new StringEntity(jsonString, Constant.CHARSET);

        return this.service.invokeAPI(uri, "POST", entity, input.getAccessToken(), returnType(mapper, Boolean.class));
    }

    /**
     * Get a face authentication url
     *
     * @param input {@link FaceAuthUrlReq}
     * @return {@link String}
     * @throws ApiException error
     */
    @Override
    public ApiResponse<String> getFaceAuthUrl(FaceAuthUrlReq input) throws ApiException {
        String uri = "/open-api/v1/kyc/face-auth-url";
        Map<String, Object> map = JSON.parseObject(JSON.toJSONString(input), new TypeReference<HashMap<String, Object>>() {
        });

        return this.service.invokeAPI(Util.dealGetParams(map, uri), "GET", null, input.getAccessToken(), returnType(mapper, String.class));
    }

    /**
     * Face authentication
     *
     * @param input {@link FaceAuthReq}
     * @return {@link Boolean}
     * @throws ApiException error
     */
    @Override
    public ApiResponse<Boolean> faceAuth(FaceAuthReq input) throws ApiException {
        String uri = "/open-api/v1/kyc/face-auth";

        MultipartEntityBuilder builder = MultipartEntityBuilder.create();
        builder.setMode(HttpMultipartMode.RFC6532);

        FileData file = input.getFile();

        ContentType fileContentType;
        String mimeType = URLConnection.guessContentTypeFromName(file.getFilename());
        if (mimeType == null) {
            // guess this is a video uploading
            fileContentType = ContentType.APPLICATION_OCTET_STREAM;
        } else {
            fileContentType = ContentType.create(mimeType);
        }

        builder.addBinaryBody("file", file.getStream(), fileContentType, file.getFilename());
        builder.addTextBody("accountId", input.getAccountId());

        HttpEntity httpEntity = builder.build();

        return this.service.invokeAPI(uri, "UPLOAD", httpEntity, input.getAccessToken(), returnType(mapper, Boolean.class));
    }

    /**
     * Get a account KYC
     *
     * @param input {@link AccountKycReq}
     * @return {@link AccountKycRes}
     * @throws ApiException error
     */
    @Override
    public ApiResponse<AccountKycRes> getAccountKyc(AccountKycReq input) throws ApiException {
        String uri = String.format("/open-api/v1/kyc/%s", input.getAccountId());

        return this.service.invokeAPI(Util.dealGetParams(null, uri), "GET", null, input.getAccessToken(), returnType(mapper, AccountKycRes.class));
    }

    /**
     * List all balances
     *
     * @param input {@link BalancesReq}
     * @return {@link ListRes<Balance>}
     * @throws ApiException error
     */
    @Override
    public ApiResponse<ListRes<Balance>> getBalances(BalancesReq input) throws ApiException {
        String uri = "/open-api/v1/balances";
        JavaType generic = mapper.getTypeFactory().constructParametricType(ListRes.class, Balance.class);
        Map<String, Object> map = JSON.parseObject(JSON.toJSONString(input), new TypeReference<HashMap<String, Object>>() {
        });

        return this.service.invokeAPI(Util.dealGetParams(map, uri), "GET", null, input.getAccessToken(), returnType(mapper, generic));
    }

    /**
     * Create a transfer
     *
     * @param input {@link CreateTransferReq}
     * @return {@link TransferRes}
     * @throws ApiException error
     */
    @Override
    public ApiResponse<TransferRes> createTransfer(CreateTransferReq input) throws ApiException {
        String uri = "/open-api/v1/asset/transfers";

        String jsonString = JSON.toJSONString(input);
        StringEntity entity = new StringEntity(jsonString, Constant.CHARSET);

        return this.service.invokeAPI(uri, "POST", entity, input.getAccessToken(), returnType(mapper, TransferRes.class));
    }

    /**
     * Get a transfer
     *
     * @param input {@link TransferReq}
     * @return {@link TransferRes}
     * @throws ApiException error
     */
    @Override
    public ApiResponse<TransferRes> getTransfer(TransferReq input) throws ApiException {
        String uri = String.format("/open-api/v1/asset/transfers/%s", input.getId());

        return this.service.invokeAPI(Util.dealGetParams(null, uri), "GET", null, input.getAccessToken(), returnType(mapper, TransferRes.class));
    }

    /**
     * Trigger webhook
     *
     * @param input {@link TriggerWebhookReq}
     * @return {@link Boolean}
     * @throws ApiException error
     */
    @Override
    public ApiResponse<Boolean> triggerWebhook(TriggerWebhookReq input) throws ApiException {
        String uri = "/open-api/v1/notifications/trigger";

        String jsonString = JSON.toJSONString(input);
        StringEntity entity = new StringEntity(jsonString, Constant.CHARSET);

        return this.service.invokeAPI(uri, "POST", entity, input.getAccessToken(), returnType(mapper, Boolean.class));
    }
}