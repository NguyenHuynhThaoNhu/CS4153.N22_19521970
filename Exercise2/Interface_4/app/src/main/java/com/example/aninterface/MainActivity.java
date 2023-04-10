package com.example.aninterface;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText txtName;
    private EditText txtEmail;
    private EditText txtProject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtName = findViewById(R.id.name);
        txtEmail = findViewById(R.id.email);
        txtProject = findViewById(R.id.project);

        Button btnview = findViewById(R.id.btnFinish);
        btnview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iGetContactInfo = new Intent(MainActivity.this, ViewContactInfoActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("nameKey", txtName.getText().toString());
                bundle.putString("emailKey", txtEmail.getText().toString());
                bundle.putString("projectKey", txtProject.getText().toString());
                iGetContactInfo.putExtras(bundle);
                startActivity(iGetContactInfo);
            }
        });
    }
}
