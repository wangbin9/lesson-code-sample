package com.feicui.edu.highpart.common;

/**
 * Created by Administrator on 2016/9/13 0013.
 */
public class Const {
    private static final String URL = "http://118.244.212.82:9092/newsClient/";
    public static final String PHONE = "0";
    //新闻的请求路径
    public static final String URL_NEW_LIST = URL+"news_list?";
    //登入的请求路径
    public static final String URL_LOGIN = URL+"user_login?";
    //register
    public static final String URL_REGISTER = URL+"user_register?";
    //forget pwd /user_forgetpass?ver=" + args[0] + "&email=" + args[1]
    public static final String URL_FORGET_PWD = URL+"user_forgetpass?";

}
