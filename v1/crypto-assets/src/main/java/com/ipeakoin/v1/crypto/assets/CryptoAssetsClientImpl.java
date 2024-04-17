package com.ipeakoin.v1.crypto.assets;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ipeakoin.http.client.HttpRequestsBase;
import com.ipeakoin.http.client.dto.Credentials;
import com.ipeakoin.http.client.dto.res.ApiException;
import com.ipeakoin.utils.JsonUtil;
import com.ipeakoin.utils.Util;
import com.ipeakoin.utils.res.PageRes;
import com.ipeakoin.v1.crypto.assets.dto.entity.*;
import com.ipeakoin.v1.crypto.assets.dto.req.*;
import com.ipeakoin.v1.crypto.assets.dto.res.CreateBlockchainAddressRes;
import com.ipeakoin.v1.crypto.assets.dto.res.CurrencyPairRes;
import com.ipeakoin.v1.crypto.assets.dto.res.EstimateQuoteRes;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;

import java.util.List;

import static com.ipeakoin.http.client.HttpRequestsBase.buildEntity;

/**
 * CryptoAssetsClientImpl
 *
 * @author klover
 * @date 2024/4/11 20:48
 */
public class CryptoAssetsClientImpl implements CryptoAssetsClient {
    private final CloseableHttpClient httpClient;
    private final Credentials credentials;
    private final HttpRequestsBase service;
    private String accessToken;

