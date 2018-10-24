package com.king;

import java.awt.FlowLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author Lakshmanan.0018
 */
public class Welcome extends JFrame {
    JButton btn;
    public Welcome(){
        setTitle("Exampel Frame");
        btn = new JButton("Click");
        setLayout(new FlowLayout());
        add(btn);
        
        setSize(500,400);
        setVisible(true);
        
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                System.out.println("Window about to close...");
                e.getWindow().dispose();
            }
        });
        
        btn.addActionListener(event-> System.out.println("btn was clicked..." ));
    }
    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        SwingUtilities.invokeLater(()->new Welcome());
    }
}
