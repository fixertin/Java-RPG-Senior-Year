package com.fixertin.tileGame.actors.gameActors;

import java.awt.Color;
import java.awt.Graphics;


public class AIBattleActor extends BattleActor{
	
	/**
	 * 
	 * @param x
	 * @param y
	 * @param hp
	 * @param name
	 * @param baseDamage
	 * @param speed
	 */
	public AIBattleActor(double x, double y, int hp, String name, int baseDamage, int speed) {
		super(x, y, hp, name, baseDamage, speed);
	}

	@Override
	public void tick() {
		x += velx;
		y += vely;
	}

	@Override
	public void render(Graphics g) {
		g.setColor(Color.RED);
		g.fillRect((int)x, (int)y, 32, 32);
	}


}
