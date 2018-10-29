package com.huan.wanandroid_huan.ui.tree;

import com.huan.wanandroid_huan.base.BasePresenter;
import com.zhouyou.http.EasyHttp;

import javax.inject.Inject;

import io.reactivex.disposables.Disposable;

public class TreePresenter extends BasePresenter<TreeContract.View> implements TreeContract.Presenter{
    private Disposable mDisposable;
    private Disposable mDisposable1;

    @Inject
    TreePresenter() {
    }

    @Override
    public void getTree() {

    }

    @Override
    public void getTreeArticle(int id, int page) {

    }


    @Override
    public void deteachView() {
        super.deteachView();
        EasyHttp.cancelSubscription(mDisposable);
        EasyHttp.cancelSubscription(mDisposable1);
    }
}
