package com.fixertin.tileGame.graphics.userInterface;

import java.awt.*;
import java.util.Stack;

import com.fixertin.tileGame.actors.gameActors.basicGraphics.GameText;
import com.fixertin.tileGame.actors.gameActors.selectableGraphics.SelectableText;
import com.fixertin.tileGame.actors.util.ResourceManager;
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

		MenuItem goToTwo = new MenuItem(new SelectableText(30, 60, "Go To Second Menu", Color.RED,
				new Font(ResourceManager.gameFontName, Font.PLAIN, 20), null, Color.BLUE, null),goToTwoCommand);
		MenuItem goToThree = new MenuItem(new SelectableText(30, 75, "Go To Third Menu", Color.RED,
				new Font(ResourceManager.gameFontName, Font.PLAIN, 20), null, Color.BLUE, null),goToThreeCommand);
		MenuItem goBack = new MenuItem(new SelectableText(30, 60, "Back", Color.RED,
				new Font(ResourceManager.gameFontName, Font.PLAIN, 20), null, Color.BLUE, null),goBackCommand);

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
