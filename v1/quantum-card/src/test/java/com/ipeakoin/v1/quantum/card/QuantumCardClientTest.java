package com.ipeakoin.v1.quantum.card;

import com.ipeakoin.http.client.dto.res.ApiException;
import com.ipeakoin.utils.JsonUtil;
import com.ipeakoin.utils.entity.Address;
import com.ipeakoin.utils.res.PageRes;
import com.ipeakoin.v1.quantum.card.dto.entity.*;
import com.ipeakoin.v1.quantum.card.dto.req.*;
import com.ipeakoin.v1.quantum.card.dto.res.CardPrivateInfoReqRes;
import com.ipeakoin.v1.quantum.card.dto.res.CreateCardCheckRes;
import junit.framework.TestCase;

import java.util.List;

public class QuantumCardClientTest extends TestCase {
    private static QuantumCardClient service = new QuantumCardClient.Builder()
            .Credentials("http://127.0.0.1:3000")
            .build();

    static {
        service.setAccessToken("d14652e68bb45196f191eec0b35cdadac4ca3b45");
    }

    public void testGetBudgets() throws ApiException {
        PageRes<Budget> res = service.getBudgets(null);
        System.out.println(JsonUtil.toJSONString(res));
    }

    public void testUpdateBudget() throws ApiException {
        Boolean res = service.updateBudget("929c63c9-e318-4a9c-a0b0-5276517edab5", "klover5");
        System.out.println(res);
    }

    public void testCreateBudget() throws ApiException {
        String res = service.createBudget(new CreateBudgetReq() {{
            this.setName("klover6");
            this.setCost("10");
        }});
        System.out.println(res);
    }

    public void testIncreaseBudgetBalance() throws ApiException {
        Boolean res = service.increaseBudgetBalance(new IncreaseBudgetBalanceReq() {{
            this.setBudgetId("c0acf51f-8120-466e-8b7c-b2787784e65e");
            this.setCost(100);
        }});
        System.out.println(res);
    }

    public void testDecreaseBudgetBalance() throws ApiException {
        Boolean res = service.decreaseBudgetBalance(new DecreaseBudgetBalanceReq() {{
            this.setBudgetId("929c63c9-e318-4a9c-a0b0-5276517edab5");
            this.setCost(10);
        }});
        System.out.println(res);
    }

    public void testGetBudgetTransactions() throws ApiException {
        PageRes<BudgetTransaction> res = service.getBudgetTransactions(new BudgetTransactionReq() {{
            this.setLimit(1);
        }});
        System.out.println(JsonUtil.toJSONString(res));
    }

    public void testGetCardBins() throws ApiException {
        List<CardBin> res = service.getCardBins();
        System.out.println(JsonUtil.toJSONString(res));
    }

    public void testGetCards() throws ApiException {
        PageRes<Card> res = service.getCards(null);
        System.out.println(JsonUtil.toJSONString(res));
    }

    public void testCreateCard() throws ApiException {
        Address address = new Address() {{
            this.setAddressLine1("39.No");
            this.setAddressLine2("");
            this.setCity("hangzhou");
            this.setCountry("CN");
            this.setPostalCode("330000");
            this.setState("zhejiang");
        }};
        Boolean res = service.createCard(new CreateCardReq() {{
            this.setType("BudgetCard");
            this.setCardAddress(address);
            this.setBin("489683");
            this.setBatchCount(1);
//            this.setCost(BigDecimal.valueOf(10));
            this.setFirstName("KLOVER");
            this.setLastName("W");
            this.setBudgetId("929c63c9-e318-4a9c-a0b0-5276517edab5");
        }});
        System.out.println(res);
    }

    public void testCreateCardCheck() throws ApiException {
        Address address = new Address() {{
            this.setAddressLine1("39.No");
            this.setAddressLine2("");
            this.setCity("hangzhou");
            this.setCountry("CN");
            this.setPostalCode("330000");
            this.setState("zhejiang");
        }};
        List<CreateCardCheckRes> res = service.createCardCheck(new CreateCardReq() {{
            this.setType("BudgetCard");
            this.setCardAddress(address);
            this.setBin("489683");
            this.setBatchCount(1);
//            this.setCost(BigDecimal.valueOf(10));
            this.setFirstName("KLOVER");
            this.setLastName("W");
            this.setBudgetId("929c63c9-e318-4a9c-a0b0-5276517edab5");
        }});
        System.out.println(JsonUtil.toJSONString(res));
    }

    public void testDeleteCard() throws ApiException {
        Boolean res = service.deleteCard("81357689-4116-439b-b9e7-225c02da4e42");
        System.out.println(res);
    }

    public void testCardTransferIn() throws ApiException {
        Boolean res = service.cardTransferIn(new CardTransferInReq() {{
            this.setCardId("788b540b-fa00-44a7-b682-b6989e4462fa");
            this.setCost(10);
        }});
        System.out.println(res);
    }

    public void testCardTransferOut() throws ApiException {
        Boolean res = service.cardTransferOut(new CardTransferOutReq() {{
            this.setCardId("788b540b-fa00-44a7-b682-b6989e4462fa");
            this.setCost(10);
        }});
        System.out.println(res);
    }

    public void testSuspendCard() throws ApiException {
        Boolean res = service.suspendCard("788b540b-fa00-44a7-b682-b6989e4462fa");
        System.out.println(res);
    }

    public void testEnableCard() throws ApiException {
        Boolean res = service.enableCard("788b540b-fa00-44a7-b682-b6989e4462fa");
        System.out.println(res);
    }

    public void testVelocityControl() throws ApiException {
        Boolean res = service.velocityControl(new VelocityControlReq() {{
            this.setCardId("168136b1-ab5d-4896-9efa-d9be30b70255");
            this.setType("DAY");
            this.setLimit("100");
        }});
        System.out.println(res);
    }

    public void testFrozenCardBalance() throws ApiException {
        Boolean res = service.frozenCardBalance(new FrozenCardBalanceReq() {{
            this.setCardId("788b540b-fa00-44a7-b682-b6989e4462fa");
            this.setCost(1);
            this.setClientTransactionId("113412341");
        }});
        System.out.println(res);
    }

    public void testUnfrozenCardBalance() throws ApiException {
        Boolean res = service.unfrozenCardBalance(new UnfrozenCardBalanceReq() {{
            this.setCardId("788b540b-fa00-44a7-b682-b6989e4462fa");
            this.setCost(1);
            this.setClientTransactionId("141");
        }});
        System.out.println(res);
    }

    public void testGetCardPrivateInfo() throws ApiException {
        CardPrivateInfoReqRes res = service.getCardPrivateInfo("168136b1-ab5d-4896-9efa-d9be30b70255");
        System.out.println(JsonUtil.toJSONString(res));
    }

    public void testGetCardTransactions() throws ApiException {
        PageRes<CardTransaction> res = service.getCardTransactions(null);
        System.out.println(JsonUtil.toJSONString(res));
    }
}