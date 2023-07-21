package com.ipeakoin.service.v1;

import com.ipeakoin.dto.ApiException;
import com.ipeakoin.dto.ApiResponse;
import com.ipeakoin.dto.req.DefaultReq;
import com.ipeakoin.dto.req.v1.*;
import com.ipeakoin.dto.res.ListRes;
import com.ipeakoin.dto.res.v1.*;

import java.util.List;

/**
 * @author klover
 * description V1
 * date 2023/6/30 17:31
 */
public interface V1 {
    /**
     * List account fee rates
     *
     * @param input {@link DefaultReq}
     * @return {@link List<AccountFeeRatesRes>}
     * @throws ApiException
     */
    ApiResponse<List<AccountFeeRatesRes>> accountFeeRates(DefaultReq input) throws ApiException;

    /**
     * Create a account
     *
     * @param input {@link CreateAccountReq}
     * @return {@link CreateAccountRes}
     * @throws ApiException error
     */
    ApiResponse<CreateAccountRes> createAccount(CreateAccountReq input) throws ApiException;

    /**
     * List all accounts
     *
     * @param input {@link AccountsReq}
     * @return {@link ApiResponse}
     * @throws ApiException error
     */
    ApiResponse<ListRes<Account>> getAccounts(AccountsReq input) throws ApiException;

    /**
     * List all users
     *
     * @param input {@link UsersReq}
     * @return {@link ListRes<User>}
     * @throws ApiException error
     */
    ApiResponse<ListRes<User>> getUsers(UsersReq input) throws ApiException;

    /**
     * Upload file
     *
     * @param input {@link UploadFileReq}
     * @return {@link List<String>}
     * @throws ApiException error
     */
    ApiResponse<List<String>> uploadFile(UploadFileReq input) throws ApiException;

    /**
     * OCR (ID card - Face)
     *
     * @param input {@link OcrReq}
     * @return {@link OcrIdCardFaceRes}
     * @throws ApiException error
     */
    ApiResponse<OcrIdCardFaceRes> ocrIdCardFace(OcrReq input) throws ApiException;

    /**
     * OCR (ID card - Back)
     *
     * @param input {@link OcrReq}
     * @return {@link OcrIdCardBackRes}
     * @throws ApiException error
     */
    ApiResponse<OcrIdCardBackRes> ocrIdCardBack(OcrReq input) throws ApiException;

    /**
     * OCR (Passport)
     *
     * @param input {@link OcrReq}
     * @return {@link OcrPassportRes}
     * @throws ApiException error
     */
    ApiResponse<OcrPassportRes> ocrPassport(OcrReq input) throws ApiException;

    /**
     * Submit account KYC
     *
     * @param input {@link SubmitAccountKycReq}
     * @return {@link String}
     * @throws ApiException error
     */
    ApiResponse<String> submitAccountKyc(SubmitAccountKycReq input) throws ApiException;

    /**
     * Reset account KYC
     *
     * @param input {@link ResetAccountKycReq}
     * @return {@link Boolean}
     * @throws ApiException error
     */
    ApiResponse<Boolean> resetAccountKyc(ResetAccountKycReq input) throws ApiException;

    /**
     * Get a face authentication url
     *
     * @param input {@link FaceAuthUrlReq}
     * @return {@link String}
     * @throws ApiException error
     */
    ApiResponse<String> getFaceAuthUrl(FaceAuthUrlReq input) throws ApiException;

    /**
     * Face authentication
     *
     * @param input {@link FaceAuthReq}
     * @return {@link Boolean}
     * @throws ApiException error
     */
    ApiResponse<Boolean> faceAuth(FaceAuthReq input) throws ApiException;

    /**
     * Get a account KYC
     *
     * @param input {@link AccountKycReq}
     * @return {@link AccountKycRes}
     * @throws ApiException error
     */
    ApiResponse<AccountKycRes> getAccountKyc(AccountKycReq input) throws ApiException;

    /**
     * List all balances
     *
     * @param input {@link BalancesReq}
     * @return {@link ListRes<Balance>}
     * @throws ApiException error
     */
    ApiResponse<ListRes<Balance>> getBalances(BalancesReq input) throws ApiException;

    /**
     * Create a transfer
     *
     * @param input {@link CreateTransferReq}
     * @return {@link TransferRes}
     * @throws ApiException error
     */
    ApiResponse<TransferRes> createTransfer(CreateTransferReq input) throws ApiException;

    /**
     * Get a transfer
     *
     * @param input {@link TransferReq}
     * @return {@link TransferRes}
     * @throws ApiException error
     */
    ApiResponse<TransferRes> getTransfer(TransferReq input) throws ApiException;

    /**
     * Trigger webhook
     *
     * @param input {@link TriggerWebhookReq}
     * @return {@link Boolean}
     * @throws ApiException error
     */
    ApiResponse<Boolean> triggerWebhook(TriggerWebhookReq input) throws ApiException;

    /**
     * card
     *
     * @return {@link Card}
     */
    Card card();

    /**
     * crypto assets
     *
     * @return {@link CryptoAssets}
     */
    CryptoAssets cryptoAssets();
}
