package com.example.foodapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Rating;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class İcliKofte extends AppCompatActivity {
RatingBar ratingBar;
Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_icli_kofte);
        ratingBar=(RatingBar) findViewById(R.id.ratingBar);
    //    button=(Button) findViewById(R.id.button_check);
       // ratingBar.setMax(5);
       // ratingBar.setNumStars(5);
        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
    @Override
    public void onRatingChanged(RatingBar ratingBar, float v, boolean fromUser) {
        Toast.makeText(İcliKofte.this,"Stars: "+(int)v,Toast.LENGTH_SHORT).show();
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
