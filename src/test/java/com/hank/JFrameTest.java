package com.hank;

import javax.swing.*;

public class JFrameTest {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setSize(800,630);
        jFrame.setLocationRelativeTo(null);//窗口位置
        jFrame.setResizable(true);//窗口可由用户自由调整
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//用户单击关闭按钮执行的动作
        jFrame.setVisible(true);//设置可见
    }
}
