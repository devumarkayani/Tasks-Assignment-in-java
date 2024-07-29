package com.example.form_page;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class mainpage extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainpage);
        TextView t1=findViewById(R.id.data);
        TextView t2=findViewById(R.id.data2);
        Intent next=getIntent();
        String name=next.getStringExtra("data1");
        String pass=next.getStringExtra("data2");

        t1.setText("NAME : "+name);
        t2.setText("Password : "+pass);
        Toast.makeText(this, "You are on the Main page", Toast.LENGTH_SHORT).show();
    }
}