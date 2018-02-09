package com.fixertin.tileGame.worlds;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import com.fixertin.tileGame.actors.primitive.Actor;

public abstract class World {
	protected int width;
	protected int height;
	protected List<Actor> actors;
	
	public World(int width, int height) {
		this.width = width;
		this.height = height;
		actors = new ArrayList<Actor>();
	}
	
	public abstract void tick();
	public abstract void render(Graphics g);
	
	public void addObject(Actor a) {
		actors.add(a);
	}
	
	public List<Actor> getActors() {
		return actors;
	}
	public void setActors(List<Actor> actors) {
		this.actors = actors;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
}
