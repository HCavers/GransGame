package com.example.hunter.gransgame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;

import java.util.LinkedList;

public class GameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        LinkedList<Sprite> sprites = new LinkedList<Sprite>();
        sprites.add(new Barrier(400, 1850, 50, 100));
        sprites.add(new Ball(100, 100, 20, 50 ));
        sprites.add(new DamageBall(300, 100, 20, 50 ));
        sprites.add(new LifeBall(500, 100, 20, 50 ));
        super.onCreate(savedInstanceState);
        GraphicsView gv = new GraphicsView(this, sprites);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(gv);
    }
}
