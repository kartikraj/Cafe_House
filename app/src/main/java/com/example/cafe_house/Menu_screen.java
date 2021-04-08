package com.example.cafe_house;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Menu_screen extends AppCompatActivity implements  View.OnClickListener{

    public CardView card1,card2,card3,card4,card5,card6,card7,card8,card9,card10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mennu);
        getSupportActionBar().setTitle("MENU");

        card1 =(CardView) findViewById(R.id.firstcardview);
        card2 =(CardView) findViewById(R.id.secondcardview);
        card3 =(CardView) findViewById(R.id.thirdcardview);
        card4 =(CardView) findViewById(R.id.fourthcardview);
        card5 =(CardView) findViewById(R.id.fivthcardview);
        card6 =(CardView) findViewById(R.id.sixthcardview);
        card7 =(CardView) findViewById(R.id.seventhcardview);
        card8 =(CardView) findViewById(R.id.eighthcardview);
        card9 =(CardView) findViewById(R.id.ninecardview);
        card10 =(CardView) findViewById(R.id.tencardview);

        card1.setOnClickListener(this);
        card2.setOnClickListener(this);
        card3.setOnClickListener(this);
        card4.setOnClickListener(this);
        card5.setOnClickListener(this);
        card6.setOnClickListener(this);
        card7.setOnClickListener(this);
        card8.setOnClickListener(this);
        card9.setOnClickListener(this);
        card10.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent i;
        switch(view.getId()){
            case R.id.firstcardview:
                i=new Intent(this,Order_Screen_Pongal.class);
                startActivity(i);
                break;
            case R.id.secondcardview:
                i=new Intent(this,Order_Screen_Kadhi.class);
                startActivity(i);
                break;
            case R.id.thirdcardview:
                i=new Intent(this,Order_Screen_Modurpulav.class);
                startActivity(i);
                break;
            case R.id.fourthcardview:
                i=new Intent(this,Order_Screen_Biryani.class);
                startActivity(i);
                break;
            case R.id.fivthcardview:
                i=new Intent(this,Order_Screen_Pithla.class);
                startActivity(i);
                break;
            case R.id.sixthcardview:
                i=new Intent(this,Order_Screen_Pooran.class);
                startActivity(i);
                break;
            case R.id.seventhcardview:
                i=new Intent(this,Order_Screen_Dosa.class);
                startActivity(i);
                break;
            case R.id.eighthcardview:
                i=new Intent(this,Order_Screen_Idli.class);
                startActivity(i);
                break;
            case R.id.ninecardview:
                i=new Intent(this,Order_Screen_Misal.class);
                startActivity(i);
                break;
            case R.id.tencardview:
                i=new Intent(this,Order_Screen_Roganjosh.class);
                startActivity(i);
                break;


        }

    }
}