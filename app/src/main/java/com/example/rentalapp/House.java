package com.example.rentalapp;

import android.view.View;
import android.widget.ImageView;

public class House {
    private int sellerID;
    private ImageView image;

    public ImageView getImage() {
        return image;
    }

    public void setImage(ImageView image) {
        this.image = image;
    }
    public void setvisible(){
        image.setVisibility(View.VISIBLE);

    }



    public int getSellerID() {
        return sellerID;
    }

    public void setSellerID(int sellerID) {
        this.sellerID = sellerID;
    }



}
