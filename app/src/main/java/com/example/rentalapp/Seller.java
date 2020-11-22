package com.example.rentalapp;

public class Seller extends User {
    private String sellerName;
    private int sellerID;
    //Constructors
    public Seller(){
        sellerName="";
        sellerID = 0;
    }
    public Seller(String name, int id){
        sellerName = name;
        sellerID = id;
    }
     //getters and setters
    // Need to check if the setters set a valid name and id

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public int getSellerID() {
        return sellerID;
    }

    public void setSellerID(int sellerID) {
        this.sellerID = sellerID;
    }
    // array of ads posted by seller
}
