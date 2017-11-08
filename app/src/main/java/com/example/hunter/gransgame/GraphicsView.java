package com.example.hunter.gransgame;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

import java.util.LinkedList;

/**
 * Created by hunter on 7/11/2017.
 */

public class GraphicsView extends View {
    private LinkedList<Sprite> sprites;

    public GraphicsView(Context c, LinkedList<Sprite> _sprites){
        super(c);
        sprites = _sprites;
    }

    @Override
    protected void onDraw(Canvas canvas){
        for(Sprite sprite : sprites){
            sprite.draw(canvas);
        }
        invalidate();
    }
}
