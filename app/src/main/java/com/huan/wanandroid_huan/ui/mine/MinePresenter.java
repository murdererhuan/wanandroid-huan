package com.huan.wanandroid_huan.ui.mine;

import com.huan.wanandroid_huan.base.BasePresenter;

import javax.inject.Inject;

import io.reactivex.disposables.Disposable;

public class MinePresenter extends BasePresenter<MineContract.View> implements MineContract.Presenter {

    private Disposable mDisposable1;
    private Disposable mDisposable2;



    @Inject
    MinePresenter(){

    }

    @Override
    public void login(String name, String password) {

    }

    @Override
    public void logout() {

    }

    @Override
    public void register(String username, String password, String repassword) {

    }
}
