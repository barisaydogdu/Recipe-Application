package com.example.foodapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    Button btnsingin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnsingin=(Button)findViewById(R.id.btn_sign);

        btnsingin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gec= new Intent(MainActivity.this,Liste.class);
                startActivity(gec);
            }
        });



    }

}
