package com.ArcadeBox.videoGameFrame.GameModules.KeyListeners;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import static com.ArcadeBox.VGM.GTR.SnakeGame.*;
import static com.ArcadeBox.videoGameFrame.mainFrame.*;

public class SecondKeyAdapter extends KeyAdapter {

    public void keyPressed(KeyEvent e) {

        int key = e.getKeyCode();

        if ((key == 37) && (!rightDirection)) {
            leftBtn.setForeground(Color.RED);
            leftDirection = true;
            upDirection = false;
            downDirection = false;
        }

        if ((key == 39) && (!leftDirection)) {
            rightBtn.setForeground(Color.RED);
            rightDirection = true;
            upDirection = false;
            downDirection = false;
        }

        if ((key == 38) && (!downDirection)) {
            upperBtn.setForeground(Color.RED);
            upDirection = true;
            rightDirection = false;
            leftDirection = false;
        }

        if ((key == 40) && (!upDirection)) {
            downBtn.setForeground(Color.RED);
            downDirection = true;
            rightDirection = false;
            leftDirection = false;
        }
    }

    public void keyReleased(KeyEvent er) {

        int keyCode = er.getKeyCode();

        switch (keyCode) {
            case 38 -> upperBtn.setForeground(Color.LIGHT_GRAY);
            case 37 -> leftBtn.setForeground(Color.LIGHT_GRAY);
            case 39 -> rightBtn.setForeground(Color.LIGHT_GRAY);
            case 40 -> downBtn.setForeground(Color.LIGHT_GRAY);
        }
    }
}
