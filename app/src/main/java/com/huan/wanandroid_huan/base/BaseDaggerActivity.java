package com.huan.wanandroid_huan.base;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.Toast;

import com.trello.rxlifecycle2.LifecycleTransformer;
import com.trello.rxlifecycle2.components.support.RxAppCompatActivity;

import javax.annotation.Nullable;
import javax.inject.Inject;

import butterknife.ButterKnife;
import butterknife.Unbinder;
import dagger.android.AndroidInjection;

public abstract class BaseDaggerActivity<T extends BaseContract.BasePresenter> extends RxAppCompatActivity implements BaseContract.BaseView {
    @Inject
    @Nullable
    protected  T mPresenter;

    private Unbinder unbinder;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        int layoutId=getLayoutId();
        setContentView(layoutId);
        unbinder= ButterKnife.bind(this);
        attachView();
        initView();
        initData();

    }


    protected abstract  int getLayoutId();


    /*
    * 贴上View
    * */

    private void attachView(){
        if (mPresenter!=null){
            mPresenter.attacView(this);
        }
    }

    protected  abstract void initView();

    protected abstract void initData();


    @Override
    protected void onDestroy() {
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



    @Override
    public void showLoading() {
        Toast.makeText(this,"显示进度条",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void hideLoading() {
        Toast.makeText(this,"隐藏进度条",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showSuccess() {

    }

    @Override
    public void showFailed() {
        Toast.makeText(this,"加载失败",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void shwoNoNet() {
        Toast.makeText(this,"无网络连接",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onRetry() {

    }

    @Override
    public <T> LifecycleTransformer<T> bindToLife() {
        return this.bindToLifecycle();
    }
}
