package com.example.simon.rentallistview;


import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_layout);
        //data recieved
        Property property = getIntent().getSerializableExtra("value");
        //set the back (up) button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

       
    
    }
}
