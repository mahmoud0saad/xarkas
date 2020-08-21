package com.mahmoudsaad.xarkas.ui.register;

import com.mahmoudsaad.xarkas.data.DataManager;
import com.mahmoudsaad.xarkas.ui.base.BasePresenter;
import com.mahmoudsaad.xarkas.utils.rx.SchedulerProvider;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;

public class RegisterPresenter<V extends RegisterMvpView> extends BasePresenter<V>
        implements RegisterMvpPresenter<V> {
    @Inject
    public RegisterPresenter(DataManager manager, SchedulerProvider schedulerProvider, CompositeDisposable compositeDisposable) {
        super(manager, schedulerProvider, compositeDisposable);
    }

    @Override
    public void onRegisterClick(String email, String phone, String password, String firstName, String lastName) {

        getMvpView().showLoading();
        getCompositeDisposable().add(getDataManager()
                .doRegisterApiCall(firstName,lastName,email,phone,password)
                .subscribeOn(getSchedulerProvider().io())
                .observeOn(getSchedulerProvider().ui())
                .subscribe(response -> {
                    if (!isViewAttached()) {
                        return;
                    }
                    getMvpView().hideLoading();

                    /**
                     * Update view here
                     */

                    if (response.isSuccess()){
                        getMvpView().showMessage("successful Register");
                        getMvpView().openLoginActivity();
                    }else {
                        getMvpView().showMessage("fail Register");
                    }


                }, error -> {
                    if (!isViewAttached()) {
                        return;
                    }
                    getMvpView().hideLoading();

                    /**
                     * manage all kind of error in single place
                     */
                    handleApiError(error);
                }));

    }

}
