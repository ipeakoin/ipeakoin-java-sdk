<p style="text-align: center;">
  <h1 align="center"><a href="javascript:void(0);">ipeakoin-sdk</a></h1>
</p>

## iPeakoin Concept

The developer API aims to allow enterprises to integrate with iPeakoin systems and easily make it part of their
workflow. This API allows developers to use businesses such as [Global Account], [Crypto Asset], and [Quantum Card].

## Project Status

It supports auth related interfaces and also provides other interfaces required by iPeakoin Api. Please refer to the
following code example for specific usage.

`Notice`：Please ask the professional technical personnel of the merchant to pay attention to the correctness and
compatibility of the system and software, as well as the risks involved when using them.

## Environmental Requirements

+ Java 1.8+

## Install

The latest version has been released on [Maven Central](https://mvnrepository.com/artifact/com.ipeakoin/ipeakoin-sdk).

#### Gradle

Add the following dependencies to your build.gradle file

```groovy
// https://mvnrepository.com/artifact/com.ipeakoin/ipeakoin-sdk
implementation group: 'com.ipeakoin', name: 'ipeakoin-sdk', version: '1.0.0-beta'

```

### Maven

Add the following dependencies

```xml
<!-- https://mvnrepository.com/artifact/com.ipeakoin/ipeakoin-sdk -->
<dependency>
    <groupId>com.ipeakoin</groupId>
    <artifactId>ipeakoin-sdk</artifactId>
    <version>1.0.0-beta</version>
</dependency>

```

## Start Using

### get access token

```java
import com.ipeakoin.dto.ApiException;
import com.ipeakoin.dto.ApiResponse;
import com.ipeakoin.dto.res.AccessTokenRes;
import com.ipeakoin.dto.res.CodeRes;
import com.ipeakoin.service.Client;

public class test {
    private static Client service = new Client.Builder()
            .config("ipeakoin1ab59eccfbc78d1b", "93fc39d77ef6a3a7b5f26b83fbbebe81", "https://api-sandbox.ipeakoin.com")
            .build();

    public static void main(String[] args) {
        try {
            ApiResponse<CodeRes> code = service.getCode();
            ApiResponse<AccessTokenRes> accessToken = service.getAccessToken(code.getContent().getCode());
            System.out.println(accessToken.getContent());
        } catch (ApiException e) {
            System.out.println(e.getErrorMessage());
            e.printStackTrace();
        }
    }
}
```

### refresh access token

```java
import com.ipeakoin.dto.ApiException;
import com.ipeakoin.dto.ApiResponse;
import com.ipeakoin.dto.res.RefreshAccessTokenRes;
import com.ipeakoin.service.Client;

public class test {
    private static Client service = new Client.Builder()
            .config("ipeakoin1ab59eccfbc78d1b", "93fc39d77ef6a3a7b5f26b83fbbebe81", "https://api-sandbox.ipeakoin.com")
            .build();

    public static void main(String[] args) {
        try {
            ApiResponse<RefreshAccessTokenRes> res = service.refreshAccessToken("12c4aec847b969b11a610a7ced6027506e88699fc1868893b2396ffb329a01b2");
            System.out.println(res.getContent());
        } catch (ApiException e) {
            System.out.println(e.getErrorMessage());
            e.printStackTrace();
        }
    }
}
```

### encrypt Hmac SHA256

```java
package com.ipeakoin.utils;

import junit.framework.TestCase;

import java.util.HashMap;
import java.util.Map;

import static com.ipeakoin.utils.HmacCryptoUtil.encryptHmacSHA256;

public class HmacCryptoUtilTest extends TestCase {

    public void testEncryptHmacSHA256() {
        Map<String, String> address = new HashMap<>();
        address.put("addressLine1", "20 Barneson ave");
        address.put("addressLine2", "");
        address.put("city", "San Mateo");
        address.put("country", "US");
        address.put("postalCode", "94402");
        address.put("state", "California");

        Map<String, Object> data = new HashMap<>();
        data.put("id", "b9ce056b-c1f8-4f19-b014-d7be02a54598");
        data.put("accountId", "01eba490-5f9c-48a6-aa2d-7bcfdff0d720");
        data.put("token", "0ef85b24-866f-4c03-a7e8-459e3742642b");
        data.put("status", "Active");
        data.put("currency", "USD");
        data.put("provider", "PrepaidCard_493728");
        data.put("userName", "test test");
        data.put("createTime", "2023-05-31T07:29:46.784Z");
        data.put("qbitCardNoLastFour", "1234");
        data.put("label", "ce08100b-fca8-4a13-bbfc-c381aeaec5d0");
        data.put("useType", "79f22263-a3fe-4347-8a40-2af6bf422839");
        data.put("balanceId", "ab43462f-93b3-4540-8601-11d759948ee7");
        data.put("budgetId", null);
        data.put("cardAddress", address);
        String s = encryptHmacSHA256(data, "25d55ad283aa400af464c76d713c07ad");
        System.out.println(s.equals("178997e5960603afc573a28743d1680e3719a400e83936076f4dae4cb123a35a"));
    }
}
```

### V1 Interface Example

```java
import com.ipeakoin.dto.ApiException;
import com.ipeakoin.dto.ApiResponse;
import com.ipeakoin.dto.req.DefaultReq;
import com.ipeakoin.dto.res.v1.AccountFeeRatesRes;
import com.ipeakoin.service.Client;

import java.util.List;

public class test {
    private static Client service = new Client.Builder()
            .config("ipeakoin1ab59eccfbc78d1b", "93fc39d77ef6a3a7b5f26b83fbbebe81", "https://api-sandbox.ipeakoin.com")
            .build();

    public static void main(String[] args) {
        try {
            ApiResponse<List<AccountFeeRatesRes>> res = service.v1().accountFeeRates(new DefaultReq() {{
                this.setAccessToken("accessToken");
            }});
            System.out.println(res);
            System.out.println(res);
        } catch (ApiException e) {
            System.out.println(e.getErrorMessage());
            e.printStackTrace();
        }
    }
}
```

#### Vl API List

| name                               | func                                                     |
|------------------------------------|----------------------------------------------------------|
| List account fee rates             | service.v1().accountFeeRates(...)                        |
| Create a account                   | service.v1().createAccount(...)                          |
| List all accounts                  | service.v1().getAccounts(...)                            |
| List all users                     | service.v1().getUsers(...)                               |
| Upload file                        | service.v1().uploadFile(...)                             |
| OCR (ID card - Face)               | service.v1().ocrIdCardFace(...)                          |
| OCR (ID card - Back)               | service.v1().ocrIdCardBack(...)                          |
| OCR (Passport)                     | service.v1().ocrPassport(...)                            |
| Submit account KYC                 | service.v1().submitAccountKyc(...)                       |
| Reset account KYC                  | service.v1().resetAccountKyc(...)                        |
| Get a face authentication url      | service.v1().getFaceAuthUrl(...)                         |
| Face authentication                | service.v1().faceAuth(...)                               |
| Get a account KYC                  | service.v1().getAccountKyc(...)                          |
| List all balances                  | service.v1().getBalances(...)                            |
| Create a transfer                  | service.v1().createTransfer(...)                         |
| Get a transfer                     | service.v1().getTransfer(...)                            |
| Trigger webhook                    | service.v1().triggerWebhook(...)                         |
| List all budgets                   | service.v1().card().getBudgets(...)                      |
| Update a budget                    | service.v1().card().updateBudget(...)                    |
| Create a budget                    | service.v1().card().createBudget(...)                    |
| Increase the budget balance        | service.v1().card().increaseBudgetBalance(...)           |
| Decrease the budget balance        | service.v1().card().decreaseBudgetBalance(...)           |
| List all budget transactions       | service.v1().card().getBudgetTransactions(...)           |
| List all available card BIN        | service.v1().card().getCardBins(...)                     |
| List all quantum cards             | service.v1().card().getCards(...)                        |
| Create a quantum card              | service.v1().card().createCard(...)                      |
| Delete quantum card                | service.v1().card().deleteCard(...)                      |
| Quantum card transfer in           | service.v1().card().cardTransferIn(...)                  |
| Quantum card transfer out          | service.v1().card().cardTransferOut(...)                 |
| Frozen quantum card                | service.v1().card().suspendCard(...)                     |
| Unfrozen quantum card              | service.v1().card().enableCard(...)                      |
| Velocity Control                   | service.v1().card().velocityControl(...)                 |
| Frozen quantum card balance        | service.v1().card().frozenCardBalance(...)               |
| Unfrozen quantum card balance      | service.v1().card().unfrozenCardBalance(...)             |
| Get a quantum card private info    | service.v1().card().getCardPrivateInfo(...)              |
| List all quantum card transactions | service.v1().card().getCardTransactions(...)             |
| List all wallet balances           | service.v1().cryptoAssets().getBalances(...)             |
| List all addresses                 | service.v1().cryptoAssets().getAddresses(...)            |
| Create a blockchain address        | service.v1().cryptoAssets().createBlockchainAddress(...) |
| List all deposit history           | service.v1().cryptoAssets().getDeposits(...)             |
| List all withdrawal history        | service.v1().cryptoAssets().getWithdrawals(...)          |
| Withdraw coin                      | service.v1().cryptoAssets().withdrawal(...)              |
| List all bills                     | service.v1().cryptoAssets().getBills(...)                |
| Get a trade currency pair          | service.v1().cryptoAssets().getCurrencyPair(...)         |
| Get a estimate quote               | service.v1().cryptoAssets().estimateQuote(...)           |
| List all trades                    | service.v1().cryptoAssets().getTrades(...)               |
| Create a trade                     | service.v1().cryptoAssets().trade(...)                   |
| List all Wire bank accounts        | service.v1().cryptoAssets().getWires(...)                |
| Create a wire bank account         | service.v1().cryptoAssets().wire(...)                    |
| Delete a Wire bank account         | service.v1().cryptoAssets().deleteWire(...)              |
| List all payouts                   | service.v1().cryptoAssets().getPayouts(...)              |
| Create a payout                    | service.v1().cryptoAssets().payout(...)                  |
| Get a payout                       | service.v1().cryptoAssets().getPayout(...)               |

### V2 Interface Example

```java
import com.ipeakoin.dto.ApiException;
import com.ipeakoin.dto.ApiResponse;
import com.ipeakoin.dto.req.v2.CardsReq;
import com.ipeakoin.dto.res.ListRes;
import com.ipeakoin.dto.res.v2.CardInfo;
import com.ipeakoin.service.Client;

public class test {
    private static Client service = new Client.Builder()
            .config("ipeakoin1ab59eccfbc78d1b", "93fc39d77ef6a3a7b5f26b83fbbebe81", "https://api-sandbox.ipeakoin.com")
            .build();

    public static void main(String[] args) {
        try {
            ApiResponse<ListRes<CardInfo>> res = service.v2().card().getCards(new CardsReq() {{
                this.setAccessToken("accessToken");
                this.setLimit(10);
            }});
            System.out.println(res);
        } catch (ApiException e) {
            System.out.println(e.getErrorMessage());
            e.printStackTrace();
        }
    }
}
```

#### V2 API List

| name           | func                              |
|----------------|-----------------------------------|
| List all cards | service.v2().card().getCards(...) |
| Get a card     | service.v2().card().getCard(...)  |

## Contact Us

If you find a **BUG** or have any questions or suggestions, please provide feedback through the issue.