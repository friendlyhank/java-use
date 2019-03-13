package com.hank;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;

//(1)extends JPanel面板
public class GamePanel extends JPanel{


        @Override
        public void paint(Graphics g){
            super.paint(g);
            System.out.println("绘制面板操作");
        }


    //(2)extends KeyAdapter
    public class MyKeyLinenter extends KeyAdapter{

    }

    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setSize(800,630);
        jFrame.setLocationRelativeTo(null);//窗口位置
        jFrame.setResizable(true);//窗口可由用户自由调整
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//用户单击关闭按钮执行的动作

        GamePanel gamePanel = new GamePanel();
        jFrame.add(gamePanel);

        jFrame.setVisible(true);//设置可见
    }
}
