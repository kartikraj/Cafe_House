package com.example.cafe_house;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ThreeColumn_ListAdapter extends ArrayAdapter {
    private LayoutInflater mInflater;
    private ArrayList<User> users;
    private int mViewResourceId;

    public ThreeColumn_ListAdapter(Context context, int textViewResourceId, ArrayList<User> users) {
        super(context, textViewResourceId, users);
        this.users = users;
        mInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        mViewResourceId = textViewResourceId;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = mInflater.inflate(mViewResourceId, null);

        User user = users.get(position);

        if (user != null) {
            TextView foodname = (TextView) convertView.findViewById(R.id.foodNameinOrderSummary);
            TextView quantity = (TextView) convertView.findViewById(R.id.quantityinOrderSummary);
            TextView price = (TextView) convertView.findViewById(R.id.priceinOrderSummary);
            TextView single =(TextView) convertView.findViewById(R.id.singleprice);
            if (foodname != null) {
                foodname.setText(user.getName());
            }
            if (quantity  != null) {
                quantity .setText(("Quantity: "+user.getQuantity()));
            }
            if (price != null) {
                price.setText(("Rs."+user.getPrice()));
            }
            if (single != null) {
                single.setText(("Rs."+user.getSinglep()));
            }
        }

        return convertView;
    }
}
