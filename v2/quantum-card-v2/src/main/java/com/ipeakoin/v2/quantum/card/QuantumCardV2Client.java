package com.ipeakoin.v2.quantum.card;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ipeakoin.http.client.MyHttpClientBuilder;
import com.ipeakoin.http.client.dto.Credentials;
import com.ipeakoin.http.client.dto.res.ApiException;
import com.ipeakoin.utils.JsonUtil;
import com.ipeakoin.utils.res.PageRes;
import com.ipeakoin.v2.quantum.card.dto.entity.AccountTransaction;
import com.ipeakoin.v2.quantum.card.dto.entity.Card;
import com.ipeakoin.v2.quantum.card.dto.req.AccountTxsReq;
import com.ipeakoin.v2.quantum.card.dto.req.CardsReq;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;

/**
 * QuantumCardV2Client
 *
 * @author klover
 * @date 2024/4/11 20:24
 */
public interface QuantumCardV2Client {
    /**
     * Service构造器
     */
    class Builder {
        private Credentials credentials;

        Builder Credentials(Credentials credentials) {
            this.credentials = credentials;
            return this;
        }

        public Builder Credentials(String baseurl) {
            return Credentials(new Credentials(null, null, baseurl));
        }


        public QuantumCardV2Client build(CloseableHttpClient httpClient) {
            return new QuantumCardV2ClientImpl(httpClient, JsonUtil.getInstance(), this.credentials);
        }

        public QuantumCardV2Client build(ObjectMapper mapper) {
            CloseableHttpClient httpClient = MyHttpClientBuilder.create().build();
            return new QuantumCardV2ClientImpl(httpClient, JsonUtil.getInstance(), this.credentials);
        }

        public QuantumCardV2Client build(CloseableHttpClient httpClient, ObjectMapper mapper) {
            return new QuantumCardV2ClientImpl(httpClient, mapper, this.credentials);
        }

        public QuantumCardV2Client build() {
            CloseableHttpClient httpClient = MyHttpClientBuilder.create().build();
            return this.build(httpClient);
        }
    }

    /**
     * 设置 accessToken
     *
     * @param accessToken accessToken
     */
    void setAccessToken(String accessToken);

    /**
     * List all cards
     *
     * @param input {@link Card}
     * @return {@link PageRes<Card>}
     * @throws ApiException
     */
    PageRes<Card> getCards(CardsReq input) throws ApiException;

    /**
     * List all cards
     *
     * @param id id
     * @return {@link Card}
     * @throws ApiException
     */
    Card getCard(String id) throws ApiException;

    /**
     * List all quantum account transactions
     *
     * @param input {@link AccountTxsReq}
     * @return {@link PageRes<AccountTransaction>}
     * @throws ApiException
     */
    PageRes<AccountTransaction> getAccountTransactions(AccountTxsReq input) throws ApiException;

    /**
     * Get a quantum account transaction
     *
     * @param id id
     * @return {@link AccountTransaction}
     * @throws ApiException
     */
   AccountTransaction getAccountTransaction(String id) throws ApiException;
}
