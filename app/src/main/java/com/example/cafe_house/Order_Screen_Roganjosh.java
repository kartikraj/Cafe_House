package com.example.cafe_house;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.cafe_house.Database.OrderContract;

public class Order_Screen_Roganjosh extends AppCompatActivity {
    private Button _decrease,_increase;
    TextView totalprice,quant,foodname;
    Button addtocart;
    public Uri mCurrentCartUri;
    boolean hasAllRequiredValues = false;

    int _counter = 1;
    int baseprice= 249;
    String _stringval="249",count;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_roganjosh);

        _decrease =  findViewById(R.id.minus);
        _increase =  findViewById(R.id.plus);
        quant = findViewById(R.id.quantity);
        totalprice = findViewById(R.id.price);
        foodname = findViewById(R.id.textView2);
        addtocart =  findViewById(R.id.Ordernow);

        addtocart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SaveCart();
            }
        });

        _decrease.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(_counter==1){
                    Toast.makeText(Order_Screen_Roganjosh.this, "Cant decrease ", Toast.LENGTH_SHORT).show();
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
                int total = baseprice*_counter;
                _stringval = Integer.toString(total);
                count = Integer.toString(_counter);
                quant.setText(count);
                totalprice.setText("Rs."+_stringval+"/-");
            }
        });
    }
    private boolean SaveCart() {
        String name =foodname.getText().toString();
        String price= _stringval;
        String quantity = quant.getText().toString();
        String indiprice = Integer.toString(baseprice);

        ContentValues values = new ContentValues();
        values.put(OrderContract.OrderEntry.COLUMN_NAME,name);
        values.put(OrderContract.OrderEntry.COLUMN_PRICE,price);
        values.put(OrderContract.OrderEntry.COLUMN_QUANTITY,quantity);
        values.put(OrderContract.OrderEntry.COLUMN_SP,indiprice);

        if (mCurrentCartUri == null) {
            Uri newUri = getContentResolver().insert(OrderContract.OrderEntry.CONTENT_URI, values);
            if (newUri==null) {
                Toast.makeText(this, "Failed to add to Cart", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Added to Cart :) ", Toast.LENGTH_SHORT).show();

            }
        }

        hasAllRequiredValues = true;
        return hasAllRequiredValues;

    }
}