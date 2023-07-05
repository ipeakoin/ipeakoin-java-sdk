package com.ipeakoin.service.v1;

import com.ipeakoin.dto.ApiException;
import com.ipeakoin.dto.ApiResponse;
import com.ipeakoin.dto.req.v1.*;
import com.ipeakoin.dto.res.BooleanRes;
import com.ipeakoin.dto.res.Res;
import com.ipeakoin.dto.res.v1.*;
import com.ipeakoin.dto.res.v1.data.CreateAccountData;
import com.ipeakoin.dto.res.v1.list.AccountsList;
import com.ipeakoin.httpclient.http.HttpRequestsBase;

/**
 * @author klover
 * description V1
 * date 2023/6/30 17:31
 */
public interface V1 {
    /**
     * Create a account
     *
     * @param input {@link CreateAccountReq}
     * @return {@link ApiResponse<Res<CreateAccountData>>}
     * @throws ApiException error
     */
    ApiResponse<Res<CreateAccountData>> createAccount(CreateAccountReq input) throws ApiException;

    /**
     * List all accounts
     *
     * @param input {@link CreateAccountReq}
     * @return {@link ApiResponse<AccountsList>}
     * @throws ApiException error
     */
    ApiResponse<AccountsList> getAccounts(AccountsReq input) throws ApiException;

//    /**
//     * List all users
//     *
//     * @param input {@link CreateAccountReq}
//     * @return {@link ApiResponse<UsersRes>}
//     * @throws ApiException error
//     */
//    ApiResponse<UsersRes> getUsers(UsersReq input) throws ApiException;
//
//    /**
//     * Upload file
//     *
//     * @param input {@link CreateAccountReq}
//     * @return {@link ApiResponse<UploadFileRes>}
//     * @throws ApiException error
//     */
//    ApiResponse<UploadFileRes> uploadFile(UploadFileReq input) throws ApiException;
//
//    /**
//     * OCR (ID card - Face)
//     *
//     * @param input {@link CreateAccountReq}
//     * @return {@link ApiResponse<OcrIdCardFaceRes>}
//     * @throws ApiException error
//     */
//    ApiResponse<OcrIdCardFaceRes> ocrIdCardFace(OcrIdCardFaceReq input) throws ApiException;
//
//    /**
//     * OCR (ID card - Back)
//     *
//     * @param input {@link CreateAccountReq}
//     * @return {@link ApiResponse<OcrIdCardBackRes>}
//     * @throws ApiException error
//     */
//    ApiResponse<OcrIdCardBackRes> ocrIdCardBack(OcrIdCardBackReq input) throws ApiException;
//
//    /**
//     * OCR (Passport)
//     *
//     * @param input {@link CreateAccountReq}
//     * @return {@link ApiResponse<OcrPassportRes>}
//     * @throws ApiException error
//     */
//    ApiResponse<OcrPassportRes> ocrPassport(OcrPassportReq input) throws ApiException;
//
//    /**
//     * Submit account KYC
//     *
//     * @param input {@link CreateAccountReq}
//     * @return {@link ApiResponse<SubmitAccountKycRes>}
//     * @throws ApiException error
//     */
//    ApiResponse<SubmitAccountKycRes> submitAccountKyc(SubmitAccountKycReq input) throws ApiException;
//
//    /**
//     * Reset account KYC
//     *
//     * @param input {@link CreateAccountReq}
//     * @return {@link ApiResponse<ResetAccountKycRes>}
//     * @throws ApiException error
//     */
//    ApiResponse<ResetAccountKycRes> resetAccountKyc(ResetAccountKycReq input) throws ApiException;
//
//    /**
//     * Get a face authentication url
//     *
//     * @param input {@link CreateAccountReq}
//     * @return {@link ApiResponse<FaceAuthUrlRes>}
//     * @throws ApiException error
//     */
//    ApiResponse<FaceAuthUrlRes> getFaceAuthUrl(FaceAuthUrlReq input) throws ApiException;
//
//    /**
//     * Face authentication
//     *
//     * @param input {@link CreateAccountReq}
//     * @return {@link ApiResponse<  BooleanRes  >}
//     * @throws ApiException error
//     */
//    ApiResponse<BooleanRes> faceAuth(FaceAuthReq input) throws ApiException;
//
//    /**
//     * Get a account KYC
//     *
//     * @param input {@link CreateAccountReq}
//     * @return {@link ApiResponse<AccountKycRes>}
//     * @throws ApiException error
//     */
//    ApiResponse<AccountKycRes> getAccountKyc(AccountKycReq input) throws ApiException;
//
//    /**
//     * List all balances
//     *
//     * @param input {@link CreateAccountReq}
//     * @return {@link ApiResponse<BalancesRes>}
//     * @throws ApiException error
//     */
//    ApiResponse<BalancesRes> getBalances(BalancesReq input) throws ApiException;
//
//    /**
//     * Create a transfer
//     *
//     * @param input {@link CreateAccountReq}
//     * @return {@link ApiResponse<CreateTransferRes>}
//     * @throws ApiException error
//     */
//    ApiResponse<CreateTransferRes> createTransfer(CreateTransferReq input) throws ApiException;
//
//    /**
//     * Get a transfer
//     *
//     * @param input {@link CreateAccountReq}
//     * @return {@link ApiResponse<TransferRes>}
//     * @throws ApiException error
//     */
//    ApiResponse<TransferRes> getTransfer(TransferReq input) throws ApiException;
//
//    /**
//     * Trigger webhook
//     *
//     * @param input {@link CreateAccountReq}
//     * @return {@link ApiResponse<TriggerWebhookRes>}
//     * @throws ApiException error
//     */
//    ApiResponse<TriggerWebhookRes> triggerWebhook(TriggerWebhookReq input) throws ApiException;
}
