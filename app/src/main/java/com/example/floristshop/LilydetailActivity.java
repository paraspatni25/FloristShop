package com.example.floristshop;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class LilydetailActivity extends AppCompatActivity {

    //Creating floating button
    FloatingActionButton Add_to_cart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lilydetail);

        //Creating an on click listener on button to move to next activity.
        Add_to_cart = findViewById(R.id.fab);
        Add_to_cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LilydetailActivity.this, CheckoutActivity.class);
                startActivity(i);

            }

        });

    }
}