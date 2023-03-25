package com.example.exercise1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class Bai2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai2);

        final Button btnCall= findViewById(R.id.btnCall);
        final EditText phonenumber  = findViewById(R.id.editTextPhone);

        btnCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            Intent callIntent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + phonenumber.getText()));
            callIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(callIntent);
            }
        });

        Button bai3 = findViewById(R.id.btnBai3);
        bai3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Bai2Activity.this,Bai3Activity.class));
            }
        });
    }
}