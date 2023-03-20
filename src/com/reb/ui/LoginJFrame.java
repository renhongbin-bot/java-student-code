package com.reb.ui;

import javax.swing.*;

public class LoginJFrame extends JFrame {
    public LoginJFrame() {
        this.setSize(488, 430);
//        设置界面标题
        this.setTitle("登录");
//        设置界面置顶
        this.setAlwaysOnTop(true);
//        设置界面居中
        this.setLocationRelativeTo(null);
//        设置程序关闭模式
        this.setDefaultCloseOperation(3);
//        让界面显示出来
        this.setVisible(true);
    }
}
