package com.example.hunter.gransgame;

import android.graphics.Canvas;
import android.graphics.Color;

/**
 * Created by hunter on 6/11/2017.
 */

public abstract class Sprite {
    protected float x;
    protected float y;
    protected float speed;
    protected float size;

    public Sprite(float _x, float _y, float _speed, float _size){
        x = _x;
        y = _y;
        speed = _speed;
        size = _size;
    }

    abstract void draw(Canvas canvas);

    abstract void updatePos();
}
