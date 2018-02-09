package com.fixertin.tileGame.actors.util;


import com.fixertin.tileGame.graphics.font.Fonts;

public class ResourceManager {
	private Fonts fonts;
	
	public static String gameFontName = "VCR OSD Mono";
		
	public ResourceManager() {
		fonts = new Fonts();
	}
	
	public void loadAllResources() {
		loadFont("res/fonts/gameFont.ttf");
	}
	
	//Resource Loader
	private void loadFont(String path) {
		fonts.loadFont(path);
	}
}
