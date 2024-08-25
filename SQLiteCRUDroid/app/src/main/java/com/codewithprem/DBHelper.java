package com.codewithprem;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.ArrayList;

public class DBHelper extends SQLiteOpenHelper {

    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "contactdb";
    public static final String CONTACTS_TABLE_NAME = "contacts";
    public static final String CONTACTS_COLUMN_ID = "id";
    public static final String CONTACTS_COLUMN_NAME = "name";
    public static final String CONTACTS_COLUMN_PHONE = "phone";
    public static final String CONTACTS_COLUMN_EMAIL = "email";
    public static final String CONTACTS_COLUMN_CITY = "place";

    public DBHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_CONTACTS_TABLE = "CREATE TABLE " + CONTACTS_TABLE_NAME + " (" +
                CONTACTS_COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                CONTACTS_COLUMN_NAME + " TEXT, " +
                CONTACTS_COLUMN_PHONE + " TEXT, " +
                CONTACTS_COLUMN_EMAIL + " TEXT, " +
                CONTACTS_COLUMN_CITY + " TEXT" + ")";
        db.execSQL(CREATE_CONTACTS_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE IF EXISTS " + CONTACTS_TABLE_NAME);
        onCreate(db);
    }

    public void createContact(String name, String phone, String email, String place) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(CONTACTS_COLUMN_NAME, name);
        values.put(CONTACTS_COLUMN_PHONE, phone);
        values.put(CONTACTS_COLUMN_EMAIL, email);
        values.put(CONTACTS_COLUMN_CITY, place);
        db.insert(CONTACTS_TABLE_NAME, null, values);
    }

    public ArrayList<Contact> getContacts() {
        SQLiteDatabase db = this.getReadableDatabase();

        String query = "SELECT * FROM " + CONTACTS_TABLE_NAME;


        ArrayList<Contact> contacts = new ArrayList<>();


        return contacts;
    }

}
