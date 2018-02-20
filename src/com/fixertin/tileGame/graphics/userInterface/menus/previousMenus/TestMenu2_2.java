package com.fixertin.tileGame.graphics.userInterface.menus.previousMenus;

import java.awt.Color;
import java.awt.Graphics;

import com.fixertin.tileGame.graphics.userInterface.ActionOption;
import com.fixertin.tileGame.graphics.userInterface.MenuManager;
import com.fixertin.tileGame.worlds.BattleWorld;

public class TestMenu2_2 extends Menu {
	
	
	public TestMenu2_2(BattleWorld world) {
		super(world);
		optionList.add(new ActionOption(100, 150, "Back"));
		addEnemyOptions();
	}

	private void addEnemyOptions(){

	}

	@Override
	public void render(Graphics g) {
		for(ActionOption a : optionList) {
			g.setColor(Color.WHITE);
			if(getActiveOption() == a) {
				g.setColor(Color.RED);
			}
			a.render(g);
		}
	}

	@Override
	public void doActiveOptionAction() {
		ActionOption activeOption = getActiveOption();
		if(activeOption == optionList.get(0)) {
			System.out.println("back");
			//MenuManager.menuQueue.pop();
		} else if(activeOption == optionList.get(1)) {

		} else if(activeOption == optionList.get(2)) {

		}
	}

}
