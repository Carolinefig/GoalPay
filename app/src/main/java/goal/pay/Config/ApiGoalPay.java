package goal.pay.Config;

import goal.pay.Models.Requests.Login;
import goal.pay.Models.Requests.WalletTransfer;
import goal.pay.Models.Responses.UserSession;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ApiGoalPay {

    @POST("auth/login")
    Call<UserSession> Autenticar(@Body Login login);

    @POST("user/wallet/transfer")
    Call<WalletTransfer> ObterSaldo(@Body WalletTransfer model);


}
