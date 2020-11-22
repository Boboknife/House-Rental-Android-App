package com.example.rentalapp;

public class dataBaseHouses {
    private static int maxCapacity = 100;
    private int size;
    private House houseArr[] = new House[maxCapacity];

    public int getSize() {
        return size;
    }
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
