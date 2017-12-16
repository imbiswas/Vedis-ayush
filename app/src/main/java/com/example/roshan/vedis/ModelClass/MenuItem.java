package com.example.roshan.vedis.ModelClass;

/**
 * Created by roshan on 10/8/17.
 */

public class MenuItem {

    String  item_name;
    double item_price;
    int item_image;
    String  item_description;

    public MenuItem(String item_name, double item_price, int item_image, String item_description) {
        this.item_name = item_name;
        this.item_price = item_price;
        this.item_image = item_image;
        this.item_description = item_description;
    }

    public String getItem_name() {
        return item_name;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    public double getItem_price() {
        return item_price;
    }

    public void setItem_price(double item_price) {
        this.item_price = item_price;
    }

    public int getItem_image() {
        return item_image;
    }

    public void setItem_image(int item_image) {
        this.item_image = item_image;
    }

    public String getItem_description() {
        return item_description;
    }

    public void setItem_description(String item_description) {
        this.item_description = item_description;
    }

    public MenuItem(){
        //empty constructor
    }



}
