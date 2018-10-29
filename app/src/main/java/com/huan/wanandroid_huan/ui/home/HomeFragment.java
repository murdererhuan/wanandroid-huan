package com.huan.wanandroid_huan.ui.home;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.huan.wanandroid_huan.R;
import com.huan.wanandroid_huan.base.BaseDaggerFragment;
import com.huan.wanandroid_huan.bean.ArticleListBean;
import com.huan.wanandroid_huan.bean.BannerBean;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnLoadMoreListener;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;
import com.youth.banner.Banner;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.Unbinder;

public class HomeFragment  extends BaseDaggerFragment<HomePresenter> implements HomeContract.View,OnRefreshListener,OnLoadMoreListener {

    @BindView(R.id.recycleView)
    RecyclerView mRecycleView;
    @BindView(R.id.refreshLayout)
    SmartRefreshLayout mRefreshLayout;
    Unbinder unbinder;


    private int mpage;
    private ArticleAdapter mAdapter;
    private List<String> mBannerBeans=new ArrayList<>();
    private Banner mBanner;

    /*
    *单例方法
     */
    public static HomeFragment newInstance(String from){
        HomeFragment homeFragment=new HomeFragment();
        Bundle bundle=new Bundle();
        bundle.putString("from",from);
        homeFragment.setArguments(bundle);
        return homeFragment;
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


    /*
    * 适配器
    * */

    private  class ArticleAdapter extends BaseQuickAdapter<ArticleListBean.DatasBean,BaseViewHolder>{

        public ArticleAdapter(){
            super(R.layout.item_article);
        }

        @Override
        protected void convert(BaseViewHolder helper, ArticleListBean.DatasBean item) {
            helper.setText(R.id.tv_author,item.getAuthor());
            helper.setText(R.id.tv_chapterName,item.getChapterName());
            helper.setText(R.id.tv_title,item.getTitle());
            helper.setText(R.id.tv_niceDate,item.getNiceDate());

        }
    }
}
