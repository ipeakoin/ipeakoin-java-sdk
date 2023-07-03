package com.ipeakoin.service.impl.v1;

import com.ipeakoin.dto.ApiException;
import com.ipeakoin.dto.ApiResponse;
import com.ipeakoin.dto.FileData;
import com.ipeakoin.dto.req.v1.*;
import com.ipeakoin.dto.res.v1.*;
import com.ipeakoin.httpclient.http.HttpRequestsBase;
import com.ipeakoin.service.v1.V1;
import org.apache.http.HttpEntity;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.HttpMultipartMode;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import javax.ws.rs.core.GenericType;
import java.net.URLConnection;

/**
 * @author klover
 * description V1
 * date 2023/6/29 16:59
 */
public class V1Impl implements V1 {
    /**
     * http service
     */
    private HttpRequestsBase service;

    /**
     * v1
     */
    public V1Impl() {
    }

    /**
     * 设置 http service
     *
     * @param service {@link HttpRequestsBase}
     */
    public void setService(HttpRequestsBase service) {
        this.service = service;
    }

    /**
     * Create a account
     *
     * @param input {@link CreateAccountReq}
     * @return {@link ApiResponse<CreateAccountRes>}
     * @throws ApiException error
     */
    @Override
    public ApiResponse<CreateAccountRes> createAccount(CreateAccountReq input) throws ApiException {
        return null;
    }

    /**
     * List all accounts
     *
     * @param input {@link CreateAccountReq}
     * @return {@link ApiResponse<AccountsRes>}
     * @throws ApiException error
     */
    @Override
    public ApiResponse<AccountsRes> getAccounts(AccountsReq input) throws ApiException {
        return null;
    }

    /**
     * List all users
     *
     * @param input {@link CreateAccountReq}
     * @return {@link ApiResponse<UsersRes>}
     * @throws ApiException error
     */
    @Override
    public ApiResponse<UsersRes> getUsers(UsersReq input) throws ApiException {
        return null;
    }

    /**
     * Upload file
     *
     * @param input {@link CreateAccountReq}
     * @return {@link ApiResponse<UploadFileRes>}
     * @throws ApiException error
     */
    @Override
    public ApiResponse<UploadFileRes> uploadFile(UploadFileReq input) throws ApiException {
        String uri = "/open-api/v1/files/upload";

        GenericType<UploadFileRes> returnType = new GenericType<>() {
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

        return this.service.invokeAPI(uri, "UPLOAD", httpEntity, returnType);
    }

    /**
     * OCR (ID card - Face)
     *
     * @param input {@link CreateAccountReq}
     * @return {@link ApiResponse<OcrIdCardFaceRes>}
     * @throws ApiException error
     */
    @Override
    public ApiResponse<OcrIdCardFaceRes> ocrIdCardFace(OcrIdCardFaceReq input) throws ApiException {
        return null;
    }

    /**
     * OCR (ID card - Back)
     *
     * @param input {@link CreateAccountReq}
     * @return {@link ApiResponse<OcrIdCardBackRes>}
     * @throws ApiException error
     */
    @Override
    public ApiResponse<OcrIdCardBackRes> ocrIdCardBack(OcrIdCardBackReq input) throws ApiException {
        return null;
    }

    /**
     * OCR (Passport)
     *
     * @param input {@link CreateAccountReq}
     * @return {@link ApiResponse<OcrPassportRes>}
     * @throws ApiException error
     */
    @Override
    public ApiResponse<OcrPassportRes> ocrPassport(OcrPassportReq input) throws ApiException {
        return null;
    }

    /**
     * Submit account KYC
     *
     * @param input {@link CreateAccountReq}
     * @return {@link ApiResponse<SubmitAccountKycRes>}
     * @throws ApiException error
     */
    @Override
    public ApiResponse<SubmitAccountKycRes> submitAccountKyc(SubmitAccountKycReq input) throws ApiException {
        return null;
    }

    /**
     * Reset account KYC
     *
     * @param input {@link CreateAccountReq}
     * @return {@link ApiResponse<ResetAccountKycRes>}
     * @throws ApiException error
     */
    @Override
    public ApiResponse<ResetAccountKycRes> resetAccountKyc(ResetAccountKycReq input) throws ApiException {
        return null;
    }

    /**
     * Get a face authentication url
     *
     * @param input {@link CreateAccountReq}
     * @return {@link ApiResponse<FaceAuthUrlRes>}
     * @throws ApiException error
     */
    @Override
    public ApiResponse<FaceAuthUrlRes> getFaceAuthUrl(FaceAuthUrlReq input) throws ApiException {
        return null;
    }

    /**
     * Face authentication
     *
     * @param input {@link CreateAccountReq}
     * @return {@link ApiResponse< BooleanRes >}
     * @throws ApiException error
     */
    @Override
    public ApiResponse<BooleanRes> faceAuth(FaceAuthReq input) throws ApiException {
        String uri = "/open-api/v1/kyc/face-auth";

        GenericType<BooleanRes> returnType = new GenericType<>() {
        };

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

        return this.service.invokeAPI(uri, "UPLOAD", httpEntity, returnType);
    }

    /**
     * Get a account KYC
     *
     * @param input {@link CreateAccountReq}
     * @return {@link ApiResponse<AccountKycRes>}
     * @throws ApiException error
     */
    @Override
    public ApiResponse<AccountKycRes> getAccountKyc(AccountKycReq input) throws ApiException {
        return null;
    }

    /**
     * List all balances
     *
     * @param input {@link CreateAccountReq}
     * @return {@link ApiResponse<BalancesRes>}
     * @throws ApiException error
     */
    @Override
    public ApiResponse<BalancesRes> getBalances(BalancesReq input) throws ApiException {
        return null;
    }

    /**
     * Create a transfer
     *
     * @param input {@link CreateAccountReq}
     * @return {@link ApiResponse<CreateTransferRes>}
     * @throws ApiException error
     */
    @Override
    public ApiResponse<CreateTransferRes> createTransfer(CreateTransferReq input) throws ApiException {
        return null;
    }

    /**
     * Get a transfer
     *
     * @param input {@link CreateAccountReq}
     * @return {@link ApiResponse<TransferRes>}
     * @throws ApiException error
     */
    @Override
    public ApiResponse<TransferRes> getTransfer(TransferReq input) throws ApiException {
        return null;
    }

    /**
     * Trigger webhook
     *
     * @param input {@link CreateAccountReq}
     * @return {@link ApiResponse<TriggerWebhookRes>}
     * @throws ApiException error
     */
    @Override
    public ApiResponse<TriggerWebhookRes> triggerWebhook(TriggerWebhookReq input) throws ApiException {
        return null;
    }
}