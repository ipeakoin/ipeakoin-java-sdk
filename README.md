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
implementation group: 'com.ipeakoin', name: 'ipeakoin-sdk', version: '2.0.0'

```

### Maven

Add the following dependencies

```xml
<!-- https://mvnrepository.com/artifact/com.ipeakoin/ipeakoin-sdk -->
<dependency>
    <groupId>com.ipeakoin</groupId>
    <artifactId>ipeakoin-sdk</artifactId>
    <version>2.0.0</version>
</dependency>

```

## Start Using

### get access token

```java
 private static AuthClient service = new AuthClient.Builder()
        .Credentials("ipeakoin1ab59eccfbc78d1b", "93fc39d77ef6a3a7b5f26b83fbbebe81", "https://api-sandbox.ipeakoin.com")
        .build();


CodeRes res = service.getCode();
AccessTokenRes res = service.getAccessToken(res.getCode());
```

### refresh access token

```java
RefreshAccessTokenRes res = service.refreshAccessToken("74323196942eb80322bdf4fc38383df74946a5d402ecfc789b6f95e30435f6f9");
System.out.println(JsonUtil.toJSONString(res));
```

### encrypt Hmac SHA256

```java
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

String s = encryptHmacSHA256(joinStr(data), "25d55ad283aa400af464c76d713c07ad");
System.out.println(s);
```

## Contact Us

If you find a **BUG** or have any questions or suggestions, please provide feedback through the issue.