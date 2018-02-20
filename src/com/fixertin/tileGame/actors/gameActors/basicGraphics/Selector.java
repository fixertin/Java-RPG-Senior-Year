package com.fixertin.tileGame.actors.gameActors.basicGraphics;

import com.fixertin.tileGame.actors.primitive.Actor;

public abstract class Selector extends Actor{
    protected double xOffset, yOffset;

    public Selector(double x, double y, double xOffset, double yOffset) {
        super(x, y);
        this.xOffset = xOffset;
        this.yOffset = yOffset;
    }

    public double getxOffset() {
        return xOffset;
    }

    public void setxOffset(double xOffset) {
        this.xOffset = xOffset;
    }

    public double getyOffset() {
        return yOffset;
    }

    public void setyOffset(double yOffset) {
        this.yOffset = yOffset;
    }
}
