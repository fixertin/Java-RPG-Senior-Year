package com.fixertin.tileGame.actors.gameActors;


import com.fixertin.tileGame.actors.primitive.Actor;

public abstract class BattleActor extends Actor implements Comparable<BattleActor>{
	protected int hp, maxhp;
	protected String name;
	protected int baseDamage;
	protected int speed;

	public BattleActor(double x, double y, int hp, String name, int baseDamage, int speed) {
		super(x, y);
		this.hp = hp;
		maxhp = hp;
		this.name = name;
		this.baseDamage = baseDamage;
		this.speed = speed;
	}
	public BattleActor(double x, double y, int hp, int maxhp, String name, int baseDamage, int speed) {
		super(x, y);
		this.hp = hp;
		this.maxhp = maxhp;
		this.name = name;
		this.baseDamage = baseDamage;
		this.speed = speed;
	}

	@Override
	public int compareTo(BattleActor o) {
		return speed - o.getSpeed();
	}

	//GETTERS / SETTERS
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBaseDamage() {
		return baseDamage;
	}
	public void setBaseDamage(int baseDamage) {
		this.baseDamage = baseDamage;
	}
	public int getMaxhp() {
		return maxhp;
	}
	public void setMaxhp(int maxhp) {
		this.maxhp = maxhp;
	}
	public int getSpeed(){return speed;}
	public void setSpeed(int speed){this.speed = speed;}

}
