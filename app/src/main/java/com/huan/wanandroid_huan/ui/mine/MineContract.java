package com.huan.wanandroid_huan.ui.mine;

import com.huan.wanandroid_huan.base.BaseContract;
import com.huan.wanandroid_huan.bean.UserBean;

public class MineContract {

    interface View extends BaseContract.BaseView{
        void updateLoginView(UserBean userBean);

        void updateLogoutView(String result);

        void updateRegisterView(String result);
    }

    interface Presenter extends BaseContract.BasePresenter<View>{

        void login(String name,String password);

        void logout();

        void register(String username,String password,String repassword);
    }

}
