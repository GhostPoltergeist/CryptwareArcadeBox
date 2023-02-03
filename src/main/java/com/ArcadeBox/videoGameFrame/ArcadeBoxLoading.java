package com.ArcadeBox.videoGameFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URL;

import static com.ArcadeBox.FontLoader.FontLoader.loadFonts;
import static com.ArcadeBox.FontLoader.FontLoader.quantico;

public class ArcadeBoxLoading extends JFrame {
    JLabel labelPrt, intro, loading;
    public ArcadeBoxLoading() throws IOException, FontFormatException {
        loadFonts();

        URL imageURLSix = getClass().getClassLoader().getResource("reaper.gif");
        ImageIcon icon = new ImageIcon(imageURLSix);

        URL imageURLSeven = getClass().getClassLoader().getResource("loadingBar.gif");
        ImageIcon imageIcon = new ImageIcon(new ImageIcon(imageURLSeven).getImage().getScaledInstance(540,200, Image.SCALE_DEFAULT));

        URL imageURLEight = getClass().getClassLoader().getResource("box.png");
        ImageIcon frameIcon = new ImageIcon(new ImageIcon(imageURLEight).getImage().getScaledInstance(551,591, Image.SCALE_DEFAULT));

        intro = new JLabel("ArcadeBox");
        intro.setFont(quantico.deriveFont(100f));
        intro.setBounds(43,30, 600,200);
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
        setIconImage(frameIcon.getImage());
        setLocationRelativeTo(null);

        Timer timer = new Timer(15000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                dispose();
                try {
                    new mainFrame();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        timer.setRepeats(false);
        timer.start();

        add(labelPrt);
        add(intro);
        add(loading);

    }
}
