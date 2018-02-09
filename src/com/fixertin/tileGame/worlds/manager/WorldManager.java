package com.fixertin.tileGame.worlds.manager;

import java.awt.Graphics;

import com.fixertin.tileGame.main.Main;
import com.fixertin.tileGame.worlds.BattleWorld;
import com.fixertin.tileGame.worlds.World;

public class WorldManager {
	private World activeWorld;
	public World test;
	
	public WorldManager() {
		
	}
	
	public void init() {
		test = new BattleWorld(Main.WIDTH, Main.HEIGHT);
		
		//set the active world
		activeWorld = test;
		
	}
	
	public void tick() {
		if(activeWorld != null)
			activeWorld.tick();
	}
	
	public void render(Graphics g) {
		if(activeWorld != null)
			activeWorld.render(g);
	}
	
	public World getActiveWorld() {
		return activeWorld;
	}
	public void setActiveWorld(World world) {
		activeWorld = world;
	}
	
}
