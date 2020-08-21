package com.mahmoudsaad.xarkas.di.component;


import com.mahmoudsaad.xarkas.di.PerActivity;
import com.mahmoudsaad.xarkas.di.module.ActivityModule;
import com.mahmoudsaad.xarkas.ui.login.LoginActivity;
import com.mahmoudsaad.xarkas.ui.register.RegisterActivity;
import com.mahmoudsaad.xarkas.ui.splash.SplashActivity;

import dagger.Component;

/**
 * Created on : August 21, 2020
 * Author     : mahmoud saad
 * Email    : mahmoud1saad2@gmail.com
 */
@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

    void inject(LoginActivity activity);

    void inject(RegisterActivity activity);

    void inject(SplashActivity activity);

}