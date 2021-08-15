package com.example.birthdaycakewithname;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    GridView gridView;
    EditText editTextName;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = (GridView) findViewById(R.id.gridView);

        gridView.setAdapter(new ImageAdapter(this));

//        button = findViewById(R.id.createBirthdayButton);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                createBirthdayCard();
//            }
//        });
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v, int position, long id){
                // Send intent to SingleViewActivity
                Intent i = new Intent(getApplicationContext(), CakeActivity.class);
                editTextName = findViewById(R.id.nameInput);
                // Pass image index
                String playerName = editTextName.getText().toString();
//                i.putExtra("keyname", playerName);
                i.putExtra("keyname", playerName);
                i.putExtra("id", position);
                startActivity(i);
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