package com.example.georgia.alfa.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.example.georgia.alfa.R;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }


    public void Login(View view) {
       // Intent TerritoryIntent=new Intent(getApplicationContext(),)
        Toast.makeText(getApplicationContext(),"you are login in",Toast.LENGTH_LONG).show();

        Intent myIntent=new Intent(getApplicationContext(),Territories.class);
        startActivity(myIntent);
    }
}
