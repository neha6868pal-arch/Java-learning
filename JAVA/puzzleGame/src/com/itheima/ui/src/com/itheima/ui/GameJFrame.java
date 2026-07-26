package com.itheima.ui;

import javax.swing.*;

public class GameJFrame extends JFrame {
    //不能都写在一个main方法里——>分类
    //写成类的形式，就可直接继承jframe
    //在构造参数中完成初始化
    public GameJFrame() {
        this.setSize(603,680);//int的单位是像素
        this.setTitle("拼图单机版");//设置标题
        this.setAlwaysOnTop(true);//一直置顶，
        this.setLocationRelativeTo(null);
        //如果没有这行，点×只是隐藏
        //括号里的每个数字都代表一个关闭模式
        //0——点×无效
        //1——默认的关闭
        //2——所有界面都关闭才停止运行，所有界面都要设置成2才有用
        //3——关掉其中一个，虚拟机停止运行
        this.setDefaultCloseOperation(3);
        this.setVisible(true);//默认隐藏，需要方法调用
    }
}
