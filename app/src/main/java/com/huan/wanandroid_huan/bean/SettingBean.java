package com.huan.wanandroid_huan.bean;

import android.support.annotation.DrawableRes;

import java.io.Serializable;

public class SettingBean implements Serializable {
    private int id;
    private String name;
    private int resourceId;

    public SettingBean(int id, String name, int resourceId) {
        this.id = id;
        this.name = name;
        this.resourceId = resourceId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name == null ? "" : name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getResourceId() {
        return resourceId;
    }

    public void setResourceId(@DrawableRes int resourceId) {
        this.resourceId = resourceId;
    }
}
