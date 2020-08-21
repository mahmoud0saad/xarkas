package com.mahmoudsaad.xarkas.data.network;

import com.mahmoudsaad.xarkas.data.network.pojo.LoginResponse;
import com.mahmoudsaad.xarkas.data.network.pojo.RegisterResponse;

import io.reactivex.Single;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created on : August 21, 2020
 * Author     : mahmoud saad
 * Email    : mahmoud1saad2@gmail.com
 */
public interface NetworkService {

    @FormUrlEncoded
    @POST("signin")
    Single<LoginResponse> doLoginApiCall(@Field("email") String emailOrPhone,
                                         @Field("password") String password);

    @FormUrlEncoded
    @POST("signup")
    Single<RegisterResponse> doRegisterApiCall(@Field("f_name") String firstName,
                                               @Field("l_name") String lastName,
                                               @Field("email") String email,
                                               @Field("phone") String phone,
                                               @Field("password") String password);


}
