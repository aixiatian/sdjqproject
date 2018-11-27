package com.day.bean;

public class ErrorMsg {
    /**
     * 0-失败
     * 1-成功
     */
    String errcode;
    String errmsg;
    String requrl;
//    Integer dataCount;

    public String getRequrl() {
        return requrl;
    }

    public void setRequrl(String requrl) {
        this.requrl = requrl;
    }

    public String getErrcode() {
        return errcode;
    }

    public void setErrcode(String errcode) {
        this.errcode = errcode;
    }

    public String getErrmsg() {
        return errmsg;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }

}
