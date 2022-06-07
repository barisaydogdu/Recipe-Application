package com.example.foodapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class Liste extends AppCompatActivity {

    String items[] = new String[]
            {"Etli Yemek Tarifleri", "Diyet Tarifleri", "Sebzeli Tarifler", "Çorba Tarifleri","Tatlı Tarifleri"};

    Integer[] images={R.drawable.biftek,
            R.drawable.diyet,
            R.drawable.sebzeli,
            R.drawable.corba,
            R.drawable.tatli};

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liste2);
        ListView listView = (ListView) findViewById(R.id.ListView);
        CustomListView customListView= new CustomListView(this,items,images);
        listView.setAdapter(customListView);
      //  CustomAdaptor customAdaptor= new CustomAdaptor();
       //listView.setAdapter(customAdaptor);
    //   ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items);
      //  listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position==0)
                {
                    Intent gec= new Intent(Liste.this,EtliYemekler.class);
                    startActivity(gec);
                }
                if (position==1)
                {
                    Intent gec= new Intent(Liste.this,DiyetTarifleri.class);
                    startActivity(gec);
                }
                if (position==2)
                {
                    Intent gec= new Intent(Liste.this,SebzeliYemekler.class);
                    startActivity(gec);
                }
                if (position==3)
                {
                    Intent gec= new Intent(Liste.this,CorbaTarifleri.class);
                    startActivity(gec);
                }
                if (position==4)
                {
                    Intent gec= new Intent(Liste.this,TatliTarifleri.class);
                    startActivity(gec);
                }
            }

        });

    }

  /*  private class CustomAdaptor extends BaseAdapter{

            @Override
            public int getCount() {
                return images.length;
            }

            @Override
            public Object getItem(int position) {
                return null;
            }

            @Override
            public long getItemId(int position) {
                return 0;
            }

            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                View view= getLayoutInflater().inflate(R.layout.customlayout,null);
                ImageView mImageView=view.findViewById(R.id.imageView);
                TextView mTextView=view.findViewById((R.id.textView));
                mImageView.setImageResource(images[position]);
                mTextView.setText(items[position]);
                return view;
            }*/
        }

