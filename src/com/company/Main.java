package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {
        // window
        JFrame frame = new JFrame("Launcher");

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        // contents
        JTextField keywordField = new JTextField(10);

        JButton queryButton = new JButton();
        queryButton.setText("Query keyword");

        // add stuff in
        panel.add(keywordField);
        panel.add(queryButton);
        
        // listeners
        queryButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame view1 = new JFrame("View 1");
                JFrame view2 = new JFrame("View 2");

                JPanel panel1 = new JPanel();
                panel1.setLayout(new FlowLayout());

                JPanel panel2 = new JPanel();
                panel2.setLayout(new FlowLayout());

                JLabel view1Label = new JLabel("View 1");
                JLabel view2Label = new JLabel("View 2");

                panel1.add(view1Label);
                panel2.add(view2Label);

                view1.add(panel1);
                view1.setSize(300, 75);
                view1.setLocationRelativeTo(null);
                view1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                view1.setVisible(true);
                view1.setResizable(false);

                view2.add(panel2);
                view2.setSize(300, 75);
                view2.setLocationRelativeTo(null);
                view2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                view2.setVisible(true);
                view2.setResizable(false);
            }
        });

        frame.add(panel);
        frame.setSize(300, 75);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(false);
    }
}
