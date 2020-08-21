package com.mahmoudsaad.xarkas.data.prefs;

import com.mahmoudsaad.xarkas.data.utils.LoggedInMode;

import java.util.List;

public interface PreferencesHelper {
    int getUserLoggedInMode();

    void setUserLoggedIn(LoggedInMode mode);

    int getUserId();

    void setUserId(int userId);

    String getUserName();

    void setUserName(String userName);

    String getUserEmail();

    void setUserEmail(String email);

    String getUserProfilePicUrl();

    void setUserProfilePicUrl(String profilePicUrl);

    String getUserProfileAddress();

    void setUserProfileAddress(String address);

    String getAccessToken();

    void setAccessToken(String accessToken);

    String getUserPhone();

    void setUserPhone(String mobileNumber);

    boolean isNotificationON();

    void setNotificationON(boolean notificationON);

    boolean isNotificationAppear();

    void setNotificationAppear(boolean notificationON);

    boolean isCoachMarkView();

    void setCoachMarkView(boolean coachMark);

    boolean isFirstTime();

    void setFirstTime(boolean firstTime);

    void logoutUser();

    String getProviderId();

    void setProviderId(String providerId);

    String getAddress();

    void setAddress(String address);

    String getUserType();

    void setUserType(String userType);

    String getUserCountryId();

    void setUserCountryId(String countryId);

    String getUserCityId();

    void setUserCityId(String cityId);

    List<String> getSearchSuggestion();

    void setSearchSuggestion(List<String> searchSuggestions);
}
