package com.au.allotedv5;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Abhishek-Pc on 09-01-2016.
 */
public class Getstudents extends Fragment {

    private String taken=new String();
    String key=new String();
    String Name1 = new String();
    private EditText Keytext;
    public static EditText Taken ;
    private EditText Name;
    private TextView Freeslot ;
    private Button Gettimings;
    private TextView pageText;
private  Button Selectslots;
    private time mtime=new time();

    public void setFreee(String freee) {
        Freee = freee;
    }

    private String Freee=new String();
    Freecalc F=new Freecalc();
    FreecovertString F2= new FreecovertString();
    Datasource mDatasource;
    public static final int MY_REQUEST_CODE = 123;
public static Getstudents newInstance() {
    Getstudents fragment = new Getstudents();
    return fragment;
}
    public Getstudents(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       final View rootView = inflater.inflate(R.layout.getstudents, container, false);
        super.onCreate(savedInstanceState);

        Toolbar toolbar = (Toolbar)rootView.findViewById(R.id.toolbar);
        //rootView.setSupportActionBar(toolbar);
        Name = (EditText)rootView.findViewById(R.id.editText3);
        Name.setTextColor(Color.WHITE);
        Keytext = (EditText)rootView.findViewById(R.id.editText);
        Keytext.setTextColor(Color.WHITE);
        Taken = (EditText)rootView.findViewById(R.id.editText2);
        Taken.setTextColor(Color.WHITE);
        Selectslots=(Button)rootView.findViewById(R.id.button5);


        Gettimings= (Button) rootView.findViewById(R.id.button);
        Bundle args = getArguments();



        mDatasource=new Datasource(getActivity());
        mDatasource.open();





        Gettimings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                key = Keytext.getText().toString();
                taken = Taken.getText().toString().toUpperCase();
                Name1 = Name.getText().toString();
                Taken.clearFocus();
                Keytext.clearFocus();
                if (key.equals("") || taken.equals("") || Name1.equals("")) {
                    Toast.makeText(getActivity(), "INVALID ENTRY ", Toast.LENGTH_SHORT).show();
                    getActivity().getWindow().setSoftInputMode(
                            WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
                } else {
                    if (key.length()>=9&&key.length()<=10) {
                        Freee = F.calc1(Name1, key, taken, mDatasource);
                        //Toast.makeText(this, F2.mFreetimings, LENGTH_LONG).show();

                        Toast.makeText(getActivity(), Freee, Toast.LENGTH_SHORT).show();


                        Keytext.setText("");
                        Taken.setText("");
                        Name.setText("");
                        InputMethodManager imm = (InputMethodManager) getActivity().getSystemService(
                                getActivity().INPUT_METHOD_SERVICE);
                        imm.hideSoftInputFromWindow(getActivity().getCurrentFocus().getWindowToken(), 0);

                    }
                    else {
                        Toast.makeText(getActivity(),"Registration number is invalid",Toast.LENGTH_LONG).show();
                    }

                }

                InputMethodManager imm = (InputMethodManager) getActivity().getSystemService(
                        getActivity().INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(getActivity().getCurrentFocus().getWindowToken(), 0);

            }
        });


        return rootView;

    }




    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement


        return super.onOptionsItemSelected(item);
    }

   /* public void getkeyandstring(View view) {
        Freeslot.setText("");
        key=Keytext.getText().toString();
        taken=Taken.getText().toString();

        String Freee = F.calc1(key, taken,mDatasource);
        //Toast.makeText(this, F2.mFreetimings, LENGTH_LONG).show();

        Freeslot.setText(Freee);
    }
    */

   /* public void Getlist(View view) {
        Intent intent = new Intent(getActivity(),Getstudent.class);
        startActivity(intent);
    }*/

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


    public void setTaken(String taken) {

        Taken.setText(taken);
    }


}
