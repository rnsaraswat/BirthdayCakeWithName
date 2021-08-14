package com.example.birthdaycakewithname;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editTextName;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.createBirthdayButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createBirthdayCard();
            }
        });
    }
    public void createBirthdayCard() {
        editTextName = findViewById(R.id.nameInput);
        Intent intent = new Intent(MainActivity.this, CakeActivity.class);
        String playerName = editTextName.getText().toString();
        intent.putExtra("keyname", playerName);
        Log.d("Ravi", "Main Activity Player name " + playerName);
        startActivity(intent);
    }
}