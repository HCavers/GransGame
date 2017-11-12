package com.example.hunter.gransgame;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

/**
 * Created by hunter on 7/11/2017.
 */

public class Barrier extends Sprite {



    public Barrier(float x, float y, float speed, float size){
        super(x, y, speed, size);
    }

    @Override
    public void updatePos(){
        x += speed;

    }

    @Override
    public void draw(Canvas canvas){
        Paint p = new Paint();
        p.setColor(Color.BLACK);
        canvas.drawRect(x, y, x + 250, y + 30, p);
    }

    public void setVelocity(float velocity){
        speed += velocity;
    }

}
