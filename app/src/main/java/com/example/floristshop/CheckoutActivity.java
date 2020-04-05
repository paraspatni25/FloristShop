package com.example.floristshop;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class CheckoutActivity extends AppCompatActivity {

    //Creating image view
    ImageView Increment_Lily;
    ImageView Decrement_Lily;
    ImageView Increment_RedRose;
    ImageView Decrement_RedRose;
    ImageView Increment_BlackRose;
    ImageView Decrement_BlackRose;

    //Creating text view
    TextView Total_Count;

    //Creating text view
    private TextView lily_Count;
    private TextView red_rose_Count;
    private TextView black_rose_Count;
    private TextView GST;
    private TextView QST;
    private TextView Final_amount;
    //creating temporary.
    int total_amount = 0;
    //creating fix value integer.
    int lily_price = 15, red_price = 11, black_price = 10;
    double gst = 0, qst = 0,final_amount = 0;
    public static int count, lilyCount, blackRose, redRose = 0;
    //Creating floating button
    private FloatingActionButton Checkout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout);

        //Lily
        Increment_Lily = findViewById(R.id.imageView_increase_lily);
        Decrement_Lily = findViewById(R.id.imageView_decrease_lily);
        lily_Count = findViewById(R.id.show_quantity_lily);
        //Black rose
        Increment_BlackRose = findViewById(R.id.imageView_increase_black_rose);
        Decrement_BlackRose= findViewById(R.id.imageView_decrease_black_rose);
        black_rose_Count = findViewById(R.id.show_quantity_black_rose);
        //Red Rose
        Increment_RedRose = findViewById(R.id.imageView_increase_red_rose);
        Decrement_RedRose = findViewById(R.id.imageView_decrease_red_rose);
        red_rose_Count = findViewById(R.id.show_quantity_red_rose);

        Total_Count= findViewById(R.id.textView_total_count);
        GST = findViewById(R.id.textView_gst_value);
        QST = findViewById(R.id.textView_qst_value);
        Final_amount = findViewById(R.id.textView_final_amount_value);

        //creating the toast in the end to show the end message.
        Checkout= findViewById(R.id.fab_checkout);
        Checkout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"You have Successfully purchased items.",Toast.LENGTH_LONG).show();
            }
        });

        //onclick listener to increase and decrease a quantity for LILY.
        Increment_Lily.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int currentCount = Integer.parseInt(lily_Count.getText().toString());
                lily_Count.setText(Integer.toString(++currentCount));
                total_amount= total_amount+lily_price;
                Settotalcount();
            }
        });

        Decrement_Lily.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int currentCount = Integer.parseInt(lily_Count.getText().toString());
                if (currentCount > 0){
                    lily_Count.setText(Integer.toString(--currentCount));
                    total_amount= total_amount-lily_price;
                }
                Settotalcount();
            }
        });

        //onclick listener to increase and decrease a a quantity for RED ROSE.
        Increment_RedRose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int currentCount = Integer.parseInt(red_rose_Count.getText().toString());
                red_rose_Count.setText(Integer.toString(++currentCount));
                total_amount= total_amount+red_price;
                Settotalcount();
            }
        });

        Decrement_RedRose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int currentCount = Integer.parseInt(red_rose_Count.getText().toString());
                if (currentCount > 0){
                     red_rose_Count.setText(Integer.toString(--currentCount));
                    total_amount= total_amount-red_price;
                }
                Settotalcount();
            }
        });

        //onclick listener to increase and decrease a a quantity for BLACK ROSE.
        Increment_BlackRose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int currentCount = Integer.parseInt(black_rose_Count.getText().toString());
                black_rose_Count.setText(Integer.toString(++currentCount));
                total_amount= total_amount+black_price;
                Settotalcount();
            }
        });

        Decrement_BlackRose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int currentCount = Integer.parseInt(black_rose_Count.getText().toString());
                if (currentCount > 0){
                    black_rose_Count.setText(Integer.toString(--currentCount));
                    total_amount= total_amount-black_price;
                }
                Settotalcount();
            }
        });
    }
    //Creating the total method for all the calculation of before and after taxes.
    void Settotalcount(){
        Total_Count.setText(getString(R.string.dollar_sign)+Integer.toString(total_amount));
        gst = total_amount*0.05;
        qst = total_amount*0.09;
        final_amount = total_amount+ qst + gst;
        GST.setText(getString(R.string.dollar_sign)+ String.format("%.2f",gst));
        QST.setText(getString(R.string.dollar_sign)+String.format("%.2f",qst));
        Final_amount.setText(getString(R.string.dollar_sign)+String.format("%.2f",final_amount));

    }

    //creating override method to restore data
    @Override
    protected void onResume() {
        super.onResume();
        total_amount = count;
        lily_Count.setText(Integer.toString(lilyCount));
        black_rose_Count.setText(Integer.toString(blackRose));
        red_rose_Count.setText(Integer.toString(redRose));
        Settotalcount();
    }

    //creating override method to save data
    @Override
    protected void onPause() {
        super.onPause();
        lilyCount = Integer.parseInt(lily_Count.getText().toString());
        blackRose = Integer.parseInt(black_rose_Count.getText().toString());
        redRose = Integer.parseInt(red_rose_Count.getText().toString());
        count = total_amount;
    }
}