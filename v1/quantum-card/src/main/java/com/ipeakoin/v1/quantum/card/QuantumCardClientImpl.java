package com.ipeakoin.v1.quantum.card;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ipeakoin.http.client.HttpRequestsBase;
import com.ipeakoin.http.client.dto.Credentials;
import com.ipeakoin.http.client.dto.res.ApiException;
import com.ipeakoin.utils.JsonUtil;
import com.ipeakoin.utils.Util;
import com.ipeakoin.utils.res.PageRes;
import com.ipeakoin.v1.quantum.card.dto.entity.*;
import com.ipeakoin.v1.quantum.card.dto.req.*;
import com.ipeakoin.v1.quantum.card.dto.res.CardPrivateInfoReqRes;
import com.ipeakoin.v1.quantum.card.dto.res.CreateCardCheckRes;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;

import java.util.List;

import static com.ipeakoin.http.client.HttpRequestsBase.buildEntity;

/**
 * AuthClientImpl
 QuantumCardClientImpl
 * @author klover
 * @date 2024/4/11 20:48
 */
public class QuantumCardClientImpl implements QuantumCardClient {
    private final CloseableHttpClient httpClient;
    private final Credentials credentials;
    private final HttpRequestsBase service;
    private String accessToken;

    public QuantumCardClientImpl(CloseableHttpClient httpClient, ObjectMapper mapper, Credentials credentials) {
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
     * List all budgets
     *
     * @param input {@link  BudgetsReq}
     * @return {@link  PageRes< Budget >}
     */
    @Override
    public PageRes<Budget> getBudgets(BudgetsReq input) throws ApiException {
        String uri = "/open-api/v1/budget";
        JavaType javaType = JsonUtil.getCollectionType(PageRes.class, Budget.class);
        return this.service.invokeAPI(Util.dealGetParams(input, uri), "GET", null, this.accessToken, javaType);
    }

    /**
     * Update a budget
     *
     * @param budgetId budgetId
     * @param name
     * @return {@link  Boolean}
     */
    @Override
    public Boolean updateBudget(String budgetId, String name) throws ApiException {
        String uri = "/open-api/v1/budget";
        String str = String.format("{\"budgetId\":\"%s\", \"name\":\"%s\"}", budgetId, name);
        return this.service.invokeAPI(uri, "PUT", buildEntity(str), this.accessToken, Boolean.class);
    }

    /**
     * Create a budget
     *
     * @param input {@link  CreateBudgetReq}
     * @return {@link  String}
     */
    @Override
    public String createBudget(CreateBudgetReq input) throws ApiException {
        String uri = "/open-api/v1/budget";
        return this.service.invokeAPI(uri, "POST", buildEntity(input), this.accessToken, String.class);
    }

    /**
     * Increase the budget balance
     *
     * @param input {@link  IncreaseBudgetBalanceReq}
     * @return {@link  Boolean}
     */
    @Override
    public Boolean increaseBudgetBalance(IncreaseBudgetBalanceReq input) throws ApiException {
        String uri = "/open-api/v1/budget/add";
        return this.service.invokeAPI(uri, "POST", buildEntity(input), this.accessToken, Boolean.class);
    }

    /**
     * Decrease the budget balance
     *
     * @param input {@link  DecreaseBudgetBalanceReq}
     * @return {@link  Boolean}
     */
    @Override
    public Boolean decreaseBudgetBalance(DecreaseBudgetBalanceReq input) throws ApiException {
        String uri = "/open-api/v1/budget/sub";
        return this.service.invokeAPI(uri, "POST", buildEntity(input), this.accessToken, Boolean.class);
    }

    /**
     * List all budget transactions
     *
     * @param input {@link  BudgetTransactionReq}
     * @return {@link  PageRes<BudgetTransaction>}
     */
    @Override
    public PageRes<BudgetTransaction> getBudgetTransactions(BudgetTransactionReq input) throws ApiException {
        String uri = "/open-api/v1/budget/transactions";
        JavaType generic = JsonUtil.getCollectionType(PageRes.class, BudgetTransaction.class);
        return this.service.invokeAPI(Util.dealGetParams(input, uri), "GET", null, this.accessToken, generic);
    }

    /**
     * List all available card BIN
     *
     * @return {@link  List <CardBin>}
     */
    @Override
    public List<CardBin> getCardBins() throws ApiException {
        String uri = "/open-api/v1/cards/bins";
        JavaType generic = JsonUtil.getCollectionType(List.class, CardBin.class);
        return this.service.invokeAPI(uri, "GET", null, this.accessToken, generic);
    }

    /**
     * List all quantum cards
     *
     * @param input {@link  CardReq}
     * @return {@link  PageRes<Card>}
     */
    @Override
    public PageRes<Card> getCards(CardReq input) throws ApiException {
        String uri = "/open-api/v1/cards";
        JavaType generic = JsonUtil.getCollectionType(PageRes.class, Card.class);
        return this.service.invokeAPI(Util.dealGetParams(input, uri), "GET", null, this.accessToken, generic);
    }

    /**
     * Create a quantum card
     *
     * @param input {@link  CreateCardReq}
     * @return {@link  Boolean}
     */
    @Override
    public Boolean createCard(CreateCardReq input) throws ApiException {
        String uri = "/open-api/v1/cards";
        return this.service.invokeAPI(uri, "POST", buildEntity(input), this.accessToken, Boolean.class);
    }

    /**
     * Create Quantum card parameters check
     *
     * @param input {@link  CreateCardReq}
     * @return {@link  Boolean}
     */
    @Override
    public List<CreateCardCheckRes> createCardCheck(CreateCardReq input) throws ApiException {
        String uri = "/open-api/v1/cards/create/check";
        JavaType generic = JsonUtil.getCollectionType(List.class, CreateCardCheckRes.class);
        return this.service.invokeAPI(uri, "POST", buildEntity(input), this.accessToken, generic);
    }

    /**
     * Delete quantum card
     *
     * @param cardId cardId
     * @return {@link  Boolean}
     */
    @Override
    public Boolean deleteCard(String cardId) throws ApiException {
        String uri = "/open-api/v1/cards";
        String str = String.format("{\"cardId\":\"%s\"}", cardId);
        return this.service.invokeAPI(uri, "DELETE", buildEntity(str), this.accessToken, Boolean.class);
    }

    /**
     * Quantum card transfer in
     *
     * @param input {@link  CardTransferInReq}
     * @return {@link  Boolean}
     */
    @Override
    public Boolean cardTransferIn(CardTransferInReq input) throws ApiException {
        String uri = "/open-api/v1/cards/transfer/in";
        return this.service.invokeAPI(uri, "POST", buildEntity(input), this.accessToken, Boolean.class);
    }

    /**
     * Quantum card transfer out
     *
     * @param input {@link  CardTransferOutReq}
     * @return {@link  Boolean}
     */
    @Override
    public Boolean cardTransferOut(CardTransferOutReq input) throws ApiException {
        String uri = "/open-api/v1/cards/transfer/out";
        return this.service.invokeAPI(uri, "POST", buildEntity(input), this.accessToken, Boolean.class);
    }

    /**
     * Frozen quantum card
     *
     * @param cardId cardId
     * @return {@link  Boolean}
     */
    @Override
    public Boolean suspendCard(String cardId) throws ApiException {
        String uri = "/open-api/v1/cards/suspend";
        String str = String.format("{\"cardId\":\"%s\"}", cardId);
        return this.service.invokeAPI(uri, "PUT", buildEntity(str), this.accessToken, Boolean.class);
    }

    /**
     * Unfrozen quantum card
     *
     * @param cardId cardId
     * @return {@link  Boolean}
     */
    @Override
    public Boolean enableCard(String cardId) throws ApiException {
        String uri = "/open-api/v1/cards/enable";
        String str = String.format("{\"cardId\":\"%s\"}", cardId);
        return this.service.invokeAPI(uri, "PUT", buildEntity(str), this.accessToken, Boolean.class);
    }

    /**
     * Velocity Control
     *
     * @param input {@link  VelocityControlReq}
     * @return {@link  Boolean}
     * @throws ApiException
     */
    @Override
    public Boolean velocityControl(VelocityControlReq input) throws ApiException {
        String uri = "/open-api/v1/cards/velocity-control";
        return this.service.invokeAPI(uri, "PUT", buildEntity(input), this.accessToken, Boolean.class);
    }

    /**
     * Frozen quantum card balance
     *
     * @param input {@link  FrozenCardBalanceReq}
     * @return {@link  Boolean}
     */
    @Override
    public Boolean frozenCardBalance(FrozenCardBalanceReq input) throws ApiException {
        String uri = "/open-api/v1/cards/frozen";
        return this.service.invokeAPI(uri, "POST", buildEntity(input), this.accessToken, Boolean.class);
    }

    /**
     * Unfrozen quantum card balance
     *
     * @param input {@link  UnfrozenCardBalanceReq}
     * @return {@link  Boolean}
     */
    @Override
    public Boolean unfrozenCardBalance(UnfrozenCardBalanceReq input) throws ApiException {
        String uri = "/open-api/v1/cards/unfrozen";
        return this.service.invokeAPI(uri, "POST", buildEntity(input), this.accessToken, Boolean.class);
    }

    /**
     * Get a quantum card private info
     *
     * @param cardId cardId
     * @return {@link  CardPrivateInfoReqRes}
     */
    @Override
    public CardPrivateInfoReqRes getCardPrivateInfo(String cardId) throws ApiException {
        String uri = String.format("/open-api/v1/cards/info?cardId=%s", cardId);
        return this.service.invokeAPI(uri, "GET", null, this.accessToken, CardPrivateInfoReqRes.class);
    }

    /**
     * List all quantum card transactions
     *
     * @param input {@link  CardTransactionReq}
     * @return {@link  PageRes<CardTransaction>}
     */
    @Override
    public PageRes<CardTransaction> getCardTransactions(CardTransactionReq input) throws ApiException {
        String uri = "/open-api/v1/cards/transactions";
        JavaType javaType = JsonUtil.getCollectionType(PageRes.class, CardTransaction.class);
        return this.service.invokeAPI(Util.dealGetParams(input, uri), "GET", null, this.accessToken, javaType);
    }

}
