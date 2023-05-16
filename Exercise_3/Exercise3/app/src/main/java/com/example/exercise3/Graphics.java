package com.example.exercise3;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;

public class Graphics extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPlayer = MediaPlayer.create(ctext, R.raw.gangnam);
        mplayer.start();
        setContentView(new GraphicsView(this));
    }
}
