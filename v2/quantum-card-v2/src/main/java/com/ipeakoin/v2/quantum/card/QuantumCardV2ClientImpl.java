package com.ipeakoin.v2.quantum.card;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ipeakoin.http.client.HttpRequestsBase;
import com.ipeakoin.http.client.dto.Credentials;
import com.ipeakoin.http.client.dto.res.ApiException;
import com.ipeakoin.utils.JsonUtil;
import com.ipeakoin.utils.Util;
import com.ipeakoin.utils.res.PageRes;
import com.ipeakoin.v1.quantum.card.QuantumCardClientImpl;
import com.ipeakoin.v2.quantum.card.dto.entity.AccountTransaction;
import com.ipeakoin.v2.quantum.card.dto.entity.Card;
import com.ipeakoin.v2.quantum.card.dto.req.AccountTxsReq;
import com.ipeakoin.v2.quantum.card.dto.req.CardsReq;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;

/**
 * QuantumCardV2ClientImpl
 *
 * @author klover
 * @date 2024/4/11 20:48
 */
public class QuantumCardV2ClientImpl extends QuantumCardClientImpl implements QuantumCardV2Client {
    private final CloseableHttpClient httpClient;
    private final Credentials credentials;
    private final HttpRequestsBase service;
    private String accessToken;

    public QuantumCardV2ClientImpl(CloseableHttpClient httpClient, ObjectMapper mapper, Credentials credentials) {
        super(httpClient, mapper, credentials);
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
        super.setAccessToken(accessToken);
        this.accessToken = accessToken;
    }

    /**
     * List all cards
     *
     * @param input {@link Card}
     * @return {@link PageRes <Card>}
     * @throws ApiException
     */
    @Override
    public PageRes<Card> getCardList(CardsReq input) throws ApiException {
        String uri = "/open-api/v2/cards";
        JavaType javaType = JsonUtil.getCollectionType(PageRes.class, Card.class);
        return this.service.invokeAPI(Util.dealGetParams(input, uri), "GET", null, this.accessToken, javaType);
    }

    /**
     * List all cards
     *
     * @param id id
     * @return {@link Card}
     * @throws ApiException
     */
    @Override
    public Card getCard(String id) throws ApiException {
        String uri = String.format("/open-api/v2/cards/%s", id);

        return this.service.invokeAPI(uri, "GET", null, this.accessToken, Card.class);
    }

    /**
     * List all quantum account transactions
     *
     * @param input {@link AccountTxsReq}
     * @return {@link PageRes<AccountTransaction>}
     * @throws ApiException
     */
    @Override
    public PageRes<AccountTransaction> getAccountTransactions(AccountTxsReq input) throws ApiException {
        String uri = "/open-api/v2/quantum-account/transactions";
        JavaType javaType = JsonUtil.getCollectionType(PageRes.class, AccountTransaction.class);
        return this.service.invokeAPI(Util.dealGetParams(input, uri), "GET", null, this.accessToken, javaType);
    }

    /**
     * Get a quantum account transaction
     *
     * @param id id
     * @return {@link AccountTransaction}
     * @throws ApiException
     */
    @Override
    public AccountTransaction getAccountTransaction(String id) throws ApiException {
        String uri = String.format("/open-api/v2/quantum-account/transactions/%s", id);

        return this.service.invokeAPI(uri, "GET", null, this.accessToken, AccountTransaction.class);
    }

}
