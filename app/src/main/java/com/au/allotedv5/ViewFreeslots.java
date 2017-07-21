package com.au.allotedv5;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class ViewFreeslots extends AppCompatActivity {
    private TextView Freeslots;
    private TextView Freeslots2;
    private String Freetimings;
    private String Freetimings2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_freeslots);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
      Freeslots= (TextView) findViewById(R.id.textView8);
        Freeslots2=(TextView)findViewById(R.id.textView10);
        Freetimings2=getIntent().getStringExtra(ViewDatabase.Timings2);
        Freetimings=getIntent().getStringExtra(ViewDatabase.Timings);
        Freeslots.setText(Freetimings2);
        Freeslots2.setText(Freetimings);



        Freeslots.setMovementMethod(new ScrollingMovementMethod());
        Freeslots.setTextIsSelectable(true);


    }

}
