package com.example.hunter.gransgame;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

import java.util.LinkedList;
import java.util.Random;

/**
 * Created by hunter on 7/11/2017.
 */

public class GraphicsView extends View {
    private LinkedList<Sprite> sprites;
    private int count;
    private Random rand;

    public GraphicsView(Context c, LinkedList<Sprite> _sprites){
        super(c);
        sprites = _sprites;
        count = 0;
    }

    @Override
    protected void onDraw(Canvas canvas){
        for(Sprite sprite : sprites){
            sprite.draw(canvas);
            sprite.updatePos();
        }
        if(count > 20){
            float multiplier = rand.nextFloat();
            float range = (float)canvas.getWidth();
            float x = range * multiplier;
            sprites.add(new Ball(300, 100, 20, 50));
            count = 0;
        }
        count++;
        invalidate();
    }
}
