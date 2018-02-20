package com.fixertin.tileGame.actors.gameActors.basicGraphics;

import com.fixertin.tileGame.actors.primitive.Actor;

import java.awt.*;

public class MenuBoxSelector extends Selector {


    public MenuBoxSelector(double x, double y, double xOffset, double yOffset) {
        super(x, y, xOffset, yOffset);
    }

    @Override
    public void render(Graphics g) {
        g.drawRect((int) (x + xOffset), (int)(y + yOffset), 100, 25);
    }

    @Override
    public void tick() {

    }
}
