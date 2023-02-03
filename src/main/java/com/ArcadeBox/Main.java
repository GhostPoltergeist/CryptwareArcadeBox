package com.ArcadeBox;

import com.ArcadeBox.WelcomePageInitial.welcome;
import com.formdev.flatlaf.FlatDarkLaf;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        try {UIManager.setLookAndFeel(new FlatDarkLaf());}
        catch (UnsupportedLookAndFeelException e) {throw new RuntimeException(e);}
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                welcome gtw = null;
                try {
                    gtw = new welcome();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                assert gtw != null;
                gtw.setVisible(true);
            }
        });
    }
}