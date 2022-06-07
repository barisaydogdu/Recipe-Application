package com.example.foodapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class SebzeliYemekler extends AppCompatActivity {
    String items[] = new String[]
            {"Sebzeli Mantar", "Karnabahar Kızartması"};

    Integer[] images={R.drawable.sebzelimantar,
            R.drawable.karnabahar
                     };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sebzeli_yemekler);
        ListView listView = (ListView) findViewById(R.id.ListView);
        CustomListView customListView = new CustomListView(this, items, images);
        listView.setAdapter(customListView);

        //  CustomAdaptor customAdaptor= new CustomAdaptor();
        //listView.setAdapter(customAdaptor);
        //   ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items);
        //  listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent gec = new Intent(SebzeliYemekler.this, SebzeliMantar.class);
                    startActivity(gec);
                }
                if (position == 1) {
                    Intent gec = new Intent(SebzeliYemekler.this, Karnabahar.class);
                    startActivity(gec);
                }


            }

        });

    }
}
