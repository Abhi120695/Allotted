package com.au.allotedv5;


import android.content.Context;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import com.opencsv.CSVReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Abhishek-Pc on 28-02-2016.
 */
public class Import  {
    final Context mContext;
    Datasource mDataSource;



    private String path;

    public Import(Context context) {
        this.mContext = context;
        mDataSource = new Datasource(mContext);
        mDataSource.open();


    }
    private boolean checkflag=false;

    SQLiteOpenHelper dbhelper1;

    public void impcsv(File path) {
       // File exportDir = new File(Environment.getExternalStorageDirectory(), "");

       /* if (!exportDir.exists())

        {
            exportDir.mkdirs();
        }
        */

       // File file = new File(path,"");
        try {
            CSVReader reader = new CSVReader(new FileReader(path));
            String[] nextLine;

            try {
                while ((nextLine = reader.readNext()) != null) {

                    // nextLine[] is an array of values from the line
                    Sortstrings sortstrings = new Sortstrings();

                    sortstrings.setNAME(nextLine[0]);
                    sortstrings.setTaken(nextLine[1]);
                    sortstrings.setKEY(nextLine[2]);
                    sortstrings.setMONDAY(nextLine[3]);
                    sortstrings.setTUESDAY(nextLine[4]);
                    sortstrings.setWEDNESDAY(nextLine[5]);
                    sortstrings.setTHURSDAY(nextLine[6]);
                    sortstrings.setFRIDAY(nextLine[7]);


                    if (nextLine[2].equals("sample Reg NO") || nextLine[2].equals("Registrationnum")) {

                    } else {
                        mDataSource.create(sortstrings);
                        checkflag=true;
                    }
                        /*
                        if (value == 1) {
                         /*
                            Toast.makeText(getApplicationContext(), "Data inerted into table", Toast.LENGTH_LONG).show();
                        }
                */


                }
                if(checkflag){
                    Toast.makeText(mContext,"Data has been imported",Toast.LENGTH_LONG).show();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }




}


