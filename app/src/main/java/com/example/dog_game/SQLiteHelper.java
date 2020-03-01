package com.example.dog_game;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;

public class SQLiteHelper extends SQLiteOpenHelper {

    public static final String DATABASE_BREEDS = "dog_breeds.db";
    static final String TABLE_BREEDS = "dogBreeds";
    static final String NAME_COLUMN = "breeds";
    static final String IMAGES_COLUMN = "image";
    static final String COLUMN_ID = "id";
    public static final int DB_VERSION = 1;
    public SQLiteHelper(Context context) {
        super(context, DATABASE_BREEDS, null, DB_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        String sqlBreeds = "CREATE TABLE breeds(id INTEGER PRIMARY KEY AUTOINCREMENT, breed VARCHAR, images Varchar);";

        sqLiteDatabase.execSQL(sqlBreeds);

    }

        public void saveRecords(String info, int otherinfo, int greatinfo){

            SQLiteDatabase db = this.getWritableDatabase();

            ContentValues values = new ContentValues();
            values.put(IMAGES_COLUMN, @Drawable/); // inserting a string
            values.put(NAME_COLUMN, otherinfo); // inserting an int
            values.put(COLUMN_ID, greatinfo); // inserting an int

            // Inserting Row
            db.insert(TABLE_BREEDS, null, values);
            db.close(); // Closing database connection

        }
    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        String sqlBreeds = "DROP TABLE IF EXISTS breeds";

        sqLiteDatabase.execSQL(sqlBreeds);

        onCreate(sqLiteDatabase);       //https://www.youtube.com/watch?v=aukTSbD5QUs
    }
}

