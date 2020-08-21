package com.mahmoudsaad.xarkas.di.component;

import android.app.Application;
import android.content.Context;

import com.mahmoudsaad.xarkas.data.DataManager;
import com.mahmoudsaad.xarkas.di.ApplicationContext;
import com.mahmoudsaad.xarkas.di.module.ApplicationModule;
import com.mahmoudsaad.xarkas.root.WaveApp;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created on : August 21, 2020
 * Author     : mahmoud saad
 * Email    : mahmoud1saad2@gmail.com
 */
@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    void inject(WaveApp app);

    @ApplicationContext
    Context context();

    Application application();

    DataManager getDataManager();
//    @Component.Builder
//    interface Builder {
//        ApplicationComponent build();
//
//        Builder applicationModule(ApplicationModule applicationModule);
//
//        DataManager getDataManager();
//    }


}
