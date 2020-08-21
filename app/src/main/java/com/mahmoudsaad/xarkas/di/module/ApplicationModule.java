package com.mahmoudsaad.xarkas.di.module;

import android.app.Application;
import android.content.Context;

import com.mahmoudsaad.xarkas.BuildConfig;
import com.mahmoudsaad.xarkas.data.BaseDataManager;
import com.mahmoudsaad.xarkas.data.DataManager;
import com.mahmoudsaad.xarkas.data.db.AppDatabase;
import com.mahmoudsaad.xarkas.data.network.NetworkService;
import com.mahmoudsaad.xarkas.data.network.RestApiHelper;
import com.mahmoudsaad.xarkas.data.network.RestApiManager;
import com.mahmoudsaad.xarkas.data.prefs.PreferencesHelper;
import com.mahmoudsaad.xarkas.data.prefs.PreferencesManager;
import com.mahmoudsaad.xarkas.di.ApiInfo;
import com.mahmoudsaad.xarkas.di.ApplicationContext;
import com.mahmoudsaad.xarkas.di.DatabaseInfo;
import com.mahmoudsaad.xarkas.di.PreferenceInfo;
import com.mahmoudsaad.xarkas.root.AppConstant;
import com.mahmoudsaad.xarkas.utils.LanguageHelper;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created on : August 21, 2020
 * Author     : mahmoud saad
 * Email    : mahmoud1saad2@gmail.com
 */
@Module
public class ApplicationModule {

    private Application mApplication;

    public ApplicationModule(Application application) {
        this.mApplication = application;
    }


    @Provides
    @ApplicationContext
    Context provideContext() {
        return mApplication;
    }

    @Provides
    Application provideApplication() {
        return mApplication;
    }

    @Provides
    @DatabaseInfo
    String provideDatabaseName() {
        return AppConstant.DB_NAME;
    }

    @Provides
    @ApiInfo
    String provideApiKey() {
        return BuildConfig.API_KEY;
    }

    @Provides
    @PreferenceInfo
    String providePreferenceName() {
        return AppConstant.PREF_NAME;
    }

    @Provides
    @Singleton
    DataManager provideDataManager(BaseDataManager mDataManager) {
        return mDataManager;
    }


    @Provides
    @Singleton
    AppDatabase provideAppDatabase() {
        return AppDatabase.getDatabaseInstance(mApplication);
    }

    @Provides
    @Singleton
    PreferencesHelper providePreferencesHelper(PreferencesManager preferencesManager) {
        return preferencesManager;
    }

    @Provides
    @Singleton
    RestApiHelper provideRestApiHelper(RestApiManager restApiManager) {
        return restApiManager;
    }


    /**
     * @return HTTTP Client
     */
    @Provides
    public OkHttpClient provideClient(PreferencesHelper preferencesHelper) {
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        return new OkHttpClient.Builder().addInterceptor(interceptor).addInterceptor(chain -> {
            Request.Builder requestBuilder = chain.request().newBuilder();
            requestBuilder.addHeader(AppConstant.TOKEN_PARAM_AUTHORIZATION,
                    AppConstant.TOKEN_PARAM_BEARER + preferencesHelper.getAccessToken());
            requestBuilder.addHeader(AppConstant.TOKEN_PARAM_ACCEPT,
                    AppConstant.TOKEN_PARAM_APPLICATION_JSON);
            requestBuilder.addHeader(AppConstant.TOKEN_PARAM_LANGUAGE,
                    LanguageHelper.getLanguage(mApplication));
            return chain.proceed(requestBuilder.build());
        }).build();
    }

    /**
     * provide Retrofit instances
     *
     * @param baseURL base url for api calling
     * @param client  OkHttp client
     * @return Retrofit instances
     */

    @Provides
    public Retrofit provideRetrofit(String baseURL, OkHttpClient client) {
        return new Retrofit.Builder()
                .baseUrl(baseURL)
                .client(client)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    /**
     * Provide Api service
     *
     * @return ApiService instances
     */
    @Provides
    public NetworkService provideApiService(PreferencesHelper preferencesHelper) {
        return provideRetrofit(BuildConfig.BASE_URL, provideClient(preferencesHelper)).create(NetworkService.class);
    }
}
