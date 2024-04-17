package com.ipeakoin.v1.crypto.assets;

import com.ipeakoin.http.client.dto.res.ApiException;
import com.ipeakoin.utils.JsonUtil;
import com.ipeakoin.utils.entity.Address;
import com.ipeakoin.utils.res.PageRes;
import com.ipeakoin.v1.crypto.assets.dto.entity.*;
import com.ipeakoin.v1.crypto.assets.dto.req.*;
import com.ipeakoin.v1.crypto.assets.dto.res.CreateBlockchainAddressRes;
import com.ipeakoin.v1.crypto.assets.dto.res.CurrencyPairRes;
import com.ipeakoin.v1.crypto.assets.dto.res.EstimateQuoteRes;
import junit.framework.TestCase;

import java.math.BigDecimal;
import java.util.List;

public class CryptoAssetsClientTest extends TestCase {
    private static CryptoAssetsClient service = new CryptoAssetsClient.Builder()
            .Credentials("http://127.0.0.1:3000")
            .build();

    static {
        service.setAccessToken("d14652e68bb45196f191eec0b35cdadac4ca3b45");
    }

    public void testGetBalances() throws ApiException {
        List<Balance> res = service.getBalances(null);
        System.out.println(JsonUtil.toJSONString(res));
    }

    public void testGetAddresses() throws ApiException {
        PageRes<Addresses> res = service.getAddresses(null);
        System.out.println(JsonUtil.toJSONString(res));
    }

    public void testCreateBlockchainAddress() throws ApiException {
        CreateBlockchainAddressRes res = service.createBlockchainAddress(new CreateBlockchainAddressReq() {{
            this.setCurrency("USDC");
            this.setChain("TRX");
            this.setAccountId("c0e0822d-5e73-4f8d-9805-4b0814812dbe");
        }});
        System.out.println(JsonUtil.toJSONString(res));
    }

    public void testGetDeposits() throws ApiException {
        PageRes<Deposit> res = service.getDeposits(null);
        System.out.println(JsonUtil.toJSONString(res));
    }

    public void testGetWithdrawals() throws ApiException {
        PageRes<Withdrawal> res = service.getWithdrawals(null);
        System.out.println(JsonUtil.toJSONString(res));
    }

    public void testWithdrawal() throws ApiException {
        Withdrawal res = service.withdrawal(new WithdrawalReq() {{
            this.setAddress("TYc4k8chg3GkczmcWtscwS6pHfa864Mi75");
            this.setChain("TRX");
            this.setCurrency("USDC");
            this.setAmount(BigDecimal.valueOf(1));
        }});
        System.out.println(JsonUtil.toJSONString(res));
    }

    public void testGetBills() throws ApiException {
        PageRes<Bill> res = service.getBills(null);
        System.out.println(JsonUtil.toJSONString(res));
    }

    public void testGetCurrencyPair() throws ApiException {
        CurrencyPairRes res = service.getCurrencyPair(new CurrencyPairReq() {{
            this.setToCurrency("BTC");
            this.setFromCurrency("USDT");
        }});
        System.out.println(JsonUtil.toJSONString(res));
    }

    public void testEstimateQuote() throws ApiException {
        EstimateQuoteRes res = service.estimateQuote(new EstimateQuoteReq() {{
            this.setBaseCurrency("USDC");
            this.setQuoteCurrency("USD");
            this.setSide("sell");
            this.setRfqAmount(BigDecimal.valueOf(20));
            this.setRfqCurrency("USD");
        }});
        System.out.println(JsonUtil.toJSONString(res));
    }

    public void testGetTrades() throws ApiException {
        PageRes<Trade> res = service.getTrades(null);
        System.out.println(JsonUtil.toJSONString(res));
    }

    public void testTrade() throws ApiException {
        Trade res = service.trade(new TradeReq() {{
            this.setBaseCurrency("USDC");
            this.setQuoteCurrency("USD");
            this.setSide("sell");
            this.setRfqAmount(BigDecimal.valueOf(20));
            this.setRfqCurrency("USD");
            this.setQuoteId("8d49f190-030c-44e4-9bb9-9a1e76dfb7d4");
        }});
        System.out.println(JsonUtil.toJSONString(res));
    }

    public void testGetWires() throws ApiException {
        PageRes<Wire> res = service.getWires(null);
        System.out.println(JsonUtil.toJSONString(res));
    }

    public void testWire() throws ApiException {
        Bank bank = new Bank() {{
            this.setCity("HZ");
            this.setBankName("平安银行");
            this.setCountry("CN");
        }};
        Address address = new Address() {{
            this.setAddressLine1("39.No");
            this.setAddressLine2("");
            this.setCity("hangzhou");
            this.setCountry("CN");
            this.setPostalCode("330000");
            this.setDistrict("ZJ");
        }};
        Wire res = service.wire(new WireReq() {{
            this.setFirstName("first");
            this.setLastName("lastName");
            this.setAccountNumber("1112356458");
            this.setBank(bank);
            this.setBillingAddress(address);
        }});
        System.out.println(JsonUtil.toJSONString(res));
    }

    public void testDeleteWire() throws ApiException {
        Boolean res = service.deleteWire("a4875990-2e08-4215-91ee-230672bee74a");
        System.out.println(res);
    }

    public void testGetPayouts() throws ApiException {
        PageRes<Payout> res = service.getPayouts(null);
        System.out.println(JsonUtil.toJSONString(res));
    }

    public void testPayout() throws ApiException {
        Payout res = service.payout(new PayoutReq() {{
            this.setWireId("1bc20e9c-b554-421f-b1d1-981457196e87");
            this.setAmount(BigDecimal.valueOf(1));
        }});
        System.out.println(JsonUtil.toJSONString(res));
    }

    public void testGetPayout() throws ApiException {
        Payout res = service.getPayout("d2043a44-5c14-47a2-93d7-d1e5aa6e3986");
        System.out.println(JsonUtil.toJSONString(res));
    }
}