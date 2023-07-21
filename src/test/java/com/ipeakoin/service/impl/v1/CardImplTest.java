package com.ipeakoin.service.impl.v1;

import com.ipeakoin.dto.Address;
import com.ipeakoin.dto.ApiException;
import com.ipeakoin.dto.ApiResponse;
import com.ipeakoin.dto.req.DefaultReq;
import com.ipeakoin.dto.req.v1.card.*;
import com.ipeakoin.dto.res.ListRes;
import com.ipeakoin.dto.res.v1.card.*;
import com.ipeakoin.service.Client;
import junit.framework.TestCase;

import java.math.BigDecimal;
import java.util.List;

public class CardImplTest extends TestCase {
    private static Client service = new Client.Builder()
            .config("ipeakoin1ab59eccfbc78d1b", "93fc39d77ef6a3a7b5f26b83fbbebe81", "https://api-sandbox.ipeakoin.com")
            .build();

    private static String accessToken = "af42bf2e75328908c9861aa65b073c06d4c5946a";

    public void testGetBudgets() throws ApiException {
        ApiResponse<ListRes<Budget>> res = service.v1().card().getBudgets(new BudgetsReq() {{
            this.setAccessToken(CardImplTest.accessToken);
        }});
        System.out.println(res);
    }

    public void testUpdateBudget() throws ApiException {
        ApiResponse<Boolean> res = service.v1().card().updateBudget(new UpdateBudgetReq() {{
            this.setAccessToken(CardImplTest.accessToken);
            this.setBudgetId("929c63c9-e318-4a9c-a0b0-5276517edab5");
            this.setName("klover4");
        }});
        System.out.println(res);
    }

    public void testCreateBudget() throws ApiException {
        ApiResponse<String> res = service.v1().card().createBudget(new CreateBudgetReq() {{
            this.setAccessToken(CardImplTest.accessToken);
            this.setName("klover3");
            this.setCost("10");
        }});
        System.out.println(res);
    }

    public void testIncreaseBudgetBalance() throws ApiException {
        ApiResponse<Boolean> res = service.v1().card().increaseBudgetBalance(new IncreaseBudgetBalanceReq() {{
            this.setAccessToken(CardImplTest.accessToken);
            this.setBudgetId("929c63c9-e318-4a9c-a0b0-5276517edab5");
            this.setCost(BigDecimal.valueOf(100));
        }});
        System.out.println(res);
    }

    public void testDecreaseBudgetBalance() throws ApiException {
        ApiResponse<Boolean> res = service.v1().card().decreaseBudgetBalance(new DecreaseBudgetBalanceReq() {{
            this.setAccessToken(CardImplTest.accessToken);
            this.setBudgetId("929c63c9-e318-4a9c-a0b0-5276517edab5");
            this.setCost(BigDecimal.valueOf(10));
        }});

        System.out.println(res);
    }

    public void testGetBudgetTransactions() throws ApiException {
        ApiResponse<ListRes<BudgetTransaction>> res = service.v1().card().getBudgetTransactions(new BudgetTransactionReq() {{
            this.setAccessToken(CardImplTest.accessToken);
            this.setLimit(1);
        }});

        System.out.println(res);
    }

    public void testGetCardBins() throws ApiException {
        ApiResponse<List<CardBin>> res = service.v1().card().getCardBins(new DefaultReq() {{
            this.setAccessToken(CardImplTest.accessToken);
        }});

        System.out.println(res);
    }

    public void testGetCards() throws ApiException {
        ApiResponse<ListRes<CardInfo>> res = service.v1().card().getCards(new CardReq() {{
            this.setAccessToken(CardImplTest.accessToken);
            this.setLimit(1);
        }});
        System.out.println(res);
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
        ApiResponse<Boolean> res = service.v1().card().createCard(new CreateCardReq() {{
            this.setAccessToken(CardImplTest.accessToken);
            this.setType("BudgetCard");
            this.setCardAddress(address);
            this.setBin("493193");
            this.setBatchCount(1);
//            this.setCost(BigDecimal.valueOf(10));
            this.setFirstName("KLOVER");
            this.setLastName("W");
            this.setBudgetId("929c63c9-e318-4a9c-a0b0-5276517edab5");
        }});
        System.out.println(res);
    }

