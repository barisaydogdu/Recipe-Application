package com.example.foodapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.foodapplication.R;

public class EtliYemekler extends AppCompatActivity {
    String items[] = new String[]
            {"İçli Köfte", "Pirzola","Tepsi Kebabı", "Sulu Köfte","Dana Rosto","Güveç"};

    Integer[] images={R.drawable.iclikofte,
            R.drawable.pirzola,
            R.drawable.tepsikebabi,
            R.drawable.sulukofte,
            R.drawable.danarosto,
             R.drawable.guvec};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liste2);

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
                    Intent gec = new Intent(EtliYemekler.this, İcliKofte.class);
                    startActivity(gec);
                }
                if (position == 1) {
                    Intent gec = new Intent(EtliYemekler.this, Pirzola.class);
                    startActivity(gec);
                }
                if (position == 2) {
                    Intent gec = new Intent(EtliYemekler.this, TepsiKebabi.class);
                    startActivity(gec);
                }
                if (position == 3) {
                    Intent gec = new Intent(EtliYemekler.this, SuluKofte.class);
                    startActivity(gec);
                }
                if (position == 4) {
                    Intent gec = new Intent(EtliYemekler.this, DanaRosto.class);
                    startActivity(gec);
                }
                if (position == 5) {
                    Intent gec = new Intent(EtliYemekler.this, Guvec.class);
                    startActivity(gec);
                }
            }

        });

    }
}