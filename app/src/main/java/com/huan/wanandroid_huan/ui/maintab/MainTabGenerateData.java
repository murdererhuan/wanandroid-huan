package com.huan.wanandroid_huan.ui.maintab;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.huan.wanandroid_huan.R;
import com.huan.wanandroid_huan.ui.home.HomeFragment;
import com.huan.wanandroid_huan.ui.mine.MineFragment;
import com.huan.wanandroid_huan.ui.project.ProjectFragment;
import com.huan.wanandroid_huan.ui.tree.TreeFragment;


/*
* fragment初始化 四个菜单按钮
* */
public class MainTabGenerateData {

    public static final int[] tabResNormal = new int[]{R.drawable.tab_home_selector, R.drawable.tab_discovery_selector, R.drawable.tab_attention_selector, R.drawable.tab_profile_selector};
    public static final int[] tabResPressed=new int[]{R.mipmap.ic_tab_strip_icon_feed_selected, R.mipmap.ic_tab_strip_icon_category_selected, R.mipmap.ic_tab_strip_icon_pgc_selected, R.mipmap.ic_tab_strip_icon_profile_selected};

    private static final String[] tabTitle = new String[]{"首页", "体系", "项目", "我的"};

    public static Fragment []getFragments(String from){
        Fragment [] fragments=new Fragment[4];
        fragments[0] = HomeFragment.newInstance(from);
        fragments[1] = TreeFragment.newInstance(from);
        fragments[2] = ProjectFragment.newInstance(from);
        fragments[3] = MineFragment.newInstance(from);
        return fragments;
    }

    public static View getTabView(Context context,int position){
        View view= LayoutInflater.from(context).inflate(R.layout.home_tab_content,null);
        ImageView tabIcon=view.findViewById(R.id.tab_content_image);
        tabIcon.setImageResource(MainTabGenerateData.tabResNormal[position]);
        TextView tabText=view.findViewById(R.id.tab_content_text);
        tabText.setText(tabTitle[position]);
        return  view;
    }

}
