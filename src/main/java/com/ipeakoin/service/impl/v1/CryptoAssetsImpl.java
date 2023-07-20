package com.ipeakoin.service.impl.v1;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ipeakoin.dto.ApiException;
import com.ipeakoin.dto.ApiResponse;
import com.ipeakoin.dto.req.v1.cryptoAssets.*;
import com.ipeakoin.dto.res.ListRes;
import com.ipeakoin.dto.res.v1.Balance;
import com.ipeakoin.dto.res.v1.card.Budget;
import com.ipeakoin.dto.res.v1.cryptoAssets.*;
import com.ipeakoin.httpclient.constant.Constant;
import com.ipeakoin.httpclient.http.HttpRequestsBase;
import com.ipeakoin.service.v1.CryptoAssets;
import com.ipeakoin.utils.Util;
import org.apache.http.entity.StringEntity;

import java.util.List;
import java.util.Map;

import static com.ipeakoin.utils.Util.*;

/**
 * @author klover
 * @description CryptoAssetsImpl
 * @date 2023/7/17 15:43
 */
public class CryptoAssetsImpl implements CryptoAssets {
    /**
     * http service
     */
    private final HttpRequestsBase service;

    private final ObjectMapper mapper;

    public CryptoAssetsImpl(HttpRequestsBase service, ObjectMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }


    /**
     * List all wallet balances
     *
     * @param input {@link BalanceReq}
     * @return {@link List<Balance>}
     */
    @Override
    public ApiResponse<List<Balance>> getBalances(BalanceReq input) throws ApiException {
        String uri = "/open-api/v1/asset/wallets/balances";

        JavaType generic = mapper.getTypeFactory().constructParametricType(List.class, Balance.class);

        Map<String, Object> map = JsonToMap(mapper, input);

        return this.service.invokeAPI(Util.dealGetParams(map, uri), "GET", null, input.getAccessToken(), returnType(mapper, generic));
    }

    /**
     * List all addresses
     *
     * @param input {@link AddressesReq}
     * @return {@link ListRes<Addresses>}
     */
    @Override
    public ApiResponse<ListRes<Addresses>> getAddresses(AddressesReq input) throws ApiException {
        String uri = "/open-api/v1/asset/wallets/addresses";

        JavaType generic = mapper.getTypeFactory().constructParametricType(ListRes.class, Addresses.class);

        Map<String, Object> map = JsonToMap(mapper, input);

        return this.service.invokeAPI(Util.dealGetParams(map, uri), "GET", null, input.getAccessToken(), returnType(mapper, generic));
    }

    /**
     * Create a blockchain address
     *
     * @param input {@link CreateBlockchainAddressReq}
     * @return {@link ListRes<CreateBlockchainAddressRes>}
     */
    @Override
    public ApiResponse<CreateBlockchainAddressRes> createBlockchainAddress(CreateBlockchainAddressReq input) throws ApiException {
        String uri = "/open-api/v1/asset/wallets/addresses";

        String jsonString = JsonToString(mapper, input);
        StringEntity entity = new StringEntity(jsonString, Constant.CHARSET);

        return this.service.invokeAPI(uri, "POST", entity, input.getAccessToken(), returnType(mapper, CreateBlockchainAddressRes.class));
    }

    /**
     * List all deposit history
     *
     * @param input {@link DepositsReq}
     * @return {@link ListRes<Deposit>}
     */
    @Override
    public ApiResponse<ListRes<Deposit>> getDeposits(DepositsReq input) throws ApiException {
        String uri = "/open-api/v1/asset/wallets/deposits";

        JavaType generic = mapper.getTypeFactory().constructParametricType(ListRes.class, Deposit.class);

        Map<String, Object> map = JsonToMap(mapper, input);

        return this.service.invokeAPI(Util.dealGetParams(map, uri), "GET", null, input.getAccessToken(), returnType(mapper, generic));
    }

    /**
     * List all withdrawal history
     *
     * @param input {@link WithdrawalsReq}
     * @return {@link ListRes<Withdrawal>}
     */
    @Override
    public ApiResponse<ListRes<Withdrawal>> getWithdrawals(WithdrawalsReq input) throws ApiException {
        String uri = "/open-api/v1/asset/wallets/withdrawals";

        JavaType generic = mapper.getTypeFactory().constructParametricType(ListRes.class, Withdrawal.class);

        Map<String, Object> map = JsonToMap(mapper, input);

        return this.service.invokeAPI(Util.dealGetParams(map, uri), "GET", null, input.getAccessToken(), returnType(mapper, generic));
    }

    /**
     * Withdraw coin
     *
     * @param input {@link WithdrawalReq}
     * @return {@link Withdrawal}
     */
    @Override
    public ApiResponse<Withdrawal> withdrawal(WithdrawalReq input) throws ApiException {
        String uri = "/open-api/v1/asset/wallets/withdrawals";

        String jsonString = JsonToString(mapper, input);
        StringEntity entity = new StringEntity(jsonString, Constant.CHARSET);

        return this.service.invokeAPI(uri, "POST", entity, input.getAccessToken(), returnType(mapper, Withdrawal.class));
    }

    /**
     * List all bills
     *
     * @param input {@link BillsReq}
     * @return {@link ListRes<Bill>}
     */
    @Override
    public ApiResponse<ListRes<Bill>> getBills(BillsReq input) throws ApiException {
        String uri = "/open-api/v1/asset/wallets/bills";

        JavaType generic = mapper.getTypeFactory().constructParametricType(ListRes.class, Bill.class);

        Map<String, Object> map = JsonToMap(mapper, input);

        return this.service.invokeAPI(Util.dealGetParams(map, uri), "GET", null, input.getAccessToken(), returnType(mapper, generic));
    }

