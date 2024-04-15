package com.ipeakoin.v1.crypto.assets;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ipeakoin.http.client.MyHttpClientBuilder;
import com.ipeakoin.http.client.dto.Credentials;
import com.ipeakoin.http.client.dto.res.ApiException;
import com.ipeakoin.utils.JsonUtil;
import com.ipeakoin.utils.res.PageRes;

import com.ipeakoin.v1.crypto.assets.dto.entity.*;
import com.ipeakoin.v1.crypto.assets.dto.req.*;
import com.ipeakoin.v1.crypto.assets.dto.res.CreateBlockchainAddressRes;
import com.ipeakoin.v1.crypto.assets.dto.res.CurrencyPairRes;
import com.ipeakoin.v1.crypto.assets.dto.res.EstimateQuoteRes;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;

import java.util.List;

/**
 * CryptoAssetsClient
 *
 * @author klover
 * @date 2024/4/11 20:24
 */
public interface CryptoAssetsClient {
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


        public CryptoAssetsClient build(CloseableHttpClient httpClient) {
            return new CryptoAssetsClientImpl(httpClient, JsonUtil.getInstance(), this.credentials);
        }

        public CryptoAssetsClient build(ObjectMapper mapper) {
            CloseableHttpClient httpClient = MyHttpClientBuilder.create().build();
            return new CryptoAssetsClientImpl(httpClient, JsonUtil.getInstance(), this.credentials);
        }

        public CryptoAssetsClient build(CloseableHttpClient httpClient, ObjectMapper mapper) {
            return new CryptoAssetsClientImpl(httpClient, mapper, this.credentials);
        }

        public CryptoAssetsClient build() {
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
     * List all wallet balances
     *
     * @param input {@link BalanceReq}
     * @return {@link List <Balance>}
     */
    List<Balance> getBalances(BalanceReq input) throws ApiException;

    /**
     * List all addresses
     *
     * @param input {@link AddressesReq}
     * @return {@link PageRes<Addresses>}
     */
    PageRes<Addresses> getAddresses(AddressesReq input) throws ApiException;

    /**
     * Create a blockchain address
     *
     * @param input {@link CreateBlockchainAddressReq}
     * @return {@link PageRes<CreateBlockchainAddressRes>}
     */
    CreateBlockchainAddressRes createBlockchainAddress(CreateBlockchainAddressReq input) throws ApiException;

    /**
     * List all deposit history
     *
     * @param input {@link DepositsReq}
     * @return {@link PageRes<Deposit>}
     */
    PageRes<Deposit> getDeposits(DepositsReq input) throws ApiException;

    /**
     * List all withdrawal history
     *
     * @param input {@link WithdrawalsReq}
     * @return {@link PageRes<Withdrawal>}
     */
    PageRes<Withdrawal> getWithdrawals(WithdrawalsReq input) throws ApiException;

    /**
     * Withdraw coin
     *
     * @param input {@link WithdrawalReq}
     * @return {@link Withdrawal}
     */
    Withdrawal withdrawal(WithdrawalReq input) throws ApiException;

    /**
     * List all bills
     *
     * @param input {@link BillsReq}
     * @return {@link PageRes<Bill>}
     */
    PageRes<Bill> getBills(BillsReq input) throws ApiException;

    /**
     * Get a trade currency pair
     *
     * @param input {@link CurrencyPairReq}
     * @return {@link CurrencyPairRes}
     */
    CurrencyPairRes getCurrencyPair(CurrencyPairReq input) throws ApiException;

    /**
     * Get a estimate quote
     *
     * @param input {@link EstimateQuoteReq}
     * @return {@link EstimateQuoteRes}
     */
    EstimateQuoteRes estimateQuote(EstimateQuoteReq input) throws ApiException;

    /**
     * List all trades
     *
     * @param input {@link TradesReq}
     * @return {@link PageRes<Trade>}
     */
    PageRes<Trade> getTrades(TradesReq input) throws ApiException;

    /**
     * Create a trade
     *
     * @param input {@link TradeReq}
     * @return {@link Trade}
     */
    Trade trade(TradeReq input) throws ApiException;

    /**
     * List all Wire bank accounts
     *
     * @param input {@link WiresReq}
     * @return {@link PageRes<Wire>}
     */
    PageRes<Wire> getWires(WiresReq input) throws ApiException;

    /**
     * Create a wire bank account
     *
     * @param input {@link WireReq}
     * @return {@link Wire}
     */
    Wire wire(WireReq input) throws ApiException;

    /**
     * Delete a Wire bank account
     *
     * @param id id
     * @return {@link Boolean}
     */
    Boolean deleteWire(String id) throws ApiException;

    /**
     * List all payouts
     *
     * @param input {@link PageRes<Payout>}
     * @return {@link Payout}
     */
    PageRes<Payout> getPayouts(PayoutsReq input) throws ApiException;

    /**
     * Create a payout
     *
     * @param input {@link PayoutReq}
     * @return {@link Payout}
     */
    Payout payout(PayoutReq input) throws ApiException;

    /**
     * Get a payout
     *
     * @param id id
     * @return {@link Payout}
     */
    Payout getPayout(String id) throws ApiException;

}