    public CryptoAssetsClientImpl(CloseableHttpClient httpClient, ObjectMapper mapper, Credentials credentials) {
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
     * List all wallet balances
     *
     * @param input {@link BalanceReq}
     * @return {@link List <Balance>}
     */
    @Override
    public List<Balance> getBalances(BalanceReq input) throws ApiException {
        String uri = "/open-api/v1/asset/wallets/balances";
        JavaType generic = JsonUtil.getCollectionType(List.class, Balance.class);
        return this.service.invokeAPI(Util.dealGetParams(input, uri), "GET", null, this.accessToken, generic);
    }

    /**
     * List all addresses
     *
     * @param input {@link AddressesReq}
     * @return {@link PageRes<Addresses>}
     */
    @Override
    public PageRes<Addresses> getAddresses(AddressesReq input) throws ApiException {
        String uri = "/open-api/v1/asset/wallets/addresses";
        JavaType generic = JsonUtil.getCollectionType(PageRes.class, Addresses.class);
        return this.service.invokeAPI(Util.dealGetParams(input, uri), "GET", null, this.accessToken, generic);
    }

    /**
     * Create a blockchain address
     *
     * @param input {@link CreateBlockchainAddressReq}
     * @return {@link PageRes<CreateBlockchainAddressRes>}
     */
    @Override
    public CreateBlockchainAddressRes createBlockchainAddress(CreateBlockchainAddressReq input) throws ApiException {
        String uri = "/open-api/v1/asset/wallets/addresses";
        return this.service.invokeAPI(uri, "POST", buildEntity(input), this.accessToken, CreateBlockchainAddressRes.class);
    }

    /**
     * List all deposit history
     *
     * @param input {@link DepositsReq}
     * @return {@link PageRes<Deposit>}
     */
    @Override
    public PageRes<Deposit> getDeposits(DepositsReq input) throws ApiException {
        String uri = "/open-api/v1/asset/wallets/deposits";
        JavaType generic = JsonUtil.getCollectionType(PageRes.class, Deposit.class);
        return this.service.invokeAPI(Util.dealGetParams(input, uri), "GET", null, this.accessToken, generic);
    }

    /**
     * List all withdrawal history
     *
     * @param input {@link WithdrawalsReq}
     * @return {@link PageRes<Withdrawal>}
     */
    @Override
    public PageRes<Withdrawal> getWithdrawals(WithdrawalsReq input) throws ApiException {
        String uri = "/open-api/v1/asset/wallets/withdrawals";
        JavaType generic = JsonUtil.getCollectionType(PageRes.class, Withdrawal.class);
        return this.service.invokeAPI(Util.dealGetParams(input, uri), "GET", null, this.accessToken, generic);
    }

    /**
     * Withdraw coin
     *
     * @param input {@link WithdrawalReq}
     * @return {@link Withdrawal}
     */
    @Override
    public Withdrawal withdrawal(WithdrawalReq input) throws ApiException {
        String uri = "/open-api/v1/asset/wallets/withdrawals";
        return this.service.invokeAPI(uri, "POST", buildEntity(input), this.accessToken, Withdrawal.class);
    }

    /**
     * List all bills
     *
     * @param input {@link BillsReq}
     * @return {@link PageRes<Bill>}
     */
    @Override
    public PageRes<Bill> getBills(BillsReq input) throws ApiException {
        String uri = "/open-api/v1/asset/wallets/bills";
        JavaType generic = JsonUtil.getCollectionType(PageRes.class, Bill.class);
        return this.service.invokeAPI(Util.dealGetParams(input, uri), "GET", null, this.accessToken, generic);
    }

    /**
     * Get a trade currency pair
     *
     * @param input {@link CurrencyPairReq}
     * @return {@link CurrencyPairRes}
     */
    @Override
    public CurrencyPairRes getCurrencyPair(CurrencyPairReq input) throws ApiException {
        String uri = "/open-api/v1/asset/convert/currency-pair";
        return this.service.invokeAPI(Util.dealGetParams(input, uri), "GET", null, this.accessToken, CurrencyPairRes.class);
    }

    /**
     * Get a estimate quote
     *
     * @param input {@link EstimateQuoteReq}
     * @return {@link EstimateQuoteRes}
     */
    @Override
    public EstimateQuoteRes estimateQuote(EstimateQuoteReq input) throws ApiException {
        String uri = "/open-api/v1/asset/convert/estimate-quote";
        return this.service.invokeAPI(uri, "POST", buildEntity(input), this.accessToken, EstimateQuoteRes.class);
    }

    /**
     * List all trades
     *
     * @param input {@link TradesReq}
     * @return {@link PageRes<Trade>}
     */
    @Override
    public PageRes<Trade> getTrades(TradesReq input) throws ApiException {
        String uri = "/open-api/v1/asset/convert/trades";
        JavaType generic = JsonUtil.getCollectionType(PageRes.class, Trade.class);
        return this.service.invokeAPI(Util.dealGetParams(input, uri), "GET", null, this.accessToken, generic);
    }

    /**
     * Create a trade
     *
     * @param input {@link TradeReq}
     * @return {@link Trade}
     */
    @Override
    public Trade trade(TradeReq input) throws ApiException {
        String uri = "/open-api/v1/asset/convert/trades";
        return this.service.invokeAPI(uri, "POST", buildEntity(input), this.accessToken, Trade.class);
    }

    /**
     * List all Wire bank accounts
     *
     * @param input {@link WiresReq}
     * @return {@link PageRes<Wire>}
     */
    @Override
    public PageRes<Wire> getWires(WiresReq input) throws ApiException {
        String uri = "/open-api/v1/asset/banks/wires";
        JavaType generic = JsonUtil.getCollectionType(PageRes.class, Wire.class);
        return this.service.invokeAPI(Util.dealGetParams(input, uri), "GET", null, this.accessToken, generic);
    }

    /**
     * Create a wire bank account
     *
     * @param input {@link WireReq}
     * @return {@link Wire}
     */
    @Override
    public Wire wire(WireReq input) throws ApiException {
        String uri = "/open-api/v1/asset/banks/wires";
        return this.service.invokeAPI(uri, "POST", buildEntity(input), this.accessToken, Wire.class);
    }

    /**
     * Delete a Wire bank account
     *
     * @param id id
     * @return {@link Boolean}
     */
    @Override
    public Boolean deleteWire(String id) throws ApiException {
        String uri = String.format("/open-api/v1/asset/banks/wires/%s", id);
        return this.service.invokeAPI(uri, "DELETE", null, this.accessToken, Boolean.class);
    }

    /**
     * List all payouts
     *
     * @param input {@link PageRes<Payout>}
     * @return {@link Payout}
     */
    @Override
    public PageRes<Payout> getPayouts(PayoutsReq input) throws ApiException {
        String uri = "/open-api/v1/asset/payouts";
        JavaType generic = JsonUtil.getCollectionType(PageRes.class, Payout.class);
        return this.service.invokeAPI(Util.dealGetParams(input, uri), "GET", null, this.accessToken, generic);
    }

    /**
     * Create a payout
     *
     * @param input {@link PayoutReq}
     * @return {@link Payout}
     */
    @Override
    public Payout payout(PayoutReq input) throws ApiException {
        String uri = "/open-api/v1/asset/payouts";
        return this.service.invokeAPI(uri, "POST", buildEntity(input), this.accessToken, Payout.class);
    }

    /**
     * Get a payout
     *
     * @param id id
     * @return {@link Payout}
     */
    @Override
    public Payout getPayout(String id) throws ApiException {
        String uri = String.format("/open-api/v1/asset/payouts/%s", id);
        return this.service.invokeAPI(uri, "GET", null, this.accessToken, Payout.class);
    }
}
