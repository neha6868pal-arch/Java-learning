package com.itheima.ui;

import javax.swing.*;

public class Test {
    public static void main(String[] args){
        JFrame gameJFrame = new JFrame();
        gameJFrame.setSize(603,680);//int的单位是像素
        gameJFrame.setVisible(true);//默认隐藏，需要方法调用
        JFrame loginJFrame = new JFrame();
        loginJFrame.setSize(480,430);
        loginJFrame.setVisible(true);
        JFrame registerJFrame = new JFrame();
        registerJFrame.setSize(488,500);
        registerJFrame.setVisible(true);
    }
}
