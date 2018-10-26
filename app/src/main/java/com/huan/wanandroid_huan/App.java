package com.huan.wanandroid_huan;

import android.app.Activity;
import android.app.Application;
import android.support.v4.app.Fragment;

import com.blankj.utilcode.util.Utils;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;
import dagger.android.support.HasSupportFragmentInjector;

public class App extends Application implements HasSupportFragmentInjector,HasActivityInjector {

    private static App mBaseApp;

    @Inject
    DispatchingAndroidInjector<Activity> mDispatchingAndroidInjector;

    @Inject
    DispatchingAndroidInjector<Fragment> mFragmentDispatchingAndroidInjector;


    public static App getInstance(){
        return mBaseApp;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mBaseApp=this;
        Utils.init(this);

    }

    @Override
    public AndroidInjector<Activity> activityInjector() {
        return null;
    }

    @Override
    public AndroidInjector<Fragment> supportFragmentInjector() {
        return null;
    }
}
