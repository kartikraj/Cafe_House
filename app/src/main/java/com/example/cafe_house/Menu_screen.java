package com.example.cafe_house;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Menu_screen extends AppCompatActivity {

    ImageView pongalimg,kadhiimg,modurimg,pithlabhakriimg,idliimg,biryaniimg,poornaimg,dosaimg,roganjoshimg,misalimg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mennu);
        getSupportActionBar().setTitle("MENU");

        pongalimg=findViewById(R.id.pongalimg);
        pongalimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(Menu_screen.this,Order_Screen_Pongal.class);
                startActivity(intent);
            }
        });

        kadhiimg=findViewById(R.id.kadhiimg);
        kadhiimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(Menu_screen.this,Order_Screen_Kadhi.class);
                startActivity(intent);
            }
        });

        modurimg=findViewById(R.id.modurpulavimg);
        modurimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(Menu_screen.this,Order_Screen_Modurpulav.class);
                startActivity(intent);
            }
        });

        pithlabhakriimg=findViewById(R.id.pithlabhakriimg);
        pithlabhakriimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(Menu_screen.this,Order_Screen_Pithla.class);
                startActivity(intent);
            }
        });

        idliimg=findViewById(R.id.idliimg);
        idliimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(Menu_screen.this,Order_Screen_Idli.class);
                startActivity(intent);
            }
        });

        biryaniimg=findViewById(R.id.biryaniimg);
        biryaniimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(Menu_screen.this,Order_Screen_Biryani.class);
                startActivity(intent);
            }
        });

        poornaimg=findViewById(R.id.poornaimg);
        poornaimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(Menu_screen.this,Order_Screen_Pooran.class);
                startActivity(intent);
            }
        });

        dosaimg=findViewById(R.id.dosaimg);
        dosaimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(Menu_screen.this,Order_Screen_Dosa.class);
                startActivity(intent);
            }
        });

        roganjoshimg=findViewById(R.id.roganjoshimg);
        roganjoshimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(Menu_screen.this,Order_Screen_Roganjosh.class);
                startActivity(intent);
            }
        });

        misalimg=findViewById(R.id.misalimg);
        misalimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(Menu_screen.this,Order_Screen_Misal.class);
                startActivity(intent);
            }
        });

    }
}