package com.mahmoudsaad.xarkas.utils.libs.google;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

public interface GoogleListener {
    void onGoogleAuthSignIn(String authToken, GoogleSignInAccount user);

    void onGoogleAuthSignInFailed(String errorMessage);

    void onGoogleAuthSignOut();
}
