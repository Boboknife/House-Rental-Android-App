package com.example.rentalapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class login extends AppCompatActivity {

    public void launchApp(View view){
        //Log.i("Info", "button working check? ");
        openActivity2();

    }

    public void openActivity2(){
        Intent intent = new Intent (this, Search.class );
        startActivity(intent);
    }
    public void openActivity5(){
        Intent intent = new Intent (this, newUserCreate.class );
        startActivity(intent);
    }

    public void signUp(){
        TextView tv = (TextView)findViewById(R.id.textView9);

        tv.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                openActivity5();
            }
        });
   }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        signUp();
    }
}