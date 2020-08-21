package com.mahmoudsaad.xarkas.data.network;

import com.mahmoudsaad.xarkas.data.network.pojo.LoginResponse;
import com.mahmoudsaad.xarkas.data.network.pojo.RegisterResponse;

import javax.inject.Inject;
import javax.inject.Singleton;

import io.reactivex.Single;

@Singleton
public class RestApiManager implements RestApiHelper {

    NetworkService mService;

    @Inject
    public RestApiManager(NetworkService apiService) {
        mService = apiService;
    }

    @Override
    public Single<LoginResponse> doLoginApiCall(String emailOrPhone, String password) {
        return mService.doLoginApiCall(emailOrPhone, password);
    }

    @Override
    public Single<RegisterResponse> doRegisterApiCall(String firstName, String lastName, String email, String phone, String password) {
        return mService.doRegisterApiCall(firstName, lastName, email, phone, password);
    }



}
