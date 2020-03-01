package com.example.dog_game;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class SQLiteHelper extends SQLiteOpenHelper {

    public static final String DATABASE_DOGS = "Dogs.db";
    public static final String TABLE_DOGS  = "Dogs_table";
    public static final String ID  = "id";
    public static final String BREEDS  = "breeds";
    public static final String DOGS  = "dogs";
    public static final String PICTURES  = "pics";


    public SQLiteHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}

