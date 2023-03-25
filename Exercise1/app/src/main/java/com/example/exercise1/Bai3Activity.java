package com.example.exercise1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Date;

public class Bai3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai3);

        Button btntime= findViewById(R.id.btnTime);
        AlertDialog ad = new AlertDialog.Builder(this).create();

        btntime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Date t = new Date();
                String message = "Thoi gian hien hanh" + t.toLocaleString();
                ad.setMessage(message);
                ad.show();

                Button bai4 = findViewById(R.id.btnBai4);
                bai4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        startActivity(new Intent(Bai3Activity.this,Bai4Activity.class));
                    }
                });
            }
        });


    }
}