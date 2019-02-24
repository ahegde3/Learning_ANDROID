package com.example.sqlite;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.ContactsContract;

public class DataBase extends SQLiteOpenHelper {

    private static String DATABASE_NAME="student.db";
    private static String table_name="student_table";
    private static String col1="stdid";
    private static String col2="stdname";


    public DataBase(Context context)
    {
        super(context,DATABASE_NAME,null,1);

    }
    @Override
    public void onCreate(SQLiteDatabase db) {
      db.execSQL("create table "+table_name+" (ID INTEGER PRIMARY KEY,NAME TEXT )");
      onCreate(db);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+table_name);
        onCreate(db);

    }
    public boolean insertData(String id,String name)
    { SQLiteDatabase db=this.getWritableDatabase();
        ContentValues  contentValues=new ContentValues();
        contentValues.put(col1,id);
        contentValues.put(col2,name);
        long result=db.insertWithOnConflict(table_name,null,contentValues,0);
        if(result==-1) {
        return false;}
        else {
            return true;
        }



    }
    public Cursor getData()
    { SQLiteDatabase db=this.getWritableDatabase();
     Cursor res=db.rawQuery( "select * from " +table_name,null);
     return res;

    }
}
