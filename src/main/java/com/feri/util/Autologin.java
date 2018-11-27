package com.feri.util;

import com.sun.deploy.net.URLEncoder;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;

public class Autologin {

    public static void addCookie(String username, String password, HttpServletResponse response, HttpServletRequest request) throws UnsupportedEncodingException {
        if(!username.equals("") && !password.equals("")){
            //创建Cookie
            Cookie nameCookie=new Cookie("name",URLEncoder.encode(username,"utf-8"));
            Cookie pswCookie=new Cookie("psw",password);

            //设置Cookie的父路径
            nameCookie.setPath(request.getContextPath()+"/");
            pswCookie.setPath(request.getContextPath()+"/");

            //获取是否保存Cookie
            String rememberMe=request.getParameter("rember");
            if(rememberMe==null || rememberMe.equals(false)){//不保存Cookie
                nameCookie.setMaxAge(0);
                pswCookie.setMaxAge(0);
            }else{//保存Cookie的时间长度，单位为秒
                nameCookie.setMaxAge(7*24*60*60);
                pswCookie.setMaxAge(7*24*60*60);
            }
            //加入Cookie到响应头
            response.addCookie(nameCookie);
            response.addCookie(pswCookie);
        }
    }


}
