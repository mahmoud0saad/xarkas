package com.mahmoudsaad.xarkas.ui.login;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.textfield.TextInputEditText;
import com.mahmoudsaad.xarkas.R;
import com.mahmoudsaad.xarkas.ui.base.BaseActivity;
import com.mahmoudsaad.xarkas.ui.register.RegisterActivity;
import com.mahmoudsaad.xarkas.utils.CommonUtils;
import com.mahmoudsaad.xarkas.utils.MessageDialog;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * A login screen that offers login via email/password.
 */
public class LoginActivity extends BaseActivity implements LoginMvpView {

    private static final String TAG = "LoginActivity";

    private static final int RC_SIGN_IN = 9001;

    @BindView(R.id.et_email_or_phone)
    TextInputEditText etEmailOrPhone;
    @BindView(R.id.et_password)
    TextInputEditText etPassword;





    @Inject
    LoginMvpPresenter<LoginMvpView> mPresenter;


    public static Intent getStartIntent(Context context) {
        return new Intent(context, LoginActivity.class);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
        getActivityComponent().inject(this);
        mPresenter.onAttach(LoginActivity.this);
        setUp();
    }

    @Override
    protected void setUp() {



    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mPresenter.onDetach();
    }


    @Override
    public void onLoginSuccess() {
    }



    @OnClick({ R.id.btn_follow,R.id.ll_no_account})
    public void onViewsClicked(View view) {
        switch (view.getId()) {

            case  R.id.ll_no_account:
                startActivity(RegisterActivity.getStartIntent(getApplicationContext()));
                break;
            case R.id.btn_follow:

                if (etEmailOrPhone.getText().toString().trim().isEmpty()) {
                    showMessage(R.string.input_empty_email_phone);
                    return;
                }

                if (etPassword.getText().toString().trim().isEmpty()) {
                    showMessage(R.string.empty_password);
                    return;
                }

                if (etPassword.getText().toString().trim().length() < 6) {
                    showMessage(R.string.error_invalid_password);
                    return;
                }

                if (CommonUtils.isEmailValid(etEmailOrPhone.getText().toString().trim()) ||
                        CommonUtils.isValidPhoneNumber(etEmailOrPhone.getText().toString().trim())) {

                    mPresenter.onLoginClick(etEmailOrPhone.getText().toString().trim(), etPassword.getText().toString().trim());

                } else {

                    showMessage(R.string.error_invalid_email_phone);
                    return;

                }

                break;

        }
    }

    @Override
    public  void showDialog(String message ){
        MessageDialog messageDialog = new MessageDialog(this, message, null);
        messageDialog.show();
    }

}

