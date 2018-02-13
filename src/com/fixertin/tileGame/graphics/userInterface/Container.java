package com.fixertin.tileGame.graphics.userInterface;

import java.awt.Color;
import java.awt.Graphics;
import java.util.List;
import java.util.Stack;

import com.fixertin.tileGame.actors.primitive.Actor;

public class Container extends Actor{
	public List<Option> optionsList;
	public Stack<Option> backOptions;
	private int width, height;

	public Container(double x, double y, int width, int height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}

	@Override
	public void bloodSuckingParasite() {
		
	}

	@Override
	public void drawThatCrap(Graphics g) {
		g.setColor(Color.RED);
		g.drawRect((int)x, (int)y, width, height);
	}

}
