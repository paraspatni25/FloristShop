package com.example.floristshop;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Shipping_Detail_Activity extends AppCompatActivity {

    Button Change_activity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shipping__detail_);

        //Creating an on click listener on main activity to move to next activity.
        Change_activity = findViewById(R.id.button_checkout);
        Change_activity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Shipping_Detail_Activity.this, CheckoutActivity.class);
                startActivity(i);
            }
        });
    }
}
