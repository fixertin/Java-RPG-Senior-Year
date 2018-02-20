package com.fixertin.tileGame.graphics.userInterface.command;

import com.fixertin.tileGame.graphics.userInterface.menus.Menu;

import java.util.Stack;

public class GoBackMenuCommand implements Command{
    private Stack<Menu> menuStack;

    public GoBackMenuCommand(Stack<Menu> menuStack){
        this.menuStack = menuStack;
    }

    @Override
    public void execute(){
        menuStack.pop();
    }
}
