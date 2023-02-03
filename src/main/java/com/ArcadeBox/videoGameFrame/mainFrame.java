package com.ArcadeBox.videoGameFrame;

import com.ArcadeBox.videoGameFrame.GameModules.KeyListeners.FirstKeyAdapter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.net.URL;

import static com.ArcadeBox.FontLoader.FontLoader.*;

public class mainFrame extends JFrame implements MouseListener {
    public static JFrame videoGameFrame;
    public static JButton upperBtn, downBtn, leftBtn, rightBtn, midSelectBtn;
    public static JButton selectBtn, selectTwoBtn, backBtn, pauseBtn;
    public static JLabel arcadeBoxTitle, circleLayout, snowFlakeEffect;
    public static JLabel titleBar, gameOne, gameTwo, gameThree, gameFour, gamePointer;
    public static JPanel mainPanel;
    public mainFrame() throws IOException {
        loadFonts();

        titleBar = new JLabel("Box of Games");
        titleBar.setFont(jetBrainsMono.deriveFont(20f));
        titleBar.setOpaque(false);
        titleBar.setBackground(Color.BLACK);
        titleBar.setForeground(new Color(0x00FFFF));
        titleBar.setBounds(6, 10, 300,50);

        gameOne = new JLabel("▷ SnakeGame");
        gameOne.setFont(jetBrainsMono.deriveFont(20f));
        gameOne.setOpaque(false);
        gameOne.setBackground(Color.BLACK);
        gameOne.setForeground(new Color(0x00FFFF));
        gameOne.setBounds(6, 40, 300,50);

        gameTwo = new JLabel("▷ Sudoku");
        gameTwo.setFont(jetBrainsMono.deriveFont(20f));
        gameTwo.setOpaque(false);
        gameTwo.setBackground(Color.BLACK);
        gameTwo.setForeground(new Color(0x00FFFF));
        gameTwo.setBounds(6, 80, 300,50);

        gameThree = new JLabel("▷ NumberGame");
        gameThree.setFont(jetBrainsMono.deriveFont(20f));
        gameThree.setOpaque(false);
        gameThree.setBackground(Color.BLACK);
        gameThree.setForeground(new Color(0x00FFFF));
        gameThree.setBounds(6, 120, 300,50);

        gameFour = new JLabel("▷ Ladder");
        gameFour.setFont(jetBrainsMono.deriveFont(20f));
        gameFour.setOpaque(false);
        gameFour.setBackground(Color.BLACK);
        gameFour.setForeground(new Color(0x00FFFF));
        gameFour.setBounds(6, 160, 300,50);

        gamePointer = new JLabel(" ◀");
        gamePointer.setFont(jetBrainsMono.deriveFont(20f));
        gamePointer.setOpaque(false);
        gamePointer.setBackground(Color.BLACK);
        gamePointer.setForeground(Color.ORANGE);
        gamePointer.setBounds(155, 40, 300,50);

        arcadeBoxTitle = new JLabel("Cryptware ArcadeBox");
        arcadeBoxTitle.setFont(pressStart.deriveFont(16f));
        arcadeBoxTitle.setBounds(75,8, 500,50);

        URL imageURLFour = getClass().getClassLoader().getResource("snow02.gif");
        ImageIcon snowFlakes = new ImageIcon(new ImageIcon(imageURLFour).getImage().getScaledInstance(436,390, Image.SCALE_DEFAULT));

        URL imageURLFive = getClass().getClassLoader().getResource("box.png");
        ImageIcon frameIcon = new ImageIcon(new ImageIcon(imageURLFive).getImage().getScaledInstance(551,591, Image.SCALE_DEFAULT));

        snowFlakeEffect = new JLabel();
        snowFlakeEffect.setIcon(snowFlakes);
        snowFlakeEffect.setBounds(0, 0, 436, 390);

        mainPanel = new JPanel();
        mainPanel.setBounds(10, 65, 436,390);
        mainPanel.setFont(pressStart.deriveFont(20f));
        mainPanel.setBackground(Color.BLACK);
        mainPanel.setLayout(null);
        mainPanel.add(titleBar);
        mainPanel.add(gameOne);
        mainPanel.add(snowFlakeEffect);
        mainPanel.add(gameTwo);
        mainPanel.add(gameThree);
        mainPanel.add(gameFour);
        mainPanel.add(gamePointer);

        /* DIFFERENT FONT SIZING */

        circleLayout = new JLabel("○");
        circleLayout.setBounds(25,490,300,301);
        circleLayout.setFont(babelStones.deriveFont(170f));

        upperBtn = new JButton("△");
        upperBtn.setFont(jetBrainsMono.deriveFont(53f));
        upperBtn.setBounds(80,553,60,60);
        upperBtn.setOpaque(false);
        upperBtn.setForeground(Color.LIGHT_GRAY);
        upperBtn.setContentAreaFilled(false);
        upperBtn.setBorderPainted(false);
        upperBtn.setFocusable(false);
        upperBtn.addMouseListener(this);
        upperBtn.setEnabled(false);

        downBtn = new JButton("▽");
        downBtn.setFont(jetBrainsMono.deriveFont(53f));
        downBtn.setBounds(80,645,60,60);
        downBtn.setOpaque(false);
        downBtn.setContentAreaFilled(false);
        downBtn.setBorderPainted(false);
        downBtn.setForeground(Color.LIGHT_GRAY);
        downBtn.setFocusable(false);
        downBtn.addMouseListener(this);
        downBtn.setEnabled(false);

        leftBtn = new JButton("◁");
        leftBtn.setFont(jetBrainsMono.deriveFont(53f));
        leftBtn.setBounds(37,598,60,60);
        leftBtn.setOpaque(false);
        leftBtn.setContentAreaFilled(false);
        leftBtn.setBorderPainted(false);
        leftBtn.setFocusable(false);
        leftBtn.setForeground(Color.LIGHT_GRAY);
        leftBtn.addMouseListener(this);
        leftBtn.setEnabled(false);

        rightBtn = new JButton("▷");
        rightBtn.setFont(jetBrainsMono.deriveFont(53f));
        rightBtn.setBounds(125,598,60,60);
        rightBtn.setOpaque(false);
        rightBtn.setContentAreaFilled(false);
        rightBtn.setBorderPainted(false);
        rightBtn.setForeground(Color.LIGHT_GRAY);
        rightBtn.setFocusable(false);
        rightBtn.addMouseListener(this);
        rightBtn.setEnabled(false);

        midSelectBtn = new JButton("●");
        midSelectBtn.setFont(jetBrainsMono.deriveFont(53f));
        midSelectBtn.setBounds(80,597,60,60);
        midSelectBtn.setOpaque(false);
        midSelectBtn.setContentAreaFilled(false);
        midSelectBtn.setBorderPainted(false);
        midSelectBtn.setFocusable(false);
        midSelectBtn.setForeground(Color.LIGHT_GRAY);
        midSelectBtn.addMouseListener(this);
        midSelectBtn.setEnabled(false);

        selectBtn = new JButton("A");
        selectBtn.setFont(pressStart.deriveFont(40f));
        selectBtn.setBounds(333,520,70,70);
        selectBtn.setOpaque(false);
        selectBtn.setContentAreaFilled(false);
        selectBtn.setBorderPainted(false);
        selectBtn.setFocusable(false);
        selectBtn.setForeground(Color.LIGHT_GRAY);
        selectBtn.addMouseListener(this);
        selectBtn.setEnabled(false);

        backBtn = new JButton("B");
        backBtn.setFont(pressStart.deriveFont(40f));
        backBtn.setBounds(368,576,70,70);
        backBtn.setOpaque(false);
        backBtn.setContentAreaFilled(false);
        backBtn.setBorderPainted(false);
        backBtn.setFocusable(false);
        backBtn.setForeground(Color.LIGHT_GRAY);
        backBtn.addMouseListener(this);
        backBtn.setEnabled(false);

        pauseBtn = new JButton("C");
        pauseBtn.setFont(pressStart.deriveFont(40f));
        pauseBtn.setBounds(340,630,75,75);
        pauseBtn.setOpaque(false);
        pauseBtn.setContentAreaFilled(false);
        pauseBtn.setBorderPainted(false);
        pauseBtn.setFocusable(false);
        pauseBtn.setForeground(Color.LIGHT_GRAY);
        pauseBtn.addMouseListener(this);
        pauseBtn.setEnabled(false);

        selectTwoBtn = new JButton("S");
        selectTwoBtn.setFont(pressStart.deriveFont(40f));
        selectTwoBtn.setBounds(296,585,70,70);
        selectTwoBtn.setOpaque(false);
        selectTwoBtn.setContentAreaFilled(false);
        selectTwoBtn.setBorderPainted(false);
        selectTwoBtn.setFocusable(false);
        selectTwoBtn.setForeground(Color.LIGHT_GRAY);
        selectTwoBtn.addMouseListener(this);
        selectTwoBtn.setEnabled(true);

        videoGameFrame = new JFrame();
        videoGameFrame.setSize(470, 820);
        videoGameFrame.setLocationRelativeTo(null);
        videoGameFrame.setLayout(null);
        videoGameFrame.setResizable(false);
        videoGameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        videoGameFrame.setVisible(true);
        videoGameFrame.setFocusable(true);
        videoGameFrame.setIconImage(frameIcon.getImage());
        videoGameFrame.addKeyListener(new FirstKeyAdapter());

        videoGameFrame.add(upperBtn);
        videoGameFrame.add(downBtn);
        videoGameFrame.add(leftBtn);
        videoGameFrame.add(rightBtn);
        videoGameFrame.add(midSelectBtn);

        videoGameFrame.add(selectBtn);
        videoGameFrame.add(selectTwoBtn);
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
        if (e.getSource()==selectTwoBtn) {
            selectTwoBtn.setForeground(Color.GREEN);
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
        if (e.getSource()==selectTwoBtn) {
            selectTwoBtn.setForeground(Color.LIGHT_GRAY);
        }
        if (e.getSource()==backBtn) {
            backBtn.setForeground(Color.LIGHT_GRAY);
        }
        if (e.getSource()==pauseBtn) {
            pauseBtn.setForeground(Color.LIGHT_GRAY);
        }
    }
}

