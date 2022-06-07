package com.example.foodapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class Mercimek extends AppCompatActivity {

    RatingBar ratingBar;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mercimek);
        ratingBar=(RatingBar) findViewById(R.id.ratingBar);
        //    button=(Button) findViewById(R.id.button_check);
        // ratingBar.setMax(5);
        // ratingBar.setNumStars(5);
        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean fromUser) {
                Toast.makeText(Mercimek.this,"Stars: "+(int)v,Toast.LENGTH_SHORT).show();
            }
        });
        // button.setOnClickListener(new View.OnClickListener() {
        //   @Override
        // public void onClick(View v) {
        //   Toast.makeText(İcliKofte.this,"Stars: "+(int) ratingBar.getRating(),Toast.LENGTH_SHORT).show();
        // }
        //});
    }
}