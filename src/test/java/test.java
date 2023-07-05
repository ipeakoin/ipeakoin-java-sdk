import com.ipeakoin.dto.ApiException;
import com.ipeakoin.dto.ApiResponse;
import com.ipeakoin.dto.res.RefreshAccessTokenRes;
import com.ipeakoin.service.Client;

public class test {
    private static Client service = new Client.Builder()
            .config("ipeakoin1ab59eccfbc78d1b", "93fc39d77ef6a3a7b5f26b83fbbebe81", "http://127.0.0.1:3000")
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