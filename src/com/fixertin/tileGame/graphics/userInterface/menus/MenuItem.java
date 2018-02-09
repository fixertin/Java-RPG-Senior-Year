package com.fixertin.tileGame.graphics.userInterface.menus;

import com.fixertin.tileGame.actors.primitive.Actor;
import com.fixertin.tileGame.graphics.userInterface.command.Command;

public class MenuItem {
    private Command command;
    private Actor actor;

    public MenuItem(Actor actor, Command command){
        this.actor = actor;
        this.command = command;
    }

    public void clicked(){
        command.execute();
    }
    public Command getCommand() {
        return command;
    }
    public void setCommand(Command command) {
        this.command = command;
    }
    public Actor getActor() {
        return actor;
    }
    public void setActor(Actor actor) {
        this.actor = actor;
    }
}
