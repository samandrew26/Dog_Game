package com.example.dog_game;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;

public class search_breeds extends AppCompatActivity {

    Integer[] images = {
            R.drawable.beagle,
            R.drawable.bernese_mountain_dog,
            R.drawable.border_collie,
            R.drawable.elkhound,
            R.drawable.golden_retriever,
            R.drawable.leonberg,
            R.drawable.newfoundland,
            R.drawable.pug,
            R.drawable.shetland_sheepdog,
            R.drawable.siberian_husky

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_breeds);


    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        MenuInflater inflater = getMenuInflater();
//        inflater.inflate(R.drawable.options_menu, menu);
//
//        return true;
//    }

}
