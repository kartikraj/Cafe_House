package com.example.cafe_house;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.TextView;

import com.example.cafe_house.Database.OrderContract;

public class CartAdapter extends CursorAdapter {

    public CartAdapter(Context context, Cursor cursor){
        super(context,cursor,0);
    }
    @Override
    public View newView(Context context, Cursor cursor, ViewGroup parent) {

        return LayoutInflater.from(context).inflate(R.layout.cartlist,parent,false);
    }

    @Override
    public void bindView(View view, Context context, Cursor cursor) {

        TextView foodName, price, quantity;


        foodName = view.findViewById(R.id.foodNameinOrderSummary);
        price = view.findViewById(R.id.priceinOrderSummary);
        quantity = view.findViewById(R.id.quantityinOrderSummary);

        // getting the values by first getting the position of their columns

        int name = cursor.getColumnIndex(OrderContract.OrderEntry.COLUMN_NAME);
        int priceoffood = cursor.getColumnIndex(OrderContract.OrderEntry.COLUMN_PRICE);
        int quantityoffood = cursor.getColumnIndex(OrderContract.OrderEntry.COLUMN_QUANTITY);


        String nameofdrink = cursor.getString(name);
        String pricesofdrink = cursor.getString(priceoffood);
        String quantitysoffood = cursor.getString(quantityoffood);



        foodName.setText(nameofdrink);
        price.setText(pricesofdrink);
        quantity.setText(quantitysoffood);

    }
}
