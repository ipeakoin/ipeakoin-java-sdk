package com.ipeakoin.service.v1;

import com.ipeakoin.dto.ApiException;
import com.ipeakoin.dto.ApiResponse;
import com.ipeakoin.dto.req.v1.cryptoAssets.*;
import com.ipeakoin.dto.res.ListRes;
import com.ipeakoin.dto.res.v1.Balance;
import com.ipeakoin.dto.res.v1.cryptoAssets.*;

import java.util.List;

/**
 * @author klover
 * @description CryptoAssets
 * @date 2023/7/17 15:42
 */
public interface CryptoAssets {
    /**
     * List all wallet balances
     *
     * @param input {@link BalanceReq}
     * @return {@link List<Balance>}
     */
    ApiResponse<List<Balance>> getBalances(BalanceReq input) throws ApiException;

    /**
     * List all addresses
     *
     * @param input {@link AddressesReq}
     * @return {@link ListRes<Addresses>}
     */
    ApiResponse<ListRes<Addresses>> getAddresses(AddressesReq input) throws ApiException;

    /**
     * Create a blockchain address
     *
     * @param input {@link CreateBlockchainAddressReq}
     * @return {@link ListRes<CreateBlockchainAddressRes>}
     */
    ApiResponse<CreateBlockchainAddressRes> createBlockchainAddress(CreateBlockchainAddressReq input) throws ApiException;

    /**
     * List all deposit history
     *
     * @param input {@link DepositsReq}
     * @return {@link ListRes<Deposit>}
     */
    ApiResponse<ListRes<Deposit>> getDeposits(DepositsReq input) throws ApiException;

    /**
     * List all withdrawal history
     *
     * @param input {@link WithdrawalsReq}
     * @return {@link ListRes<Withdrawal>}
     */
    ApiResponse<ListRes<Withdrawal>> getWithdrawals(WithdrawalsReq input) throws ApiException;

    /**
     * Withdraw coin
     *
     * @param input {@link WithdrawalReq}
     * @return {@link Withdrawal}
     */
    ApiResponse<Withdrawal> withdrawal(WithdrawalReq input) throws ApiException;

    /**
     * List all bills
     *
     * @param input {@link BillsReq}
     * @return {@link ListRes<Bill>}
     */
    ApiResponse<ListRes<Bill>> getBills(BillsReq input) throws ApiException;

    /**
     * Get a trade currency pair
     *
     * @param input {@link CurrencyPairReq}
     * @return {@link CurrencyPairRes}
     */
    ApiResponse<CurrencyPairRes> getCurrencyPair(CurrencyPairReq input) throws ApiException;

    /**
     * Get a estimate quote
     *
     * @param input {@link EstimateQuoteReq}
     * @return {@link EstimateQuoteRes}
     */
    ApiResponse<EstimateQuoteRes> estimateQuote(EstimateQuoteReq input) throws ApiException;

    /**
     * List all trades
     *
     * @param input {@link TradesReq}
     * @return {@link ListRes<Trade>}
     */
    ApiResponse<ListRes<Trade>> getTrades(TradesReq input) throws ApiException;

    /**
     * Create a trade
     *
     * @param input {@link TradeReq}
     * @return {@link Trade}
     */
    ApiResponse<Trade> trade(TradeReq input) throws ApiException;

    /**
     * List all Wire bank accounts
     *
     * @param input {@link WiresReq}
     * @return {@link ListRes<Wire>}
     */
    ApiResponse<ListRes<Wire>> getWires(WiresReq input) throws ApiException;

    /**
     * Create a wire bank account
     *
     * @param input {@link WireReq}
     * @return {@link Wire}
     */
    ApiResponse<Wire> wire(WireReq input) throws ApiException;

    /**
     * Delete a Wire bank account
     *
     * @param input {@link DeleteWireReq}
     * @return {@link Boolean}
     */
    ApiResponse<Boolean> deleteWire(DeleteWireReq input) throws ApiException;

    /**
     * List all payouts
     *
     * @param input {@link ListRes<Payout>}
     * @return {@link Payout}
     */
    ApiResponse<ListRes<Payout>> getPayouts(PayoutsReq input) throws ApiException;

    /**
     * Create a payout
     *
     * @param input {@link PayoutReq}
     * @return {@link Payout}
     */
    ApiResponse<Payout> payout(PayoutReq input) throws ApiException;

    /**
     * Get a payout
     *
     * @param input {@link PayoutInfoReq}
     * @return {@link Payout}
     */
    ApiResponse<Payout> getPayout(PayoutInfoReq input) throws ApiException;
}
