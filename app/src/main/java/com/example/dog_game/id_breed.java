package com.example.dog_game;

import android.app.Activity;
import android.content.res.TypedArray;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import java.lang.reflect.Field;
import java.util.Random;

public class id_breed extends AppCompatActivity {

    ImageView imageView1;

    Button button_submit;

    Random r;


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
        setContentView(R.layout.activity_id_breed);

        Spinner spinner = (Spinner) findViewById(R.id.spinner);
// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.breeds, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        spinner.setAdapter(adapter);

        class SpinnerActivity extends Activity implements AdapterView.OnItemSelectedListener {

            public void onItemSelected(AdapterView<?> parent, View view,
                                       int pos, long id) {
                // An item was selected. You can retrieve the selected item using
                // parent.getItemAtPosition(pos)
            }

            public void onNothingSelected(AdapterView<?> parent) {
                // Another interface callback
            }
        }


        imageView1 = (ImageView) findViewById(R.id.imageView1);


        button_submit = (Button) findViewById(R.id.button_submit);

        r = new Random();

        button_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView1.setImageResource(images[r.nextInt(images.length)]);  // credit to https://www.youtube.com/watch?v=Pfee0wFD5M0

            }
        });

    }
}
