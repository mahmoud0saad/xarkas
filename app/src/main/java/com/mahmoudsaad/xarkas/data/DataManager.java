package com.mahmoudsaad.xarkas.data;

import com.mahmoudsaad.xarkas.data.db.dao.UserDao;
import com.mahmoudsaad.xarkas.data.network.RestApiHelper;
import com.mahmoudsaad.xarkas.data.prefs.PreferencesHelper;
import com.mahmoudsaad.xarkas.data.utils.LoggedInMode;

public interface DataManager extends UserDao, PreferencesHelper, RestApiHelper  {
    void updateApiHeader(Long userId, String accessToken);

    void setUserLoggedOut();

    void updateUserInfo(
            String accessToken,
            int userId,
            LoggedInMode loggedInMode,
            String fullName,
            String email,
            String providerId,
            String address,
            String phone,
            String userType,
            String countryId,
            String cityId,
            String profilePicPath);
}
