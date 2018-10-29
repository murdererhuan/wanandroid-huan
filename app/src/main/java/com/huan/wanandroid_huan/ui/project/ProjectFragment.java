package com.huan.wanandroid_huan.ui.project;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.huan.wanandroid_huan.R;
import com.huan.wanandroid_huan.base.BaseDaggerFragment;
import com.huan.wanandroid_huan.bean.ProjectBean;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnLoadMoreListener;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;

import java.util.List;

import butterknife.BindView;

public class ProjectFragment extends BaseDaggerFragment<ProjectPresenter> implements ProjectContract.View,OnRefreshListener,OnLoadMoreListener {


    @BindView(R.id.recycleView)
    RecyclerView mRecycleView;
    @BindView(R.id.refreshLayout)
    SmartRefreshLayout mRefreshLayout;
    private int mPage;
    private ProjectAdapter mAdapter;

    public static ProjectFragment newInstance(String from) {
        ProjectFragment fragment = new ProjectFragment();
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
    public void updateProjectView(ProjectBean bean) {

    }

    @Override
    public void onLoadMore(@NonNull RefreshLayout refreshLayout) {

    }

    @Override
    public void onRefresh(@NonNull RefreshLayout refreshLayout) {

    }

    private class ProjectAdapter extends BaseQuickAdapter<ProjectBean.DatasBean,BaseViewHolder>{

        private List<Integer> mHeights;

        public ProjectAdapter() {
            super(R.layout.item_project_layout);
        }


        @Override
        protected void convert(BaseViewHolder helper, ProjectBean.DatasBean item) {

        }
    }
}
