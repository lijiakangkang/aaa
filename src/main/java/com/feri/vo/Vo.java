package com.feri.vo;

public class Vo {
    private int code;
    private String msg;
    private Object arr;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getArr() {
        return arr;
    }

    public void setArr(Object arr) {
        this.arr = arr;
    }

    public Vo() {
    }

    public Vo(int code, String msg, Object arr) {
        this.code = code;
        this.msg = msg;
        this.arr = arr;
    }

    public static Vo ok(){
        return new Vo(1,"成功",null);
    }
    public static Vo error(){
        return new Vo(0,"失败",null);
    }
}
