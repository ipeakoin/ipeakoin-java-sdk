package com.ipeakoin.service.impl.v2;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ipeakoin.dto.ApiException;
import com.ipeakoin.dto.ApiResponse;
import com.ipeakoin.dto.req.v2.CardInfoReq;
import com.ipeakoin.dto.req.v2.CardsReq;
import com.ipeakoin.dto.res.ListRes;
import com.ipeakoin.dto.res.v2.CardInfo;
import com.ipeakoin.dto.res.v2.CardInfoRes;
import com.ipeakoin.httpclient.http.HttpRequestsBase;
import com.ipeakoin.service.v2.Card;
import com.ipeakoin.utils.Util;

import java.util.Map;

import static com.ipeakoin.utils.Util.JsonToMap;
import static com.ipeakoin.utils.Util.returnType;

/**
 * @author klover
 * @description CardImpl
 * @date 2023/7/21 9:34
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
     * List all cards
     *
     * @param input {@link CardsReq}
     * @return {@link ListRes < CardInfo >}
     * @throws ApiException
     */
    @Override
    public ApiResponse<ListRes<CardInfo>> getCards(CardsReq input) throws ApiException {
        String uri = "/open-api/v2/cards";

        JavaType generic = mapper.getTypeFactory().constructParametricType(ListRes.class, CardInfo.class);

        Map<String, Object> map = JsonToMap(mapper, input);

        return this.service.invokeAPI(Util.dealGetParams(map, uri), "GET", null, input.getAccessToken(), returnType(mapper, generic));
    }

    /**
     * List all cards
     *
     * @param input {@link CardInfoReq}
     * @return {@link CardInfoRes}
     * @throws ApiException
     */
    @Override
    public ApiResponse<CardInfoRes> getCard(CardInfoReq input) throws ApiException {
        String uri = String.format("/open-api/v2/cards/%s", input.getId());

        return this.service.invokeAPI(uri, "GET", null, input.getAccessToken(), returnType(mapper, CardInfoRes.class));
    }
}
