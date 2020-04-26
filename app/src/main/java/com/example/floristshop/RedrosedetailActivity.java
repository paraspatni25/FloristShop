package com.example.floristshop;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class RedrosedetailActivity extends AppCompatActivity {

    //Creating floating button
    FloatingActionButton Add_to_cart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_redrosedetail);

        //Creating an on click listener on button to move to next activity.
        Add_to_cart = findViewById(R.id.fab);
        Add_to_cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(RedrosedetailActivity.this, Shipping_Detail_Activity.class);
                startActivity(i);

            }

        });
    }
}
