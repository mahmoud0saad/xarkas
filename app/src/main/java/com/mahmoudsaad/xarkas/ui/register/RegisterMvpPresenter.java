package com.mahmoudsaad.xarkas.ui.register;

import com.mahmoudsaad.xarkas.ui.base.MvpPresenter;

public interface RegisterMvpPresenter<V extends RegisterMvpView> extends MvpPresenter<V> {

    void onRegisterClick(String email, String phone, String password, String firstName, String lastName);
}
