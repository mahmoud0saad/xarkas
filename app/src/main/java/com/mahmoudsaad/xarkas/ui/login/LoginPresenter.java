package com.mahmoudsaad.xarkas.ui.login;

import com.mahmoudsaad.xarkas.data.DataManager;
import com.mahmoudsaad.xarkas.ui.base.BasePresenter;
import com.mahmoudsaad.xarkas.utils.rx.SchedulerProvider;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;

public class LoginPresenter<V extends LoginMvpView> extends BasePresenter<V>
        implements LoginMvpPresenter<V> {
    @Inject
    public LoginPresenter(DataManager manager, SchedulerProvider schedulerProvider, CompositeDisposable compositeDisposable) {
        super(manager, schedulerProvider, compositeDisposable);
    }

    @Override
    public void onLoginClick(String emailOrPhone, String password) {

        getMvpView().showLoading();
        getCompositeDisposable().add(getDataManager()
                .doLoginApiCall(emailOrPhone, password)
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
                      getMvpView().showDialog("Successful login \n Thanks : "+response.getResult().getFullName());
                  }else {
                      getMvpView().showMessage("fail login reason "+response.getError());
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
