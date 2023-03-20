package com.reb.ui;

import javax.swing.*;

public class GameJFrame extends JFrame {
    public GameJFrame() {
        initJFrame();

        initJMenuBar();

//        让界面显示出来
        this.setVisible(true);
    }

    private void initJMenuBar() {
        //        初始化菜单
        JMenuBar jMenuBar = new JMenuBar();
//        创建选项
        JMenu funcJMenu = new JMenu("功能");
        JMenu aboutJMenu = new JMenu("关于我们");
//        创建选项Item
        JMenuItem replayItem = new JMenuItem("重新游戏");
        JMenuItem reLoginItem = new JMenuItem("重新登录");
        JMenuItem closeItem = new JMenuItem("关闭游戏");
        JMenuItem accountItem = new JMenuItem("公众号");

//        将选项中的item添加到选项中
        funcJMenu.add(replayItem);
        funcJMenu.add(reLoginItem);
        funcJMenu.add(closeItem);

        aboutJMenu.add(accountItem);

//        将选项添加到菜单中
        jMenuBar.add(funcJMenu);
        jMenuBar.add(aboutJMenu);

//        给整个页面设置菜单
        this.setJMenuBar(jMenuBar);
    }

    private void initJFrame() {
        this.setSize(603, 608);
//        设置界面标题
        this.setTitle("拼图单机v1.0");
//        设置界面置顶
        this.setAlwaysOnTop(true);
//        设置界面居中
        this.setLocationRelativeTo(null);
//        设置程序关闭模式
        this.setDefaultCloseOperation(3);
    }
}
