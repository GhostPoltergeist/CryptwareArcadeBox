package com.ArcadeBox;

import WelcomePageInitial.welcome;
import com.ArcadeBox.videoGameFrame.mainFrame;
import com.formdev.flatlaf.FlatDarkLaf;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        try {UIManager.setLookAndFeel(new FlatDarkLaf());}
        catch (UnsupportedLookAndFeelException e) {throw new RuntimeException(e);}
        SwingUtilities.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        mainFrame gtw = null;
                        try {
                            gtw = new mainFrame();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        assert gtw != null;
                        gtw.setVisible(true);
                    }
                });
    }
}