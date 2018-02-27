/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaretrofit.net;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 *
 * @author Ezequiel
 */
public class RetrofitClient {

    private static Retrofit retrofit;
    private static final String BASE_URL = "https://task-ar.herokuapp.com/api/";


    private static Retrofit getClient(String baseUrl) {
        if (retrofit == null) {
            
        // Asociamos el interceptor a las peticiones
        OkHttpClient httpClient = new OkHttpClient
                .Builder()
                .build();

            final OkHttpClient client = new OkHttpClient
                    .Builder()
                    .build();

            retrofit = new Retrofit.Builder()
                    .addConverterFactory(GsonConverterFactory.create())
                    .baseUrl(baseUrl)
                    .client(client)
                    .build();
        }
        return retrofit;
    }

    public static Services getAPIService() {
        return RetrofitClient.getClient(BASE_URL).create(Services.class);
    }

}

