package com.fixertin.tileGame.actors.gameActors.basicGraphics;

import com.fixertin.tileGame.actors.primitive.Actor;
import com.fixertin.tileGame.actors.util.ResourceManager;

import java.awt.*;

public class GameText extends Actor{
    private String text;
    public GameText(double x, double y, String text) {
        super(x, y);
        this.text = text;
    }

    @Override
    public void tick() {

    }

    @Override
    public void render(Graphics g) {
        g.setFont(new Font(ResourceManager.gameFontName, Font.PLAIN, 20));
        g.setColor(Color.WHITE);
        g.drawString(text, (int)x, (int)y);
    }
}
