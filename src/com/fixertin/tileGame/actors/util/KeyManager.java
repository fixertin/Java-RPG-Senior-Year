package com.fixertin.tileGame.actors.util;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyManager implements KeyListener{
	public static boolean[] keys, justPressed, cantPress;
	public static boolean w, s, a, d, space, shift, enter, upArrow, downArrow, leftArrow, rightArrow, esc;
	
	public KeyManager(){
		keys = new boolean[256];
		justPressed = new boolean[256];
		cantPress = new boolean[256];
	}
	
	public void tick(){
		for(int i=0; i<keys.length; i++){
			if(cantPress[i] && !keys[i]){
				cantPress[i] = false;
			}else if(justPressed[i]){
				cantPress[i] = true;
				justPressed[i] = false;
			}if(!cantPress[i] && keys[i]){
				justPressed[i] = true;
			}
		}
		
		w = keys[KeyEvent.VK_W];
		upArrow = keys[KeyEvent.VK_UP];
		s = keys[KeyEvent.VK_S];
		downArrow = keys[KeyEvent.VK_DOWN];
		a = keys[KeyEvent.VK_A];
		leftArrow = keys[KeyEvent.VK_LEFT];
		d = keys[KeyEvent.VK_D];
		rightArrow = keys[KeyEvent.VK_RIGHT];
		space = keys[KeyEvent.VK_SPACE];
		shift = keys[KeyEvent.VK_SHIFT];
		enter = keys[KeyEvent.VK_ENTER];
		esc = keys[KeyEvent.VK_ESCAPE];
	}
	
	public static boolean keyJustPressed(int keyCode){
		if(keyCode < 0 || keyCode >= keys.length)
			return false;
		return justPressed[keyCode];
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		keys[e.getKeyCode()] = true;
	}

	@Override
	public void keyReleased(KeyEvent e) {
		keys[e.getKeyCode()] = false;
	}
}
