package com.mahmoudsaad.xarkas.root;

import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;

import androidx.annotation.NonNull;

import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.analytics.Tracker;
import com.mahmoudsaad.xarkas.R;
import com.mahmoudsaad.xarkas.di.component.ApplicationComponent;
import com.mahmoudsaad.xarkas.di.component.DaggerApplicationComponent;
import com.mahmoudsaad.xarkas.di.module.ApplicationModule;
import com.mahmoudsaad.xarkas.utils.LanguageHelper;

/**
 * Created on : August 21, 2020
 * Author     : mahmoud saad
 * Email    : mahmoud1saad2@gmail.com
 */
public class WaveApp extends Application {


    private ApplicationComponent mApplicationComponent;

    private static GoogleAnalytics sAnalytics;
    private static Tracker sTracker;

    @Override
    public void onCreate() {
        super.onCreate();

        mApplicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this)).build();
        mApplicationComponent.inject(this);
        sAnalytics = GoogleAnalytics.getInstance(this);

    }

    public ApplicationComponent getComponent() {
        return mApplicationComponent;
    }


    // Needed to replace the component with a test specific one
    public void setComponent(ApplicationComponent applicationComponent) {
        mApplicationComponent = applicationComponent;
    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(LanguageHelper.onAttach(base, LanguageHelper.getLanguage(base)));
    }

    @Override
    public void onConfigurationChanged(@NonNull Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        LanguageHelper.setLanguage(this, LanguageHelper.getLanguage(this));
    }

    synchronized public Tracker getDefaultTracker() {
        // To enable debug logging use: adb shell setprop log.tag.GAv4 DEBUG
        if (sTracker == null) {
            sTracker = sAnalytics.newTracker(R.xml.global_tracker);
        }

        return sTracker;
    }

    public boolean isNotificationOn() {
        return getComponent().getDataManager().isNotificationON();
    }
}
