package com.mahmoudsaad.xarkas.data;

import android.content.Context;

import com.mahmoudsaad.xarkas.data.db.AppDatabase;
import com.mahmoudsaad.xarkas.data.db.model.User;
import com.mahmoudsaad.xarkas.data.network.RestApiHelper;
import com.mahmoudsaad.xarkas.data.network.pojo.LoginResponse;
import com.mahmoudsaad.xarkas.data.network.pojo.RegisterResponse;
import com.mahmoudsaad.xarkas.data.prefs.PreferencesHelper;
import com.mahmoudsaad.xarkas.data.utils.LoggedInMode;
import com.mahmoudsaad.xarkas.di.ApplicationContext;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.Single;

public class BaseDataManager implements DataManager {
    private static final String TAG = "BaseDataManager";


    private final Context mContext;
    private final AppDatabase mDatabase;
    private final PreferencesHelper mPreferencesHelper;
    private final RestApiHelper mApiHelper;

    @Inject
    public BaseDataManager(@ApplicationContext Context context,
                           AppDatabase database,
                           PreferencesHelper preferencesHelper,
                           RestApiHelper apiHelper) {
        mContext = context;
        mDatabase = database;
        mPreferencesHelper = preferencesHelper;
        mApiHelper = apiHelper;
    }

    @Override
    public void updateApiHeader(Long userId, String accessToken) {

    }

    @Override
    public void setUserLoggedOut() {
        logoutUser();
    }

    @Override
    public void updateUserInfo(String accessToken, int userId, LoggedInMode loggedInMode, String fullName, String email,
                               String providerId, String address, String phone, String userType, String countryId,
                               String cityId, String profilePicPath) {

        mPreferencesHelper.setAccessToken(accessToken);
        mPreferencesHelper.setUserId(userId);
        mPreferencesHelper.setUserLoggedIn(loggedInMode);
        mPreferencesHelper.setUserName(fullName);
        mPreferencesHelper.setUserEmail(email);
        mPreferencesHelper.setProviderId(providerId);
        mPreferencesHelper.setAddress(address);
        mPreferencesHelper.setUserPhone(phone);
        mPreferencesHelper.setUserType(userType);
        mPreferencesHelper.setUserCountryId(countryId);
        mPreferencesHelper.setUserCityId(cityId);
        mPreferencesHelper.setUserProfilePicUrl(profilePicPath);

    }


    @Override
    public List<User> getAll() {
        return mDatabase.userDao().getAll();
    }

    @Override
    public void insertUser(User mUser) {
        mDatabase.userDao().insertUser(mUser);
    }

    @Override
    public void insertAllUser(User... mUsersList) {
        mDatabase.userDao().insertAllUser(mUsersList);
    }

    @Override
    public void deleteUser(User mUser) {
        mDatabase.userDao().deleteUser(mUser);
    }

    @Override
    public void updateUser(User mUser) {

    }


    @Override
    public User getUserById(int uId) {
        return mDatabase.userDao().getUserById(uId);
    }

    @Override
    public List<User> loadAllByIds(int[] userIds) {
        return mDatabase.userDao().loadAllByIds(userIds);
    }

    @Override
    public User findByName(String first, String last) {
        return mDatabase.userDao().findByName(first, last);
    }

    @Override
    public int getUserLoggedInMode() {
        return mPreferencesHelper.getUserLoggedInMode();
    }

    @Override
    public void setUserLoggedIn(LoggedInMode mode) {
        mPreferencesHelper.setUserLoggedIn(mode);
    }

    @Override
    public int getUserId() {
        return mPreferencesHelper.getUserId();
    }

    @Override
    public void setUserId(int userId) {
        mPreferencesHelper.setUserId(userId);
    }

    @Override
    public String getUserName() {
        return mPreferencesHelper.getUserName();
    }

    @Override
    public void setUserName(String userName) {
        mPreferencesHelper.setUserName(userName);
    }

    @Override
    public String getUserEmail() {
        return mPreferencesHelper.getUserEmail();
    }

