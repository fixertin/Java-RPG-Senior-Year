package com.fixertin.tileGame.graphics.userInterface;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import com.fixertin.tileGame.graphics.userInterface.menus.previousMenus.Menu;
import com.fixertin.tileGame.graphics.userInterface.menus.previousMenus.TestMenu1_1;
import com.fixertin.tileGame.graphics.userInterface.menus.previousMenus.AttackMenu;
import com.fixertin.tileGame.graphics.userInterface.menus.previousMenus.TestMenu2_2;
import com.fixertin.tileGame.worlds.BattleWorld;

public class MenuManager {
	public static List<Menu> possibleMenus;
	public static Stack<Menu> menuQueue;
	public BattleWorld world;
	
	public MenuManager(BattleWorld world) {
		this.world = world;
		possibleMenus = new ArrayList<Menu>();
		menuQueue = new Stack<Menu>();
		test();
	}
	
	private void test() {
		possibleMenus.add(new TestMenu1_1(world));
		possibleMenus.add(new AttackMenu(world));
		possibleMenus.add(new TestMenu2_2(world));
		menuQueue.push(possibleMenus.get(0));
	}
	
	public void tick() {
		menuQueue.peek().tick();
	}
	public void render(Graphics g) {
		menuQueue.peek().render(g);
	}
	
}
