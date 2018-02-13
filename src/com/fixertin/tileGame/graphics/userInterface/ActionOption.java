package com.fixertin.tileGame.graphics.userInterface;

import java.awt.Font;
import java.awt.Graphics;

import com.fixertin.tileGame.actors.primitive.Actor;
import com.fixertin.tileGame.actors.util.ResourceManager;
import com.fixertin.tileGame.worlds.BattleWorld;

public class ActionOption extends Actor implements Option{
	private String displayText;

	public ActionOption(double x, double y) {
		super(x, y);
	}
	public ActionOption(double x, double y, String displayText) {
		super(x, y);
		this.displayText = displayText;
	}

	@Override
	public void execute(BattleWorld world) {
		
	}

	@Override
	public void bloodSuckingParasite() {
		
	}

	@Override
	public void drawThatCrap(Graphics g) {
		g.setFont(new Font(ResourceManager.gameFontName, Font.PLAIN, 20));
		g.drawString(displayText, (int)x, (int)y);
	}

}
