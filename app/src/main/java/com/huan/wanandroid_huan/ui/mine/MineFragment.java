package com.huan.wanandroid_huan.ui.mine;

import android.os.Bundle;
import android.view.View;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.huan.wanandroid_huan.R;
import com.huan.wanandroid_huan.base.BaseDaggerFragment;
import com.huan.wanandroid_huan.bean.UserBean;

import butterknife.BindView;

public class MineFragment extends BaseDaggerFragment<MinePresenter> implements MineContract.View,BaseQuickAdapter.OnItemClickListener {





    public static MineFragment newInstance(String from) {
        MineFragment fragment = new MineFragment();
        Bundle bundle = new Bundle();
        bundle.putString("from", from);
        fragment.setArguments(bundle);
        return fragment;
    }







    @Override
    public void onItemClick(BaseQuickAdapter adapter, View view, int position) {

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
    public void updateLoginView(UserBean userBean) {

    }

    @Override
    public void updateLogoutView(String result) {

    }

    @Override
    public void updateRegisterView(String result) {

    }
}
