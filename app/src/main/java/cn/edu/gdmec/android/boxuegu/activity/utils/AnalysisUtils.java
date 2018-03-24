package cn.edu.gdmec.android.boxuegu.activity.utils;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Mr.Zhang on 2018/3/20.
 */

public class AnalysisUtils {
    /*
    *从SharedPreferences中读取登录用户名
     */
    public static String readLoginUserName(Context context){
        SharedPreferences sp = context.getSharedPreferences("LoginInfo",
                Context.MODE_PRIVATE);
        String userName = sp.getString("LoginUserName","");
        return userName;
    }
}
