package com.example.customadapter;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<String> fruits=new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Orange");

        ArrayList<Integer> img=new ArrayList<>();
        img.add(R.drawable.apple);
        img.add(R.drawable.orange);

        CustomBaseAdapter customBaseAdapter=new CustomBaseAdapter(getBaseContext(),fruits,img);

        ListView listview=findViewById(R.id.myListView);
        listview.setAdapter(customBaseAdapter);
    }
}