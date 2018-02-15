package com.fixertin.tileGame.graphics.userInterface;

import java.awt.Graphics;
import java.util.Stack;

import com.fixertin.tileGame.graphics.userInterface.menus.Menu;
import com.fixertin.tileGame.worlds.BattleWorld;

public class MenuManager {

	public Stack<Menu> menuQueue;
	public BattleWorld world;
	
	public MenuManager(BattleWorld world) {
		this.world = world;
		menuQueue = new Stack<Menu>();
		test();
	}
	
	private void test() {

	}
	
	public void tick() {
		menuQueue.peek().tick();
	}
	public void render(Graphics g) {
		menuQueue.peek().render(g);
	}
	
}
