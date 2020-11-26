package com.example.rentalapp;

import android.view.View;
import android.widget.ImageView;

import java.io.Serializable;

public class House implements Serializable {
    private static int nextSellerID = 1;
    private int sellerID;
    private ImageView image;

    House() {
        sellerID = nextSellerID;
        nextSellerID++;
    }

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
