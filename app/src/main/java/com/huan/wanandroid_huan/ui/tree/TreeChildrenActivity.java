package com.huan.wanandroid_huan.ui.tree;

import android.support.annotation.NonNull;

import com.huan.wanandroid_huan.R;
import com.huan.wanandroid_huan.base.BaseActivity;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnLoadMoreListener;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;

public class TreeChildrenActivity extends BaseActivity implements OnRefreshListener,OnLoadMoreListener {





    @Override
    protected int getLayoutId() {
        return R.layout.recycleview;
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

    @Override
    public void onLoadMore(@NonNull RefreshLayout refreshLayout) {

    }

    @Override
    public void onRefresh(@NonNull RefreshLayout refreshLayout) {

    }
}
