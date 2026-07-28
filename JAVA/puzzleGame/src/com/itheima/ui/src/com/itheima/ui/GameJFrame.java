package com.itheima.ui;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class GameJFrame extends JFrame implements KeyListener {
    int [][] result = new int[4][4];
    int x = 0;
    int y = 0;
    //不能都写在一个main方法里——>分类
    //写成类的形式，就可直接继承jframe
    //在构造参数中完成初始化
    public GameJFrame() {
        initJFrame();
        initJMenuBar();
        //打乱数据
        initData();
        //根据数据放图片
        initImage();
        this.setVisible(true);//默认隐藏，需要方法调用
    }
    private void initData(){
        Random r = new Random();
        int[] arr ={0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        for (int i = 0; i < arr.length; i++) {
            int index = r.nextInt(16);
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            //找0，标记0的坐标
            //用坐标的想法放，遍历一维数组
            result[i%4][i/4] = arr[i];
        }
        //遍历二维数组
//        int number = 0;
//        int [][] result = new int[4][4];
//        for (int i = 0; i < result.length; i++) {
//            for (int i1 = 0; i1 < 4; i1++) {
//                result[i][i1] = arr[number];
//                number++;
//            }
    }

    private void initImage() {
        //先加载图片在上面，后加载的在下面
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 4; i++) {
                //创建Java容器能接收的图片,用路径来接收
    //            ImageIcon icon = new ImageIcon("D:\\code\\JAVA\\puzzleGame\\src\\image\\animal\\animal1\\1.jpg");//先打引号再复制，格式才对
                int num = result[i][j];
                //创建Java能操作的容器
                //绝对路径：从盘开始
                //相对路径：从项目名后开始（不包括项目名）
                JLabel jLabel = new JLabel(new ImageIcon("src\\image\\animal\\animal1\\"+num+".jpg"));
                //操作：指定图片位置,坐标轴以左上角为原点,图片也以左上角的点
                jLabel.setBounds(105*i+83,105*j+134,105,105);
                //添加边框
                //BevelBolder斜着的边框，0突起的，1下凹的
                jLabel.setBorder(new BevelBorder(0));
                //把管理容器添加到界面中
                //取消默认设置后，还需获取窗体界面才能调用
                //this就是在该类去找
                this.getContentPane().add(jLabel);
            }
        }
        JLabel background = new JLabel(new ImageIcon("src\\image\\background.png"));
        background.setBounds(40,40,508,560);
        this.getContentPane().add(background);
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
        this.addKeyListener(this);//继承只是省去写类，该add还是add
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {
        int code = e.getKeyCode();
        //←37 ↑38 →39 ↓40
        if (code==37){
            System.out.println("zuo");
        }else if (code==38){

        }else if (code==39){

        }else if (code==40){

        }
    }
}
