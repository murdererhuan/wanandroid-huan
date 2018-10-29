package com.huan.wanandroid_huan.ui.mine;


import com.huan.wanandroid_huan.R;
import com.huan.wanandroid_huan.bean.SettingBean;

import java.util.ArrayList;
import java.util.List;

public class MineGenerateData {
    private static final String [] TAB_NAME={"收藏","注册","注销","关于我们"};
    private static final int [] TAB_ICON={R.mipmap.tab_collect, R.mipmap.tab_register, R.mipmap.tab_logout, R.mipmap.tab_me};

    public static List<SettingBean> generateData() {
        List<SettingBean> list = new ArrayList<>();
        list.add(new SettingBean(0, TAB_NAME[0], TAB_ICON[0]));
        list.add(new SettingBean(1, TAB_NAME[1], TAB_ICON[1]));
        list.add(new SettingBean(2, TAB_NAME[2], TAB_ICON[2]));
        list.add(new SettingBean(3, TAB_NAME[3], TAB_ICON[3]));
//        list.add(new SettingBean(2, TAB_NAME[2], TAB_ICON[2]));
        return list;
    }
}
