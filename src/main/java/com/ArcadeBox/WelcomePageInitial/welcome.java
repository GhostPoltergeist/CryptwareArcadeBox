package com.ArcadeBox.WelcomePageInitial;

import com.ArcadeBox.videoGameFrame.ArcadeBoxLoading;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;

import static com.ArcadeBox.FontLoader.FontLoader.*;

public class welcome extends JFrame {
    JLabel labelPrt, intro, playGif, credits;
    JTextArea noticeArea;

    public welcome() {
        loadFonts();

        URL imageURL = getClass().getClassLoader().getResource("box.png");
        ImageIcon frameIcon = new ImageIcon(new ImageIcon(imageURL).getImage().getScaledInstance(551, 591, Image.SCALE_DEFAULT));

        noticeArea = new JTextArea();
        noticeArea.setFont(jetBrainsMono.deriveFont(15f));
        noticeArea.setText("Game programming is the term used to describe the computer or video game code Programming has changed along with technology. Early on in the history of video games, programmers were frequently in charge of the majority of development processes, including design. Dev teams, however, grew significantly as hardware and software advanced and games grew more complicated. A game programmer basically creates the code that makes a video game work. They collaborate closely with game designers, artists, sound engineers, and other departments to turn the project's concept into a fully playable, functional game.\n" +
                "\n" + "They could control anything, such as how quickly your character moves and how high they jump, as well as how many adversaries come at certain times and how they behave when assaulted.");
        noticeArea.setLineWrap(true);
        noticeArea.setWrapStyleWord(true);
        noticeArea.setBounds(100, 160, 600, 450);
        noticeArea.setBackground(new Color(50, 50, 50, 0));
        noticeArea.setForeground(Color.WHITE);
        noticeArea.setEditable(false);
        noticeArea.setFocusable(false);

        intro = new JLabel("{Notice}");
        intro.setFont(pressStart.deriveFont(30f));
        intro.setBounds(100, 30, 600, 200);
        intro.setOpaque(false);
        intro.setForeground(Color.WHITE);

        credits = new JLabel("GhostPoltergeist@2022 | Harold");
        credits.setFont(jetBrainsMono.deriveFont(16f));
        credits.setBounds(230, 510, 600, 200);
        credits.setOpaque(false);
        credits.setForeground(Color.WHITE);

        URL imageURLTwo = getClass().getClassLoader().getResource("stoney.gif");
        ImageIcon icon = new ImageIcon(new ImageIcon(imageURLTwo).getImage().getScaledInstance(300, 200, Image.SCALE_DEFAULT));

        URL imageURLThree = getClass().getClassLoader().getResource("play.gif");
        ImageIcon iconTwo = new ImageIcon(new ImageIcon(imageURLThree).getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT));

        playGif = new JLabel();
        playGif.setBounds(380, -230, 600, 650);
        playGif.setIcon(iconTwo);
        playGif.setVisible(true);

        labelPrt = new JLabel();
        labelPrt.setBounds(430, 200, 600, 650);
        labelPrt.setIcon(icon);
        labelPrt.setVisible(true);

        setUndecorated(true);
        getContentPane().setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));
        setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));
        setVisible(true);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 800);
        setIconImage(frameIcon.getImage());
        setLocationRelativeTo(null);

        Timer timer = new Timer(15000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                dispose();
                try {
                    new ArcadeBoxLoading();
                } catch (IOException | FontFormatException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        timer.setRepeats(false);
        timer.start();

        add(labelPrt);
        add(intro);
        add(noticeArea);
        add(playGif);
        add(credits);

    }
}
