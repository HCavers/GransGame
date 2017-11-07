package com.example.hunter.gransgame;

import android.graphics.Canvas;

/**
 * Created by hunter on 6/11/2017.
 */

public class ball extends Sprite {

    public ball(float x, float y, float speed, float size){
        super(x, y, speed, size, R.color.green);
    }

    @Override
    public void updatePos(){}

    @Override
    public void draw(Canvas canvas){}
}
