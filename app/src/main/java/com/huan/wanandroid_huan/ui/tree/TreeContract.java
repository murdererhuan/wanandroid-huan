package com.huan.wanandroid_huan.ui.tree;

import com.huan.wanandroid_huan.base.BaseContract;
import com.huan.wanandroid_huan.bean.TreeBean;

import java.util.List;

public class TreeContract  {

    interface View extends BaseContract.BaseView{
        void updateTreeView(List<TreeBean> treeBeans);

        void updateArticleView(String result);

        void updateRegisterView(String result);
    }

    interface Presenter extends BaseContract.BasePresenter<View>{
        void getTree();

        void getTreeArticle(int id, int page);
    }
}
