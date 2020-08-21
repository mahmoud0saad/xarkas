package com.mahmoudsaad.xarkas.ui.splash;

import android.os.Bundle;
import android.os.Handler;

import com.mahmoudsaad.xarkas.R;
import com.mahmoudsaad.xarkas.ui.base.BaseActivity;
import com.mahmoudsaad.xarkas.ui.login.LoginActivity;

import javax.inject.Inject;

import butterknife.ButterKnife;

/**
 * A login screen that offers login via email/password.
 */
public class SplashActivity extends BaseActivity implements SplashMvpView {

    @Inject
    SplashMvpPresenter<SplashMvpView> mPresenter;

    private static final int SPLASH_TIME_OUT = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        ButterKnife.bind(this);
        getActivityComponent().inject(this);
        mPresenter.onAttach(SplashActivity.this);

        new Handler().postDelayed(this::setUp, SPLASH_TIME_OUT);

    }

    @Override
    protected void setUp() {

        openLogin();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mPresenter.onDetach();
    }



    @Override
    public void openLogin() {
        startActivity(LoginActivity.getStartIntent(this));
        finish();
    }



}

