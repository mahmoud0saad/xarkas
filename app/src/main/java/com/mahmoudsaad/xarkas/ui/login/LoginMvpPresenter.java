package com.mahmoudsaad.xarkas.ui.login;

import com.mahmoudsaad.xarkas.ui.base.MvpPresenter;

public interface LoginMvpPresenter<V extends LoginMvpView> extends MvpPresenter<V> {
    void onLoginClick(String emailOrPhone, String password);


}
