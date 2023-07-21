package com.ipeakoin.service.impl.v2;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ipeakoin.httpclient.http.HttpRequestsBase;
import com.ipeakoin.service.v2.Card;
import com.ipeakoin.service.v2.V2;

/**
 * @author klover
 * description V2
 * date 2023/6/29 16:58
 */
public class V2Impl implements V2 {
    private final HttpRequestsBase service;
    private final ObjectMapper mapper;
    private static volatile Card cardService;


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
}