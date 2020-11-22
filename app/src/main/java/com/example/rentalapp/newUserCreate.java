package com.example.rentalapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class newUserCreate extends AppCompatActivity {

    public void SignUponclick(View view){
        openActivity();
    }

    public void openActivity(){
        Intent intent = new Intent (this, login.class );
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
    }
}