package com.example.aninterface;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ViewContactInfoActivity extends AppCompatActivity {
    TextView txtNameValue;
    TextView txtEmailValue;
    TextView txtProjectValue;
    
    Button finishBtn;
    private View.OnClickListener mClickFinishListenner = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
        finish();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_contact_info);
        
        txtNameValue = (TextView)findViewById(R.id.txtNameInfoValue);
        txtEmailValue = (TextView)findViewById(R.id.txtEmailInfoValue);
        txtProjectValue = (TextView)findViewById(R.id.txtProjectInfoValue);
        
        finishBtn = (Button)findViewById(R.id.btnFinish);
        finishBtn.setOnClickListener(mClickFinishListenner);
        
        Bundle bundle = getIntent().getExtras();
        String name = bundle.getString("nameKey");
        String email = bundle.getString("emailKey");
        String project = bundle.getString("projectKey");
        
        txtNameValue.setText(name);
        txtEmailValue.setText(email);
        txtProjectValue.setText(project);
                
    }
}