package com.fixertin.tileGame.actors.gameActors;

import com.fixertin.tileGame.actors.primitive.Actor;

public abstract class SelectActor extends Actor {
    protected boolean selected;

    public SelectActor(double x, double y, double velx, double vely) {
        super(x, y, velx, vely);
    }
    public SelectActor(double x, double y) {
        super(x, y);
    }

    public boolean isSelected() {
        return selected;
    }
    public void setSelected(boolean selected) {
        this.selected = selected;
    }

}
