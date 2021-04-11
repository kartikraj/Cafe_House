package com.example.cafe_house.Database;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class OrderHelper extends SQLiteOpenHelper {


    public static final int DATABASE_VERSION = 3;
    public static final String DATABASE_NAME ="ord2.db";


    public OrderHelper( Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
       String SQL_TABLE= "CREATE TABLE "+ OrderContract.OrderEntry.TABLE_NAME+ " ("
               + OrderContract.OrderEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
               + OrderContract.OrderEntry.COLUMN_NAME +   " TEXT NOT NULL, "
               +  OrderContract.OrderEntry.COLUMN_QUANTITY + " TEXT NOT NULL, "
               +  OrderContract.OrderEntry.COLUMN_PRICE + " TEXT NOT NULL ,"
               + OrderContract.OrderEntry.COLUMN_SP + " TEXT NOT NULL   );";

        db.execSQL(SQL_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {

    }

    public Cursor getListContents(){
        SQLiteDatabase db =this.getWritableDatabase();
        Cursor data = db.rawQuery("SELECT * FROM " +OrderContract.OrderEntry.TABLE_NAME,null);
        return data;
    }


}
