package com.ipeakoin.service.impl.v1;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ipeakoin.dto.ApiException;
import com.ipeakoin.dto.ApiResponse;
import com.ipeakoin.dto.req.DefaultReq;
import com.ipeakoin.dto.req.v1.card.*;
import com.ipeakoin.dto.res.ListRes;
import com.ipeakoin.dto.res.v1.card.*;
import com.ipeakoin.httpclient.constant.Constant;
import com.ipeakoin.httpclient.dto.HttpRes;
import com.ipeakoin.httpclient.http.HttpRequestsBase;
import com.ipeakoin.service.v1.Card;
import com.ipeakoin.utils.Util;
import org.apache.http.entity.StringEntity;

import java.util.List;
import java.util.Map;

import static com.ipeakoin.utils.Util.*;

/**
 * @author klover
 * @description CardImpl
 * @date 2023/7/17 15:36
 */
public class CardImpl implements Card {
    /**
     * http service
     */
    private final HttpRequestsBase service;

    private final ObjectMapper mapper;

    public CardImpl(HttpRequestsBase service, ObjectMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    /**
     * List all budgets
     *
     * @param input {@link  BudgetsReq}
     * @return {@link  ListRes<Budget>}
     */
    @Override
    public ApiResponse<ListRes<Budget>> getBudgets(BudgetsReq input) throws ApiException {
        String uri = "/open-api/v1/budget";

        JavaType generic = mapper.getTypeFactory().constructParametricType(ListRes.class, Budget.class);

        Map<String, Object> map = JsonToMap(mapper, input);

        return this.service.invokeAPI(Util.dealGetParams(map, uri), "GET", null, input.getAccessToken(), returnType(mapper, generic));
    }

    /**
     * Update a budget
     *
     * @param input {@link  UpdateBudgetReq}
     * @return {@link  Boolean}
     */
    @Override
    public ApiResponse<Boolean> updateBudget(UpdateBudgetReq input) throws ApiException {
        String uri = "/open-api/v1/budget";

        String jsonString = JsonToString(mapper, input);
        StringEntity entity = new StringEntity(jsonString, Constant.CHARSET);

        return this.service.invokeAPI(uri, "PUT", entity, input.getAccessToken(), returnType(mapper, Boolean.class));
    }

    /**
     * Create a budget
     *
     * @param input {@link  CreateBudgetReq}
     * @return {@link  String}
     */
    @Override
    public ApiResponse<String> createBudget(CreateBudgetReq input) throws ApiException {
        String uri = "/open-api/v1/budget";

        String jsonString = JsonToString(mapper, input);
        StringEntity entity = new StringEntity(jsonString, Constant.CHARSET);

        return this.service.invokeAPI(uri, "POST", entity, input.getAccessToken(), returnType(mapper, String.class));
    }

    /**
     * Increase the budget balance
     *
     * @param input {@link  IncreaseBudgetBalanceReq}
     * @return {@link  Boolean}
     */
    @Override
    public ApiResponse<Boolean> increaseBudgetBalance(IncreaseBudgetBalanceReq input) throws ApiException {
        String uri = "/open-api/v1/budget/add";

        String jsonString = JsonToString(mapper, input);
        StringEntity entity = new StringEntity(jsonString, Constant.CHARSET);

        return this.service.invokeAPI(uri, "POST", entity, input.getAccessToken(), returnType(mapper, Boolean.class));
    }

    /**
     * Decrease the budget balance
     *
     * @param input {@link  DecreaseBudgetBalanceReq}
     * @return {@link  Boolean}
     */
    @Override
    public ApiResponse<Boolean> decreaseBudgetBalance(DecreaseBudgetBalanceReq input) throws ApiException {
        String uri = "/open-api/v1/budget/sub";

        String jsonString = JsonToString(mapper, input);
        StringEntity entity = new StringEntity(jsonString, Constant.CHARSET);

        return this.service.invokeAPI(uri, "POST", entity, input.getAccessToken(), returnType(mapper, Boolean.class));
    }

    /**
     * List all budget transactions
     *
     * @param input {@link  BudgetTransactionReq}
     * @return {@link  ListRes< BudgetTransaction >}
     */
    @Override
    public ApiResponse<ListRes<BudgetTransaction>> getBudgetTransactions(BudgetTransactionReq input) throws ApiException {
        String uri = "/open-api/v1/budget/transactions";

        JavaType generic = mapper.getTypeFactory().constructParametricType(ListRes.class, BudgetTransaction.class);

        Map<String, Object> map = JsonToMap(mapper, input);

        return this.service.invokeAPI(Util.dealGetParams(map, uri), "GET", null, input.getAccessToken(), returnType(mapper, generic));
    }

    /**
     * List all available card BIN
     *
     * @param input {@link  DefaultReq}
     * @return {@link  List<CardBin>}
     */
    @Override
    public ApiResponse<List<CardBin>> getCardBins(DefaultReq input) throws ApiException {
        String uri = "/open-api/v1/cards/bins";

        JavaType generic = mapper.getTypeFactory().constructParametricType(List.class, CardBin.class);

        Map<String, Object> map = JsonToMap(mapper, input);

        return this.service.invokeAPI(Util.dealGetParams(map, uri), "GET", null, input.getAccessToken(), returnType(mapper, generic));
    }

    /**
     * List all quantum cards
     *
     * @param input {@link  CardReq}
     * @return {@link  ListRes<CardInfo>}
     */
    @Override
    public ApiResponse<ListRes<CardInfo>> getCards(CardReq input) throws ApiException {
        String uri = "/open-api/v1/cards";

        JavaType generic = mapper.getTypeFactory().constructParametricType(ListRes.class, CardInfo.class);

        Map<String, Object> map = JsonToMap(mapper, input);

        return this.service.invokeAPI(Util.dealGetParams(map, uri), "GET", null, input.getAccessToken(), returnType(mapper, generic));
    }

    /**
     * Create a quantum card
     *
     * @param input {@link  CreateCardReq}
     * @return {@link  Boolean}
     */
    @Override
    public ApiResponse<Boolean> createCard(CreateCardReq input) throws ApiException {
        String uri = "/open-api/v1/cards";

        String jsonString = JsonToString(mapper, input);
        StringEntity entity = new StringEntity(jsonString, Constant.CHARSET);

        return this.service.invokeAPI(uri, "POST", entity, input.getAccessToken(), returnType(mapper, Boolean.class));
    }

    /**
     * Create Quantum card parameters check
     *
     * @param input {@link  CreateCardReq}
     * @return {@link  Boolean}
     */
    @Override
    public ApiResponse<List<CreateCardCheckRes>> createCardCheck(CreateCardReq input) throws ApiException {
        String uri = "/open-api/v1/cards/create/check";

        String jsonString = JsonToString(mapper, input);
        StringEntity entity = new StringEntity(jsonString, Constant.CHARSET);

        JavaType generic = mapper.getTypeFactory().constructParametricType(List.class, CreateCardCheckRes.class);

        return this.service.invokeAPI(uri, "POST", entity, input.getAccessToken(), returnType(mapper, generic));
    }

    /**
     * Delete quantum card
     *
     * @param input {@link  DeleteCardReq}
     * @return {@link  Boolean}
     */
    @Override
    public ApiResponse<Boolean> deleteCard(DeleteCardReq input) throws ApiException {
        String uri = "/open-api/v1/cards";

        String jsonString = JsonToString(mapper, input);
        StringEntity entity = new StringEntity(jsonString, Constant.CHARSET);

        return this.service.invokeAPI(uri, "DELETE", entity, input.getAccessToken(), returnType(mapper, Boolean.class));
    }

    /**
     * Quantum card transfer in
     *
     * @param input {@link  CardTransferInReq}
     * @return {@link  Boolean}
     */
    @Override
    public ApiResponse<Boolean> cardTransferIn(CardTransferInReq input) throws ApiException {
        String uri = "/open-api/v1/cards/transfer/in";

        String jsonString = JsonToString(mapper, input);
        StringEntity entity = new StringEntity(jsonString, Constant.CHARSET);

        return this.service.invokeAPI(uri, "POST", entity, input.getAccessToken(), returnType(mapper, Boolean.class));
    }

    /**
     * Quantum card transfer out
     *
     * @param input {@link  CardTransferOutReq}
     * @return {@link  Boolean}
     */
    @Override
    public ApiResponse<Boolean> cardTransferOut(CardTransferOutReq input) throws ApiException {
        String uri = "/open-api/v1/cards/transfer/out";

        String jsonString = JsonToString(mapper, input);
        StringEntity entity = new StringEntity(jsonString, Constant.CHARSET);

        return this.service.invokeAPI(uri, "POST", entity, input.getAccessToken(), returnType(mapper, Boolean.class));
    }

    /**
     * Frozen quantum card
     *
     * @param input {@link  SuspendCardReq}
     * @return {@link  Boolean}
     */
    @Override
    public ApiResponse<Boolean> suspendCard(SuspendCardReq input) throws ApiException {
        String uri = "/open-api/v1/cards/suspend";

        String jsonString = JsonToString(mapper, input);
        StringEntity entity = new StringEntity(jsonString, Constant.CHARSET);

        return this.service.invokeAPI(uri, "PUT", entity, input.getAccessToken(), returnType(mapper, Boolean.class));
    }

    /**
     * Unfrozen quantum card
     *
     * @param input {@link  EnableCardReq}
     * @return {@link  Boolean}
     */
    @Override
    public ApiResponse<Boolean> enableCard(EnableCardReq input) throws ApiException {
        String uri = "/open-api/v1/cards/enable";

        String jsonString = JsonToString(mapper, input);
        StringEntity entity = new StringEntity(jsonString, Constant.CHARSET);

        return this.service.invokeAPI(uri, "PUT", entity, input.getAccessToken(), returnType(mapper, Boolean.class));
    }

    /**
     * Velocity Control
     *
     * @param input {@link  VelocityControlReq}
     * @return {@link  Boolean}
     * @throws ApiException
     */
    @Override
    public ApiResponse<Boolean> velocityControl(VelocityControlReq input) throws ApiException {
        String uri = "/open-api/v1/cards/velocity-control";

        String jsonString = JsonToString(mapper, input);
        StringEntity entity = new StringEntity(jsonString, Constant.CHARSET);

        return this.service.invokeAPI(uri, "PUT", entity, input.getAccessToken(), returnType(mapper, Boolean.class));
    }

    /**
     * Frozen quantum card balance
     *
     * @param input {@link  FrozenCardBalanceReq}
     * @return {@link  Boolean}
     */
    @Override
    public ApiResponse<Boolean> frozenCardBalance(FrozenCardBalanceReq input) throws ApiException {
        String uri = "/open-api/v1/cards/frozen";

        String jsonString = JsonToString(mapper, input);
        StringEntity entity = new StringEntity(jsonString, Constant.CHARSET);

        return this.service.invokeAPI(uri, "POST", entity, input.getAccessToken(), returnType(mapper, Boolean.class));
    }

    /**
     * Unfrozen quantum card balance
     *
     * @param input {@link  UnfrozenCardBalanceReq}
     * @return {@link  Boolean}
     */
    @Override
    public ApiResponse<Boolean> unfrozenCardBalance(UnfrozenCardBalanceReq input) throws ApiException {
        String uri = "/open-api/v1/cards/unfrozen";

        String jsonString = JsonToString(mapper, input);
        StringEntity entity = new StringEntity(jsonString, Constant.CHARSET);

        return this.service.invokeAPI(uri, "POST", entity, input.getAccessToken(), returnType(mapper, Boolean.class));
    }

    /**
     * Get a quantum card private info
     *
     * @param input {@link  CardPrivateInfoReq}
     * @return {@link  CardPrivateInfoReqRes}
     */
    @Override
    public ApiResponse<CardPrivateInfoReqRes> getCardPrivateInfo(CardPrivateInfoReq input) throws ApiException {
        String uri = "/open-api/v1/cards/info";

        Map<String, Object> map = JsonToMap(mapper, input);

        return this.service.invokeAPI(Util.dealGetParams(map, uri), "GET", null, input.getAccessToken(), returnType(mapper, CardPrivateInfoReqRes.class));
    }

    /**
     * List all quantum card transactions
     *
     * @param input {@link  CardTransactionReq}
     * @return {@link  ListRes<CardTransaction>}
     */
    @Override
    public ApiResponse<ListRes<CardTransaction>> getCardTransactions(CardTransactionReq input) throws ApiException {
        String uri = "/open-api/v1/cards/transactions";

        Map<String, Object> map = JsonToMap(mapper, input);
        JavaType returnType = mapper.getTypeFactory().constructParametricType(ListRes.class, CardTransaction.class);

        HttpRes res = this.service.request(Util.dealGetParams(map, uri), "GET", null, input.getAccessToken());
        int status = res.getStatus();
        if (status >= 200 && status < 300) {
            try {
                Object value = mapper.readValue(res.getContent(), returnType);
                return new ApiResponse(value, 0, "ok");
            } catch (JsonProcessingException e) {
                throw new RuntimeException(e);
            }
        }
        throw new ApiException(status, res.getContent(), res.getHeaders(), this.service.delErrorMessage(res.getContent()));
    }
}
