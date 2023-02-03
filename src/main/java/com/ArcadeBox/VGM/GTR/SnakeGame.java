package com.ArcadeBox.VGM.GTR;

import com.ArcadeBox.videoGameFrame.GameModules.KeyListeners.SecondKeyAdapter;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

import com.ArcadeBox.FontLoader.FontLoader;
import static com.ArcadeBox.FontLoader.FontLoader.jetBrainsMono;

public class SnakeGame extends JPanel implements ActionListener {
    public static final int B_WIDTH = 436;
    public static int B_HEIGHT = 390;
    public static int DOT_SIZE = 10;
    public static int ALL_DOTS = 900;
    public static int RAND_POS = 29;
    public static int DELAY = 140;

    public static int x[] = new int[ALL_DOTS];
    public static int y[] = new int[ALL_DOTS];

    public static int dots;
    public static int apple_x;
    public static int apple_y;

    public static boolean leftDirection = false;
    public static boolean rightDirection = true;
    public static boolean upDirection = false;
    public static boolean downDirection = false;
    public static boolean inGame = true;

    public static Timer timer;
    public static Image ball;
    public static Image apple;
    public static Image head;

    public SnakeGame() {

        initBoard();
    }

    private void initBoard() {

        addKeyListener(new SecondKeyAdapter());
        setBackground(Color.black);
        setFocusable(true);

        setPreferredSize(new Dimension(B_WIDTH, B_HEIGHT));
        setLayout(null);
        setBounds(0,0, 436,390);
        loadImages();
        initGame();
    }

    private void loadImages() {

        URL imageURLNine = getClass().getClassLoader().getResource("dot.png");
        ImageIcon iid = new ImageIcon(imageURLNine);
        ball = iid.getImage();

        URL imageURLTen = getClass().getClassLoader().getResource("apple.png");
        ImageIcon iia = new ImageIcon(imageURLTen);
        apple = iia.getImage();

        URL imageURLEleven = getClass().getClassLoader().getResource("head.png");
        ImageIcon iih = new ImageIcon(imageURLEleven);
        head = iih.getImage();
    }

    private void initGame() {

        dots = 3;

        for (int z = 0; z < dots; z++) {
            x[z] = 50 - z * 10;
            y[z] = 50;
        }

        locateApple();

        timer = new Timer(DELAY, this);
        timer.start();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        doDrawing(g);
    }

    private void doDrawing(Graphics g) {

        if (inGame) {

            g.drawImage(apple, apple_x, apple_y, this);

            for (int z = 0; z < dots; z++) {
                if (z == 0) {
                    g.drawImage(head, x[z], y[z], this);
                } else {
                    g.drawImage(ball, x[z], y[z], this);
                }
            }

            Toolkit.getDefaultToolkit().sync();

        } else {

            gameOver(g);
        }
    }

    private void gameOver(Graphics g) {

        String msg = "Game Over";
        Font small = jetBrainsMono.deriveFont(18f);
        FontMetrics metr = getFontMetrics(small);

        g.setColor(Color.white);
        g.setFont(small);
        g.drawString(msg, (B_WIDTH - metr.stringWidth(msg)) / 2, B_HEIGHT / 2);
    }

    private void checkApple() {

        if ((x[0] == apple_x) && (y[0] == apple_y)) {

            dots++;
            locateApple();
        }
    }

    private void move() {

        for (int z = dots; z > 0; z--) {
            x[z] = x[(z - 1)];
            y[z] = y[(z - 1)];
        }

        if (leftDirection) {
            x[0] -= DOT_SIZE;
        }

        if (rightDirection) {
            x[0] += DOT_SIZE;
        }

        if (upDirection) {
            y[0] -= DOT_SIZE;
        }

        if (downDirection) {
            y[0] += DOT_SIZE;
        }
    }

    private void checkCollision() {

        for (int z = dots; z > 0; z--) {

            if ((z > 4) && (x[0] == x[z]) && (y[0] == y[z])) {
                inGame = false;
            }
        }

        if (y[0] >= B_HEIGHT) {
            inGame = false;
        }

        if (y[0] < 0) {
            inGame = false;
        }

        if (x[0] >= B_WIDTH) {
            inGame = false;
        }

        if (x[0] < 0) {
            inGame = false;
        }

        if (!inGame) {
            timer.stop();
        }
    }

    private void locateApple() {

        int r = (int) (Math.random() * RAND_POS);
        apple_x = ((r * DOT_SIZE));

        r = (int) (Math.random() * RAND_POS);
        apple_y = ((r * DOT_SIZE));
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (inGame) {

            checkApple();
            checkCollision();
            move();
        }

        repaint();
    }
}
