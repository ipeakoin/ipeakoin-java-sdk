package com.ipeakoin.service.impl.v2;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.BeanUtil;
import com.ipeakoin.dto.ApiException;
import com.ipeakoin.dto.ApiResponse;
import com.ipeakoin.dto.req.v2.DeleteAccountReq;
import com.ipeakoin.dto.req.v2.UpdateAccountReq;
import com.ipeakoin.dto.res.v1.TransferRes;
import com.ipeakoin.httpclient.constant.Constant;
import com.ipeakoin.httpclient.http.HttpRequestsBase;
import com.ipeakoin.service.v2.Card;
import com.ipeakoin.service.v2.QuantumAccount;
import com.ipeakoin.service.v2.V2;
import com.ipeakoin.utils.Util;
import org.apache.http.entity.StringEntity;

import static com.ipeakoin.utils.Util.JsonToString;
import static com.ipeakoin.utils.Util.returnType;

/**
 * @author klover
 * description V2
 * date 2023/6/29 16:58
 */
public class V2Impl implements V2 {
    private final HttpRequestsBase service;
    private final ObjectMapper mapper;
    private static volatile Card cardService;
    private static volatile QuantumAccount quantumAccountService;


    /**
     * v2
     *
     * @param service http service
     */
    public V2Impl(HttpRequestsBase service, ObjectMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    /**
     * Delete account
     *
     * @param input {@link DeleteAccountReq}
     * @return {@link Boolean}
     * @throws ApiException error
     */
    @Override
    public ApiResponse<Boolean> deleteAccount(DeleteAccountReq input) throws ApiException {
        if (input.getId() == null) {
            throw new ApiException();
        }
        String uri = String.format("/open-api/v2/accounts/%s", input.getId());

        return this.service.invokeAPI(uri, "DELETE", null, input.getAccessToken(), returnType(mapper, Boolean.class));
    }

    /**
     * Update a account
     *
     * @param input {@link UpdateAccountReq}
     * @return {@link Boolean}
     * @throws ApiException error
     */
    @Override
    public ApiResponse<Boolean> updateAccount(UpdateAccountReq input) throws ApiException {
        if (input.getId() == null) {
            throw new ApiException();
        }
        String uri = String.format("/open-api/v2/accounts/%s", input.getId());

        UpdateAccountReq req = input.clone();
        req.setId(null);

        String jsonString = JsonToString(mapper, req);
        StringEntity entity = new StringEntity(jsonString, Constant.CHARSET);

        return this.service.invokeAPI(uri, "PUT", entity, input.getAccessToken(), returnType(mapper, Boolean.class));
    }

    /**
     * card
     *
     * @return {@link Card}
     */
    @Override
    public Card card() {
        if (cardService == null) {
            synchronized (CardImpl.class) {
                if (cardService == null) {
                    cardService = new CardImpl(this.service, this.mapper);
                }
            }
        }
        return cardService;
    }

    /**
     * quantumAccount
     *
     * @return {@link QuantumAccount}
     */
    @Override
    public QuantumAccount quantumAccount() {
        if (quantumAccountService == null) {
            synchronized (QuantumAccountImpl.class) {
                if (quantumAccountService == null) {
                    quantumAccountService = new QuantumAccountImpl(this.service, this.mapper);
                }
            }
        }
        return quantumAccountService;
    }
}