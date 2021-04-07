package com.example.cafe_house;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Order_Screen_Biryani extends AppCompatActivity {
    private Button _decrease;
    private Button _increase;
    private TextView _value;

    private static int _counter = 1;
    private String _stringval;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_biryani);

        _decrease = (Button) findViewById(R.id.minus);
        _increase = (Button) findViewById(R.id.plus);
        _value = (TextView) findViewById(R.id.quantity);


        _decrease.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                _counter--;
                _stringval = Integer.toString(_counter);
                _value.setText(_stringval);
            }
        });

        _increase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                _counter++;
                _stringval = Integer.toString(_counter);
                _value.setText(_stringval);
            }
        });



//        calculate();


    }

//    public void calculate() {
//        Double value1 = Double.parseDouble(_quantity.getText().toString());
//        Double value2 = Double.parseDouble(_price.getText().toString());
//
//        Double finalprice = (value1 * value2);
//        _finalprice.setText(finalprice.toString());
//
//    }
}