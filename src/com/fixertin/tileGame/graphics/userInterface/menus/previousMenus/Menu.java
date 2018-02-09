package com.fixertin.tileGame.graphics.userInterface.menus.previousMenus;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import com.fixertin.tileGame.actors.util.KeyManager;
import com.fixertin.tileGame.graphics.userInterface.ActionOption;
import com.fixertin.tileGame.worlds.BattleWorld;

public abstract class Menu {
	protected List<ActionOption> optionList = new ArrayList<ActionOption>();
	protected int activeIndex;
	protected BattleWorld world;

	public Menu(BattleWorld world) {
		activeIndex = 0;
		this.world = world;
	}
	
	public void tick() {
		//input
		if(KeyManager.keyJustPressed(KeyEvent.VK_S) && optionList.size() != 1) {
			if(activeIndex < optionList.size()-1) {
				activeIndex++;
				System.out.println("index goes up");
			}else {
				activeIndex = 0;
				System.out.println("index goes to 0");
			}
			System.out.println(activeIndex);
			System.out.println(optionList.size());
		}
		if(KeyManager.keyJustPressed(KeyEvent.VK_W) && optionList.size() != 1) {
			if(activeIndex > 0) {
				activeIndex--;
				System.out.println("index goes down");
			}else {
				activeIndex = optionList.size()-1;
				System.out.println("index goes to max");
			}
			System.out.println(activeIndex);
			System.out.println(optionList.size());
		}
		if(KeyManager.keyJustPressed(KeyEvent.VK_ENTER)) {
			doActiveOptionAction();
		}
		//input
	}
	public abstract void render(Graphics g);
	public abstract void doActiveOptionAction();
	
	public ActionOption getActiveOption() {
		return optionList.get(activeIndex);
	}
	
	public List<ActionOption> getOptionList() {
		return optionList;
	}
	public void setOptionList(List<ActionOption> optionList) {
		this.optionList = optionList;
	}
	public BattleWorld getWorld() {
		return world;
	}
	
	
}
