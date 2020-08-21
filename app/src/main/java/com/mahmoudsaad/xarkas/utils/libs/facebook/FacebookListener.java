package com.mahmoudsaad.xarkas.utils.libs.facebook;

import com.facebook.GraphResponse;

public interface FacebookListener {
  void onFbSignInFail(String errorMessage);

  void onFbSignInSuccess(String authToken, GraphResponse response);

  void onFBSignOut();
}
