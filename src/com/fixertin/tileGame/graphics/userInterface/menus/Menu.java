package com.fixertin.tileGame.graphics.userInterface.menus;

import com.fixertin.tileGame.actors.util.KeyManager;
import com.fixertin.tileGame.actors.util.Renderable;
import com.fixertin.tileGame.actors.util.Tickable;

import java.awt.*;
import java.util.ArrayList;

public class Menu implements Renderable, Tickable{
    private ArrayList<MenuItem> menuItems = new ArrayList<MenuItem>();
    public int activeIndex;

    @Override
    public void render(Graphics g) {
        for(MenuItem item : menuItems){
            item.getActor().render(g);
        }
    }

    @Override
    public void tick() {
        if(KeyManager.a){
            System.out.print(activeIndex);
            activeIndex = activeIndex+1 % menuItems.size();
            System.out.println( " to " + activeIndex);
        }
        if(KeyManager.d){
            System.out.print(activeIndex);
            if(activeIndex == 0)
                activeIndex = menuItems.size()-1;
            else
                activeIndex++;
            System.out.println( " to " + activeIndex);
        }
    }

    //getters and setters
    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }
    public void setMenuItems(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }
    public void addMenuItem(MenuItem menuItem){
        menuItems.add(menuItem);
    }
}
