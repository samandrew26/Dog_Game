package com.example.dog_game;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    SQLiteHelper db;


    private Button button;
    private Button button2;
    private Button button3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openid_breed();
            }
        });

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openid_dog();
            }
        });

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opensearch_breeds();
            }
        });

    }

    public void openid_breed() {
        Intent intent = new Intent(this, id_breed.class);
        startActivity(intent);
    }


    public void openid_dog() {
        Intent intent = new Intent(this, id_dog.class);
        startActivity(intent);
    }

    public void opensearch_breeds() {
        Intent intent = new Intent(this, search_breeds.class);
        startActivity(intent);
    }
}