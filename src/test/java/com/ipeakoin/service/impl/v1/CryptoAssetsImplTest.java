package com.ipeakoin.service.impl.v1;

import com.ipeakoin.dto.Address;
import com.ipeakoin.dto.ApiException;
import com.ipeakoin.dto.ApiResponse;
import com.ipeakoin.dto.req.v1.cryptoAssets.*;
import com.ipeakoin.dto.res.ListRes;
import com.ipeakoin.dto.res.v1.Balance;
import com.ipeakoin.dto.res.v1.cryptoAssets.*;
import com.ipeakoin.service.Client;
import junit.framework.TestCase;

import java.math.BigDecimal;
import java.util.List;

public class CryptoAssetsImplTest extends TestCase {
    private static Client service = new Client.Builder()
            .config("ipeakoin1ab59eccfbc78d1b", "93fc39d77ef6a3a7b5f26b83fbbebe81", "https://api-sandbox.ipeakoin.com")
            .build();

    private static String accessToken = "af42bf2e75328908c9861aa65b073c06d4c5946a";

    public void testGetBalances() throws ApiException {
        ApiResponse<List<Balance>> res = service.v1().cryptoAssets().getBalances(new BalanceReq() {{
            this.setAccessToken(CryptoAssetsImplTest.accessToken);
        }});
        System.out.println(res);
    }

    public void testGetAddresses() throws ApiException {
        ApiResponse<ListRes<Addresses>> res = service.v1().cryptoAssets().getAddresses(new AddressesReq() {{
            this.setAccessToken(CryptoAssetsImplTest.accessToken);
            this.setLimit(1);
        }});
        System.out.println(res);
    }

    public void testCreateBlockchainAddress() throws ApiException {
        ApiResponse<CreateBlockchainAddressRes> res = service.v1().cryptoAssets().createBlockchainAddress(new CreateBlockchainAddressReq() {{
            this.setAccessToken(CryptoAssetsImplTest.accessToken);
            this.setCurrency("USDC");
            this.setChain("TRX");
            this.setAccountId("7b26ccd2-cf51-44f5-9426-00cd532ea80c");

        }});
        System.out.println(res);
    }

    public void testGetDeposits() throws ApiException {
        ApiResponse<ListRes<Deposit>> res = service.v1().cryptoAssets().getDeposits(new DepositsReq() {{
            this.setAccessToken(CryptoAssetsImplTest.accessToken);
            this.setLimit(1);
        }});
        System.out.println(res);
    }

    public void testGetWithdrawals() throws ApiException {
        ApiResponse<ListRes<Withdrawal>> res = service.v1().cryptoAssets().getWithdrawals(new WithdrawalsReq() {{
            this.setAccessToken(CryptoAssetsImplTest.accessToken);
            this.setLimit(1);
        }});
        System.out.println(res);
    }

    public void testWithdrawal() throws ApiException {
        ApiResponse<Withdrawal> res = service.v1().cryptoAssets().withdrawal(new WithdrawalReq() {{
            this.setAccessToken(CryptoAssetsImplTest.accessToken);
            this.setAddress("TYc4k8chg3GkczmcWtscwS6pHfa864Mi75");
            this.setChain("TRX");
            this.setCurrency("USDC");
            this.setAmount(BigDecimal.valueOf(1).toString());
        }});
        System.out.println(res);
    }

    public void testGetBills() throws ApiException {
        ApiResponse<ListRes<Bill>> res = service.v1().cryptoAssets().getBills(new BillsReq() {{
            this.setAccessToken(CryptoAssetsImplTest.accessToken);
            this.setLimit(1);
        }});
        System.out.println(res);
    }

    public void testGetCurrencyPair() throws ApiException {
        ApiResponse<CurrencyPairRes> res = service.v1().cryptoAssets().getCurrencyPair(new CurrencyPairReq() {{
            this.setAccessToken(CryptoAssetsImplTest.accessToken);
            this.setToCurrency("BTC");
            this.setFromCurrency("USDT");
        }});
        System.out.println(res);
    }

    public void testEstimateQuote() throws ApiException {
        ApiResponse<EstimateQuoteRes> res = service.v1().cryptoAssets().estimateQuote(new EstimateQuoteReq() {{
            this.setAccessToken(CryptoAssetsImplTest.accessToken);
            this.setBaseCurrency("USDC");
            this.setQuoteCurrency("USD");
            this.setSide("sell");
            this.setRfqAmount(BigDecimal.valueOf(20).toString());
            this.setRfqCurrency("USD");
        }});
        System.out.println(res);
    }

    public void testGetTrades() throws ApiException {
        ApiResponse<ListRes<Trade>> res = service.v1().cryptoAssets().getTrades(new TradesReq() {{
            this.setAccessToken(CryptoAssetsImplTest.accessToken);
            this.setLimit(1);
        }});
        System.out.println(res);
    }

    public void testTrade() throws ApiException {
        ApiResponse<Trade> res = service.v1().cryptoAssets().trade(new TradeReq() {{
            this.setAccessToken(CryptoAssetsImplTest.accessToken);
            this.setBaseCurrency("USDC");
            this.setQuoteCurrency("USD");
            this.setSide("sell");
            this.setRfqAmount(BigDecimal.valueOf(20).toString());
            this.setRfqCurrency("USD");
            this.setQuoteId("8d49f190-030c-44e4-9bb9-9a1e76dfb7d4");
        }});
        System.out.println(res);
    }

    public void testGetWires() throws ApiException {
        ApiResponse<ListRes<Wire>> res = service.v1().cryptoAssets().getWires(new WiresReq() {{
            this.setAccessToken(CryptoAssetsImplTest.accessToken);
            this.setLimit(1);
        }});
        System.out.println(res);
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
        ApiResponse<Wire> res = service.v1().cryptoAssets().wire(new WireReq() {{
            this.setAccessToken(CryptoAssetsImplTest.accessToken);
            this.setFirstName("first");
            this.setLastName("lastName");
            this.setAccountNumber("1112356456");
            this.setBank(bank);
            this.setBillingAddress(address);
        }});
        System.out.println(res);
    }

    public void testDeleteWire() throws ApiException {
        ApiResponse<Boolean> res = service.v1().cryptoAssets().deleteWire(new DeleteWireReq() {{
            this.setAccessToken(CryptoAssetsImplTest.accessToken);
            this.setId("a4875990-2e08-4215-91ee-230672bee74a");
        }});
        System.out.println(res);
    }

    public void testGetPayouts() throws ApiException {
        ApiResponse<ListRes<Payout>> res = service.v1().cryptoAssets().getPayouts(new PayoutsReq() {{
            this.setAccessToken(CryptoAssetsImplTest.accessToken);
            this.setLimit(1);
        }});
        System.out.println(res);
    }

    public void testPayout() throws ApiException {
        ApiResponse<Payout> res = service.v1().cryptoAssets().payout(new PayoutReq() {{
            this.setAccessToken(CryptoAssetsImplTest.accessToken);
            this.setWireId("1bc20e9c-b554-421f-b1d1-981457196e87");
            this.setAmount("1");
        }});
        System.out.println(res);
    }

    public void testGetPayout() throws ApiException {
        ApiResponse<Payout> res = service.v1().cryptoAssets().getPayout(new PayoutInfoReq() {{
            this.setAccessToken(CryptoAssetsImplTest.accessToken);
            this.setId("d2043a44-5c14-47a2-93d7-d1e5aa6e3986");
        }});
        System.out.println(res);
    }
}