package com.example.floristshop;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class ItemsActivity extends AppCompatActivity {
    //Creating card view values
    CardView Lily_card;
    CardView Red_rose_card;
    CardView Black_rose_card;
    //Creating floating button
    private FloatingActionButton Checkout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_items);

        //Creating an on click listener on main activity to move to next activity.
        Lily_card= findViewById(R.id.card_view_lily);
        Lily_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ItemsActivity.this, LilydetailActivity.class);
                startActivity(i);
            }
        });

        //Creating an on click listener on main activity to move to next activity.
        Red_rose_card= findViewById(R.id.card_view_red);
        Red_rose_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ItemsActivity.this, RedrosedetailActivity.class);
                startActivity(i);
            }
        });

        //Creating an on click listener on main activity to move to next activity.
        Black_rose_card= findViewById(R.id.card_view_black);
        Black_rose_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ItemsActivity.this, BlackrosedetailActivity.class);
                startActivity(i);
            }
        });

        //Creating an on click listener on main activity to move to next activity.
        Checkout= findViewById(R.id.fab_checkout);
        Checkout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ItemsActivity.this,CheckoutActivity.class);
                startActivity(i);
            }
        });
    }
}
