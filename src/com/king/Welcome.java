package com.king;

import javax.swing.JFrame;

/**
 *
 * @author Lakshmanan.0018
 */
public class Welcome {
    public static void main(String[] args) {
        System.out.println("Java new features....");
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("Testing....");
        frame.setSize(400,400);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
