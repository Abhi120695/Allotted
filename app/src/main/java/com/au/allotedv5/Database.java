package com.au.allotedv5;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Abhishek-Pc on 31-12-2015.
 */
public class Database extends SQLiteOpenHelper {
    private static final String DATABASENAME ="StudentList";
    private static final int Databaseversion =1;

    public static  final String Table="Students";
    public static final String Column_id="ColumnID";
    public static  final String Column_studentId="Registrationnum";
    public static final String Column_Taken="Taken";
    public static  final String Column_Name="NAME";
    public static  final String Column_Monday="Monday";
    public static  final String Column_Tuesday="Tuesday";
    public static  final String Column_Wednesday="Wednesday";
    public static  final String Column_Thursday="Thursday";
    public static  final String Column_Friday="Friday";
    private static final String Tablecreate=" CREATE TABLE "+Table+" ("+Column_id + " INTEGER PRIMARY KEY AUTOINCREMENT, "+
      Column_Name +" TEXT, "+Column_Taken+" TEXT, " +Column_studentId +" TEXT, "+Column_Monday+" TEXT, "+Column_Tuesday+" TEXT, "+Column_Wednesday+" TEXT, "+Column_Thursday+" TEXT, "+
            Column_Friday+" TEXT" + ")";


    public Database(Context context) {
        super(context, DATABASENAME, null, Databaseversion);

    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
         sqLiteDatabase.execSQL(Tablecreate);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
      sqLiteDatabase.execSQL("DROP TABLE IF EXISTS "+Table);
        onCreate(sqLiteDatabase);
    }

    public void DeleteTable() {
        SQLiteDatabase sqLiteDatabase=getWritableDatabase();
       // sqLiteDatabase.delete(Table, null, null);
        sqLiteDatabase.execSQL("delete from "+ Table);
    }
}