    public void testDeleteCard() throws ApiException {
        ApiResponse<Boolean> res = service.v1().card().deleteCard(new DeleteCardReq() {{
            this.setAccessToken(CardImplTest.accessToken);
            this.setCardId("788b540b-fa00-44a7-b682-b6989e4462fa");
        }});
        System.out.println(res);
    }

    public void testCardTransferIn() throws ApiException {
        ApiResponse<Boolean> res = service.v1().card().cardTransferIn(new CardTransferInReq() {{
            this.setAccessToken(CardImplTest.accessToken);
            this.setCardId("788b540b-fa00-44a7-b682-b6989e4462fa");
            this.setCost(BigDecimal.valueOf(10));
        }});

        System.out.println(res);
    }

    public void testCardTransferOut() throws ApiException {
        ApiResponse<Boolean> res = service.v1().card().cardTransferOut(new CardTransferOutReq() {{
            this.setAccessToken(CardImplTest.accessToken);
            this.setCardId("788b540b-fa00-44a7-b682-b6989e4462fa");
            this.setCost(BigDecimal.valueOf(10));
        }});
        System.out.println(res);
    }

    public void testSuspendCard() throws ApiException {
        ApiResponse<Boolean> res = service.v1().card().suspendCard(new SuspendCardReq() {{
            this.setAccessToken(CardImplTest.accessToken);
            this.setCardId("788b540b-fa00-44a7-b682-b6989e4462fa");
        }});
        System.out.println(res);
    }

    public void testEnableCard() throws ApiException {
        ApiResponse<Boolean> res = service.v1().card().enableCard(new EnableCardReq() {{
            this.setAccessToken(CardImplTest.accessToken);
            this.setCardId("788b540b-fa00-44a7-b682-b6989e4462fa");
        }});
        System.out.println(res);
    }

    public void testVelocityControl() throws ApiException {
        ApiResponse<Boolean> res = service.v1().card().velocityControl(new VelocityControlReq() {{
            this.setAccessToken(CardImplTest.accessToken);
            this.setCardId("168136b1-ab5d-4896-9efa-d9be30b70255");
            this.setType("DAY");
            this.setLimit("100");
        }});
        System.out.println(res);
    }

    public void testFrozenCardBalance() throws ApiException {
        ApiResponse<Boolean> res = service.v1().card().frozenCardBalance(new FrozenCardBalanceReq() {{
            this.setAccessToken(CardImplTest.accessToken);
            this.setCardId("788b540b-fa00-44a7-b682-b6989e4462fa");
            this.setCost(BigDecimal.valueOf(1));
        }});
        System.out.println(res);
    }

    public void testUnfrozenCardBalance() throws ApiException {
        ApiResponse<Boolean> res = service.v1().card().unfrozenCardBalance(new UnfrozenCardBalanceReq() {{
            this.setAccessToken(CardImplTest.accessToken);
            this.setCardId("788b540b-fa00-44a7-b682-b6989e4462fa");
            this.setCost(BigDecimal.valueOf(2));
        }});
        System.out.println(res);
    }

    public void testGetCardPrivateInfo() throws ApiException {
        ApiResponse<CardPrivateInfoReqRes> res = service.v1().card().getCardPrivateInfo(new CardPrivateInfoReq() {{
            this.setAccessToken(CardImplTest.accessToken);
            this.setCardId("788b540b-fa00-44a7-b682-b6989e4462fa");
        }});
        System.out.println(res);
    }

    public void testGetCardTransactions() throws ApiException {
        ApiResponse<ListRes<CardTransaction>> res = service.v1().card().getCardTransactions(new CardTransactionReq() {{
            this.setAccessToken(CardImplTest.accessToken);
            this.setCardId("788b540b-fa00-44a7-b682-b6989e4462fa");
            this.setLimit(1);
        }});
        System.out.println(res);
    }
}