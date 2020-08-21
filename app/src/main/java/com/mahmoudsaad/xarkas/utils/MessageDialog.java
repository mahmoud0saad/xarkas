package com.mahmoudsaad.xarkas.utils;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.google.android.material.button.MaterialButton;
import com.mahmoudsaad.xarkas.R;

import java.util.Objects;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MessageDialog extends Dialog {



    @BindView(R.id.tv_message)
    TextView tvMessage;
    @BindView(R.id.btn_ok)
    MaterialButton btnOk;
    private String mMessage;
    private Context mContext;
    private Intent mActionIntent;


    public MessageDialog(@NonNull Context context, String message, Intent okAction) {
        super(context);

        mActionIntent = okAction;
        mContext = context;
        mMessage = message;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.dialog_message);

        Objects.requireNonNull(this.getWindow())
                .setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        ButterKnife.bind(this);

        updateViews();
    }

    private void updateViews() {

        if (!TextUtils.isEmpty(mMessage))
            tvMessage.setText(mMessage);

    }


    @OnClick({R.id.btn_ok})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_ok:
                dismiss();
                if (mActionIntent != null)
                    mContext.startActivity(mActionIntent);
                break;
        }
    }
}
