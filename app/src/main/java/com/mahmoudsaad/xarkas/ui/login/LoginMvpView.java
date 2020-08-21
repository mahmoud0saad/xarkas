package com.mahmoudsaad.xarkas.ui.login;

import com.mahmoudsaad.xarkas.ui.base.MvpView;

public interface LoginMvpView extends MvpView {
    void onLoginSuccess();

    void showDialog(String message);
}
