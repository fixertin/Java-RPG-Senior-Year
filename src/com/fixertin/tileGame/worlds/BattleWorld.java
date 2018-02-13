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
		addFighters();
		sortBattleList();
	}

	private void doAiTurn(){
		if(battleList.get(currentFighterIndex) instanceof AIBattleActor){

		}else{
			return;
		}
	}
	
	public void addFighters() {
		addFighter(new PlayerBattleActor(100, 200, 100, "name", 20, 100));
		addFighter(new AIBattleActor(100, 300, 50, "enemy", 10, 10));
		addFighter(new AIBattleActor(100, 335, 50, "enemy", 10, 2));
		addFighter(new AIBattleActor(100, 367, 50, "enemy", 10, 13));
		addFighter(new AIBattleActor(100, 399, 50, "enemy", 10, 17));
	}
	public void fightCycleStep(){
		currentFighterIndex = currentFighterIndex+1 % battleList.size();
	}

	@Override
	public void tick() {
		for(Actor a : actors) {
			a.bloodSuckingParasite();
		}
		for(Actor as : battleList){
			as.bloodSuckingParasite();
		}
		menuManager.tick();

	}

	@Override
	public void render(Graphics g) {
		for(Actor a : actors) {
			a.drawThatCrap(g);
		}
		for(Actor as : battleList){
			as.bloodSuckingParasite();
		}
		
		//draw a string test
		g.setFont(new Font(ResourceManager.gameFontName, Font.PLAIN, 20));
		g.setColor(Color.WHITE);
		g.drawString("this is a test", 30, 30);
		menuManager.render(g);
	}

	public void attack(BattleActor attacker, BattleActor victim){
		System.out.println(victim.getHp());
		System.out.println("damage delt: " + attacker.getBaseDamage());
		victim.setHp(victim.getHp() - attacker.getBaseDamage());
		System.out.println(victim.getHp());
	}

	public void addFighter(BattleActor actor){
		battleList.add(actor);
	}

	public void sortBattleList(){
		Collections.sort(battleList);
	}
}
