package com.ipeakoin.service.v2;

import com.ipeakoin.dto.ApiException;
import com.ipeakoin.dto.ApiResponse;
import com.ipeakoin.dto.req.v2.CardInfoReq;
import com.ipeakoin.dto.req.v2.CardsReq;
import com.ipeakoin.dto.req.v2.UpdateCardReq;
import com.ipeakoin.dto.res.ListRes;
import com.ipeakoin.dto.res.v2.CardInfo;
import com.ipeakoin.dto.res.v2.CardInfoRes;

/**
 * @author klover
 * @description Card
 * @date 2023/7/21 9:33
 */
public interface Card {
    /**
     * List all cards
     *
     * @param input {@link CardsReq}
     * @return {@link ListRes<CardInfo>}
     * @throws ApiException
     */
    ApiResponse<ListRes<CardInfo>> getCards(CardsReq input) throws ApiException;

    /**
     * List all cards
     *
     * @param input {@link CardInfoReq}
     * @return {@link CardInfoRes}
     * @throws ApiException
     */
    ApiResponse<CardInfoRes> getCard(CardInfoReq input) throws ApiException;

    /**
     * Update card
     *
     * @param input {@link UpdateCardReq}
     * @return {@link Boolean}
     * @throws ApiException
     */
    ApiResponse<Boolean> updateCard(UpdateCardReq input) throws ApiException;
}
