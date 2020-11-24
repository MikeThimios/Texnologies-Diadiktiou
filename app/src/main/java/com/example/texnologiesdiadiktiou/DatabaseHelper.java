package com.example.texnologiesdiadiktiou;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "COMPANY_WORKERS.db";
    public static final String TABLE_NAME = "WORKERS";
    public static final String COL_1 = "ID";
    public static final String COL_2 = "NAME";
    public static final String COL_3 = "SURNAME";
    public static final String COL_4 = "EXPERTISE";
    public static final String COL_5 = "PHONE_NUMBER";


    public DatabaseHelper(Context context ){

        super(context,DATABASE_NAME,null,1);
        SQLiteDatabase db = this.getWritableDatabase();

    }
    @Override
    public void onCreate(SQLiteDatabase db) {
       db.execSQL("create table" + TABLE_NAME + "(ID INTEGER PRIMARY KEY AYTOINCREMENT, NAME TEXT , SURNAME TEXT , EXPERTISE TEXT , PHONE_NUMBER TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
      db.execSQL("DROP TABLE IF EXISTS" + TABLE_NAME );
      onCreate(db);
    }
}
