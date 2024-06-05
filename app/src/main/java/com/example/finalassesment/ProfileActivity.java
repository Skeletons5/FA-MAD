package com.example.finalassesment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.content.Intent;

public class ProfileActivity extends AppCompatActivity {
    TextView nameView, icView;
    Button changeBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        nameView = findViewById(R.id.nameView);
        icView = findViewById(R.id.icView);
        changeBtn = findViewById(R.id.changeBtn);

        String user = getIntent().getStringExtra("nameTxt");
        String ic = getIntent().getStringExtra("icTxt");
        nameView.setText(user);
        icView.setText(ic);

        changeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProfileActivity.this,
                        MainActivity.class);
                startActivity(intent);
            }
        });
    }
}