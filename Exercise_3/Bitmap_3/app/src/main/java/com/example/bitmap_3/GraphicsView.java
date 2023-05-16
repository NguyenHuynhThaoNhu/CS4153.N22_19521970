package com.example.bitmap_3;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;

public class GraphicsView extends View {
    Bitmap[] frames = new Bitmap[1];
    int i = 0;
    public GraphicsView(Context context) {
        super(context);
        frames[0] = BitmapFactory.decodeResource(getResources(),R.drawable.win_1);
        frames[1] = BitmapFactory.decodeResource(getResources(),R.drawable.win_2);
//        frames[2] = BitmapFactory.decodeResource(getResources(),R.drawable.win_9);
//        frames[3] = BitmapFactory.decodeResource(getResources(),R.drawable.win_8);
//        frames[4] = BitmapFactory.decodeResource(getResources(),R.drawable.win_7);
    }
    @Override
    protected void onDraw(Canvas canvas) {
        if (i < 1) {
            canvas.drawBitmap(frames[i], 40, 40, new Paint());
        } else {
            i = 0;
        }
        invalidate();
    }
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        i++;
        return true;
    }
}
