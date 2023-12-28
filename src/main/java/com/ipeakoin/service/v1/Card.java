package com.ipeakoin.service.v1;

import com.ipeakoin.dto.ApiException;
import com.ipeakoin.dto.ApiResponse;
import com.ipeakoin.dto.req.DefaultReq;
import com.ipeakoin.dto.req.v1.card.*;
import com.ipeakoin.dto.res.ListRes;
import com.ipeakoin.dto.res.v1.card.*;

import java.util.List;

/**
 * @author klover
 * @description Card
 * @date 2023/7/17 9:38
 */
public interface Card {
    /**
     * List all budgets
     *
     * @param input {@link  BudgetsReq}
     * @return {@link  ListRes<Budget>}
     */
    ApiResponse<ListRes<Budget>> getBudgets(BudgetsReq input) throws ApiException;

    /**
     * Update a budget
     *
     * @param input {@link  UpdateBudgetReq}
     * @return {@link  Boolean}
     */
    ApiResponse<Boolean> updateBudget(UpdateBudgetReq input) throws ApiException;

    /**
     * Create a budget
     *
     * @param input {@link  CreateBudgetReq}
     * @return {@link  String}
     */
    ApiResponse<String> createBudget(CreateBudgetReq input) throws ApiException;

    /**
     * Increase the budget balance
     *
     * @param input {@link  IncreaseBudgetBalanceReq}
     * @return {@link  Boolean}
     */
    ApiResponse<Boolean> increaseBudgetBalance(IncreaseBudgetBalanceReq input) throws ApiException;

    /**
     * Decrease the budget balance
     *
     * @param input {@link  DecreaseBudgetBalanceReq}
     * @return {@link  Boolean}
     */
    ApiResponse<Boolean> decreaseBudgetBalance(DecreaseBudgetBalanceReq input) throws ApiException;

    /**
     * List all budget transactions
     *
     * @param input {@link  BudgetTransactionReq}
     * @return {@link  ListRes<BudgetTransaction>}
     */
    ApiResponse<ListRes<BudgetTransaction>> getBudgetTransactions(BudgetTransactionReq input) throws ApiException;

    /**
     * List all available card BIN
     *
     * @param input {@link  DefaultReq}
     * @return {@link  List<CardBin>}
     */
    ApiResponse<List<CardBin>> getCardBins(DefaultReq input) throws ApiException;

    /**
     * List all quantum cards
     *
     * @param input {@link  CardReq}
     * @return {@link  ListRes<CardInfo>}
     */
    ApiResponse<ListRes<CardInfo>> getCards(CardReq input) throws ApiException;

    /**
     * Create a quantum card
     *
     * @param input {@link  CreateCardReq}
     * @return {@link  Boolean}
     */
    ApiResponse<Boolean> createCard(CreateCardReq input) throws ApiException;

    /**
     * Create Quantum card parameters check
     *
     * @param input {@link  CreateCardReq}
     * @return {@link  Boolean}
     */
    ApiResponse<List<CreateCardCheckRes>> createCardCheck(CreateCardReq input) throws ApiException;

    /**
     * Delete quantum card
     *
     * @param input {@link  DeleteCardReq}
     * @return {@link  Boolean}
     */
    ApiResponse<Boolean> deleteCard(DeleteCardReq input) throws ApiException;

    /**
     * Quantum card transfer in
     *
     * @param input {@link  CardTransferInReq}
     * @return {@link  Boolean}
     */
    ApiResponse<Boolean> cardTransferIn(CardTransferInReq input) throws ApiException;

    /**
     * Quantum card transfer out
     *
     * @param input {@link  CardTransferOutReq}
     * @return {@link  Boolean}
     */
    ApiResponse<Boolean> cardTransferOut(CardTransferOutReq input) throws ApiException;

    /**
     * Frozen quantum card
     *
     * @param input {@link  SuspendCardReq}
     * @return {@link  Boolean}
     */
    ApiResponse<Boolean> suspendCard(SuspendCardReq input) throws ApiException;

    /**
     * Unfrozen quantum card
     *
     * @param input {@link  EnableCardReq}
     * @return {@link  Boolean}
     */
    ApiResponse<Boolean> enableCard(EnableCardReq input) throws ApiException;

    /**
     * Velocity Control
     *
     * @param input {@link  VelocityControlReq}
     * @return {@link  Boolean}
     * @throws ApiException
     */
    ApiResponse<Boolean> velocityControl(VelocityControlReq input) throws ApiException;

    /**
     * Frozen quantum card balance
     *
     * @param input {@link  FrozenCardBalanceReq}
     * @return {@link  Boolean}
     */
    ApiResponse<Boolean> frozenCardBalance(FrozenCardBalanceReq input) throws ApiException;

    /**
     * Unfrozen quantum card balance
     *
     * @param input {@link  UnfrozenCardBalanceReq}
     * @return {@link  Boolean}
     */
    ApiResponse<Boolean> unfrozenCardBalance(UnfrozenCardBalanceReq input) throws ApiException;

    /**
     * Get a quantum card private info
     *
     * @param input {@link  CardPrivateInfoReq}
     * @return {@link  CardPrivateInfoReqRes}
     */
    ApiResponse<CardPrivateInfoReqRes> getCardPrivateInfo(CardPrivateInfoReq input) throws ApiException;

    /**
     * List all quantum card transactions
     *
     * @param input {@link  CardTransactionReq}
     * @return {@link  ListRes<CardTransaction>}
     */
    ApiResponse<ListRes<CardTransaction>> getCardTransactions(CardTransactionReq input) throws ApiException;
}
