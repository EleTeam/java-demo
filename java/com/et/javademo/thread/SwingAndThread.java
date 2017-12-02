package com.et.javademo.thread;

import javax.swing.*;
import java.net.URL;

/**
 * Created by tony on 17/12/2.
 */
public class SwingAndThread extends JFrame {

    private JLabel label = new JLabel();

    public SwingAndThread() {
        setVisible(true);
        setBounds(0, 0, 500, 500);
        setLayout(null);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        add(label);

        Thread thread = new Thread(new Roll());
        thread.start();
    }

    class Roll implements Runnable {
        private int count = 0;
        private boolean goRight = true;

        public Roll() {
            URL url = SwingAndThread.class.getResource("1.png");
            ImageIcon icon = new ImageIcon(url);
            label.setBounds(0, 0, 30, 30);
            label.setIcon(icon);
        }

        @Override
        public void run() {
            System.out.println("count");
            while (true) {
                label.setLocation(count, 30);
                if (goRight) {
                    if (label.getX() >= (SwingAndThread.this.getWidth() + SwingAndThread.this.getX())) {
                        goRight = false;
                    }
                    count ++;
//                    System.out.print(",count++:" + count);
                } else {
                    if (label.getX() <= SwingAndThread.this.getX()) {
                        goRight = true;
                    }
                    count --;
//                    System.out.print(",count--:"+count);
                }
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        new SwingAndThread();
    }

}
