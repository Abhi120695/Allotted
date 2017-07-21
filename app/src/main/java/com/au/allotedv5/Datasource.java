package com.au.allotedv5;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Abhishek-Pc on 01-01-2016.
 */
public class Datasource {
    SQLiteOpenHelper dbhelper;
    SQLiteDatabase mSQLiteDatabase;
    Boolean flag;

    public String getFree() {
        return Free;
    }

    private String Free = new String();


    public static  final String[] Columns={
            Database.Column_id,Database.Column_studentId,
            Database.Column_Name,Database.Column_Taken,
        Database.Column_Monday, Database.Column_Tuesday,Database.Column_Wednesday,
                Database.Column_Thursday,Database.Column_Friday};
    public Datasource(Context context){
        dbhelper=new Database(context);


    }
    public void open(){

        mSQLiteDatabase=dbhelper.getWritableDatabase();
    }
    public void close(){
     mSQLiteDatabase.close();
    }

public boolean create(Sortstrings sortstrings){

    Cursor c=mSQLiteDatabase.rawQuery("SELECT * FROM Students WHERE Registrationnum='"+sortstrings.getKEY()+"'", null);

    if(c.moveToFirst())
    {
       Free="Data for Registration Number already exists";
        flag=false;
    }
    else
    {
        ContentValues values = new ContentValues();
        values.put(Database.Column_studentId,sortstrings.getKEY());
        values.put(Database.Column_Name,sortstrings.getNAME());
        values.put(Database.Column_Taken,sortstrings.getTaken());
        values.put(Database.Column_Monday,sortstrings.getMONDAY());
        values.put(Database.Column_Tuesday,sortstrings.getTUESDAY());
        values.put(Database.Column_Wednesday, sortstrings.getWEDNESDAY());
        values.put(Database.Column_Thursday, sortstrings.getTHURSDAY());
        values.put(Database.Column_Friday, sortstrings.getFRIDAY());
        long insertid=mSQLiteDatabase.insert(Database.Table,null,values);
        sortstrings.setId(insertid);
        flag=true;
        Free="Data has Been saved";


    }
    return flag;
    }

    public List<Retriveddata>getall(){
        List<Retriveddata> data = new ArrayList<>();
        mSQLiteDatabase=dbhelper.getWritableDatabase();

        Cursor cursor=mSQLiteDatabase.query(Database.Table, Columns, null, null, null, null, null);
        if(cursor.getCount()>0){
            while (cursor.moveToNext()){
                Retriveddata Data=new Retriveddata();
                Data.setId(cursor.getLong(cursor.getColumnIndex(Database.Column_id)));
                Data.setRegistration_Number(cursor.getString(cursor.getColumnIndex(Database.Column_studentId)));
                Data.setNAME(cursor.getString(cursor.getColumnIndex(Database.Column_Name)));
                Data.setTaken(cursor.getString(cursor.getColumnIndex(Database.Column_Taken)));
                Data.setMonday(cursor.getString(cursor.getColumnIndex(Database.Column_Monday)));
                Data.setTuesday(cursor.getString(cursor.getColumnIndex(Database.Column_Tuesday)));
                Data.setWenesday(cursor.getString(cursor.getColumnIndex(Database.Column_Wednesday)));
                Data.setThursday(cursor.getString(cursor.getColumnIndex(Database.Column_Thursday)));
                Data.setFriday(cursor.getString(cursor.getColumnIndex(Database.Column_Friday)));
                data.add(Data);




            }

        }

        return data;
    }

    public void DeleteData(Retriveddata retriveddata) {

                Long id =  retriveddata.getId();
            String where = Database.Column_id+"="+id;
            mSQLiteDatabase.delete(Database.Table,where,null);

        }


    public void DeleteTable() {
    }

    public boolean getflag() {
        return flag;
    }
}
