package com.example.cafe_house;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SignUp_Activity extends AppCompatActivity {
    TextView alreadyacc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        getSupportActionBar().setTitle("Sign In");

        alreadyacc = findViewById(R.id.createacc);
        alreadyacc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(SignUp_Activity.this,SignIn_Activity.class);
                startActivity(intent);
            }
        });
    }
}