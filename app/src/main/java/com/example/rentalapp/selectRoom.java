package com.example.rentalapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.ImageView;

public class selectRoom extends AppCompatActivity {
    private dataBaseHouses d1;
    public ImageView image;


    public void selectHouse(View view){
        //openActivity4();
        int x = d1.setImageatIndex(0,image);
        int y = d1.setvisible(0);
    }

    public void openActivity4(){
       Intent intent = new Intent (this, Payment.class );
        intent.putExtra("dataBaseHouses",  d1);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        dataBaseHouses g1 = (dataBaseHouses)getIntent().getSerializableExtra("dataBaseHouses");
        d1 = g1;
        image = (ImageView) findViewById(R.id.imageViewHouse1ID);
    }
}