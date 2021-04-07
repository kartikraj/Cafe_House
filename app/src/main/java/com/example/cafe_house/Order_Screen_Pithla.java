package com.example.cafe_house;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Order_Screen_Pithla extends AppCompatActivity {
    private Button _decrease;
    private Button _increase;
    private TextView _value;
    private static int _counter = 1;
    private String _stringval;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_pithla);

        _decrease = (Button) findViewById(R.id.minus);
        _increase = (Button) findViewById(R.id.plus);
        _value = (TextView) findViewById(R.id.quantity);

        _decrease.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                _counter --;
                _stringval = Integer.toString(_counter);
                _value.setText(_stringval);
            }
        });

        _increase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                _counter ++;
                _stringval = Integer.toString(_counter);
                _value.setText(_stringval);
            }
        });
    }
}