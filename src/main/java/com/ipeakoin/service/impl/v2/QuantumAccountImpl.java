package com.ipeakoin.service.impl.v2;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ipeakoin.dto.ApiException;
import com.ipeakoin.dto.ApiResponse;
import com.ipeakoin.dto.req.v2.AccountTxReq;
import com.ipeakoin.dto.req.v2.AccountTxsReq;
import com.ipeakoin.dto.res.ListRes;
import com.ipeakoin.dto.res.v2.AccountTxInfo;
import com.ipeakoin.httpclient.http.HttpRequestsBase;
import com.ipeakoin.service.v2.QuantumAccount;
import com.ipeakoin.utils.Util;

import java.util.Map;

import static com.ipeakoin.utils.Util.JsonToMap;
import static com.ipeakoin.utils.Util.returnType;

/**
 * QuantumAccountImpl
 *
 * @author klover
 * @date 2023/12/27 20:18
 */
public class QuantumAccountImpl implements QuantumAccount {
    /**
     * http service
     */
    private final HttpRequestsBase service;

    private final ObjectMapper mapper;

    public QuantumAccountImpl(HttpRequestsBase service, ObjectMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    /**
     * List all quantum account transactions
     *
     * @param input {@link AccountTxsReq}
     * @return {@link ListRes < AccountTxInfo >}
     * @throws ApiException
     */
    @Override
    public ApiResponse<ListRes<AccountTxInfo>> getAccountTransactions(AccountTxsReq input) throws ApiException {
        String uri = "/open-api/v2/quantum-account/transactions";

        JavaType generic = mapper.getTypeFactory().constructParametricType(ListRes.class, AccountTxInfo.class);

        Map<String, Object> map = JsonToMap(mapper, input);

        return this.service.invokeAPI(Util.dealGetParams(map, uri), "GET", null, input.getAccessToken(), returnType(mapper, generic));
    }

    /**
     * Get a quantum account transaction
     *
     * @param input {@link AccountTxsReq}
     * @return {@link AccountTxInfo}
     * @throws ApiException
     */
    @Override
    public ApiResponse<AccountTxInfo> getAccountTransaction(AccountTxReq input) throws ApiException {
        String uri = String.format("/open-api/v2/quantum-account/transactions/%s", input.getId());

        return this.service.invokeAPI(uri, "GET", null, input.getAccessToken(), returnType(mapper, AccountTxInfo.class));
    }
}
