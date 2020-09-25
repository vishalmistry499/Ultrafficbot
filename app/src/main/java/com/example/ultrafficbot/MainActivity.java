package com.example.ultrafficbot;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void sendToManual(View view) {
        Intent intent = new Intent(MainActivity.this, Manual.class);
        startActivity(intent);
    }

    public void sendToAutomatic(View view) {
        Intent intent = new Intent(MainActivity.this,AutomaticMode.class);
        startActivity(intent);
    }



}