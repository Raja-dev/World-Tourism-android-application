package com.example.worldfoodblogs;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class MyHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME="register.db";
    public static final String TABLE_NAME="registeration";
    public static final String COL_1="ID";
    public static final String COL_2="Name";
    public static final String COL_3="Password";
    public static final String COL_4="C_Password";
    public static final String COL_5="Email_PHone";
    public MyHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    public MyHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE " + TABLE_NAME + " (ID INTEGER PRIMARY KEY AUTOINCREMENT,Name TEXT,Password TEXT,C_Password TEXT,Email_Phone TEXT)");
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " +TABLE_NAME); //Drop older table if exists
        onCreate(db);
    }
}























/*import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class MyHelper extends SQLiteOpenHelper
{
    public static final String DBNAME = "MYDB";
    public static final String TABLENAME = "REGISTER";
    public static final String COLUMN1 = "ID";
    public static final String COLUMN2 = "USERNAME";
    public static final String COLUMN3 = "PASSWORD";
    public static final String COLUMN4 = "CONFIRM_PASSWORD";
    public static final String COLUMN5 = "EMAIL";


    public MyHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
            //create a table
        String script = "CREATE TABLE " + TABLENAME + "("
                + COLUMN1 + " INTEGER PRIMARY KEY autoincrement," + COLUMN2 + " TEXT,"
                + COLUMN3 + " VCHAR," + COLUMN4 + "VCHAR," + COLUMN5 + "VCHAR" +" )";
        sqLiteDatabase.execSQL(script);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
            //Drop tables if exists
            sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + TABLENAME);

            //create table again
            onCreate(sqLiteDatabase);
    }

    //if table has no data Insert
}*/
