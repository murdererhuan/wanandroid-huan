package com.huan.wanandroid_huan.ui.tree;

import android.os.Bundle;

import com.huan.wanandroid_huan.base.BaseDaggerFragment;
import com.huan.wanandroid_huan.bean.TreeBean;
import com.huan.wanandroid_huan.ui.tree.adapter.HorizontalPagerAdapter;

import java.util.List;

public class TreeFragment extends BaseDaggerFragment<TreePresenter> implements TreeContract.View {

    private HorizontalPagerAdapter mPagerAdapter;

    public static TreeFragment newInstance(String from) {
        TreeFragment fragment = new TreeFragment();
        Bundle bundle = new Bundle();
        bundle.putString("from", from);
        fragment.setArguments(bundle);
        return fragment;
    }


    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {

    }

    @Override
    protected int getLayoutId() {
        return 0;
    }

    @Override
    public void updateTreeView(List<TreeBean> treeBeans) {

    }

    @Override
    public void updateArticleView(String result) {

    }

    @Override
    public void updateRegisterView(String result) {

    }
}
