package com.ArcadeBox.videoGameFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class mainFrame extends JFrame implements MouseListener, KeyListener {
    JFrame videoGameFrame;
    JButton upperBtn, downBtn, leftBtn, rightBtn, midSelectBtn;
    JButton selectBtn, backBtn, pauseBtn;
    JLabel arcadeBoxTitle, circleLayout, snowFlakeEffect;
    JLabel titleBar, gameOne, gameTwo, gameThree, gameFour, gamePointer;
    JPanel mainPanel;
    public mainFrame() {
        titleBar = new JLabel("Box of Games | Enjoy!");
        titleBar.setFont(new Font("Quantico", Font.BOLD, 20));
        titleBar.setOpaque(false);
        titleBar.setBackground(Color.BLACK);
        titleBar.setForeground(Color.GREEN);
        titleBar.setBounds(10, 20, 300,50);

        arcadeBoxTitle = new JLabel("Arcade Box");
        arcadeBoxTitle.setFont(new Font("Press Start 2P", Font.BOLD, 16));
        arcadeBoxTitle.setBounds(10,8, 500,50);

        ImageIcon snowFlakes = new ImageIcon(new ImageIcon("snow02.gif").getImage().getScaledInstance(436,390, Image.SCALE_DEFAULT));

        snowFlakeEffect = new JLabel();
        snowFlakeEffect.setIcon(snowFlakes);
        snowFlakeEffect.setBounds(0, 0, 436, 390);

        mainPanel = new JPanel();
        mainPanel.setBounds(10, 65, 436,390);
        mainPanel.setFont(new Font("Electrolize", Font.PLAIN, 20));
        mainPanel.setBackground(Color.BLACK);
        mainPanel.setLayout(null);
        mainPanel.add(titleBar);
        mainPanel.add(snowFlakeEffect);

        circleLayout = new JLabel("○");
        circleLayout.setBounds(2,470,300,300);
        circleLayout.setFont(new Font("Press Start", Font.PLAIN, 250));

        upperBtn = new JButton("△");
        upperBtn.setFont(new Font("JetBrains Mono", Font.BOLD, 50));
        upperBtn.setBounds(80,553,60,60);
        upperBtn.setOpaque(false);
        upperBtn.setForeground(Color.LIGHT_GRAY);
        upperBtn.setContentAreaFilled(false);
        upperBtn.setBorderPainted(false);
        upperBtn.setFocusable(false);
        upperBtn.addMouseListener(this);

        downBtn = new JButton("▽");
        downBtn.setFont(new Font("JetBrains Mono", Font.BOLD, 50));
        downBtn.setBounds(80,645,60,60);
        downBtn.setOpaque(false);
        downBtn.setContentAreaFilled(false);
        downBtn.setBorderPainted(false);
        downBtn.setForeground(Color.LIGHT_GRAY);
        downBtn.setFocusable(false);
        downBtn.addMouseListener(this);

        leftBtn = new JButton("◁");
        leftBtn.setFont(new Font("JetBrains Mono", Font.BOLD, 50));
        leftBtn.setBounds(37,598,60,60);
        leftBtn.setOpaque(false);
        leftBtn.setContentAreaFilled(false);
        leftBtn.setBorderPainted(false);
        leftBtn.setFocusable(false);
        leftBtn.setForeground(Color.LIGHT_GRAY);
        leftBtn.addMouseListener(this);

        rightBtn = new JButton("▷");
        rightBtn.setFont(new Font("JetBrains Mono", Font.BOLD, 50));
        rightBtn.setBounds(125,598,60,60);
        rightBtn.setOpaque(false);
        rightBtn.setContentAreaFilled(false);
        rightBtn.setBorderPainted(false);
        rightBtn.setForeground(Color.LIGHT_GRAY);
        rightBtn.setFocusable(false);
        rightBtn.addMouseListener(this);

        midSelectBtn = new JButton("●");
        midSelectBtn.setFont(new Font("JetBrains Mono", Font.BOLD, 50));
        midSelectBtn.setBounds(80,597,60,60);
        midSelectBtn.setOpaque(false);
        midSelectBtn.setContentAreaFilled(false);
        midSelectBtn.setBorderPainted(false);
        midSelectBtn.setFocusable(false);
        midSelectBtn.setForeground(Color.LIGHT_GRAY);
        midSelectBtn.addMouseListener(this);

        selectBtn = new JButton("Ⓐ");
        selectBtn.setFont(new Font("Press Start", Font.PLAIN, 65));
        selectBtn.setBounds(330,540,70,70);
        selectBtn.setOpaque(false);
        selectBtn.setContentAreaFilled(false);
        selectBtn.setBorderPainted(false);
        selectBtn.setFocusable(false);
        selectBtn.setForeground(Color.LIGHT_GRAY);
        selectBtn.addMouseListener(this);
        selectBtn.addKeyListener(this);

        backBtn = new JButton("Ⓑ");
        backBtn.setFont(new Font("Press Start", Font.PLAIN, 65));
        backBtn.setBounds(370,580,70,70);
        backBtn.setOpaque(false);
        backBtn.setContentAreaFilled(false);
        backBtn.setBorderPainted(false);
        backBtn.setFocusable(false);
        backBtn.setForeground(Color.LIGHT_GRAY);
        backBtn.addMouseListener(this);

        pauseBtn = new JButton("Ⓒ");
        pauseBtn.setFont(new Font("Press Start", Font.PLAIN, 65));
        pauseBtn.setBounds(340,625,75,75);
        pauseBtn.setOpaque(false);
        pauseBtn.setContentAreaFilled(false);
        pauseBtn.setBorderPainted(false);
        pauseBtn.setFocusable(false);
        pauseBtn.setForeground(Color.LIGHT_GRAY);
        pauseBtn.addMouseListener(this);

        videoGameFrame = new JFrame();
        videoGameFrame.setSize(470, 820);
        videoGameFrame.setLocationRelativeTo(null);
        videoGameFrame.setLayout(null);
        videoGameFrame.setResizable(false);
        videoGameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        videoGameFrame.setVisible(true);
        videoGameFrame.setFocusable(true);
        videoGameFrame.addKeyListener(this);

        videoGameFrame.add(upperBtn);
        videoGameFrame.add(downBtn);
        videoGameFrame.add(leftBtn);
        videoGameFrame.add(rightBtn);
        videoGameFrame.add(midSelectBtn);

        videoGameFrame.add(selectBtn);
        videoGameFrame.add(backBtn);
        videoGameFrame.add(pauseBtn);
        videoGameFrame.add(circleLayout);

        videoGameFrame.add(arcadeBoxTitle);

        videoGameFrame.add(mainPanel);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if (e.getSource()==upperBtn) {
            upperBtn.setForeground(Color.RED);
        }
        if (e.getSource()==rightBtn) {
            rightBtn.setForeground(Color.RED);
        }
        if (e.getSource()==leftBtn) {
            leftBtn.setForeground(Color.RED);
        }
        if (e.getSource()==downBtn) {
            downBtn.setForeground(Color.RED);
        }
        if (e.getSource()==midSelectBtn) {
            midSelectBtn.setForeground(Color.RED);
        }
        if (e.getSource()==selectBtn) {
            selectBtn.setForeground(Color.GREEN);
        }
        if (e.getSource()==backBtn) {
            backBtn.setForeground(Color.GREEN);
        }
        if (e.getSource()==pauseBtn) {
            pauseBtn.setForeground(Color.GREEN);
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if (e.getSource()==upperBtn) {
            upperBtn.setForeground(Color.LIGHT_GRAY);
        }
        if (e.getSource()==rightBtn) {
            rightBtn.setForeground(Color.LIGHT_GRAY);
        }
        if (e.getSource()==leftBtn) {
            leftBtn.setForeground(Color.LIGHT_GRAY);
        }
        if (e.getSource()==downBtn) {
            downBtn.setForeground(Color.LIGHT_GRAY);
        }
        if (e.getSource()==midSelectBtn) {
            midSelectBtn.setForeground(Color.LIGHT_GRAY);
        }
        if (e.getSource()==selectBtn) {
            selectBtn.setForeground(Color.LIGHT_GRAY);
        }
        if (e.getSource()==backBtn) {
            backBtn.setForeground(Color.LIGHT_GRAY);
        }
        if (e.getSource()==pauseBtn) {
            pauseBtn.setForeground(Color.LIGHT_GRAY);
        }
    }

    @Override
    public void keyTyped(KeyEvent er) {
        switch (er.getKeyChar()) {
            case 'A' -> selectBtn.setForeground(Color.GREEN);
            case 'B' -> backBtn.setForeground(Color.GREEN);
            case 'C' -> pauseBtn.setForeground(Color.GREEN);
        }
    }

    @Override
    public void keyPressed(KeyEvent er) {
        int keyCode = er.getKeyCode();
        switch (keyCode) {
            case 38 -> upperBtn.setForeground(Color.RED);
            case 37 -> leftBtn.setForeground(Color.RED);
            case 39 -> rightBtn.setForeground(Color.RED);
            case 40 -> downBtn.setForeground(Color.RED);
            case 10 -> midSelectBtn.setForeground(Color.RED);
            case 65 -> selectBtn.setForeground(Color.GREEN);
            case 66 -> backBtn.setForeground(Color.GREEN);
            case 67 -> pauseBtn.setForeground(Color.GREEN);
        }
    }

    @Override
    public void keyReleased(KeyEvent er) {
        int keyCode = er.getKeyCode();
        switch (keyCode) {
            case 38 -> upperBtn.setForeground(Color.LIGHT_GRAY);
            case 37 -> leftBtn.setForeground(Color.LIGHT_GRAY);
            case 39 -> rightBtn.setForeground(Color.LIGHT_GRAY);
            case 40 -> downBtn.setForeground(Color.LIGHT_GRAY);
            case 10 -> midSelectBtn.setForeground(Color.LIGHT_GRAY);
            case 65 -> selectBtn.setForeground(Color.LIGHT_GRAY);
            case 66 -> backBtn.setForeground(Color.LIGHT_GRAY);
            case 67 -> pauseBtn.setForeground(Color.LIGHT_GRAY);
        }
    }
}
