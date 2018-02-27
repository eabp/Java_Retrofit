/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaretrofit.net;

import javaretrofit.net.models.LoginResponses;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import retrofit2.Call;

/**
 *
 * @author Ezequiel
 */
public interface Services {
    @FormUrlEncoded
    @POST("signin")
    Call<LoginResponses> login(@Field("email") String email, @Field("password") String password);
}
