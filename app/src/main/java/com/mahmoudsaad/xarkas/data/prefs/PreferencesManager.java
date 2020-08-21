package com.mahmoudsaad.xarkas.data.prefs;

import android.content.Context;
import android.content.SharedPreferences;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.mahmoudsaad.xarkas.data.utils.LoggedInMode;
import com.mahmoudsaad.xarkas.di.ApplicationContext;
import com.mahmoudsaad.xarkas.di.PreferenceInfo;
import com.mahmoudsaad.xarkas.root.AppConstant;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

public class PreferencesManager implements PreferencesHelper {

    private static final String PREF_KEY_USER_LOGGED_IN_MODE = "PREF_KEY_LOGGED_IN_MODE";
    private static final String PREF_KEY_USER_ID = "PREF_KEY_USER_ID";
    private static final String PREF_KEY_USER_MOBILE = "PREF_KEY_CURRENT_MOBILE";
    private static final String PREF_KEY_USER_NAME = "PREF_KEY_CURRENT_USER_NAME";
    private static final String PREF_KEY_USER_EMAIL = "PREF_KEY_CURRENT_USER_EMAIL";
    private static final String PREF_KEY_ACCESS_TOKEN = "PREF_KEY_ACCESS_TOKEN";
    private static final String PREF_KEY_FIRST_TIME = "PREF_KEY_FIRST_TIME";
    private static final String PREF_KEY_USER_PROFILE_PIC_URL = "PREF_KEY_USER_PROFILE_PIC_URL";
    private static final String PREF_KEY_USER_PROFILE_ADDRESS = "PREF_KEY_USER_PROFILE_PIC_URL";
    private static final String PREF_KEY_COACH_MARK = "PREF_KEY_COACH_MARK";
    private static final String PREF_KEY_PROVIDER_ID = "PREF_KEY_PROVIDER_ID";
    private static final String PREF_KEY_ADDRESS = "PREF_KEY_ADDRESS";
    private static final String PREF_KEY_SEARCH_SUGGESTION = "PREF_KEY_SEARCH_SUGGESTION";
    private static final String PREF_KEY_USER_TYPE = "PREF_KEY_USER_TYPE";
    private static final String PREF_KEY_USER_COUNTRY = "PREF_KEY_USER_COUNTRY";
    private static final String PREF_KEY_USER_CITY = "PREF_KEY_USER_CITY";
    public static final String PREF_KEY_USER_NOTIFICATIONS = "PREF_KEY_USER_NOTIFICATIONS";
    private static final String PREF_KEY_NOTIFICATION_APPEAR = "PREF_KEY_NOTIFICATION_APPEAR";

    private final SharedPreferences mPrefs;
    private Context mAppContext;

    @Inject
    public PreferencesManager(@ApplicationContext Context context,
                              @PreferenceInfo String prefFileName) {
        mPrefs = context.getSharedPreferences(prefFileName, Context.MODE_PRIVATE);
        mAppContext = context;
    }

    @Override
    public String getUserName() {
        return mPrefs.getString(PREF_KEY_USER_NAME, null);
    }

    @Override
    public void setUserName(String userName) {
        mPrefs.edit().putString(PREF_KEY_USER_NAME, userName).apply();
    }

    @Override
    public String getUserEmail() {
        return mPrefs.getString(PREF_KEY_USER_EMAIL, null);
    }

    @Override
    public void setUserEmail(String email) {
        mPrefs.edit().putString(PREF_KEY_USER_EMAIL, email).apply();
    }

    @Override
    public String getUserProfilePicUrl() {
        return mPrefs.getString(PREF_KEY_USER_PROFILE_PIC_URL, null);
    }

    @Override
    public void setUserProfilePicUrl(String profilePicUrl) {
        mPrefs.edit().putString(PREF_KEY_USER_PROFILE_PIC_URL, profilePicUrl).apply();
    }

    @Override
    public String getUserProfileAddress() {
        return mPrefs.getString(PREF_KEY_USER_PROFILE_ADDRESS, null);
    }

    @Override
    public void setUserProfileAddress(String address) {
        mPrefs.edit().putString(PREF_KEY_USER_PROFILE_ADDRESS, address).apply();
    }

    @Override
    public int getUserLoggedInMode() {
        return mPrefs.getInt(PREF_KEY_USER_LOGGED_IN_MODE,
                LoggedInMode.LOGGED_IN_MODE_LOGOUT.getType());
    }

    @Override
    public void setUserLoggedIn(LoggedInMode mode) {
        mPrefs.edit().putInt(PREF_KEY_USER_LOGGED_IN_MODE, mode.getType()).apply();
    }

