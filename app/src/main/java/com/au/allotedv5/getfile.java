package com.au.allotedv5;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import java.io.File;

/**
 * Created by Abhishek-Pc on 29-02-2016.
 */
public class getfile extends Activity {
    private String mapath;
    Import mImport;
    final int select_file_cod=60;

    private void openFile(int  CODE) {
        Intent i = new Intent(Intent.ACTION_GET_CONTENT);
        i.setType("*text/csv*");
        startActivityForResult(i, CODE);
    }
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
       if(data!=null) {
           String Fpath = data.getData().getPath();
           mapath = Fpath;
           if (!mapath.equals("")) {
               mImport.impcsv(new File(mapath));
               Log.v("NEW", Fpath);
               finish();
           } else {
               Toast.makeText(this, "Please Select a file", Toast.LENGTH_LONG).show();
               finish();
           }
       }
      else{
           Toast.makeText(this, "Please Select a file", Toast.LENGTH_LONG).show();
           finish();
       }


        super.onActivityResult(requestCode, resultCode, data);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        mImport=new Import(this);
        super.onCreate(savedInstanceState);

        openFile(select_file_cod);




    }


}
