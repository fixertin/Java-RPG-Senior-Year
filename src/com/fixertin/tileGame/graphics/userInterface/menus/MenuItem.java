package com.fixertin.tileGame.graphics.userInterface.menus;

import com.fixertin.tileGame.actors.gameActors.SelectActor;
import com.fixertin.tileGame.actors.primitive.Actor;
import com.fixertin.tileGame.graphics.userInterface.command.Command;

public class MenuItem {
    private Command command;
    private SelectActor actor;

    public MenuItem(SelectActor actor, Command command){
        this.actor = actor;
        this.command = command;
    }

    public void setSelected(boolean selected){
        actor.setSelected(selected);
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
    public void setActor(SelectActor actor) {
        this.actor = actor;
    }
}
