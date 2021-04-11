package com.example.cafe_house;

public class User {
    private  String Name;
    private  String quantity;
    private  String price;
    private String singlep;

    public User(String name,String quant,String pr,String sp) {
        Name=name;
        quantity = quant;
        price = pr;
        singlep = sp;

    }



    public String getName() {
        return Name;
    }

    public String getQuantity() {
        return quantity;
    }

    public String getPrice() {
        return price;
    }

    public String getSinglep(){ return  singlep;}

}
