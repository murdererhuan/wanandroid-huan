package com.huan.wanandroid_huan.bean;

import com.zhouyou.http.model.ApiResult;

public class BaseResult<T> extends ApiResult<T> {

    private String errorMsg;
    private int errorCode;


    @Override
    public int getCode() {
        return  errorCode;
    }

    @Override
    public void setCode(int code) {
        errorCode=code;
    }


    @Override
    public void setMsg(String msg) {
        errorMsg=msg;
    }

    @Override
    public String getMsg() {
        return errorMsg;
    }
}
