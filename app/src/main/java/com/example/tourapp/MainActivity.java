package com.example.tourapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.tourapp.IntoTheCity;
public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void getIntoCity(View view)
    {
        Intent objectIntent=new Intent(this,IntoTheCity.class);

        startActivity(objectIntent);

        this.finish();
    }

}
