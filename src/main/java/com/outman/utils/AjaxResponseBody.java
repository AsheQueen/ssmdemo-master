package com.outman.utils;

import com.fasterxml.jackson.annotation.JsonView;
import com.outman.model.LoginInfo;

import java.util.List;

public class AjaxResponseBody {

    String msg;
    String code;
    List<LoginInfo> result;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<LoginInfo> getResult() {
        return result;
    }

    public void setResult(List<LoginInfo> result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "AjaxResponseBody { msg=" + msg + ", code=" + code + ", result=" + result + " }";
    }
}
