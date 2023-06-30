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
implementation group: 'com.ipeakoin', name: 'ipeakoin-sdk', version: '0.0.2-beta'

```

### Maven

Add the following dependencies

```xml
<!-- https://mvnrepository.com/artifact/com.ipeakoin/ipeakoin-sdk -->
<dependency>
    <groupId>com.ipeakoin</groupId>
    <artifactId>ipeakoin-sdk</artifactId>
    <version>0.0.2-beta</version>
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
    public static void main(String[] args) {
        Client service = new Client.Builder().config("ipeakoin1ab59eccfbc78d1b", "93fc39d77ef6a3a7b5f26b83fbbebe81", "http://127.0.0.1:3000").build(false);
        try {
            ApiResponse<CodeRes> code = service.getCode();
            ApiResponse<AccessTokenRes> accessToken = service.getAccessToken(code.getData().getCode());
            // Actively close http Connection pool
            service.closeHttpClient();
            System.out.println(accessToken.getData());
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
    public static void main(String[] args) {
        Client service = new Client.Builder()
                .config("ipeakoin1ab59eccfbc78d1b", "93fc39d77ef6a3a7b5f26b83fbbebe81", "http://127.0.0.1:3000")
                .build();

        try {
            ApiResponse<RefreshAccessTokenRes> res = service.refreshAccessToken("12c4aec847b969b11a610a7ced6027506e88699fc1868893b2396ffb329a01b2");
            System.out.println(res.getData());
        } catch (ApiException e) {
            System.out.println(e.getErrorMessage());
            e.printStackTrace();
        }
    }
}
```

### encrypt Hmac SHA256

```java
        
```

### V1 Interface Example

### V2 Interface Example

## Contact Us

If you find a **BUG** or have any questions or suggestions, please provide feedback through the issue.