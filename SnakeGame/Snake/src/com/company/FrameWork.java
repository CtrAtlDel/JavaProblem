package com.company;

import javax.swing.*;

public class FrameWork extends JFrame {
    FrameWork(){
        this.add(new Panel());
        this.setTitle("Snake game");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}
