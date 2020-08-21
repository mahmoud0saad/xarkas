package com.mahmoudsaad.xarkas.ui.base;

import androidx.annotation.StringRes;

/**
 * Created on : August 21, 2020
 * Author     : mahmoud saad
 * Email    : mahmoud1saad2@gmail.com
 */
public interface MvpView {

    void showLoading();

    void hideLoading();

    void openActivityOnTokenExpire();

    void openLoginActivity();

    void onError(@StringRes int resId);

    void onError(String message);

    void showMessage(String message);

    void showMessage(@StringRes int resId);

    boolean isNetworkConnected();

    void hideKeyboard();


}

