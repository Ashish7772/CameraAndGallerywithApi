package com.example.cameraandgallery;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {


    private static final String BaseUrl = " https://dev.ecarter.co/api/";
    private  static Retrofit retrofit;

    public static Retrofit getApiClient()
    {
        OkHttpClient client = new OkHttpClient.Builder()
                .addInterceptor(new BasicAuthInterceptor("api@ecarter.co", "J08hEk210D5e1vwjn699Z722r13is348"))
                .build();

        if (retrofit== null)
        {
            retrofit = new Retrofit.Builder().baseUrl(BaseUrl).client(client)
                    .addConverterFactory(GsonConverterFactory.create()).build();
        }
        return retrofit;
    }


}
