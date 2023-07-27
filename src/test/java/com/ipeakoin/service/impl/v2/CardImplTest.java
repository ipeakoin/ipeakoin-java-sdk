package com.ipeakoin.service.impl.v2;

import com.ipeakoin.dto.ApiException;
import com.ipeakoin.dto.ApiResponse;
import com.ipeakoin.dto.req.v2.CardInfoReq;
import com.ipeakoin.dto.req.v2.CardsReq;
import com.ipeakoin.dto.req.v2.UpdateCardReq;
import com.ipeakoin.dto.res.ListRes;
import com.ipeakoin.dto.res.v2.CardInfo;
import com.ipeakoin.dto.res.v2.CardInfoRes;
import com.ipeakoin.service.Client;
import junit.framework.TestCase;

public class CardImplTest extends TestCase {
    private static Client service = new Client.Builder()
            .config("ipeakoin1ab59eccfbc78d1b", "93fc39d77ef6a3a7b5f26b83fbbebe81", "https://api-sandbox.ipeakoin.com")
            .build();

    private static String accessToken = "126b01fb256607b7f3b45713501edf33fb94d7be";

    public void testGetCards() throws ApiException {
        ApiResponse<ListRes<CardInfo>> res = service.v2().card().getCards(new CardsReq() {{
            this.setAccessToken(CardImplTest.accessToken);
            this.setLimit(10);
        }});
        System.out.println(res);
    }

    public void testGetCard() throws ApiException {
        ApiResponse<CardInfoRes> res = service.v2().card().getCard(new CardInfoReq() {{
            this.setAccessToken(CardImplTest.accessToken);
            this.setId("168136b1-ab5d-4896-9efa-d9be30b70255");
        }});
        System.out.println(res);
    }

    public void testUpdateCard() throws ApiException {
        ApiResponse<Boolean> res = service.v2().card().updateCard(new UpdateCardReq() {{
            this.setAccessToken(CardImplTest.accessToken);
            this.setId("39ebe743-9ce3-4ed1-b694-fc9fbc096541");
            this.setPhoneCode("86");
            this.setPhone("13112340001");
        }});
        System.out.println(res);
    }
}