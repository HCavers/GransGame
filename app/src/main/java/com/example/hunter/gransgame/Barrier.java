package com.example.hunter.gransgame;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.Log;

/**
 * Created by hunter on 7/11/2017.
 */

public class Barrier extends Sprite {

    private int bound;

    public Barrier(float x, float y, float speed, float size){
        super(x, y, speed, size);
    }

    @Override
    public void updatePos(){}

    @Override
    public void draw(Canvas canvas){
        Paint p = new Paint();
        p.setColor(Color.BLACK);
        canvas.drawRect(x, y, x + 250, y + 30, p);
    }

    public void updateBarrier(float velocity){
        x += velocity * -1;
        if(x < 0){
            x = 0;
        }else if(x > bound){
            x = bound;
        }
    }

    public void setBounds(int edge){
        bound = edge - 250;
    }
}
