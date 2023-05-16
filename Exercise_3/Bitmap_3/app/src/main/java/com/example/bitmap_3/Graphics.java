package com.example.bitmap_3;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class Graphics extends Activity {
    @Override
    public void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(new GraphicsView(this));
    }
}
