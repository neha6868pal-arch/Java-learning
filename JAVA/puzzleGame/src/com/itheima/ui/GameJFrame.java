package com.itheima.ui;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Objects;
import java.util.Random;

public class GameJFrame extends JFrame implements KeyListener, ActionListener {
    int [][] result = new int[4][4];
    int [][] win = new int [][]{
            {1,5,9,13},
            {2,6,10,14},
            {3,7,11,15},
            {4,8,12,0}
    } ;
    int x = 0;
    int y = 0;
    int step = 0;
    JMenuItem replayItem = new JMenuItem("重新游戏");
    JMenuItem reLoginItem = new JMenuItem("重新登录");
    JMenuItem closeItem = new JMenuItem("关闭游戏");

    JMenuItem accountItem = new JMenuItem("公众号");
    //定义路径
    String path = "src\\image\\animal\\animal1\\";
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
            if (arr[i]==0){
                x = i/4;
                y = i%4;
            }
            result[i/4][i%4] = arr[i];

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
        //清空原本已经出现的所有图片
        this.getContentPane().removeAll();

        //判断胜利
        if (victory()) {
            JLabel winJLable = new JLabel(new ImageIcon("D:\\code\\JAVA\\puzzleGame\\src\\image\\win.png"));
            winJLable.setBounds(203, 283, 197, 73);
            this.getContentPane().add(winJLable);
        }

        //加载步数
        JLabel foot = new JLabel("步数："+step);
        foot.setBounds(50,30,100,20);
        this.getContentPane().add(foot);

        //先加载图片在上面，后加载的在下面
        for (int j = 0; j <result.length ; j++) {
            for (int i = 0; i < result[j].length; i++) {
                //创建Java容器能接收的图片,用路径来接收
    //            ImageIcon icon = new ImageIcon("D:\\code\\JAVA\\puzzleGame\\src\\image\\animal\\animal1\\1.jpg");//先打引号再复制，格式才对
                int num = result[i][j];
                //创建Java能操作的容器
                //绝对路径：从盘开始
                //相对路径：从项目名后开始（不包括项目名）
                //路径用字符串的形式可识别
                JLabel jLabel = new JLabel(new ImageIcon(path+num+".jpg"));
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
        this.getContentPane().repaint();
    }

    private void initJMenuBar() {
        //菜单这一栏、菜单上的名字、点开菜单后展开内容，这些都是单个的，都需要用add来加到前面
        JMenuBar jMenuBar = new JMenuBar();
        JMenu functionjMenu = new JMenu("功能");
        JMenu aboutjMenu = new JMenu("关于我们");

        functionjMenu.add(replayItem);
        functionjMenu.add(reLoginItem);
        functionjMenu.add(closeItem);
        aboutjMenu.add(accountItem);
        //给菜单栏加动作监听
        replayItem.addActionListener(this);
        reLoginItem.addActionListener(this);
        closeItem.addActionListener(this);
        accountItem.addActionListener(this);

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
    //按下不松时会调用
    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        if (code == 65){
            this.getContentPane().removeAll();
            JLabel all = new JLabel(new ImageIcon(path+"all.jpg"));
            all.setBounds(83,134,420,420);
            this.getContentPane().add(all);
            JLabel background = new JLabel(new ImageIcon("src\\image\\background.png"));
            background.setBounds(40,40,508,560);
            this.getContentPane().add(background);
            this.getContentPane().repaint();
        }
    }
    //松开按键的时候判断
    @Override
    public void keyReleased(KeyEvent e) {
        if (victory()){
            return;//判断胜利后结束方法
        }
        int code = e.getKeyCode();
        //←37 ↑38 →39 ↓40
        if (code==37){
            if (x==3){
                return;
            }
            result[x][y] = result[x+1][y];
            result[x+1][y] = 0;
            //y代表的位置是0，0现在换位置了，还用y表示
            x++;
            step++;
            initImage();//不刷新就无法把这个新的放进去
        }else if (code==38){
            if (y==3){
                return;
            }
            result[x][y] = result[x][y+1];
            result[x][y+1] = 0;
            y++;
            step++;
            initImage();
        }else if (code==39){
            if (x==0){
                return;
            }
            result[x][y] = result[x-1][y];
            result[x-1][y] = 0;
            x--;
            step++;
            initImage();
        }else if (code==40){
            if (y==0){
                return;
            }
            result[x][y] = result[x][y-1];
            result[x][y-1] = 0;
            y--;
            step++;
            initImage();
        }else if(code ==65){
            initImage();
        }else if(code == 87){
            result = new int [][]{
                    {1,5,9,13},
                    {2,6,10,14},
                    {3,7,11,15},
                    {4,8,12,0}
            } ;
            x = 3;
            y = 3;
            initImage();
        }
    }

    public boolean victory(){
        for (int j = 3; j >=0 ; j--) {
            for (int i = 3; i >=0; i--) {
                if (result[j][i] != win[j][i]){
                    //一有错就返回
                    //反着遍历效率更高
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if (obj==replayItem){
            initData();
            step = 0;
            initImage();
        }else if (obj==reLoginItem){
            //关闭当前页面
            this.setVisible(false);
            //打开新页面
            new LoginJFrame();
        }else if (obj==closeItem){
            System.exit(0);
        }else if (obj==accountItem){
            //新建菜单的弹窗
            JDialog jDialog = new JDialog();
            JLabel account = new JLabel(new ImageIcon("src\\image\\damie.jpg"));
            account.setBounds(0,0,258,258);
            //调用弹窗的界面
            jDialog.getContentPane().add(account);
            jDialog.setSize(344,344);
            jDialog.setAlwaysOnTop(true);
            //居中
            jDialog.setLocationRelativeTo(null);
            //不关闭无法操作其他
            jDialog.setModal(true);
            jDialog.setVisible(true);
        }
    }
}
