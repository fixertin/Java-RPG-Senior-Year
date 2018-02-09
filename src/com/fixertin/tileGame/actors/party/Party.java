package com.fixertin.tileGame.actors.party;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import com.fixertin.tileGame.actors.gameActors.BattleActor;

public class Party <T extends BattleActor>{
	private ArrayList<T> party = new ArrayList<T>();

	public void addCharacter(T partyMember){
		party.add(partyMember);
	}
	public void removeCharacter(int index){
		party.remove(index);
	}
	public T getPartyMemeber(int index){
		return party.get(index);
	}
	public ArrayList<T> getParty(){
		return party;
	}
	public void setParty(ArrayList<T> party){
		this.party = party;
	}

	/**
	 *
	 * @return will return false as long as there is at least one member in the party with hp greater than one.
	 */
	public boolean isDead(){
		if(party.size() == 0)
			return true;
		for(T member : party){
			if(member.getHp() > 0)
				return false;
		}
		return true;
	}
}
