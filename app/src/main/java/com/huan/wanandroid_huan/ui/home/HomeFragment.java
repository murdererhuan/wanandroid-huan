package com.huan.wanandroid_huan.ui.home;

import android.support.annotation.NonNull;

import com.huan.wanandroid_huan.base.BaseDaggerFragment;
import com.huan.wanandroid_huan.bean.ArticleListBean;
import com.huan.wanandroid_huan.bean.BannerBean;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnLoadMoreListener;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;

import java.util.List;

public class HomeFragment  extends BaseDaggerFragment<HomePresenter> implements HomeContract.View,OnRefreshListener,OnLoadMoreListener {


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
    public void updateArticleView(ArticleListBean articleListBean) {

    }

    @Override
    public void updateBannerView(List<BannerBean> bannerBeans) {

    }
    /*
    * 加载更多监听器
    * */
    @Override
    public void onLoadMore(@NonNull RefreshLayout refreshLayout) {

    }
    /*
    * 刷新监听器
    * */
    @Override
    public void onRefresh(@NonNull RefreshLayout refreshLayout) {

    }
}
