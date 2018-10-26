package com.huan.wanandroid_huan.base;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.huan.wanandroid_huan.App;
import com.trello.rxlifecycle2.LifecycleTransformer;
import com.trello.rxlifecycle2.components.support.RxFragment;

import javax.annotation.Nullable;
import javax.inject.Inject;

import butterknife.ButterKnife;
import butterknife.Unbinder;
import dagger.android.AndroidInjection;
import dagger.android.support.AndroidSupportInjection;

public abstract class BaseDaggerFragment<T extends BaseContract.BasePresenter> extends RxFragment implements BaseContract.BaseView {

    @Inject
    @Nullable
    protected  T mPresenter;

    private Unbinder unbinder;
    private View mRootView,mErrorView,mEmptyView;
    private ProgressDialog mProgressDialog;


    @Override
    public void onCreate(@android.support.annotation.Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        attachView();
    }






    protected  abstract void initView();

    protected abstract void initData();


    @Override
    public void onDestroy() {
        super.onDestroy();
        unbinder.unbind();
        detachView();
    }

    /*
     * 分离View
     * */

    private void detachView(){
        if (mPresenter!=null){
            mPresenter.deteachView();
        }
    }

    /*
     * 贴上View
     * */

    private void attachView(){
        if (mPresenter!=null){
            mPresenter.attacView(this);
        }
    }

    @Override
    public void onAttach(Context context) {
        AndroidSupportInjection.inject(this);
        super.onAttach(context);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        inflaterView(inflater, container);
        unbinder = ButterKnife.bind(this, mRootView);
        mProgressDialog = new ProgressDialog(getActivity());
        mProgressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        mProgressDialog.setMessage(getResources().getString(com.chad.library.R.string.loading));
        return mRootView;
    }

    @Override
    public void onActivityCreated(@android.support.annotation.Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initView();
        initData();
    }

    /*
    * 设置View
    * */
    public void inflaterView(LayoutInflater inflater, ViewGroup container){
        if (mRootView==null){
            mRootView=inflater.inflate(getLayoutId(),container,false);
        }
    };

    protected abstract  int getLayoutId();


    @Override
    public void showLoading() {
        mProgressDialog.show();
    }

    @Override
    public void hideLoading() {
        mProgressDialog.dismiss();
    }

    @Override
    public void showSuccess() {

    }

    @Override
    public void showFailed() {
        Toast.makeText(App.getInstance(),"加载失败",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void shwoNoNet() {
        Toast.makeText(App.getInstance(),"无网络连接",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onRetry() {

    }

    @Override
    public <T> LifecycleTransformer<T> bindToLife() {
        return this.bindToLifecycle();
    }
}
