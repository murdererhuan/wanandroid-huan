package com.huan.wanandroid_huan.ui.home;

import com.huan.wanandroid_huan.base.BaseContract;
import com.huan.wanandroid_huan.bean.ArticleListBean;
import com.huan.wanandroid_huan.bean.BannerBean;

import java.util.List;

public class HomeContract {

    interface View extends BaseContract.BaseView {
        void updateArticleView(ArticleListBean articleListBean);
        void updateBannerView(List<BannerBean> bannerBeans);
    }

    interface Presenter extends BaseContract.BasePresenter<View> {
        void getArticles(int page);
        void getBanner();
    }

}

