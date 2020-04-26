package com.example.floristshop;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ConfirmationActivity extends AppCompatActivity {

    ImageView confirm_image;
    TextView text_total_bill_amount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmation);


        confirm_image = findViewById(R.id.image_confirm);
        text_total_bill_amount = findViewById(R.id.text_total_bill_amount);

        Animation animation = new AlphaAnimation(1, 0); //to change visibility from visible to invisible
        animation.setDuration(750); // duration for each animation cycle
        animation.setInterpolator(new LinearInterpolator());
        animation.setRepeatCount(Animation.INFINITE); //repeating indefinitely
        animation.setRepeatMode(Animation.REVERSE); //animation will start from end point once ended.
        confirm_image.startAnimation(animation); //to start animation

        Intent intent = getIntent();

        String total = intent.getStringExtra("total");
        text_total_bill_amount.setText(total);


    }
}
