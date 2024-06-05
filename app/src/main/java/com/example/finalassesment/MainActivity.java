package com.example.finalassesment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText nameTxt, icTxt;
    Button registerBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameTxt = findViewById(R.id.nameTxt);
        icTxt = findViewById(R.id.icTxt);

        registerBtn = findViewById(R.id.registerBtn);
        registerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = nameTxt.getText().toString();
                String ic = icTxt.getText().toString();

                Toast.makeText(MainActivity.this, "Your profile has successfully updated", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(MainActivity.this, ProfileActivity.class);
                intent.putExtra("nameTxt", name);
                intent.putExtra("icTxt", ic);
                startActivity(intent);
            }
        });
    }

}