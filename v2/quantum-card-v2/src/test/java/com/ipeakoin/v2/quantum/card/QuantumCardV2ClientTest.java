package com.ipeakoin.v2.quantum.card;

import com.ipeakoin.http.client.dto.res.ApiException;
import com.ipeakoin.utils.JsonUtil;
import com.ipeakoin.utils.res.PageRes;
import com.ipeakoin.v2.quantum.card.dto.entity.AccountTransaction;
import com.ipeakoin.v2.quantum.card.dto.entity.Card;
import junit.framework.TestCase;

public class QuantumCardV2ClientTest extends TestCase {
    private static QuantumCardV2Client service = new QuantumCardV2Client.Builder()
            .Credentials("http://127.0.0.1:3000")
            .build();

    static {
        service.setAccessToken("d14652e68bb45196f191eec0b35cdadac4ca3b45");
    }

    public void testGetCards() throws ApiException {
        PageRes<Card> res = service.getCards(null);
        System.out.println(JsonUtil.toJSONString(res));
    }

    public void testGetCard()throws ApiException {
        Card res = service.getCard("81357689-4116-439b-b9e7-225c02da4e42");
        System.out.println(JsonUtil.toJSONString(res));
    }

    public void testGetAccountTransactions() throws ApiException{
        AccountTransaction res = service.getAccountTransaction("5563a26d-5c99-4a08-a8c7-36a2fe35b652");
        System.out.println(JsonUtil.toJSONString(res));
    }

    public void testGetAccountTransaction() throws ApiException{
        PageRes<AccountTransaction> res = service.getAccountTransactions(null);
        System.out.println(JsonUtil.toJSONString(res));
    }
}