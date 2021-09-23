package goal.pay.Config;

import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

public class RetrofitConfig {
        private final Retrofit retrofit;
        public RetrofitConfig() {
            this.retrofit = new Retrofit.Builder()
                    .baseUrl("http://192.168.42.239:62342/goalpay/api/")
                    .addConverterFactory(JacksonConverterFactory.create())
                    .build();
        }

        public ApiGoalPay useApiGoalPay() {
            return this.retrofit.create(ApiGoalPay.class);
        }

}
