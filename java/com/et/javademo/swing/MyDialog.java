package com.et.javademo.swing;

import javax.swing.*;
import java.awt.*;

/**
 * Created by tony on 17/12/2.
 */
public class MyDialog extends JDialog {

    public MyDialog(JFrame frame) {
        super(frame, "dialog窗体", true);
        add(new JLabel("对话框!!!"));
        setBounds(50, 50, 50, 50);
    }

}
