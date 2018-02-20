package com.fixertin.tileGame.graphics.userInterface;

import java.awt.Graphics;
import java.util.Stack;

import com.fixertin.tileGame.actors.gameActors.basicGraphics.GameText;
import com.fixertin.tileGame.graphics.userInterface.command.Command;
import com.fixertin.tileGame.graphics.userInterface.command.GoBackMenuCommand;
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
		Command goBackCommand = new GoBackMenuCommand(menuQueue);

		MenuItem goToTwo = new MenuItem(new GameText(30, 60, "Go To Second Menu"),goToTwoCommand);
		MenuItem goToThree = new MenuItem(new GameText(30, 75, "Go to third menu"),goToThreeCommand);
		MenuItem goBack = new MenuItem(new GameText(30, 60, "Back"),goBackCommand);

		firstMenu.addMenuItem(goToTwo);
		firstMenu.addMenuItem(goToThree);
		secondMenu.addMenuItem(goBack);
		thirdMenu.addMenuItem(goBack);

		menuQueue.push(firstMenu);
	}
	
	public void tick() {
		menuQueue.peek().tick();
	}
	public void render(Graphics g) {
		menuQueue.peek().render(g);
	}
	
}
