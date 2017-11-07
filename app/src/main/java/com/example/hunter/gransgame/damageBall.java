package com.example.hunter.gransgame;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

/**
 * Created by hunter on 7/11/2017.
 */

public class damageBall extends Sprite {
    public damageBall(float x, float y, float speed, float size){
        super(x, y, speed, size);
    }

    @Override
    public void updatePos(){
        super.y += super.speed;
    }

    @Override
    public void draw(Canvas canvas){
        Paint p =new Paint();
        p.setColor(Color.RED);
        canvas.drawCircle(super.x, super.y, super.size, p);
    }

}
