package com.huan.wanandroid_huan.ui.project;

import com.huan.wanandroid_huan.base.BaseContract;
import com.huan.wanandroid_huan.bean.ProjectBean;

public class ProjectContract {

    interface View extends BaseContract.BaseView{
        void updateProjectView(ProjectBean bean);
    }

    interface Presenter extends BaseContract.BasePresenter<View>{
        void  getProject(int page);
    }
}
