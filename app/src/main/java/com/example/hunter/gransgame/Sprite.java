package com.example.hunter.gransgame;

import android.graphics.Canvas;
import android.graphics.Color;

/**
 * Created by hunter on 6/11/2017.
 */

public abstract class Sprite {
    private float x;
    private float y;
    private float speed;
    private float size;
    Color colour;

    public Sprite(float _x, float _y, float _speed, float _size, int _colour){
        x = _x;
        y = _y;
        speed = _speed;
        size = _size;
        colour = Color.valueOf(_colour);
    }

    abstract void draw(Canvas canvas);

    abstract void updatePos();
}
