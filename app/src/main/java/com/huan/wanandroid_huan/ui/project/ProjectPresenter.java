package com.huan.wanandroid_huan.ui.project;

import com.huan.wanandroid_huan.base.BasePresenter;
import com.zhouyou.http.EasyHttp;

import javax.inject.Inject;

import io.reactivex.disposables.Disposable;

public class ProjectPresenter extends BasePresenter<ProjectContract.View> implements ProjectContract.Presenter {

    private Disposable mDisposable;

    @Inject
    ProjectPresenter() {
    }


    @Override
    public void getProject(int page) {

    }


    @Override
    public void deteachView() {
        super.deteachView();
        EasyHttp.cancelSubscription(mDisposable);
    }
}
