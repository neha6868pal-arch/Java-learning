package com.itheima.ui;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class LoginJFrame extends JFrame implements MouseListener {
    JButton login = new JButton(new ImageIcon("src\\image\\login\\登录按钮.png"));
    JButton register = new JButton(new ImageIcon("src\\image\\login\\注册按钮.png"));
    static ArrayList<User> list = new ArrayList<>();
    static {
        list.add(new User("youyou","123"));
        list.add(new User("小田","123"));
    }
    JLabel ceritifyCode = new JLabel(CaptchaUtil.generateCode());
    JTextField userName = new JTextField();
    JPasswordField password = new JPasswordField();

    JTextField codeText = new JTextField();

    public LoginJFrame(){
        initLOginFrame();
        initImage();
        this.setVisible(true);
    }

    private void showJDialog(String content) {
        JDialog jDialog = new JDialog();
        jDialog.setSize(200, 150);
        jDialog.setAlwaysOnTop(true);
        jDialog.setLocationRelativeTo(null);
        jDialog.setModal(true);
        JLabel warning = new JLabel(content);
        warning.setBounds(0, 0, 200, 150);
        jDialog.getContentPane().add(warning);
        jDialog.setVisible(true);
    }
    private void initLOginFrame() {
        this.setSize(480,430);
        this.setTitle("拼图 登录");
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(3);
        this.setLayout(null);
    }

    private void initImage() {
        JLabel user = new JLabel(new ImageIcon("src\\image\\login\\用户名.png"));
        user.setBounds(116, 134, 51, 19);
        this.getContentPane().add(user);
        userName.setBounds(195, 134, 200, 30);
        this.getContentPane().add(userName);
        JLabel pass = new JLabel(new ImageIcon("src\\image\\login\\密码.png"));
        pass.setBounds(130, 195, 35, 18);
        this.getContentPane().add(pass);
        password.setBounds(195, 195, 200, 30);
        this.getContentPane().add(password);
        JLabel code = new JLabel(new ImageIcon("src\\image\\login\\验证码.png"));
        code.setBounds(130,256,50,30);
        this.getContentPane().add(code);
        codeText.setBounds(195,256,100,30);
        this.getContentPane().add(codeText);
        ceritifyCode.setBounds(300,256,100,30);
        this.getContentPane().add(ceritifyCode);
        ceritifyCode.addMouseListener(this);

        login.setBounds(123, 310, 90, 40);
        this.getContentPane().add(login);
        login.addMouseListener(this);
        login.setPressedIcon(new ImageIcon("src\\image\\login\\登录按下.png"));

        register.setBounds(256, 310, 90, 40);
        this.getContentPane().add(register);
        register.addMouseListener(this);
        register.setPressedIcon(new ImageIcon("src\\image\\login\\注册按下.png"));

        JLabel background = new JLabel(new ImageIcon("src\\image\\login\\background.png"));
        background.setBounds(0, 0, 470, 390);
        this.getContentPane().add(background);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource()==login){
            //获取两个文本输入框中的内容,以字符串的形式接收
            String usernameInput = userName.getText();
            String passwordInput = password.getText();
            String codeInput = codeText.getText();

            //创建一个User对象
            User userInfo = new User(usernameInput, passwordInput);
            System.out.println("用户输入的用户名为" + usernameInput);
            System.out.println("用户输入的密码为" + passwordInput);

            if (codeInput.length() == 0) {
                showJDialog("验证码不能为空");
            } else if (usernameInput.length() == 0 || passwordInput.length() == 0) {
                showJDialog("用户名或者密码为空");


            } else if (!codeInput.equalsIgnoreCase(ceritifyCode.getText())) {
                showJDialog("验证码输入错误");
            } else if (contains(userInfo)) {
                //关闭当前登录界面
                this.setVisible(false);
                //打开游戏的主界面
                //需要把当前登录的用户名传递给游戏界面
                new GameJFrame();
            } else {
                showJDialog("用户名或密码错误");
            }
        } else if (e.getSource() == register) {
            System.out.println("点击了注册按钮");
        } else if (e.getSource() == ceritifyCode) {
            System.out.println("更换验证码");
            //获取一个新的验证码
            String code = CaptchaUtil.generateCode();
            //修改原来的验证码成新的code
            ceritifyCode.setText(code);
        }
    }
    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
    public boolean contains(User userInput){
        for (int i = 0; i < list.size(); i++) {
            User rightUser = list.get(i);
            if(userInput.getName().equals(rightUser.getName()) && userInput.getPassword().equals(rightUser.getPassword())){
                //有相同的代表存在，返回true，后面的不需要再比了
                return true;
            }
        }
        //循环结束之后还没有找到就表示不存在
        return false;
    }


}




