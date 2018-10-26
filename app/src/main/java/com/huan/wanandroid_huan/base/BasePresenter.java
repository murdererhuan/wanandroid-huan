package com.huan.wanandroid_huan.base;

public class BasePresenter<T extends BaseContract.BaseView> implements BaseContract.BasePresenter<T> {

    private T mView;

    @Override
    public void attacView(T view) {
        mView=view;
    }

    @Override
    public void deteachView() {
        if(mView!=null){
            mView=null;
        }
    }
}