    @Override
    public int getUserId() {
        return mPrefs.getInt(PREF_KEY_USER_ID, 0);
    }

    @Override
    public void setUserId(int mUserId) {
        mPrefs.edit().putInt(PREF_KEY_USER_ID, mUserId).apply();
    }

    @Override
    public String getAccessToken() {
        return mPrefs.getString(PREF_KEY_ACCESS_TOKEN, null);
    }

    @Override
    public void setAccessToken(String accessToken) {
        mPrefs.edit().putString(PREF_KEY_ACCESS_TOKEN, accessToken).apply();
    }

    @Override
    public String getUserPhone() {
        return mPrefs.getString(PREF_KEY_USER_MOBILE, "");
    }

    @Override
    public void setUserPhone(String mobileNumber) {
        mPrefs.edit().putString(PREF_KEY_USER_MOBILE, mobileNumber).apply();
    }

    @Override
    public boolean isNotificationON() {
        return mPrefs.getBoolean(PREF_KEY_USER_NOTIFICATIONS, false);
    }

    @Override
    public void setNotificationON(boolean notificationON) {
        mPrefs.edit().putBoolean(PREF_KEY_USER_NOTIFICATIONS, notificationON).apply();
    }
    @Override
    public boolean isNotificationAppear() {
        return mPrefs.getBoolean(PREF_KEY_NOTIFICATION_APPEAR, false);
    }

    @Override
    public void setNotificationAppear(boolean notificationON) {
        mPrefs.edit().putBoolean(PREF_KEY_NOTIFICATION_APPEAR, notificationON).apply();
    }

    @Override
    public boolean isCoachMarkView() {
        SharedPreferences pref = mAppContext.getSharedPreferences(AppConstant.SHARED_PREF, 0);
        return pref.getBoolean(PREF_KEY_COACH_MARK, true);
    }

    @Override
    public void setCoachMarkView(boolean coachMark) {
        SharedPreferences pref = mAppContext.getSharedPreferences(AppConstant.SHARED_PREF, 0);
        SharedPreferences.Editor editor = pref.edit();
        editor.putBoolean(PREF_KEY_COACH_MARK, coachMark);
        editor.apply();

    }

    @Override
    public boolean isFirstTime() {
        return mPrefs.getBoolean(PREF_KEY_FIRST_TIME, true);
    }

    @Override
    public void setFirstTime(boolean firstTime) {
        mPrefs.edit().putBoolean(PREF_KEY_FIRST_TIME, firstTime).apply();
    }

    @Override
    public void logoutUser() {
        mPrefs.edit().clear().apply();
    }

    @Override
    public String getProviderId() {
        return mPrefs.getString(PREF_KEY_PROVIDER_ID, null);
    }

    @Override
    public void setProviderId(String providerId) {
        mPrefs.edit().putString(PREF_KEY_PROVIDER_ID, providerId).apply();
    }

    @Override
    public String getAddress() {
        return mPrefs.getString(PREF_KEY_ADDRESS, null);
    }

    @Override
    public void setAddress(String address) {
        mPrefs.edit().putString(PREF_KEY_ADDRESS, address).apply();
    }

    @Override
    public String getUserType() {
        return mPrefs.getString(PREF_KEY_USER_TYPE, null);
    }

    @Override
    public void setUserType(String userType) {
        mPrefs.edit().putString(PREF_KEY_USER_TYPE, userType).apply();
    }

    @Override
    public String getUserCountryId() {
        return mPrefs.getString(PREF_KEY_USER_COUNTRY, null);
    }

    @Override
    public void setUserCountryId(String countryId) {
        mPrefs.edit().putString(PREF_KEY_USER_COUNTRY, countryId).apply();
    }

    @Override
    public String getUserCityId() {
        return mPrefs.getString(PREF_KEY_USER_CITY, null);
    }

    @Override
    public void setUserCityId(String cityId) {
        mPrefs.edit().putString(PREF_KEY_USER_CITY, cityId).apply();
    }

    @Override
    public List<String> getSearchSuggestion() {
        String json = mPrefs.getString(PREF_KEY_SEARCH_SUGGESTION, null);

        return json==null?new ArrayList<>(): new Gson().fromJson(json, new TypeToken<List<String>>() {}.getType());
    }

    @Override
    public void setSearchSuggestion(List<String> searchSuggestions) {
        mPrefs.edit().putString(PREF_KEY_SEARCH_SUGGESTION, new Gson().toJson(searchSuggestions)).apply();
    }


}
