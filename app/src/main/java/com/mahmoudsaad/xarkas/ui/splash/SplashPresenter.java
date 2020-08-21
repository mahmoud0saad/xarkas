package com.mahmoudsaad.xarkas.ui.splash;

import com.mahmoudsaad.xarkas.data.DataManager;
import com.mahmoudsaad.xarkas.ui.base.BasePresenter;
import com.mahmoudsaad.xarkas.utils.rx.SchedulerProvider;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;

public class SplashPresenter<V extends SplashMvpView> extends BasePresenter<V>
        implements SplashMvpPresenter<V> {
    @Inject
    public SplashPresenter(DataManager manager, SchedulerProvider schedulerProvider, CompositeDisposable compositeDisposable) {
        super(manager, schedulerProvider, compositeDisposable);
    }



}
