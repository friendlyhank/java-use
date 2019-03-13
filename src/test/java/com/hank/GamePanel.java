package com.hank;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

//(1)extends JPanel面板
public class GamePanel extends JPanel{


        @Override
        public void paint(Graphics g){
            super.paint(g);
            System.out.println("绘制面板操作");
        }


    public static void main(String[] args) {new GamePanel().start();}

    public void start(){
        JFrame jFrame = new JFrame();
        jFrame.setSize(800,630);
        jFrame.setLocationRelativeTo(null);//窗口位置
        jFrame.setResizable(true);//窗口可由用户自由调整
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//用户单击关闭按钮执行的动作

        GamePanel gamePanel = new GamePanel();
        jFrame.add(gamePanel);

        //监听键盘操作 抽象KeyAdapter
        jFrame.addKeyListener(new MyKeyLinenter(jFrame,gamePanel));

        jFrame.setVisible(true);//设置可见
    }

    /**
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setSize(800, 630);
        jFrame.setLocationRelativeTo(null);//窗口位置
        jFrame.setResizable(true);//窗口可由用户自由调整
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//用户单击关闭按钮执行的动作

        GamePanel gamePanel = new GamePanel();
        jFrame.add(gamePanel);

        //监听键盘操作 抽象KeyAdapter
        //这种写法到这里会报错，static不能调用非静态方法
        jFrame.addKeyListener(new MyKeyLinenter(jFrame, gamePanel));

        jFrame.setVisible(true);//设置可见
    }
    */

    //(2)extends KeyAdapter
    public class MyKeyLinenter extends KeyAdapter{
        private GamePanel gamePanel;
        private JFrame jFrame;

        public MyKeyLinenter(JFrame jFrame,GamePanel gamePanel) {
            this.gamePanel = gamePanel;
            this.jFrame = jFrame;
        }

        @Override
        public void keyPressed(KeyEvent e) {
            super.keyPressed(e);

            //键盘事件
            int keyCode = e.getKeyCode();
            switch (keyCode){
                case KeyEvent.VK_LEFT:
                    System.out.println("向左");
                    break;
                case KeyEvent.VK_RIGHT:
                    System.out.println("向右");
                    break;
                case KeyEvent.VK_UP:
                    System.out.println("向上");
                    break;
                case KeyEvent.VK_DOWN:
                    System.out.println("向下");
                    break;
                    default:
                        break;
            }
        }
    }
}
