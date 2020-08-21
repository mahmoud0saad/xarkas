package com.mahmoudsaad.xarkas.ui.register;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.textfield.TextInputEditText;
import com.mahmoudsaad.xarkas.R;
import com.mahmoudsaad.xarkas.ui.base.BaseActivity;
import com.mahmoudsaad.xarkas.utils.CommonUtils;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * A login screen that offers login via email/password.
 */
public class RegisterActivity extends BaseActivity implements RegisterMvpView {

    public static String INTENT_KEY_CONDITIONS_URL = "KEY_CONDITIONS_URL";
    @Inject
    RegisterMvpPresenter<RegisterMvpView> mPresenter;
    @BindView(R.id.et_full_name)
    TextInputEditText etFirstName;
    @BindView(R.id.et_email)
    TextInputEditText etEmail;
    @BindView(R.id.et_phone)
    TextInputEditText etPhone;
    @BindView(R.id.et_password)
    TextInputEditText etPassword;
    @BindView(R.id.et_last_name)
    TextInputEditText etLastName;


    public static Intent getStartIntent(Context context) {
        return new Intent(context, RegisterActivity.class);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        ButterKnife.bind(this);
        getActivityComponent().inject(this);
        mPresenter.onAttach(RegisterActivity.this);
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

    @OnClick({R.id.btn_continue})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_continue:

                if (etFirstName.getText().toString().trim().isEmpty()) {
                    showMessage(R.string.input_empty_name);
                    return;
                }

                if (etEmail.getText().toString().trim().isEmpty()) {
                    showMessage(R.string.empty_email);
                    return;
                }
                if (etPhone.getText().toString().trim().isEmpty()) {
                    showMessage(R.string.input_empty_phone);
                    return;
                }
                if (etFirstName.getText().toString().trim().isEmpty()) {
                    showMessage(R.string.input_empty_name);
                    return;
                }

                if (!CommonUtils.isEmailValid(etEmail.getText().toString().trim())) {
                    showMessage(R.string.error_invalid_email);
                    return;
                }
                if (!CommonUtils.isValidPhoneNumber(etPhone.getText().toString().trim())) {
                    showMessage(R.string.error_invalid_email_phone);
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

                mPresenter.onRegisterClick(
                        etEmail.getText().toString(),
                        etPhone.getText().toString(),
                        etPassword.getText().toString(),
                        etFirstName.getText().toString(),
                        etLastName.getText().toString()
                );

                break;


        }
    }


}

