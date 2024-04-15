package com.ipeakoin.v1.core;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ipeakoin.http.client.MyHttpClientBuilder;
import com.ipeakoin.http.client.dto.Credentials;
import com.ipeakoin.http.client.dto.res.ApiException;
import com.ipeakoin.utils.JsonUtil;
import com.ipeakoin.utils.res.PageRes;
import com.ipeakoin.v1.core.dto.entity.Account;
import com.ipeakoin.v1.core.dto.entity.Balance;
import com.ipeakoin.v1.core.dto.entity.FileData;
import com.ipeakoin.v1.core.dto.entity.User;
import com.ipeakoin.v1.core.dto.req.*;
import com.ipeakoin.v1.core.dto.res.*;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;

import java.util.List;

/**
 * CoreClient
 *
 * @author klover
 * @date 2024/4/11 20:24
 */
public interface CoreClient {
    /**
     * Service构造器
     */
    class Builder {
        private Credentials credentials;

        CoreClient.Builder Credentials(Credentials credentials) {
            this.credentials = credentials;
            return this;
        }

        public CoreClient.Builder Credentials(String baseurl) {
            return Credentials(new Credentials(null, null, baseurl));
        }


        public CoreClient build(CloseableHttpClient httpClient) {
            return new CoreClientImpl(httpClient, JsonUtil.getInstance(), this.credentials);
        }

        public CoreClient build(ObjectMapper mapper) {
            CloseableHttpClient httpClient = MyHttpClientBuilder.create().build();
            return new CoreClientImpl(httpClient, JsonUtil.getInstance(), this.credentials);
        }

        public CoreClient build(CloseableHttpClient httpClient, ObjectMapper mapper) {
            return new CoreClientImpl(httpClient, mapper, this.credentials);
        }

        public CoreClient build() {
            CloseableHttpClient httpClient = MyHttpClientBuilder.create().build();
            return this.build(httpClient);
        }
    }

    /**
     * 设置 accessToken accessToken
     */
    void setAccessToken(String accessToken);

    /**
     * List account fee rates
     *
     * @return {@link List<AccountFeeRatesRes>}
     * @throws ApiException
     */
    List<AccountFeeRatesRes> accountFeeRates() throws ApiException;

    /**
     * Create a account
     *
     * @param input {@link CreateAccountReq}
     * @return {@link CreateAccountRes}
     * @throws ApiException error
     */
    CreateAccountRes createAccount(CreateAccountReq input) throws ApiException;

    /**
     * List all accounts
     *
     * @param input {@link AccountsReq}
     * @return {@link PageRes <Account>}
     * @throws ApiException error
     */
    PageRes<Account> getAccounts(AccountsReq input) throws ApiException;

    /**
     * List all users
     *
     * @param input {@link UsersReq}
     * @return {@link PageRes <User>}
     * @throws ApiException error
     */
    PageRes<User> getUsers(UsersReq input) throws ApiException;

    /**
     * Upload file
     *
     * @param files files
     * @return {@link List<String>}
     * @throws ApiException error
     */
    List<String> uploadFile(List<FileData> files) throws ApiException;

    /**
     * OCR (ID card - Face)
     *
     * @param image image
     * @return {@link OcrIdCardFaceRes}
     * @throws ApiException error
     */
    OcrIdCardFaceRes ocrIdCardFace(String image) throws ApiException;

    /**
     * OCR (ID card - Back)
     *
     * @param image image
     * @return {@link OcrIdCardBackRes}
     * @throws ApiException error
     */
    OcrIdCardBackRes ocrIdCardBack(String image) throws ApiException;

    /**
     * OCR (Passport)
     *
     * @param image image
     * @return {@link OcrPassportRes}
     * @throws ApiException error
     */
    OcrPassportRes ocrPassport(String image) throws ApiException;

    /**
     * Submit account KYC
     *
     * @param input {@link SubmitAccountKycReq}
     * @return {@link String}
     * @throws ApiException error
     */
    String submitAccountKyc(SubmitAccountKycReq input) throws ApiException;

    /**
     * Reset account KYC
     *
     * @param accountId accountId
     * @return {@link Boolean}
     * @throws ApiException error
     */
    Boolean resetAccountKyc(String accountId) throws ApiException;

    /**
     * Get a face authentication url
     *
     * @param accountId accountId
     * @return {@link String}
     * @throws ApiException error
     */
    String getFaceAuthUrl(String accountId) throws ApiException;

    /**
     * Face authentication
     *
     * @param input {@link FaceAuthReq}
     * @return {@link Boolean}
     * @throws ApiException error
     */
    Boolean faceAuth(FaceAuthReq input) throws ApiException;

    /**
     * Get a account KYC
     *
     * @param accountId accountId
     * @return {@link AccountKycRes}
     * @throws ApiException error
     */
    AccountKycRes getAccountKyc(String accountId) throws ApiException;

    /**
     * List all balances
     *
     * @param input {@link BalancesReq}
     * @return {@link PageRes <Balance>}
     * @throws ApiException error
     */
    PageRes<Balance> getBalances(BalancesReq input) throws ApiException;

    /**
     * Create a transfer
     *
     * @param input {@link CreateTransferReq}
     * @return {@link TransferRes}
     * @throws ApiException error
     */
    TransferRes createTransfer(CreateTransferReq input) throws ApiException;

    /**
     * Get a transfer
     *
     * @param id id
     * @return {@link TransferRes}
     * @throws ApiException error
     */
    TransferRes getTransfer(String id) throws ApiException;

    /**
     * Trigger webhook
     *
     * @param input {@link TriggerWebhookReq}
     * @return {@link Boolean}
     * @throws ApiException error
     */
    Boolean triggerWebhook(TriggerWebhookReq input) throws ApiException;
}
