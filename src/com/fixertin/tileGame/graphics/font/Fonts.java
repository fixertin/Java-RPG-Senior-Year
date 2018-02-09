package com.fixertin.tileGame.graphics.font;

import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

public class Fonts {
	public void loadFont(String path) {
		try {
		    GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		    InputStream myStream = new BufferedInputStream(new FileInputStream(path));
		    ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, myStream));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
