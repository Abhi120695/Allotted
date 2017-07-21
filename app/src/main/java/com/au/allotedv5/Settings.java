package com.au.allotedv5;

import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Abhishek-Pc on 25-01-2016.
 */
public class Settings extends android.support.v4.app.Fragment {
    private ListView SettingsList;
    private SimpleAdapter Setting;
    String itemString = new String();
    Database mDatabase;
    AppUtils del = new AppUtils();
    private final int PICK_FILE_REQUEST_CODE = 160;

    public static Settings newInstance() {
        Settings fragment = new Settings();
        return fragment;
    }

    public Settings() {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.settings, container, false);
        super.onCreateView(inflater, container, savedInstanceState);
        SettingsList = (ListView) rootView.findViewById(R.id.listView2);
        mDatabase = new Database(getActivity());
        String[] Setinglist = new String[]{"Reset", "Contributors", "Rate us", "Share the app", "Export", "Import"};
        String[] Setinglist2 = new String[]{"To clear the entire Database", "Shows the list of contributors", "Your way of saying Thank you", "Spread the word" , "Share your database to other users", "Import your database from other users"};

        List<Map<String, String>> data = new ArrayList<Map<String, String>>();

        for (int i = 0; i < 6; i++) {
            Map<String, String> datum = new HashMap<String, String>(2);
            datum.put("title", Setinglist[i]);
            datum.put("subtitle", Setinglist2[i]);
            data.add(datum);
        }
        final String[] mapkey = new String[]{"title", "subtitle"};
        Setting = new SimpleAdapter(getContext(), data,
                R.layout.customlist2, mapkey, new int[]{android.R.id.text1,
                android.R.id.text2,});

        SettingsList.setAdapter(Setting);
        SettingsList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                // Object item = adapterView.getItemAtPosition(i);
                // String value = item.toString();
                if (i == 0) {

                    new AlertDialog.Builder(getActivity()).setTitle("Confirm Reset")
                            .setMessage("Are you sure you want to clear the Database?")
                            .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int which) {

                                    mDatabase.DeleteTable();
                                    Toast.makeText(getActivity(), "database has been deleted", Toast.LENGTH_LONG).show();

                                }
                            })
                            .setNeutralButton("Cancel", null)
                            .create()
                            .show();


                }


                if (i == 1)

                {
                    Intent intent = new Intent(getActivity(), contributers.class);
                    startActivity(intent);
                }

                if (i == 2)

                {
                   // Toast.makeText(getActivity(), "Rate us has been selected", Toast.LENGTH_LONG).show();
                    Uri uri = Uri.parse("market://details?id=" + getActivity().getPackageName());
                    Intent goToMarket = new Intent(Intent.ACTION_VIEW, uri);
                    // To count with Play market backstack, After pressing back button,
                    // to taken back to our application, we need to add following flags to intent.
                    goToMarket.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY |
                            Intent.FLAG_ACTIVITY_CLEAR_WHEN_TASK_RESET |
                            Intent.FLAG_ACTIVITY_MULTIPLE_TASK);
                    try {
                        startActivity(goToMarket);
                    } catch (ActivityNotFoundException e) {
                        startActivity(new Intent(Intent.ACTION_VIEW,
                                Uri.parse("http://play.google.com/store/apps/details?id=" + getActivity().getPackageName())));
                    }
                }

                if (i == 3)

                {
                   // Toast.makeText(getActivity(), "Share the app has been selected", Toast.LENGTH_LONG).show();
                    final Intent _Intent = new Intent(Intent.ACTION_SEND);
                    _Intent.setType("text/plain");

                    _Intent.putExtra(Intent.EXTRA_TEXT, "Tired of the painstaking work of duty allotment,this app will rescue you : http://play.google.com/store/apps/details?id=" + getActivity().getPackageName());
                    startActivity(Intent.createChooser(_Intent, "choose one"));
                }
                if (i == 4) {
                    AlertDialog.Builder alert = new AlertDialog.Builder(getActivity());
                    final EditText edittext = new EditText(getActivity());
                    alert.setView(edittext);
                    edittext.setText("StudentList.csv");

                    alert.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int whichButton) {
                            //What ever you want to do with the value
                            Editable YouEditTextValue = edittext.getText();
                            //OR
                            String Name = edittext.getText().toString();
                            MainActivity.verifyStoragePermissions(getActivity());
                            export E = new export(getActivity());

                            E.execute(Name);

                        }
                    });

                    alert.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int whichButton) {
                            // what ever you want to do with No option.
                        }
                    });
                    alert.show();


                }
                if (i == 5) {

                    //Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
                    //intent.setType("file/*");
                   // startActivityForResult(intent, PICK_FILE_REQUEST_CODE);
                    //showFileChooser();
                   // Import I = new Import(getActivity());
                    //I.impcsv();
                    Intent intent =new Intent(getActivity(),getfile.class);
                    startActivity(intent);

                }


            }
        });


        return rootView;
    }

    private static final int FILE_SELECT_CODE = 0;

    private void showFileChooser() {
        Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
        intent.setType("*/*");
        intent.addCategory(Intent.CATEGORY_OPENABLE);

        try {
            startActivityForResult(
                    Intent.createChooser(intent, "Select a File to Upload"),
                    FILE_SELECT_CODE);
        } catch (android.content.ActivityNotFoundException ex) {
            // Potentially direct the user to the Market with a Dialog
            Toast.makeText(getActivity(), "Please install a File Manager.",
                    Toast.LENGTH_SHORT).show();
        }


    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        String path =data.getDataString();

    }
}

