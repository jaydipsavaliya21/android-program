package com.muproject.mu_android_project;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "DoctorDB";
    private static final int DATABASE_VERSION = 1;

    public static final String TABLE_DOCTOR = "Doc_detail";
    public static final String COLUMN_ID = "doc_id";
    public static final String COLUMN_FNAME = "firstname";
    public static final String COLUMN_LNAME = "lastname";
    public static final String COLUMN_MOB = "mob";
    public static final String COLUMN_ADD = "add_ress"; // "add" is technically a reserved keyword in some SQL dialects, better to use add_ress
    public static final String COLUMN_CITY = "city";
    public static final String COLUMN_SPECIALIZATION = "specialization";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createTableQuery = "CREATE TABLE " + TABLE_DOCTOR + " (" +
                COLUMN_ID + " TEXT PRIMARY KEY, " +
                COLUMN_FNAME + " TEXT, " +
                COLUMN_LNAME + " TEXT, " +
                COLUMN_MOB + " TEXT, " +
                COLUMN_ADD + " TEXT, " +
                COLUMN_CITY + " TEXT, " +
                COLUMN_SPECIALIZATION + " TEXT)";
        db.execSQL(createTableQuery);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_DOCTOR);
        onCreate(db);
    }
}
