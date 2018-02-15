package com.fixertin.tileGame.graphics.userInterface.command;

import com.fixertin.tileGame.graphics.userInterface.menus.Menu;

import java.util.Stack;

public class GoBackMenuCommand implements Command{
    private Stack<Menu> menuStack;
    private Menu toMenu;

    public GoBackMenuCommand(Stack<Menu> menuStack, Menu toMenu){
        this.menuStack = menuStack;
        this.toMenu = toMenu;
    }

    @Override
    public void execute(){
        menuStack.push(toMenu);
    }
}
