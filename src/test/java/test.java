import com.ipeakoin.dto.ApiException;
import com.ipeakoin.dto.ApiResponse;
import com.ipeakoin.dto.req.DefaultReq;
import com.ipeakoin.dto.res.v1.AccountFeeRatesRes;
import com.ipeakoin.service.Client;

import java.util.List;

public class test {
    private static Client service = new Client.Builder()
            .config("ipeakoin1ab59eccfbc78d1b", "93fc39d77ef6a3a7b5f26b83fbbebe81", "http://127.0.0.1:3000")
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