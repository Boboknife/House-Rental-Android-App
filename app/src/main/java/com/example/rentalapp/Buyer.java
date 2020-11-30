package com.example.rentalapp;

public class Buyer extends User {
    private String buyerName;
    private int buyerID;

    public Buyer(){
        buyerName = "";
        buyerID = 0;
    }

    //need to check validity of setters
    public String getBuyerName() {
        return buyerName;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }

    public int getBuyerID() {
        return buyerID;
    }

    public void setBuyerID(int buyerID) {
        this.buyerID = buyerID;
    }
}
