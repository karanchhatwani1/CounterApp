package com.example.android.counterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import com.example.android.counterapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding bind;
    int qty = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bind = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(bind.getRoot());

        setUpEventHandlers();
    }

    //Method to set functionality of both the buttons
    private void setUpEventHandlers() {

        //setting onClickListener on decrement button
        bind.decButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                qty--;
                bind.quantity.setText(""+qty);
            }
        });

        //setting onClickListener on increment button
        bind.incButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                qty++;
                bind.quantity.setText(""+qty);
            }
        });
    }

}