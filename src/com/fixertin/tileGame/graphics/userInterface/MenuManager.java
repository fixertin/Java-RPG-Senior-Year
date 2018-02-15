package com.fixertin.tileGame.graphics.userInterface;

import java.awt.Graphics;
import java.util.Stack;

import com.fixertin.tileGame.actors.gameActors.basicGraphics.GameText;
import com.fixertin.tileGame.graphics.userInterface.command.Command;
import com.fixertin.tileGame.graphics.userInterface.command.GoToNewMenuCommand;
import com.fixertin.tileGame.graphics.userInterface.menus.Menu;
import com.fixertin.tileGame.graphics.userInterface.menus.MenuItem;
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
		Menu firstMenu = new Menu();
		Menu secondMenu = new Menu();
		Menu thirdMenu = new Menu();

		Command goToTwoCommand = new GoToNewMenuCommand(menuQueue, secondMenu);
		Command goToThreeCommand = new GoToNewMenuCommand(menuQueue, thirdMenu);
		MenuItem goToTwo = new MenuItem(new GameText(30, 40, "Go To Second Menu"),goToTwoCommand);
		firstMenu.addMenuItem(goToTwo);

	}
	
	public void tick() {
		menuQueue.peek().tick();
	}
	public void render(Graphics g) {
		menuQueue.peek().render(g);
	}
	
}
