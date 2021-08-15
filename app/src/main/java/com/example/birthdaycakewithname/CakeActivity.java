package com.example.birthdaycakewithname;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class CakeActivity extends AppCompatActivity {

    String playerName;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cake);

        // Get intent data
        Intent i = getIntent();

        // Selected image id
        int position = i.getExtras().getInt("id");
        String playerName = i.getStringExtra("keyname");
        ImageAdapter imageAdapter = new ImageAdapter(this);

        ImageView imageView = (ImageView) findViewById(R.id.SingleView);
        imageView.setImageResource(imageAdapter.mThumbIds[position]);

        textView = findViewById(R.id.textViewName);
//        playerName = getIntent().getStringExtra("keyname");
        textView.setText("Happy Birthday to " + playerName);
    }

}