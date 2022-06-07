package com.example.foodapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class DiyetTarifleri extends AppCompatActivity {
    String items[] = new String[]
            {"Nohutlu Salata", "Izgara Hindi"};

    Integer[] images={R.drawable.nohutlusalata,
            R.drawable.izgarahindi,
          };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diyet_tarifleri);
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
                    Intent gec = new Intent(DiyetTarifleri.this, NohutluSalata.class);
                    startActivity(gec);
                }
                if (position == 1) {
                    Intent gec = new Intent(DiyetTarifleri.this, IzgaraHindi.class);
                    startActivity(gec);
                }

            }

        });

    }
}
