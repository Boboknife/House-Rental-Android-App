package com.example.rentalapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Search extends AppCompatActivity {

    public void onSearch(View view){
        openActivity3();
    }

    public void openActivity3(){
        Intent intent = new Intent (this, selectRoom.class );
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
}