package com.au.allotedv5;

import android.Manifest;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Environment;
import android.provider.SyncStateContract;
import android.support.design.widget.Snackbar;
import android.support.v4.app.ActivityCompat;
import android.util.Log;
import android.widget.Toast;

import com.opencsv.CSVWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.math.MathContext;
import java.sql.SQLException;

import javax.sql.DataSource;

/**
 * Created by Abhishek-Pc on 28-02-2016.
 */


public class export extends AsyncTask<String, Void, Boolean> {
   final   Context mContext;
    final ProgressDialog dialog;
    private String path;
    Uri u1  =   null;
   static File file = null;

  public export(Context context){
      this.mContext=context;
      dialog=new ProgressDialog(context);


  }
    SQLiteOpenHelper dbhelper1;
   // SQLiteDatabase mSQLiteDatabase;





        @Override
        protected void onPreExecute ()

        {

            this.dialog.setMessage("Exporting database...");

            this.dialog.show();

        }



    protected Boolean doInBackground(final String... args)

    {
      String Name = args[0];

        File dbFile = mContext.getDatabasePath(Name);
        //AABDatabaseManager dbhelper = new AABDatabaseManager(getApplicationContext());

        System.out.println(dbFile);  // displays the data base path in your logcat


        File exportDir = new File(Environment.getExternalStorageDirectory(), "");

        if (!exportDir.exists())

        {
            exportDir.mkdirs();
        }


        file = new File(exportDir, Name);
        path=file.getAbsolutePath();

        Log.v("tag", path);






        try {
          boolean bt=  file.createNewFile();
                if (bt) {
                    Log.v("tag12","File is created!");

                } else {
                    Log.v("tag1","File already exists.");
                }


            Log.v("tag22", "working1");
          CSVWriter csvWrite ;


            csvWrite = new CSVWriter(new FileWriter(file));

            dbhelper1=new Database(mContext);
            SQLiteDatabase db = dbhelper1.getWritableDatabase();
            //  Database db1 = new Database(mContext);

            Cursor curCSV = db.rawQuery("select * from " + "Students", null);
            String[] Columns={
                    Database.Column_Name,
                    Database.Column_Taken,
                   Database.Column_studentId,
                    Database.Column_Monday, Database.Column_Tuesday,Database.Column_Wednesday,
                    Database.Column_Thursday,Database.Column_Friday};
            csvWrite.writeNext(Columns);

            Log.v("tag22", "working2");
            while (curCSV.moveToNext())

            {

                String arrStr[] = { curCSV.getString(1), curCSV.getString(2), curCSV.getString(3), curCSV.getString(4), curCSV.getString(5), curCSV.getString(6), curCSV.getString(7), curCSV.getString(8)};

         /*curCSV.getString(3),curCSV.getString(4)};*/

                csvWrite.writeNext(arrStr);

                Log.v("tag22", "working3");

            }
            csvWrite.close();

            curCSV.close();
        } catch (IOException e)

        {

            Log.v("power", e.getMessage(), e);

            return false;

        }










            return true;






    }



    protected void onPostExecute(final Boolean success)

    {

        if (this.dialog.isShowing())

        {

            this.dialog.dismiss();

        }

        if (success)

        {

            Toast.makeText(mContext, "Export succeed file has been saved in "+ path, Toast.LENGTH_SHORT).show();

            u1  =   Uri.fromFile(file);
            Intent sendIntent = new Intent(Intent.ACTION_SEND);
            sendIntent.putExtra(Intent.EXTRA_SUBJECT, "Database");
            sendIntent.putExtra(Intent.EXTRA_STREAM, u1);
            sendIntent.setType("text/html");
            mContext.startActivity(sendIntent);


        } else

        {

            Toast.makeText(mContext, "Export failed", Toast.LENGTH_SHORT).show();

        }
    }

}

