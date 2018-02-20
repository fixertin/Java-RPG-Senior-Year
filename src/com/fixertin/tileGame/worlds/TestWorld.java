package com.fixertin.tileGame.worlds;

import java.awt.Graphics;

import com.fixertin.tileGame.actors.primitive.Actor;
import com.fixertin.tileGame.graphics.userInterface.MenuManager;

public class TestWorld extends World{

	public TestWorld(int width, int height) {
		super(width, height);

	}

	@Override
	public void tick() {
		for(Actor a : actors) {
			a.tick();
		}
	}

	@Override
	public void render(Graphics g) {
		for(Actor a : actors) {
			a.render(g);
		}
	}



}
