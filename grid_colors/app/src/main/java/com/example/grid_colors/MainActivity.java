package com.example.grid_colors;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView one1 = findViewById(R.id.one);
        TextView two2 = findViewById(R.id.two);
        TextView three3 = findViewById(R.id.three);

        for (int i = 0; i < 3; i++) {
            double randomValue = Math.random();
            String randomString = String.valueOf(randomValue);
            int a = 1;
            switch (i) {
                case 0:
                    one1.setText(String.valueOf(a));
                    break;
                case 1:
                    two2.setText(String.valueOf(a));
                    break;
                case 2:
                    three3.setText(randomString);
                    break;
            }
        }

        if (one1.getText().toString().equals(two2.getText().toString())) {
            one1.setBackgroundColor(ContextCompat.getColor(this, android.R.color.black));
            two2.setBackgroundColor(ContextCompat.getColor(this, android.R.color.black));
        }
    }
}
