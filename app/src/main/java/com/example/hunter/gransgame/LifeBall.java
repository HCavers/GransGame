package com.example.hunter.gransgame;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

/**
 * Created by hunter on 6/11/2017.
 */

public class LifeBall extends Sprite {

    public LifeBall(float x, float y, float speed, float size){
        super(x, y, speed, size);
    }

    @Override
    public void updatePos(){
        super.y += super.speed;
    }

    @Override
    public void draw(Canvas canvas){
        Paint p = new Paint();
        p.setColor(Color.BLUE);
        canvas.drawCircle(super.x, super.y, super.size, p);
    }
}
