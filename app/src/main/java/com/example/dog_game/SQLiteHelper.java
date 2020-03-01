package com.example.dog_game;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.BaseColumns;

final class FeedReaderContract {
    private FeedReaderContract() {}

    /* Inner class that defines the table contents */
    public static class FeedEntry implements BaseColumns {
        public static final String DOG_BREEDS = "entry";    //TABLE
        public static final String ID = "title"; //COLUMN 1
        public static final String IMAGES = "subtitle"; //COLUMN 2
    }


    private static final String SQL_CREATE_ENTRIES =
            "CREATE TABLE " + FeedEntry.DOG_BREEDS + " (" +
                    FeedEntry._ID + " INTEGER PRIMARY KEY," +
                    FeedEntry.ID + " beagle," +
                    FeedEntry.IMAGES + " TEXT)";

    private static final String SQL_DELETE_ENTRIES =
            "DROP TABLE IF EXISTS " + FeedEntry.DOG_BREEDS;

}

public class FeedReaderDbHelper extends SQLiteOpenHelper {
    // If you change the database schema, you must increment the database version.
    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "FeedReader.db";
    private static final String SQL_CREATE_ENTRIES = ;

    public FeedReaderDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_ENTRIES);
    }

    // Gets the data repository in write mode
    SQLiteDatabase db = SQLiteDatabase.getWritableDatabase();

    // Create a new map of values, where column names are the keys
    ContentValues values = new ContentValues();
values.put(FeedReaderContract.FeedEntry.ID, beagle);
values.put(FeedReaderContract.FeedEntry.IMAGES, subtitle);

    // Insert the new row, returning the primary key value of the new row
    long newRowId = db.insert(FeedReaderContract.FeedEntry.TABLE_NAME, null, values);
}

