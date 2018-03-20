package cn.edu.gdmec.android.boxuegu.activity.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by Mr.Zhang on 2018/3/15.
 */

public class MD5Utils {
    /**
     * MD5加密的算法
     */
    public static String md5(String text){
        MessageDigest digest=null;//MessageDigest 类为应用程序提供信息摘要算法的功能，如 MD5 或 SHA 算法。信息摘要是安全的单向哈希函数，它接收任意大小的数据，并输出固定长度的哈希值。
        try{
            digest=MessageDigest.getInstance("md5");
            byte[] result=digest.digest(text.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b:result) {
                int number = b & 0xff;
                String hex=Integer.toHexString(number);
                if(hex.length()==1){
                    sb.append("0"+hex);
                }else {
                    sb.append(hex);
                }
            }
            return sb.toString();
        }catch (NoSuchAlgorithmException e){
            e.printStackTrace();
            return "";
        }
    }
}
