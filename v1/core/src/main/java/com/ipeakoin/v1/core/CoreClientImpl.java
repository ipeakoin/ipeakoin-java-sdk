package com.ipeakoin.v1.core;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ipeakoin.http.client.HttpRequestsBase;
import com.ipeakoin.http.client.dto.Credentials;
import com.ipeakoin.http.client.dto.res.ApiException;
import com.ipeakoin.utils.JsonUtil;
import com.ipeakoin.utils.Util;
import com.ipeakoin.utils.res.PageRes;
import com.ipeakoin.v1.core.dto.entity.Account;
import com.ipeakoin.v1.core.dto.entity.Balance;
import com.ipeakoin.v1.core.dto.entity.FileData;
import com.ipeakoin.v1.core.dto.entity.User;
import com.ipeakoin.v1.core.dto.req.*;
import com.ipeakoin.v1.core.dto.res.*;
import org.apache.hc.client5.http.entity.mime.HttpMultipartMode;
import org.apache.hc.client5.http.entity.mime.MultipartEntityBuilder;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.core5.http.ContentType;

import java.net.URLConnection;
import java.util.List;

import static com.ipeakoin.http.client.HttpRequestsBase.buildEntity;

/**
 * CoreClientImpl
 *
 * @author klover
 * @date 2024/4/11 20:48
 */
public class CoreClientImpl implements CoreClient {
    private final CloseableHttpClient httpClient;
    private final Credentials credentials;
    private final HttpRequestsBase service;
    private String accessToken;

    public CoreClientImpl(CloseableHttpClient httpClient, ObjectMapper mapper, Credentials credentials) {
        this.credentials = credentials;
        this.httpClient = httpClient;
        this.service = new HttpRequestsBase.Builder().build(this.httpClient, credentials.getBaseurl(), mapper, credentials.getRequestConfig());
    }

    /**
     * 设置 accessToken
     *
     * @param accessToken accessToken
     */
    @Override
    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    /**
     * List account fee rates
     *
     * @return {@link List < AccountFeeRatesRes >}
     * @throws ApiException
     */
    @Override
    public List<AccountFeeRatesRes> accountFeeRates() throws ApiException {
        String uri = "/open-api/v1/accounts/fees";

        JavaType javaType = JsonUtil.getCollectionType(List.class, AccountFeeRatesRes.class);
        return this.service.invokeAPI(uri, "GET", null, this.accessToken, javaType);
    }

    /**
     * Create a account
     *
     * @param input {@link CreateAccountReq}
     * @return {@link CreateAccountRes}
     * @throws ApiException error
     */
    @Override
    public CreateAccountRes createAccount(CreateAccountReq input) throws ApiException {
        String uri = "/open-api/v1/accounts/register";
        return this.service.invokeAPI(uri, "POST", buildEntity(input), this.accessToken, CreateAccountRes.class);
    }

    /**
     * List all accounts
     *
     * @param input {@link AccountsReq}
     * @return {@link PageRes < Account >}
     * @throws ApiException error
     */
    @Override
    public PageRes<Account> getAccounts(AccountsReq input) throws ApiException {
        String uri = "/open-api/v1/accounts";

        JavaType javaType = JsonUtil.getCollectionType(PageRes.class, Account.class);
        return this.service.invokeAPI(Util.dealGetParams(input, uri), "GET", null, this.accessToken, javaType);
    }

    /**
     * List all users
     *
     * @param input {@link UsersReq}
     * @return {@link PageRes < User >}
     * @throws ApiException error
     */
    @Override
    public PageRes<User> getUsers(UsersReq input) throws ApiException {
        String uri = "/open-api/v1/users";

        JavaType javaType = JsonUtil.getCollectionType(PageRes.class, User.class);
        return this.service.invokeAPI(Util.dealGetParams(input, uri), "GET", null, this.accessToken, javaType);
    }

    /**
     * Upload file
     *
     * @param files files
     * @return {@link List<String>}
     * @throws ApiException error
     */
    @Override
    public List<String> uploadFile(List<FileData> files) throws ApiException {
        String uri = "/open-api/v1/files/upload";
        JavaType javaType = JsonUtil.getCollectionType(List.class, String.class);

        MultipartEntityBuilder builder = MultipartEntityBuilder.create();

        ContentType fileContentType;
        for (FileData file : files) {
            String mimeType = URLConnection.guessContentTypeFromName(file.getFilename());
            if (mimeType == null) {
                // guess this is a video uploading
                fileContentType = ContentType.APPLICATION_OCTET_STREAM;
            } else {
                fileContentType = ContentType.create(mimeType);
            }

            builder.addBinaryBody("files", file.getStream(), fileContentType, file.getFilename());
        }

        return this.service.invokeAPI(uri, "UPLOAD", builder.build(), this.accessToken, javaType);
    }

    /**
     * OCR (ID card - Face)
     *
     * @param image image
     * @return {@link OcrIdCardFaceRes}
     * @throws ApiException error
     */
    @Override
    public OcrIdCardFaceRes ocrIdCardFace(String image) throws ApiException {
        String uri = "/open-api/v1/ocr/idcard/face";
        String input = String.format("{\"image\":\"%s\"}", image);
        return this.service.invokeAPI(uri, "POST", buildEntity(input), this.accessToken, OcrIdCardFaceRes.class);
    }

