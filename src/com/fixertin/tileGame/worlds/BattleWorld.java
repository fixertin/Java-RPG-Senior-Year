package com.fixertin.tileGame.worlds;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Collections;

import com.fixertin.tileGame.actors.gameActors.AIBattleActor;
import com.fixertin.tileGame.actors.gameActors.BattleActor;
import com.fixertin.tileGame.actors.gameActors.PlayerBattleActor;
import com.fixertin.tileGame.actors.primitive.Actor;
import com.fixertin.tileGame.actors.util.ResourceManager;
import com.fixertin.tileGame.graphics.userInterface.MenuManager;


public class BattleWorld extends World{
	private MenuManager menuManager = new MenuManager(this);
	private ArrayList<BattleActor> battleList = new ArrayList<BattleActor>();
	private int currentFighterIndex;


	public BattleWorld(int width, int height) {
		super(width, height);
	}

	@Override
	public void tick() {
		for(Actor a : actors) {
			a.tick();
		}
		for(Actor as : battleList){
			as.tick();
		}
		menuManager.tick();

	}

	@Override
	public void render(Graphics g) {
		for(Actor a : actors) {
			a.render(g);
		}
		for(Actor as : battleList){
			as.render(g);
		}
		
		//draw a string test
		g.setFont(new Font(ResourceManager.gameFontName, Font.PLAIN, 20));
		g.setColor(Color.WHITE);
		g.drawString("this is a test", 30, 30);
		menuManager.render(g);
	}

	public void fightCycleStep(){
		currentFighterIndex = currentFighterIndex+1 % battleList.size();
	}

	public void addFighter(BattleActor actor){
		battleList.add(actor);
	}

}
