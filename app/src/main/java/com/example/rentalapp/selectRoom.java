package com.example.rentalapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class selectRoom extends AppCompatActivity {
    public void selectHouse(View view){
        openActivity4();
    }
    public void openActivity4(){
        Intent intent = new Intent (this, Payment.class );
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }
}