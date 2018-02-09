package com.fixertin.tileGame.graphics.userInterface.menus.previousMenus;

import java.awt.Color;
import java.awt.Graphics;

import com.fixertin.tileGame.graphics.userInterface.ActionOption;
import com.fixertin.tileGame.graphics.userInterface.MenuManager;
import com.fixertin.tileGame.worlds.BattleWorld;

public class AttackMenu extends Menu {

	public AttackMenu(BattleWorld world) {
		super(world);
		optionList.add(new ActionOption(100, 100, "Option 2_1_1"));
		optionList.add(new ActionOption(100, 125, "Option 2_1_2"));
		optionList.add(new ActionOption(100, 150, "Back"));
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

		} else if(activeOption == optionList.get(1)) {

		} else if(activeOption == optionList.get(2)) {
			System.out.println("back");
			MenuManager.menuQueue.pop();
		}
	}

}