    @Override
    public void setUserEmail(String email) {
        mPreferencesHelper.setUserEmail(email);
    }

    @Override
    public String getUserProfilePicUrl() {
        return mPreferencesHelper.getUserProfilePicUrl();
    }

    @Override
    public void setUserProfilePicUrl(String profilePicUrl) {
        mPreferencesHelper.setUserProfilePicUrl(profilePicUrl);
    }

    @Override
    public String getUserProfileAddress() {
        return mPreferencesHelper.getUserProfileAddress();
    }

    @Override
    public void setUserProfileAddress(String address) {
        mPreferencesHelper.setUserProfileAddress(address);

    }

    @Override
    public String getAccessToken() {
        return mPreferencesHelper.getAccessToken();
    }

    @Override
    public void setAccessToken(String accessToken) {
        mPreferencesHelper.getAccessToken();
    }

    @Override
    public String getUserPhone() {
        return mPreferencesHelper.getUserPhone();
    }

    @Override
    public void setUserPhone(String mobileNumber) {
        mPreferencesHelper.setUserPhone(mobileNumber);
    }

    @Override
    public boolean isNotificationON() {
        return mPreferencesHelper.isNotificationON();
    }

    @Override
    public void setNotificationON(boolean notificationON) {
        mPreferencesHelper.setNotificationON(notificationON);
    }

    @Override
    public boolean isNotificationAppear() {
        return mPreferencesHelper.isNotificationAppear();
    }

    @Override
    public void setNotificationAppear(boolean notificationAppear) {
        mPreferencesHelper.setNotificationAppear(notificationAppear);
    }

    @Override
    public boolean isCoachMarkView() {
        return mPreferencesHelper.isCoachMarkView();
    }

    @Override
    public void setCoachMarkView(boolean isShowCoachMark) {
        mPreferencesHelper.setCoachMarkView(isShowCoachMark);
    }

    @Override
    public boolean isFirstTime() {
        return mPreferencesHelper.isFirstTime();
    }

    @Override
    public void setFirstTime(boolean firstTime) {
        mPreferencesHelper.setFirstTime(firstTime);
    }

    @Override
    public void logoutUser() {
        mPreferencesHelper.logoutUser();
    }

    @Override
    public String getProviderId() {
        return mPreferencesHelper.getProviderId();
    }

    @Override
    public void setProviderId(String providerId) {
        mPreferencesHelper.setProviderId(providerId);
    }

    @Override
    public String getAddress() {
        return mPreferencesHelper.getAddress();
    }

    @Override
    public void setAddress(String address) {
        mPreferencesHelper.setAddress(address);
    }

    @Override
    public String getUserType() {
        return mPreferencesHelper.getUserType();
    }

    @Override
    public void setUserType(String userType) {
        mPreferencesHelper.setUserType(userType);
    }

    @Override
    public String getUserCountryId() {
        return mPreferencesHelper.getUserCountryId();
    }

    @Override
    public void setUserCountryId(String countryId) {
        mPreferencesHelper.setUserCountryId(countryId);
    }

    @Override
    public String getUserCityId() {
        return mPreferencesHelper.getUserCityId();
    }

    @Override
    public void setUserCityId(String cityId) {
        mPreferencesHelper.setUserCityId(cityId);
    }

    @Override
    public List<String> getSearchSuggestion() {
        return mPreferencesHelper.getSearchSuggestion();
    }

    @Override
    public void setSearchSuggestion(List<String> searchSuggestions) {
        mPreferencesHelper.setSearchSuggestion(searchSuggestions);
    }

    @Override
    public Single<LoginResponse> doLoginApiCall(String emailOrPhone, String password) {
        return mApiHelper.doLoginApiCall(emailOrPhone, password);
    }

    @Override
    public Single<RegisterResponse> doRegisterApiCall(String firstName, String lastName, String email, String phone, String password) {
        return mApiHelper.doRegisterApiCall(firstName, lastName, email, phone, password);
    }


}
