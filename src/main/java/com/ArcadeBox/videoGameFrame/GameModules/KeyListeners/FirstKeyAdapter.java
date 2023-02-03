package com.ArcadeBox.videoGameFrame.GameModules.KeyListeners;

import com.ArcadeBox.VGM.GTR.SnakeGame;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import static com.ArcadeBox.videoGameFrame.mainFrame.*;

public class FirstKeyAdapter extends KeyAdapter {

    @Override
    public void keyPressed(KeyEvent er) {
        int keyCode = er.getKeyCode();
        switch (keyCode) {
            case 49 -> gamePointer.setBounds(155, 40, 300, 50);
            case 50 -> gamePointer.setBounds(155, 80, 300, 50);
            case 51 -> gamePointer.setBounds(155, 120, 300, 50);
            case 52 -> gamePointer.setBounds(155, 160, 300, 50);
            case 37 -> leftBtn.setForeground(Color.RED);
            case 38 -> rightBtn.setForeground(Color.RED);
            case 39 -> upperBtn.setForeground(Color.RED);
            case 40 -> downBtn.setForeground(Color.RED);
            case 83 -> selectTwoBtn.setForeground(Color.GREEN);
            case 10 -> midSelectBtn.setForeground(Color.RED);
            case 65 -> selectBtn.setForeground(Color.GREEN);
            case 66 -> backBtn.setForeground(Color.GREEN);
            case 67 -> pauseBtn.setForeground(Color.GREEN);
        }

        if (er.getKeyCode()==83 && gamePointer.getY()==40) {
            mainPanel.remove(titleBar);
            mainPanel.remove(gameOne);
            mainPanel.remove(gameTwo);
            mainPanel.remove(gameThree);
            mainPanel.remove(gameFour);
            mainPanel.remove(gamePointer);
            mainPanel.remove(snowFlakeEffect);

            upperBtn.setEnabled(true);
            downBtn.setEnabled(true);
            leftBtn.setEnabled(true);
            rightBtn.setEnabled(true);
            midSelectBtn.setEnabled(true);
            selectBtn.setEnabled(true);
            pauseBtn.setEnabled(true);
            selectTwoBtn.setEnabled(false);

            mainPanel.add(new SnakeGame());

            videoGameFrame.removeKeyListener(this);

            videoGameFrame.addKeyListener(new SecondKeyAdapter());
        }
    }

    @Override
    public void keyReleased(KeyEvent er) {
        int keyCode = er.getKeyCode();
        switch (keyCode) {
            case 38 -> upperBtn.setForeground(Color.LIGHT_GRAY);
            case 83 -> selectTwoBtn.setForeground(Color.LIGHT_GRAY);
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
