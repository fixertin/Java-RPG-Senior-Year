package com.fixertin.tileGame.actors.gameActors.selectableGraphics;

import com.fixertin.tileGame.actors.gameActors.SelectActor;
import com.fixertin.tileGame.actors.util.ResourceManager;

import java.awt.*;

public class SelectableText extends SelectActor{
    private String text, selectText;
    private Color color, selectColor;
    private Font font, selectFont;

    /**
     *
     * @param x
     * @param y
     * @param text
     * @param color
     * @param font
     * @param selectText if set to null, this will default to the text parameter
     * @param selectColor if set to null, this will default to the Color parameter
     * @param selectFont if set to null, this will default to the Font parameter
     */
    public SelectableText(double x, double y, String text, Color color, Font font, String selectText, Color selectColor, Font selectFont) {
        super(x, y);
        this.text = text;
        this.color = color;
        this.font = font;
        setSelectParameters(selectText, selectColor, selectFont);
    }

    private void setSelectParameters(String selectText, Color selectColor, Font selectFont){

        if(selectText == null)
            this.selectText = text;
        else
            this.selectText = selectText;

        if(selectColor == null)
            this.selectColor = color;
        else
            this.selectColor = selectColor;

        if(selectFont == null)
            this.selectFont = font;
        else
            this.selectFont = selectFont;
    }

    @Override
    public void render(Graphics g) {
        if(selected){
            g.setFont(selectFont);
            g.setColor(selectColor);
            g.drawString(selectText, (int)x, (int)y);
        }else{
            //g.setFont(new Font(ResourceManager.gameFontName, Font.PLAIN, 20));
            g.setFont(font);
            g.setColor(color);
            g.drawString(text, (int)x, (int)y);
        }
    }

    @Override
    public void tick() {

    }
}
