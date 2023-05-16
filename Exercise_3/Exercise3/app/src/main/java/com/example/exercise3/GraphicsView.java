package com.example.exercise3;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.media.MediaPlayer;
import android.provider.Settings;
import android.view.MotionEvent;
import android.view.View;

public class GraphicsView extends View {
    Bitmap[] frames = new Bitmap[15];
    int i = 0;
    long last_tick = 0;
    long period = 200;
    Context ctext;

    MediaPlayer mPlayer;
//    int x = 0;
//    int y = 0;
//    int d = 100;
//    int r = 50;
    public GraphicsView(Context context){

        super(context);
        ctext = context;
        frames[0] = BitmapFactory.decodeResource(getResources(), R.drawable.win_1);
        frames[1] = BitmapFactory.decodeResource(getResources(), R.drawable.win_2);
        frames[2] = BitmapFactory.decodeResource(getResources(), R.drawable.win_3);
        frames[3] = BitmapFactory.decodeResource(getResources(), R.drawable.win_4);
        frames[4] = BitmapFactory.decodeResource(getResources(), R.drawable.win_5);
        frames[5] = BitmapFactory.decodeResource(getResources(), R.drawable.win_6);
        frames[6] = BitmapFactory.decodeResource(getResources(), R.drawable.win_7);
        frames[7] = BitmapFactory.decodeResource(getResources(), R.drawable.win_8);
        frames[8] = BitmapFactory.decodeResource(getResources(), R.drawable.win_9);
        frames[9] = BitmapFactory.decodeResource(getResources(), R.drawable.win_10);
        frames[10] = BitmapFactory.decodeResource(getResources(), R.drawable.win_11);
        frames[11] = BitmapFactory.decodeResource(getResources(), R.drawable.win_12);
        frames[12] = BitmapFactory.decodeResource(getResources(), R.drawable.win_13);
        frames[13] = BitmapFactory.decodeResource(getResources(), R.drawable.win_14);
        frames[14] = BitmapFactory.decodeResource(getResources(), R.drawable.win_15);
    }

    @Override
    protected void onDraw(Canvas canvas){
        // Drawing commands go here
//        Exercise 2
//        if (x != 0 && y != 0) {
//            int right = x + d;
//            int bottom = y + r;
//            Rect r = new Rect(x,y,right,bottom);
//            Exercise 1
//            Rect r = new Rect(40, 40, 400, 200);
//            Paint paint = new Paint();
//            paint.setStyle(Paint.Style.FILL);
//            paint.setColor(Color.YELLOW);
//            canvas.drawRect(r, paint);
//        }
//        Exercise3
//        if (i < 15) {
//            canvas.drawBitmap(frames[i], 40, 40,new Paint());
//        } else {
//            i = 0;
//        }
        if (i < 15) {
            long time = (System.currentTimeMillis() - last_tick);
            if (time >= period)
            {
                last_tick = System.currentTimeMillis();
                canvas.drawBitmap(frames[i], 40,40,new Paint());
                i++;
                postInvalidate();
            } else {
                canvas.drawBitmap(frames[i],40,40,new Paint());
            }
        }
        invalidate();
    }
    @Override
    public  boolean onTouchEvent(MotionEvent event) {
//        Exercise 2
//        x = (int) event.getX();
//        y = (int) event.getY();
//        return super.onTouchEvent(event);
//        Exercise 3
        i++;
        return true;
    }
}

