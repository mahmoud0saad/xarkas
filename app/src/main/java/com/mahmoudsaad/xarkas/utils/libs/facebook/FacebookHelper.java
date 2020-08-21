package com.mahmoudsaad.xarkas.utils.libs.facebook;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import androidx.annotation.CheckResult;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.login.LoginManager;
import com.facebook.login.LoginResult;

import org.json.JSONObject;

import java.util.Arrays;

public class FacebookHelper {
    private FacebookListener mListener;
    private CallbackManager mCallBackManager;

    public FacebookHelper(@NonNull FacebookListener facebookListener) {
        mListener = facebookListener;
        mCallBackManager = CallbackManager.Factory.create();
        FacebookCallback<LoginResult> mCallBack = new FacebookCallback<LoginResult>() {
            @Override
            public void onSuccess(final LoginResult loginResult) {
                GraphRequest request = GraphRequest.newMeRequest(loginResult.getAccessToken(), new GraphRequest.GraphJSONObjectCallback() {
                    @Override
                    public void onCompleted(JSONObject object, GraphResponse response) {
                        Log.v("UserProfileActivity", response.toString());

                        mListener.onFbSignInSuccess(loginResult.getAccessToken().getToken(),
                                response);

                    }
                });
                Bundle parameters = new Bundle();
                parameters.putString("fields", "id,name,email,picture");
                request.setParameters(parameters);
                request.executeAsync();


            }

            @Override
            public void onCancel() {
                mListener.onFbSignInFail("User cancelled operation");
            }

            @Override
            public void onError(FacebookException e) {
                mListener.onFbSignInFail(e.getMessage());
            }
        };
        LoginManager.getInstance().registerCallback(mCallBackManager, mCallBack);
    }

    @NonNull
    @CheckResult
    public CallbackManager getCallbackManager() {
        return mCallBackManager;
    }

    public void performSignIn(AppCompatActivity activity) {
        LoginManager.getInstance()
                .logInWithReadPermissions(activity,
                        Arrays.asList("public_profile", "email"));
    }

    public void performSignIn(Fragment fragment) {
        LoginManager.getInstance()
                .logInWithReadPermissions(fragment,
                        Arrays.asList("public_profile", "email"));
    }

    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        mCallBackManager.onActivityResult(requestCode, resultCode, data);
    }

    public void performSignOut() {
        LoginManager.getInstance().logOut();
        mListener.onFBSignOut();
    }
}
