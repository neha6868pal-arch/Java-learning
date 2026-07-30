package com.itheima.ui;

import java.util.Random;

public final class CaptchaUtil {

    private CaptchaUtil() {
        throw new AssertionError("工具类禁止实例化");
    }

    public static String generateCode() {
        //生成长度为5、内容四位字母一位数字（位置随机）的验证码
        Random r = new Random();
        char [] arr = new char[52];
        for (int i = 0; i < arr.length; i++) {
            if (i<=25){
                arr[i] = (char) (i+97);
            }else {
                arr[i] = (char)(i+65-26);
            }
        }
        char [] code = new char[5];
        for (int i = 0; i < code.length; i++) {
            int index = r.nextInt(arr.length);
            code[i] = arr[index];
        }
        int index = r.nextInt(code.length);
        int num = r.nextInt(10);
        code[index] = (char) (num+48);
        String result = new String(code);
        return result;
    }
}