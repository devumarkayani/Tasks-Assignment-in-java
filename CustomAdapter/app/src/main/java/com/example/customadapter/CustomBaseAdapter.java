package com.example.customadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomBaseAdapter extends BaseAdapter {
    Context context;
    ArrayList<String> listFruits;
    ArrayList<Integer> listImages;
    LayoutInflater inflater;

    public CustomBaseAdapter(Context context, ArrayList<String> listFruits, ArrayList<Integer> listImages) {
        this.context = context;
        this.listFruits = listFruits;
        this.listImages = listImages;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return listFruits.size();
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
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.activity_list_view_data, parent, false);
        }

        TextView txtView = convertView.findViewById(R.id.textView);//get id
        ImageView fruitImg = convertView.findViewById(R.id.imageIcon);//get id

        txtView.setText(listFruits.get(position));//set data in the views
        fruitImg.setImageResource(listImages.get(position));//set data in the views

        return convertView;
    }
}
