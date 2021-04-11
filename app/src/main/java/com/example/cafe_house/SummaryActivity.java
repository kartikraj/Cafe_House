package com.example.cafe_house;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.cafe_house.Database.OrderContract;
import com.example.cafe_house.Database.OrderHelper;

import java.util.ArrayList;


public class SummaryActivity extends AppCompatActivity  {

    OrderHelper mydb;
    ArrayList<User> userList;
    ListView listView;
    User user;
    TextView t;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);
        getSupportActionBar().setTitle("Cart");

        mydb = new OrderHelper(this);
        Button clearthedata = findViewById(R.id.clearthedatabase);

        userList = new ArrayList<>();
        Cursor data=mydb.getListContents();
       // int total = mydb.getSumValue();
        t= findViewById(R.id.Total);
        if(data.getCount() ==0){
            Toast.makeText(SummaryActivity.this,"Cart is empty  ",Toast.LENGTH_SHORT).show();
        }else{
            while(data.moveToNext()){
                user = new User(data.getString(1),data.getString(2),data.getString(3),data.getString(4));
                userList.add(user);
            }
            ThreeColumn_ListAdapter adapter = new ThreeColumn_ListAdapter(this, R.layout.cartlist, userList);
            listView = (ListView) findViewById(R.id.list);
            listView.setAdapter(adapter);
        }

       // String a =Integer.toString(total);
        //t.setText(a);
        clearthedata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int deletethedata = getContentResolver().delete(OrderContract.OrderEntry.CONTENT_URI, null, null);

                recreate();
            }
        });

    }
}