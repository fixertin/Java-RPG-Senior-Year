package com.fixertin.tileGame.actors.gameActors;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

import com.fixertin.tileGame.actors.primitive.Actor;

public class Test extends Actor{

	public Test(double x, double y) {
		super(x, y);
	}
	public Test(double x, double y, double velx, double vely) {
		super(x, y, velx, vely);
	}

	@Override
	public void tick() {
		x += velx;
		y += vely;
	}

	@Override
	public void drawThatCrap(Graphics g) {
		Rectangle r = new Rectangle((int)x, (int)y, 32, 32);
		g.setColor(Color.BLUE);
		g.drawRect(r.x, r.y, r.width, r.height);
	}

}
