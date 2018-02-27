/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaretrofit;

import javaretrofit.net.RetrofitClient;
import javaretrofit.net.Services;
import javaretrofit.net.models.LoginResponses;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 *
 * @author Ezequiel
 */
public class JavaRetrofit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Services api = RetrofitClient.getAPIService();
        api.login("ezequielandresbp@gmail.com", "123456").enqueue(new Callback<LoginResponses>() {
            @Override
            public void onResponse(Call<LoginResponses> call, Response<LoginResponses> rspns) {
                System.out.println("Responses: " + rspns.body());
            }

            @Override
            public void onFailure(Call<LoginResponses> call, Throwable thrwbl) {
                System.out.println("Excepcion: " + thrwbl.getMessage());
            }
        });
    }
    
}