    /**
     * Get a trade currency pair
     *
     * @param input {@link CurrencyPairReq}
     * @return {@link CurrencyPairRes}
     */
    @Override
    public ApiResponse<CurrencyPairRes> getCurrencyPair(CurrencyPairReq input) throws ApiException {
        String uri = "/open-api/v1/asset/convert/currency-pair";

        Map<String, Object> map = JsonToMap(mapper, input);

        return this.service.invokeAPI(Util.dealGetParams(map, uri), "GET", null, input.getAccessToken(), returnType(mapper, CurrencyPairRes.class));
    }

    /**
     * Get a estimate quote
     *
     * @param input {@link EstimateQuoteReq}
     * @return {@link EstimateQuoteRes}
     */
    @Override
    public ApiResponse<EstimateQuoteRes> estimateQuote(EstimateQuoteReq input) throws ApiException {
        String uri = "/open-api/v1/asset/convert/estimate-quote";

        String jsonString = JsonToString(mapper, input);
        StringEntity entity = new StringEntity(jsonString, Constant.CHARSET);

        return this.service.invokeAPI(uri, "POST", entity, input.getAccessToken(), returnType(mapper, EstimateQuoteRes.class));
    }

    /**
     * List all trades
     *
     * @param input {@link TradesReq}
     * @return {@link ListRes<Trade>}
     */
    @Override
    public ApiResponse<ListRes<Trade>> getTrades(TradesReq input) throws ApiException {
        String uri = "/open-api/v1/asset/convert/trades";

        JavaType generic = mapper.getTypeFactory().constructParametricType(ListRes.class, Trade.class);

        Map<String, Object> map = JsonToMap(mapper, input);

        return this.service.invokeAPI(Util.dealGetParams(map, uri), "GET", null, input.getAccessToken(), returnType(mapper, generic));
    }

    /**
     * Create a trade
     *
     * @param input {@link TradeReq}
     * @return {@link Trade}
     */
    @Override
    public ApiResponse<Trade> trade(TradeReq input) throws ApiException {
        String uri = "/open-api/v1/asset/convert/trades";

        String jsonString = JsonToString(mapper, input);
        StringEntity entity = new StringEntity(jsonString, Constant.CHARSET);

        return this.service.invokeAPI(uri, "POST", entity, input.getAccessToken(), returnType(mapper, Trade.class));
    }

    /**
     * List all Wire bank accounts
     *
     * @param input {@link WiresReq}
     * @return {@link ListRes<Wire>}
     */
    @Override
    public ApiResponse<ListRes<Wire>> getWires(WiresReq input) throws ApiException {
        String uri = "/open-api/v1/asset/banks/wires";

        JavaType generic = mapper.getTypeFactory().constructParametricType(ListRes.class, Wire.class);

        Map<String, Object> map = JsonToMap(mapper, input);

        return this.service.invokeAPI(Util.dealGetParams(map, uri), "GET", null, input.getAccessToken(), returnType(mapper, generic));
    }

    /**
     * Create a wire bank account
     *
     * @param input {@link WireReq}
     * @return {@link Wire}
     */
    @Override
    public ApiResponse<Wire> wire(WireReq input) throws ApiException {
        String uri = "/open-api/v1/asset/banks/wires";

        String jsonString = JsonToString(mapper, input);
        StringEntity entity = new StringEntity(jsonString, Constant.CHARSET);

        return this.service.invokeAPI(uri, "POST", entity, input.getAccessToken(), returnType(mapper, Wire.class));
    }

    /**
     * Delete a Wire bank account
     *
     * @param input {@link DeleteWireReq}
     * @return {@link Boolean}
     */
    @Override
    public ApiResponse<Boolean> deleteWire(DeleteWireReq input) throws ApiException {
        String uri = String.format("/open-api/v1/asset/banks/wires/%s", input.getId());

        return this.service.invokeAPI(uri, "DELETE", null, input.getAccessToken(), returnType(mapper, Boolean.class));
    }

    /**
     * List all payouts
     *
     * @param input {@link PayoutsReq}
     * @return {@link Payout}
     */
    @Override
    public ApiResponse<ListRes<Payout>> getPayouts(PayoutsReq input) throws ApiException {
        String uri = "/open-api/v1/asset/payouts";

        JavaType generic = mapper.getTypeFactory().constructParametricType(ListRes.class, Payout.class);

        Map<String, Object> map = JsonToMap(mapper, input);

        return this.service.invokeAPI(Util.dealGetParams(map, uri), "GET", null, input.getAccessToken(), returnType(mapper, generic));
    }

    /**
     * Create a payout
     *
     * @param input {@link PayoutReq}
     * @return {@link Payout}
     */
    @Override
    public ApiResponse<Payout> payout(PayoutReq input) throws ApiException {
        String uri = "/open-api/v1/asset/payouts";

        String jsonString = JsonToString(mapper, input);
        StringEntity entity = new StringEntity(jsonString, Constant.CHARSET);

        return this.service.invokeAPI(uri, "POST", entity, input.getAccessToken(), returnType(mapper, Payout.class));
    }

    /**
     * Get a payout
     *
     * @param input {@link PayoutInfoReq}
     * @return {@link Payout}
     */
    @Override
    public ApiResponse<Payout> getPayout(PayoutInfoReq input) throws ApiException {
        String uri = String.format("/open-api/v1/asset/payouts/%s", input.getId());

        return this.service.invokeAPI(uri, "GET", null, input.getAccessToken(), returnType(mapper, Payout.class));
    }
}
