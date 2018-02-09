package com.fixertin.tileGame.actors.gameActors;

import java.awt.Color;
import java.awt.Graphics;

public class PlayerBattleActor extends BattleActor{
	
	/**
	 * 
	 * @param x
	 * @param y
	 * @param hp
	 * @param name
	 * @param baseDamage
	 * @param speed
	 */
	public PlayerBattleActor(double x, double y, int hp, String name, int baseDamage, int speed) {
		super(x, y, hp, name, baseDamage, speed);
	}

	@Override
	public void tick() {
		x += velx;
		y += vely;
	}

	@Override
	public void render(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillRect((int)x, (int)y, 32, 32);
	}
	
	public void attack(BattleActor a) {
		a.setHp(a.getHp() - baseDamage);
	}

}
