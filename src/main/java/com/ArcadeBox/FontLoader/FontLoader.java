package com.ArcadeBox.FontLoader;

import java.awt.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class FontLoader {
    public static Font jetBrainsMono, pressStart, quantico, electrolize, babelStones, freeFonts = null;
    public static void loadFonts() {

        try {

            InputStream stream = ClassLoader.getSystemClassLoader().getResourceAsStream("JetBrainsMono-Bold.ttf");
            jetBrainsMono = Font.createFont(Font.TRUETYPE_FONT, stream).deriveFont(15f);
            InputStream streamTwo = ClassLoader.getSystemClassLoader().getResourceAsStream("PressStart2P-Regular.ttf");
            pressStart = Font.createFont(Font.TRUETYPE_FONT, streamTwo).deriveFont(15f);
            InputStream streamThree = ClassLoader.getSystemClassLoader().getResourceAsStream("Quantico-Bold.ttf");
            quantico = Font.createFont(Font.TRUETYPE_FONT, streamThree).deriveFont(15f);
            InputStream streamFour  = ClassLoader.getSystemClassLoader().getResourceAsStream("Electrolize-Regular.ttf");
            electrolize = Font.createFont(Font.TRUETYPE_FONT, streamFour).deriveFont(15f);
            InputStream streamFive = ClassLoader.getSystemClassLoader().getResourceAsStream("BabelStoneShapes.ttf");
            babelStones = Font.createFont(Font.TRUETYPE_FONT, streamFive).deriveFont(15f);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
