package com.fixertin.tileGame.main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;

import com.fixertin.tileGame.actors.util.KeyManager;
import com.fixertin.tileGame.actors.util.ResourceManager;
import com.fixertin.tileGame.worlds.manager.WorldManager;

public class Main implements Runnable{
	public static final int WIDTH = 800; 
	public static final int HEIGHT = 600;
	
	public WorldManager worldManager;
	
	private boolean running = false;
	private String title;
	private Thread thread;
	private Window window;
	private BufferStrategy bs;
	private Graphics g;
	private ResourceManager rm;
	private KeyManager km;
	
	
	public Main(String title) {
		this.title = title;
	}
	
	public void init() {
		km = new KeyManager();
		window = new Window(title, WIDTH, HEIGHT);
		window.getFrame().addKeyListener(km);
		rm = new ResourceManager();
		rm.loadAllResources();
		worldManager = new WorldManager();
		worldManager.init();
	}
	
	private void tick() {
		km.tick();
		worldManager.tick();
	}
	
	private void render() {
		bs = window.getCanvas().getBufferStrategy();
		if(bs == null){
			window.getCanvas().createBufferStrategy(3);
			return;
		}
		g = bs.getDrawGraphics();
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, WIDTH, HEIGHT);
		//draw
		worldManager.render(g);
		//don't draw
		bs.show();
		g.dispose();
	}

	@Override
	public void run() {
		init();
		long lastTime = System.nanoTime();
		double amountOfTicks = 60.0;
		double ns = 1000000000 / amountOfTicks;
		double delta = 0;
		long timer = System.currentTimeMillis();
		int updates = 0;
		int frames = 0;
		while(running){
			long now = System.nanoTime();
			delta += (now - lastTime) / ns;
			lastTime = now;
			while(delta >= 1){
				tick();
				updates++;
				delta--;
			}
			render();
			frames++;
					
			if(System.currentTimeMillis() - timer > 1000){
				timer += 1000;
				//System.out.println("FPS: " + frames + " TICKS: " + updates);
				frames = 0;
				updates = 0;
			}
		}
	}
	
	public synchronized void start() {
		if(running)
			return;
		running = true;
		thread = new Thread(this);
		thread.start();
	}
	public synchronized void stop() {
		if(!running)
			return;
		running = false;
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
