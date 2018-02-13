package com.fixertin.tileGame.graphics.userInterface;

import com.fixertin.tileGame.actors.gameActors.BattleActor;
import com.fixertin.tileGame.actors.primitive.Actor;
import com.fixertin.tileGame.actors.util.ResourceManager;

import java.awt.*;

public class PlayerUiDisplay extends Actor{
    public BattleActor actor;

    public PlayerUiDisplay(double x, double y, BattleActor actor) {
        super(x, y);
        this.actor = actor;
    }

    @Override
    public void tick() {

    }

    @Override
    public void render(Graphics g) {
        g.setFont(new Font(ResourceManager.gameFontName, Font.PLAIN, 20));
        g.setColor(Color.WHITE);
        g.drawString(actor.getName() + " " + actor.getHp() + " / " + actor.getMaxhp(), (int)x, (int)y);
    }
}
