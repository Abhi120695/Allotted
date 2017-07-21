package com.au.allotedv5;

import android.content.Context;
import android.util.Log;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Abhishek-Pc on 04-03-2016.
 */
public class sortretriveddata2 {
    private List<Retriveddata> Data1;
    //private List<String> Regnum =new ArrayList<>();
    StringBuilder Regnum = new StringBuilder();
    private String Regnum1 = new String();
    private String Monday = new String();
    private String Tuesday = new String();
    private String Wednesday = new String();
    private String Thursday = new String();
    private String Friday = new String();
    private String NAME = new String();


    public sortretriveddata2(Context context) {

        Data1 = new Datasource(context).getall();

    }

    public String Sortdata(String Day, String[] Time) {


// In your method:

        boolean Found = true;
        boolean Found2;

        int i = 0;
        int j;
         int k = Time.length;
        int l=0;
        if (Day.equals("Monday")) {
            for (i = 0; i < Data1.size(); i++) {
                Found = true;
                Found2=true;
                Monday = Data1.get(i).getMonday();
                Regnum1 = Data1.get(i).getRegistration_Number();
                NAME = Data1.get(i).getNAME();

                    for (j = 0; j < k; j++) {
                      Found2= checkday(Monday, Time[j]);
                        Found=Found&&Found2;
                        Log.v("check21",Time[j]+Boolean.toString(Found2)+Boolean.toString(Found));
                        //Log.v("check31",Boolean.toString(Found));

                    }

                if (Found) {
                    Regnum.append(Regnum1 + "-" + NAME + "\n");
                }

            }
        }

            if (Day.equals("Tuesday")) {
                for (i = 0; i < Data1.size(); i++) {
                    Found = true;
                    Found2=true;

                    Tuesday = Data1.get(i).getTuesday();
                    Regnum1 = Data1.get(i).getRegistration_Number();
                    NAME = Data1.get(i).getNAME();
                    for (j = 0; j < k; j++) {
                        Found2= checkday(Tuesday,Time[j]);
                        Found=Found&&Found2;
                        Log.v("check21",Time[j]+Boolean.toString(Found2)+Boolean.toString(Found));
                        //Log.v("check31",Boolean.toString(Found));

                    }
                    if (Found) {
                        Regnum.append(Regnum1 + "-" + NAME + "\n");
                    }

                }
            }
            if (Day.equals("Wednesday")) {
                for (i = 0; i < Data1.size(); i++) {
                    Found = true;
                    Found2=true;
                    Wednesday = Data1.get(i).getWenesday();
                    Regnum1 = Data1.get(i).getRegistration_Number();
                    NAME = Data1.get(i).getNAME();
                    for (j = 0; j < k; j++) {
                        Found2= checkday(Wednesday,Time[j]);
                        Found=Found&&Found2;
                        Log.v("check21",Time[j]+Boolean.toString(Found2)+Boolean.toString(Found));
                        //Log.v("check31",Boolean.toString(Found));

                    }
                    if (Found) {
                        Regnum.append(Regnum1 + "-" + NAME + "\n");
                    }

                }
            }
            if (Day.equals("Thursday")) {
                for (i = 0; i < Data1.size(); i++) {
                    Found = true;
                    Found2=true;

                    Thursday = Data1.get(i).getThursday();
                    Regnum1 = Data1.get(i).getRegistration_Number();
                    NAME = Data1.get(i).getNAME();
                    for (j = 0; j < k; j++) {
                        Found2= checkday(Thursday,Time[j]);
                        Found=Found&&Found2;
                        Log.v("check21",Time[j]+Boolean.toString(Found2)+Boolean.toString(Found));
                        //Log.v("check31",Boolean.toString(Found));

                    }
                    if (Found) {
                        Regnum.append(Regnum1 + "-" + NAME + "\n");
                    }

                }
            }
            if (Day.equals("Friday")) {
                for (i = 0; i < Data1.size(); i++) {
                    Found = true;
                    Found2=true;

                    Friday = Data1.get(i).getFriday();
                    Regnum1 = Data1.get(i).getRegistration_Number();
                    NAME = Data1.get(i).getNAME();
                    for (j = 0; j < k; j++) {
                        Found2= checkday(Friday,Time[j]);
                        Found=Found&&Found2;
                        Log.v("check21",Time[j]+Boolean.toString(Found2)+Boolean.toString(Found));
                        //Log.v("check31",Boolean.toString(Found));

                    }

                    if (Found) {
                        Regnum.append(Regnum1 + "-" + NAME + "\n");
                    }

                }
            }



        if (Regnum.toString().equals("")) {
            Regnum.append("No members found");
        }
        return Regnum.toString();
    }

    private Boolean checkday(String day, String s) {
        Boolean Found=false;
        if (day.contains(s)) {
            Found = true;
            Log.v("check11",s+Found.toString());
            //Log.v("check221",Found.toString());

        }
        return Found;
    }
}



