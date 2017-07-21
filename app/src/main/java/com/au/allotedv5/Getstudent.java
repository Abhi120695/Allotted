package com.au.allotedv5;

import android.graphics.PorterDuff;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.Toolbar;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class Getstudent extends Fragment {
    private String Timeslot1,day;
    private EditText Timeslot;
    private EditText Day;
    private String Reglist= new String();
    private TextView List;
    private Button Getlist;
    private Spinner Timespinner;
    private Spinner Time1spinner;
    private Spinner Time2spinner;
    private Spinner Dayspinner;
    Datasource mDatasource;
    private static final String[]Day1 = {"Monday", "Tuesday", "Wednesday","Thursday","Friday"};
    private static final String[] Time ={"8-9","9-10","10-11","11-12","12-1","1-2","2-3","3-4","4-5","5-6","6-7"};
    private static final String[] Time1 ={"8","9","10","11","12","1","2","3","4","5","6","7"};
    private static final String[] Time2 ={"8","9","10","11","12","1","2","3","4","5","6","7"};
    private static final String[] Time3 ={"8","9","10","11","12","13","14","15","16","17","18","19"};
    private String Timeslot11;
    private String Timeslot12;
    private String Timeslot13;


    public static Getstudent newInstance() {
        Getstudent fragment = new Getstudent();
        return fragment;
    }
    private time mtime=new time();
public Getstudent(){

}
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.getstudent, container, false);
        super.onCreate(savedInstanceState);
        Toolbar toolbar = (Toolbar)rootView.findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);
       // Timeslot=(EditText)rootView.findViewById(R.id.editText4);
       // Day = (EditText) rootView.findViewById(R.id.editText5);
        Timespinner= (Spinner)rootView.findViewById(R.id.spinner);
        Dayspinner= (Spinner)rootView.findViewById(R.id.spinner2);
        Time1spinner= (Spinner)rootView.findViewById(R.id.spinner3);
        Time2spinner= (Spinner)rootView.findViewById(R.id.spinner4);


        //ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
          //      R.layout.spinner,Time);
        //Timespinner.setAdapter(adapter);
        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(getActivity(),
                     R.layout.spinner,Time1);
        Time1spinner.setAdapter(adapter3);
        ArrayAdapter<String> adapter4 = new ArrayAdapter<String>(getActivity(),
                R.layout.spinner,Time2);
        Time2spinner.setAdapter(adapter4);
        ArrayAdapter<String>adapter2 = new ArrayAdapter<String>(getActivity(),
                R.layout.spinner,Day1);
        Dayspinner.setAdapter(adapter2);
        Bundle args = getArguments();


        Dayspinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {


            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                day = Day1[i];
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                day="";
            }


        });
        Timespinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Timeslot1=Time[i];
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Timeslot1="";
            }
        });

        Time1spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Timeslot11=Time3[i];
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Timeslot1="";
            }
        });

        Time2spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Timeslot12=Time3[i];
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Timeslot1="";
            }
        });


        List=(TextView)rootView.findViewById(R.id.textView6);
        List.setMovementMethod(new ScrollingMovementMethod());
        Getlist= (Button) rootView.findViewById(R.id.button4);
        Getlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Timeslot1=Timeslot.getText().toString();
                //day=Day.getText().toString();

               // Sortretriveddata mSortretriveddata =new Sortretriveddata(getActivity());
               // Reglist= mSortretriveddata.Sortdata(Timeslot1,day);
                Timeslot13=Timeslot11+"-"+Timeslot12;
              Reglist=  mtime.calctime(getActivity(),day,Timeslot13);
                List.setText(Reglist);

            }
        });
        mDatasource=new Datasource(getActivity());

        mDatasource.open();

return rootView;

    }




    @Override
    public void onResume() {
        super.onResume();
        mDatasource.open();
    }

    @Override
    public void onPause() {
        super.onPause();
        mDatasource.close();
    }
}
