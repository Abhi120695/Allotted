package com.au.allotedv5;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;

public class Login_Activity extends AppCompatActivity {
    public static final String PREFS_NAME = "LoginCheck";
    private EditText ClubName;
    private String clubsname=new String();
    private SharedPreferences settings;
    SharedPreferences.Editor editor ;
    private String Club;
   // 0 - for private mode


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        ClubName = (EditText) findViewById(R.id.editText5);
        ClubName.setTextColor(Color.WHITE);
        settings = getPreferences(MODE_PRIVATE);
        settings = this.getSharedPreferences(Login_Activity.PREFS_NAME, 0);
        editor = settings.edit();






//Get "hasLoggedIn" value. If the value doesn't exist yet false is returned
        boolean hasLoggedIn = settings.getBoolean("hasLoggedIn", false);
         Club=settings.getString("Clubname","no Name");

        if(hasLoggedIn)
        {
            Intent intent = new Intent();
            intent.setClass(Login_Activity.this, MainActivity.class);
            intent.putExtra("club",Club);
            startActivity(intent);
            Login_Activity.this.finish();
        }


    }

    public void Saveclubname(View view) {
        //Set "hasLoggedIn" to true
        clubsname=ClubName.getText().toString();
        editor.putBoolean("hasLoggedIn", true);
        editor.putString("Clubname",clubsname);
        Intent intent = new Intent();
        intent.setClass(Login_Activity.this, MainActivity.class);
        intent.putExtra("club",clubsname);
        startActivity(intent);
        Login_Activity.this.finish();

// Commit the edits!
        editor.commit();

    }
}
