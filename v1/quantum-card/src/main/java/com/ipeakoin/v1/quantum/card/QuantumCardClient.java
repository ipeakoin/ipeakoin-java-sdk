package com.ipeakoin.v1.quantum.card;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ipeakoin.http.client.MyHttpClientBuilder;
import com.ipeakoin.http.client.dto.Credentials;
import com.ipeakoin.http.client.dto.res.ApiException;
import com.ipeakoin.utils.JsonUtil;
import com.ipeakoin.utils.res.PageRes;
import com.ipeakoin.v1.quantum.card.dto.entity.*;
import com.ipeakoin.v1.quantum.card.dto.req.*;
import com.ipeakoin.v1.quantum.card.dto.res.CardPrivateInfoReqRes;
import com.ipeakoin.v1.quantum.card.dto.res.CreateCardCheckRes;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;

import java.util.List;

/**
 * QuantumCardClient
 *
 * @author klover
 * @date 2024/4/11 20:24
 */
public interface QuantumCardClient {
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


        public QuantumCardClient build(CloseableHttpClient httpClient) {
            return new QuantumCardClientImpl(httpClient, JsonUtil.getInstance(), this.credentials);
        }

        public QuantumCardClient build(ObjectMapper mapper) {
            CloseableHttpClient httpClient = MyHttpClientBuilder.create().build();
            return new QuantumCardClientImpl(httpClient, JsonUtil.getInstance(), this.credentials);
        }

        public QuantumCardClient build(CloseableHttpClient httpClient, ObjectMapper mapper) {
            return new QuantumCardClientImpl(httpClient, mapper, this.credentials);
        }

        public QuantumCardClient build() {
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
     * List all budgets
     *
     * @param input {@link  BudgetsReq}
     * @return {@link  PageRes<Budget>}
     */
    PageRes<Budget> getBudgets(BudgetsReq input) throws ApiException;

    /**
     * Update a budget
     *
     * @param budgetId budgetId
     * @return {@link  Boolean}
     */
    Boolean updateBudget(String budgetId, String name) throws ApiException;

    /**
     * Create a budget
     *
     * @param input {@link  CreateBudgetReq}
     * @return {@link  String}
     */
    String createBudget(CreateBudgetReq input) throws ApiException;

    /**
     * Increase the budget balance
     *
     * @param input {@link  IncreaseBudgetBalanceReq}
     * @return {@link  Boolean}
     */
    Boolean increaseBudgetBalance(IncreaseBudgetBalanceReq input) throws ApiException;

    /**
     * Decrease the budget balance
     *
     * @param input {@link  DecreaseBudgetBalanceReq}
     * @return {@link  Boolean}
     */
    Boolean decreaseBudgetBalance(DecreaseBudgetBalanceReq input) throws ApiException;

    /**
     * List all budget transactions
     *
     * @param input {@link  BudgetTransactionReq}
     * @return {@link  PageRes<BudgetTransaction>}
     */
    PageRes<BudgetTransaction> getBudgetTransactions(BudgetTransactionReq input) throws ApiException;

    /**
     * List all available card BIN
     *
     * @return {@link  List <CardBin>}
     */
    List<CardBin> getCardBins() throws ApiException;

    /**
     * List all quantum cards
     *
     * @param input {@link  CardReq}
     * @return {@link  PageRes<Card>}
     */
    PageRes<Card> getCards(CardReq input) throws ApiException;

    /**
     * Create a quantum card
     *
     * @param input {@link  CreateCardReq}
     * @return {@link  Boolean}
     */
    Boolean createCard(CreateCardReq input) throws ApiException;

    /**
     * Create Quantum card parameters check
     *
     * @param input {@link  CreateCardReq}
     * @return {@link  Boolean}
     */
    List<CreateCardCheckRes> createCardCheck(CreateCardReq input) throws ApiException;

    /**
     * Delete quantum card
     *
     * @param cardId cardId
     * @return {@link  Boolean}
     */
    Boolean deleteCard(String cardId) throws ApiException;

    /**
     * Quantum card transfer in
     *
     * @param input {@link  CardTransferInReq}
     * @return {@link  Boolean}
     */
    Boolean cardTransferIn(CardTransferInReq input) throws ApiException;

    /**
     * Quantum card transfer out
     *
     * @param input {@link  CardTransferOutReq}
     * @return {@link  Boolean}
     */
    Boolean cardTransferOut(CardTransferOutReq input) throws ApiException;

    /**
     * Frozen quantum card
     *
     * @param cardId cardId
     * @return {@link  Boolean}
     */
    Boolean suspendCard(String cardId) throws ApiException;

    /**
     * Unfrozen quantum card
     *
     * @param cardId cardId
     * @return {@link  Boolean}
     */
    Boolean enableCard(String cardId) throws ApiException;

    /**
     * Velocity Control
     *
     * @param input {@link  VelocityControlReq}
     * @return {@link  Boolean}
     * @throws ApiException
     */
    Boolean velocityControl(VelocityControlReq input) throws ApiException;

    /**
     * Frozen quantum card balance
     *
     * @param input {@link  FrozenCardBalanceReq}
     * @return {@link  Boolean}
     */
    Boolean frozenCardBalance(FrozenCardBalanceReq input) throws ApiException;

    /**
     * Unfrozen quantum card balance
     *
     * @param input {@link  UnfrozenCardBalanceReq}
     * @return {@link  Boolean}
     */
    Boolean unfrozenCardBalance(UnfrozenCardBalanceReq input) throws ApiException;

    /**
     * Get a quantum card private info
     *
     * @param cardId cardId
     * @return {@link  CardPrivateInfoReqRes}
     */
    CardPrivateInfoReqRes getCardPrivateInfo(String cardId) throws ApiException;

    /**
     * List all quantum card transactions
     *
     * @param input {@link  CardTransactionReq}
     * @return {@link  PageRes<CardTransaction>}
     */
    PageRes<CardTransaction> getCardTransactions(CardTransactionReq input) throws ApiException;
}
