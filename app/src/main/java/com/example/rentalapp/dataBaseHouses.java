package com.example.rentalapp;
import java.io.Serializable;

import android.widget.ImageView;

public class dataBaseHouses implements Serializable {
    
    private static int maxCapacity;
    private int size;
    protected House houseArr[];

public dataBaseHouses(){
    maxCapacity = 100;
    size = 2;
    houseArr = new House[maxCapacity];
}
    public int setImageatIndex(int index, ImageView image){
        houseArr[index].setImage(image);
        if(index >100)
        {return 0;}
        else
        {return 1;}
    }
    public int setvisible(int index){
        houseArr[index].setvisible();
        return index;
    }
    public int getSize() {
        return size;
    }
    public House[] getHouses() {return (houseArr);}
    public void setSize(int size) {
        this.size = size;
    }
    // get and set id at index
    public int getID_at_Index(int index){
       return houseArr[index].getSellerID();
    }
    public void setID_at_Index(int index, int id){
        houseArr[index].setSellerID(id);
    }
}