    /**
     * OCR (ID card - Back)
     *
     * @param image image
     * @return {@link OcrIdCardBackRes}
     * @throws ApiException error
     */
    @Override
    public OcrIdCardBackRes ocrIdCardBack(String image) throws ApiException {
        String uri = "/open-api/v1/ocr/idcard/back";
        String input = String.format("{\"image\":\"%s\"}", image);
        return this.service.invokeAPI(uri, "POST", buildEntity(input), this.accessToken, OcrIdCardBackRes.class);
    }

    /**
     * OCR (Passport)
     *
     * @param image image
     * @return {@link OcrPassportRes}
     * @throws ApiException error
     */
    @Override
    public OcrPassportRes ocrPassport(String image) throws ApiException {
        String uri = "/open-api/v1/ocr/passport";
        String input = String.format("{\"image\":\"%s\"}", image);
        return this.service.invokeAPI(uri, "POST", buildEntity(input), this.accessToken, OcrPassportRes.class);
    }

    /**
     * Submit account KYC
     *
     * @param input {@link SubmitAccountKycReq}
     * @return {@link String}
     * @throws ApiException error
     */
    @Override
    public String submitAccountKyc(SubmitAccountKycReq input) throws ApiException {
        String uri = "/open-api/v1/kyc/submit";
        return this.service.invokeAPI(uri, "POST", buildEntity(input), this.accessToken, String.class);
    }

    /**
     * Reset account KYC
     *
     * @param accountId accountId
     * @return {@link Boolean}
     * @throws ApiException error
     */
    @Override
    public Boolean resetAccountKyc(String accountId) throws ApiException {
        String uri = "/open-api/v1/kyc/reset";
        String input = String.format("{\"accountId\":\"%s\"}", accountId);
        return this.service.invokeAPI(uri, "POST", buildEntity(input), this.accessToken, Boolean.class);
    }

    /**
     * Get a face authentication url
     *
     * @param accountId accountId
     * @return {@link String}
     * @throws ApiException error
     */
    @Override
    public String getFaceAuthUrl(String accountId) throws ApiException {
        String uri = String.format("/open-api/v1/kyc/face-auth-url?accountId=%s", accountId);
        return this.service.invokeAPI(uri, "GET", null, this.accessToken, String.class);
    }

    /**
     * Face authentication
     *
     * @param input {@link FaceAuthReq}
     * @return {@link Boolean}
     * @throws ApiException error
     */
    @Override
    public Boolean faceAuth(FaceAuthReq input) throws ApiException {
        String uri = "/open-api/v1/kyc/face-auth";

        MultipartEntityBuilder builder = MultipartEntityBuilder.create();
        builder.setMode(HttpMultipartMode.EXTENDED);

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

        return this.service.invokeAPI(uri, "UPLOAD", builder.build(), this.accessToken, Boolean.class);
    }

    /**
     * Get a account KYC
     *
     * @param accountId accountId
     * @return {@link AccountKycRes}
     * @throws ApiException error
     */
    @Override
    public AccountKycRes getAccountKyc(String accountId) throws ApiException {
        String uri = String.format("/open-api/v1/kyc/%s", accountId);
        return this.service.invokeAPI(uri, "GET", null, this.accessToken, AccountKycRes.class);
    }

    /**
     * List all balances
     *
     * @param input {@link BalancesReq}
     * @return {@link PageRes < Balance >}
     * @throws ApiException error
     */
    @Override
    public PageRes<Balance> getBalances(BalancesReq input) throws ApiException {
        String uri = "/open-api/v1/balances";

        JavaType javaType = JsonUtil.getCollectionType(PageRes.class, Balance.class);
        return this.service.invokeAPI(Util.dealGetParams(input, uri), "GET", null, this.accessToken, javaType);
    }

    /**
     * Create a transfer
     *
     * @param input {@link CreateTransferReq}
     * @return {@link TransferRes}
     * @throws ApiException error
     */
    @Override
    public TransferRes createTransfer(CreateTransferReq input) throws ApiException {
        String uri = "/open-api/v1/asset/transfers";
        return this.service.invokeAPI(uri, "POST", buildEntity(input), this.accessToken, TransferRes.class);
    }

    /**
     * Get a transfer
     *
     * @param id id
     * @return {@link TransferRes}
     * @throws ApiException error
     */
    @Override
    public TransferRes getTransfer(String id) throws ApiException {
        String uri = String.format("/open-api/v1/asset/transfers/%s", id);
        return this.service.invokeAPI(uri, "GET", null, this.accessToken, TransferRes.class);
    }

    /**
     * Trigger webhook
     *
     * @param input {@link TriggerWebhookReq}
     * @return {@link Boolean}
     * @throws ApiException error
     */
    @Override
    public Boolean triggerWebhook(TriggerWebhookReq input) throws ApiException {
        String uri = "/open-api/v1/notifications/trigger";
        return this.service.invokeAPI(uri, "POST", buildEntity(input), this.accessToken, Boolean.class);
    }
}
