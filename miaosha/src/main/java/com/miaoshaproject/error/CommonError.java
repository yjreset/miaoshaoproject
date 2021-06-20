package com.miaoshaproject.error;

/**
 * @description:
 * @author: YJ
 * @time: 2021/6/20 0:33
 */
public interface CommonError {
    public int getErrCode();
    public String getErrMsg();
    public CommonError setErrMsg(String errMsg);
}
