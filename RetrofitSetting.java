package app.news.jahesh.retrofitlearning;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Alireza on 6/24/17.
 */
public class RetrofitSetting {

    ApiService apiService ;
    Retrofit retrofit ;

    public RetrofitSetting() {

        OkHttpClient client = new OkHttpClient();

        retrofit = new Retrofit.Builder()
                .baseUrl("http://112.18.1.12/app/")
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        apiService = retrofit.create(ApiService.class);

    }

    public ApiService getApiService() {
        return apiService;
    }

    public Retrofit getRetrofit() {
        return retrofit;
    }
}
