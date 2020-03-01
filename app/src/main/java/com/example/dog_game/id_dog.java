package com.example.dog_game;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.dog_game.R;

import java.lang.reflect.Field;
import java.util.Random;

import androidx.appcompat.app.AppCompatActivity;

public class id_dog extends AppCompatActivity {

    ImageView imageView3;
    ImageView imageView4;
    ImageView imageView5;

    Button button_submit2;

    Random r;

    TextView dogsname;


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
        setContentView(R.layout.activity_id_dog);


        imageView3 = (ImageView) findViewById(R.id.imageView3);
        imageView4 = (ImageView) findViewById(R.id.imageView4);
        imageView5 = (ImageView) findViewById(R.id.imageView5);


        button_submit2 = (Button) findViewById(R.id.button_submit2);

        r = new Random();

        button_submit2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView3.setImageResource(images[r.nextInt(images.length)]);
                imageView4.setImageResource(images[r.nextInt(images.length)]);
                imageView5.setImageResource(images[r.nextInt(images.length)]);// credit to https://www.youtube.com/watch?v=Pfee0wFD5M0

            }
        });

        int resourceID = getResources().getIdentifier(
                "beagle",
                "drawable",
                getPackageName()
        );

         ;

//        final Class drawableClass = R.drawable.class;
//        final Field[] fields = drawableClass.getFields();
//
//        final Random rand = new Random();
//        int rndInt = rand.nextInt(fields.length);
//        try {
//            int resID = fields[rndInt].getInt(drawableClass);
//            imageView1.setImageResource(resID);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

    }
}
