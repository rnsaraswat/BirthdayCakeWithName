package com.example.birthdaycakewithname;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class CakeActivity extends AppCompatActivity {

    String playerName;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cake);

        textView = findViewById(R.id.textViewName);
        playerName = getIntent().getStringExtra("keyname");
        textView.setText("Happy Birthday to " + playerName);
    }

}