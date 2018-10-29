package com.huan.wanandroid_huan.ui;

import android.content.Context;
import android.content.Intent;
import android.widget.FrameLayout;

import com.huan.wanandroid_huan.R;
import com.huan.wanandroid_huan.base.BaseActivity;
import com.just.agentweb.AgentWeb;

import butterknife.BindView;

public class WebActivity extends BaseActivity {

    @BindView(R.id.fl_web)
    FrameLayout frameLayout;

    private static final String WEB_URL = "web_url";
    private String mWebUrl;

    AgentWeb mAgentWeb;

    public static void startWebActivity(Context context, String url) {
        Intent intent = new Intent(context, WebActivity.class);
        intent.putExtra(WEB_URL, url);
        context.startActivity(intent);
    }


    @Override
    protected int getLayoutId() {
        return  R.layout.activity_web;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {

    }

    @Override
    public void shwoNoNet() {

    }
}
