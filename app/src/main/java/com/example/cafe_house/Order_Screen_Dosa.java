package com.example.cafe_house;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Order_Screen_Dosa extends AppCompatActivity {
    private Button _decrease,_increase;
    TextView totalprice,quant;
    Button addtocart;

    int _counter = 1;
    String _stringval,count;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_dosa);

        _decrease =  findViewById(R.id.minus);
        _increase =  findViewById(R.id.plus);
        quant = findViewById(R.id.quantity);
        totalprice = findViewById(R.id.price);

        _decrease.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int baseprice= 70;
                if(_counter==0){
                    Toast.makeText(Order_Screen_Dosa.this, "Cant decrease quantity < 0", Toast.LENGTH_SHORT).show();
                }else {
                    _counter--;
                    //       displayQuantity();
                    int total = baseprice*_counter;
                    _stringval = Integer.toString(total);
                    count =Integer.toString(_counter);
                    quant.setText(count);
                    totalprice.setText("Rs."+_stringval+"/-");
                }
            }
        });

        _increase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                _counter++;
                int baseprice= 70;
                int total = baseprice*_counter;
                _stringval = Integer.toString(total);
                count = Integer.toString(_counter);
                quant.setText(count);
                totalprice.setText("Rs."+_stringval+"/-");
            }
        });
    }
}