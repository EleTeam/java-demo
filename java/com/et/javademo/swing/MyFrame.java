package com.et.javademo.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by tony on 17/12/2.
 */
public class MyFrame extends JFrame {

    public void createFrame() {
        setVisible(true);
        setSize(400, 200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("MyFrame - Swing");
        setBackground(Color.PINK);
        setLayout(null);

        JLabel label = new JLabel("这是JFrame窗体");
        label.setBackground(Color.YELLOW);
        label.setBounds(10, 10, 100, 20);

        JButton btn = new JButton("弹出窗体");
        btn.setBounds(10, 40, 100, 20);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MyDialog dialog = new MyDialog(MyFrame.this);
                dialog.setVisible(true);
            }
        });

        add(label);
        add(btn);
    }

    public static void main(String[] args) {
        new MyFrame().createFrame();
    }

}
