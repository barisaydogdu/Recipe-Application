package com.example.foodapplication;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextClock;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class CustomListView extends ArrayAdapter<String> {
    private String[] items;
    private Integer[] images;
    private Activity context;
    public CustomListView(Activity context,String[] items,Integer[] images) {
        super(context, R.layout.activity_liste2,items);
        this.context=context;
        this.items=items;
        this.images=images;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View r = convertView;
        ViewHolder viewHolder = null;
        if (r == null) {
            LayoutInflater layoutInflater = context.getLayoutInflater();
            r = layoutInflater.inflate(R.layout.customlayout, null, true);
            viewHolder = new ViewHolder(r);
            r.setTag(viewHolder);
        } else {
            viewHolder=(ViewHolder) r.getTag();
        }
        viewHolder.ivw.setImageResource(images[position]);
        viewHolder.tvw1.setText(items[position]);
        return r;

    }
    class ViewHolder{
        TextView tvw1;
        ImageView ivw;
        ViewHolder(View v)
        {
            tvw1=(TextView) v.findViewById(R.id.textView2);
            ivw=(ImageView) v.findViewById(R.id.imageview);




        }

    }
}