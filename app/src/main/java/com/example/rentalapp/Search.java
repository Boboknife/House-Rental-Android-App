package com.example.rentalapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;

public class Search extends AppCompatActivity {
   public dataBaseHouses d1 ;
   private boolean isClicked = false;
    public void onSearch(View view){
        openActivity3();
    }

    public void openActivity3(){
        isClicked = true;
       // Intent intent = new Intent (this, selectRoom.class );
       // intent.putExtra("dataBaseHouses",  d1);
      //  startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        dataBaseHouses g1 = (dataBaseHouses)getIntent().getSerializableExtra("dataBaseHouses");
        //d1 = g1;
        if (isClicked)
        {
             Intent intent = new Intent (this, selectRoom.class );
             intent.putExtra("dataBaseHouses",  g1);
             startActivity(intent);
        }

    }
}