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
        rand = new Random();
        sprites = _sprites;
        count = 0;
    }

    @Override
    protected void onDraw(Canvas canvas){
        setBarrierBounds(canvas.getWidth());
        drawSprites(canvas);
        addNewSprite(canvas.getWidth());
        invalidate();
    }

    private void drawSprites(Canvas canvas){
        for(Sprite sprite : sprites){
            sprite.draw(canvas);
            sprite.updatePos();
        }
    }

    private void addNewSprite(int range){
        if(count > 20){
            float multiplier = rand.nextFloat();
            float x = range * multiplier;
            if(x < 50){
                x = 50;
            }else if(x > range - 50){
                x = range - 50;
            }
            int spriteType = rand.nextInt(6);
            if(spriteType < 4){
                sprites.add(new Ball(x, 100, 20, 50));
            }else if(spriteType < 5){
                sprites.add(new LifeBall(x, 100, 20, 50));
            }else{
                sprites.add(new DamageBall(x, 100, 20, 50));
            }
            count = 0;
        }
        count++;
    }

    private void setBarrierBounds(int bound){
        Barrier barrier = (Barrier)sprites.get(0);
        barrier.setBounds(bound);
    }
}
