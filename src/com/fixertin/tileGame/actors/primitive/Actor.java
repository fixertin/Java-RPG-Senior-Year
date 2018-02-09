package com.fixertin.tileGame.actors.primitive;

import com.fixertin.tileGame.actors.util.Renderable;
import com.fixertin.tileGame.actors.util.Tickable;

public abstract class Actor implements Tickable, Renderable {
	protected double x, y, velx, vely;

	/**
	 *
	 * @param x
	 * @param y
	 * @param velx
	 * @param vely
	 */
	public Actor(double x, double y, double velx, double vely) {
		this.x = x;
		this.y = y;
		this.velx = velx;
		this.vely = vely;
	}
	public Actor(double x, double y) {
		this.x = x;
		this.y = y;
		this.velx = 0;
		this.vely = 0;
	}
	
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public double getVelx() {
		return velx;
	}
	public void setVelx(double velx) {
		this.velx = velx;
	}
	public double getVely() {
		return vely;
	}
	public void setVely(double vely) {
		this.vely = vely;
	}
}
