package com.mahmoudsaad.xarkas.di.module;

import android.content.Context;

import androidx.appcompat.app.AppCompatActivity;

import com.mahmoudsaad.xarkas.di.ActivityContext;
import com.mahmoudsaad.xarkas.di.PerActivity;
import com.mahmoudsaad.xarkas.ui.login.LoginMvpPresenter;
import com.mahmoudsaad.xarkas.ui.login.LoginMvpView;
import com.mahmoudsaad.xarkas.ui.login.LoginPresenter;
import com.mahmoudsaad.xarkas.ui.register.RegisterMvpPresenter;
import com.mahmoudsaad.xarkas.ui.register.RegisterMvpView;
import com.mahmoudsaad.xarkas.ui.register.RegisterPresenter;
import com.mahmoudsaad.xarkas.ui.splash.SplashMvpPresenter;
import com.mahmoudsaad.xarkas.ui.splash.SplashMvpView;
import com.mahmoudsaad.xarkas.ui.splash.SplashPresenter;
import com.mahmoudsaad.xarkas.utils.rx.AppSchedulerProvider;
import com.mahmoudsaad.xarkas.utils.rx.SchedulerProvider;

import dagger.Module;
import dagger.Provides;
import io.reactivex.disposables.CompositeDisposable;

/**
 * Created on : August 21, 2020
 * Author     : mahmoud saad
 * Email    : mahmoud1saad2@gmail.com
 */
@Module
public class ActivityModule {

    private AppCompatActivity mActivity;

    public ActivityModule(AppCompatActivity activity) {
        this.mActivity = activity;
    }

    @Provides
    @ActivityContext
    Context provideContext() {
        return mActivity;
    }

    @Provides
    AppCompatActivity provideActivity() {
        return mActivity;
    }

    @Provides
    CompositeDisposable provideCompositeDisposable() {
        return new CompositeDisposable();
    }


    @Provides
    SchedulerProvider provideSchedulerProvider() {
        return new AppSchedulerProvider();
    }


    @Provides
    @PerActivity
    SplashMvpPresenter<SplashMvpView> provideSplashPresenter(SplashPresenter<SplashMvpView> presenter) {
        return presenter;
    }

    @Provides
    @PerActivity
    RegisterMvpPresenter<RegisterMvpView> provideRegisterPresenter(RegisterPresenter<RegisterMvpView> presenter) {
        return presenter;
    }


    @Provides
    @PerActivity
    LoginMvpPresenter<LoginMvpView> provideLoginPresenter(LoginPresenter<LoginMvpView> presenter) {
        return presenter;
    }


}