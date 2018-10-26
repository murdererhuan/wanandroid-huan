package com.huan.wanandroid_huan.base;


import com.trello.rxlifecycle2.LifecycleTransformer;

public interface BaseContract {


    interface BasePresenter <T extends BaseContract.BaseView>{

        void attacView(T view);

        void deteachView();

    }

    interface BaseView{
        /*
        * 显示进度中
        * */

        void showLoading();

        /*
        * 隐藏进度
        *
        * */

        void hideLoading();

        /*
        * 显示请求成功
        * */

        void showSuccess();

        /*
        * 失败重试
        * */

        void showFailed();

        /*
        * 显示当前网络不可用
        * */

        void shwoNoNet();

        /*
        * 重试
        * */

        void onRetry();

        /*
        * 绑定生命周期
        * */

        <T> LifecycleTransformer<T> bindToLife();
    }
}
