package com.example.hunter.gransgame;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.WindowManager;

import java.util.LinkedList;

public class GameActivity extends AppCompatActivity {

    GraphicsView gv;
    SensorManager smgr;
    Sensor accel;
    SensorEventListener accel_listener = new SensorEventListener() {
        @Override
        public void onSensorChanged(SensorEvent sensorEvent) {
            gv.updateBarrier(sensorEvent.values[0]);
        }
        @Override
        public void onAccuracyChanged(Sensor sensor, int i) {
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        smgr = (SensorManager)getSystemService(SENSOR_SERVICE);
        accel = smgr.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        LinkedList<Sprite> sprites = new LinkedList<Sprite>();
        sprites.add(new Barrier(400, 1850, 50, 100));
        super.onCreate(savedInstanceState);
        gv = new GraphicsView(this, sprites);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(gv);
    }

    @Override
    protected void onPause() {
        super.onPause();
        smgr.registerListener(accel_listener, accel, SensorManager.SENSOR_DELAY_NORMAL);
    }

    @Override
    protected void onResume() {
        super.onResume();
        smgr.unregisterListener(accel_listener, accel);
    }
}
