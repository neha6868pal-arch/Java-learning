package com.itheima.ui;

import javax.swing.*;

public class GameJFrame extends JFrame {
    //不能都写在一个main方法里——>分类
    //写成类的形式，就可直接继承jframe
    //在构造参数中完成初始化
    public GameJFrame() {
        initJFrame();
        initJMenuBar();
        initImage();
        this.setVisible(true);//默认隐藏，需要方法调用
    }

    private void initImage() {
        //创建Java容器能接收的图片
        ImageIcon icon = new ImageIcon("D:\\code\\JAVA\\puzzleGame\\src\\image\\animal\\animal1\\1.jpg");//先打引号再复制，格式才对
        //创建Java能操作的容器
        JLabel jLabel = new JLabel(icon);
        //操作：指定图片位置,坐标轴以左上角为原点,图片也以左上角的点
        jLabel.setBounds(0,0,105,105);
        //把管理容器添加到界面中
        //取消默认设置后，还需获取大容器才能调用
        this.getContentPane().add(jLabel);
    }

    private void initJMenuBar() {
        //菜单这一栏、菜单上的名字、点开菜单后展开内容，这些都是单个的，都需要用add来加到前面
        JMenuBar jMenuBar = new JMenuBar();
        JMenu functionjMenu = new JMenu("功能");
        JMenu aboutjMenu = new JMenu("关于我们");
        JMenuItem replayItem = new JMenuItem("重新游戏");
        JMenuItem reLoginItem = new JMenuItem("重新登录");
        JMenuItem closeItem = new JMenuItem("关闭游戏");

        JMenuItem accountItem = new JMenuItem("公众号");
        functionjMenu.add(replayItem);
        functionjMenu.add(reLoginItem);
        functionjMenu.add(closeItem);
        aboutjMenu.add(accountItem);
        jMenuBar.add(functionjMenu);
        jMenuBar.add(aboutjMenu);
        this.setJMenuBar(jMenuBar);
    }

    private void initJFrame() {
        this.setSize(603,680);//int的单位是像素
        this.setTitle("拼图单机版");//设置标题
        this.setAlwaysOnTop(true);//一直置顶，
        this.setLocationRelativeTo(null);
        //如果没有这行，点×只是隐藏
        //括号里的每个数字都代表一个关闭模式
        //0——点×无效
        //1——默认的关闭
        //2——所有界面都关闭才停止运行，所有界面都要设置成2才有用
        //3——关掉其中一个，虚拟机停止运行（拼图的三个界面不同时出现）
        this.setDefaultCloseOperation(3);
        //窗体自带容器，不取消就默认居中，取消后才能按坐标轴的方式添加
        this.setLayout(null);
    }
}
