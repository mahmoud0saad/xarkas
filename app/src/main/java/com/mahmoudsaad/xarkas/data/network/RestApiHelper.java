package com.mahmoudsaad.xarkas.data.network;

import com.mahmoudsaad.xarkas.data.network.pojo.LoginResponse;
import com.mahmoudsaad.xarkas.data.network.pojo.RegisterResponse;

import io.reactivex.Single;

public interface RestApiHelper {

    Single<LoginResponse> doLoginApiCall(String emailOrPhone,
                                         String password);

    Single<RegisterResponse> doRegisterApiCall(String firstName,
                                               String lastName,
                                               String email,
                                               String phone,
                                               String password);
}
