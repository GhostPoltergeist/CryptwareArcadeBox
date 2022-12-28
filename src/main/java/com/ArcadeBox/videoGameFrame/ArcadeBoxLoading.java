package com.ArcadeBox.videoGameFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ArcadeBoxLoading extends JFrame {
        JLabel labelPrt, intro, loading;
    public ArcadeBoxLoading() {

        ImageIcon icon = new ImageIcon("reaper.gif");
        ImageIcon imageIcon = new ImageIcon(new ImageIcon("loadingBar.gif").getImage().getScaledInstance(540,200, Image.SCALE_DEFAULT));

        intro = new JLabel("ArcadeBox");
        intro.setFont(new Font("Quantico", Font.BOLD, 85));
        intro.setBounds(70,30, 600,200);
        intro.setForeground(Color.WHITE);

        loading = new JLabel();
        loading.setIcon(imageIcon);
        loading.setBounds(57, 270, 600,600);

        labelPrt = new JLabel();
        labelPrt.setBounds(23,20,600,600);
        labelPrt.setIcon(icon);

        setUndecorated(true);
        getContentPane().setBackground(new Color(1.0f,1.0f,1.0f,0.0f));
        setBackground(new Color(1.0f,1.0f,1.0f,0.0f));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setSize(600,600);
        setLocationRelativeTo(null);

        Timer timer = new Timer(10000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                dispose();
                new mainFrame();
            }
        });
        timer.setRepeats(false);
        timer.start();

        add(labelPrt);
        add(intro);
        add(loading);

    }
}
