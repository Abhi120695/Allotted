package com.au.allotedv5;

import android.content.Context;

import java.util.List;

/**
 * Created by Abhishek-Pc on 04-01-2016.
 */
public class Sortretriveddata {
   private List<Retriveddata> Data1;
    //private List<String> Regnum =new ArrayList<>();
    StringBuilder Regnum= new StringBuilder();
    private String Regnum1 =new String();
    private String Monday= new String();
    private String Tuesday=new String();
    private String Wednesday= new String();
    private String Thursday = new String();
    private String Friday= new String();
    private String NAME=new String();



    public Sortretriveddata(Context context) {

         Data1 = new Datasource(context).getall();

    }
    public String Sortdata(String Time,String Day){
        boolean Found=false;
        int i=0;
        if(Day.equals("Monday")) {
            for (i = 0; i < Data1.size(); i++) {

               Monday= Data1.get(i).getMonday();
                Regnum1  =  Data1.get(i).getRegistration_Number();
                NAME=Data1.get(i).getNAME();
                if(Monday.contains(Time)) {
                    Regnum.append(Regnum1 +"-"+NAME+ "\n");
                    Found=true;

                }
                
            }
        }
        if(Day.equals("Tuesday")) {
            for (i = 0; i < Data1.size(); i++) {

              Tuesday=  Data1.get(i).getTuesday();
                Regnum1  = Data1.get(i).getRegistration_Number();
                NAME=Data1.get(i).getNAME();
                if(Tuesday.contains(Time)) {
                    Regnum.append(Regnum1 +"-"+NAME+ "\n");
                    Found=true;

                }
            }
        }
        if(Day.equals("Wednesday")) {
            for (i = 0; i < Data1.size(); i++) {

               Wednesday= Data1.get(i).getWenesday();
                Regnum1  =  Data1.get(i).getRegistration_Number();
                NAME=Data1.get(i).getNAME();
                if(Wednesday.contains(Time)) {
                    Regnum.append(Regnum1 +"-"+NAME+ "\n");
                    Found=true;

                }
            }
        }
        if(Day.equals("Thursday")) {
            for (i = 0; i < Data1.size(); i++) {

               Thursday= Data1.get(i).getThursday();
                Regnum1  = Data1.get(i).getRegistration_Number();
                NAME=Data1.get(i).getNAME();
                if(Thursday.contains(Time)) {
                    Regnum.append(Regnum1 +"-"+NAME+ "\n");
                    Found=true;

                }
            }
        }
        if(Day.equals("Friday")) {
            for (i = 0; i < Data1.size(); i++) {

               Friday= Data1.get(i).getFriday();
                Regnum1  = Data1.get(i).getRegistration_Number();
                NAME=Data1.get(i).getNAME();
                if(Friday.contains(Time)) {
                    Regnum.append(Regnum1 +"-"+NAME+ "\n");
                    Found=true;
                    
                }
                }
            }
           if(!Found) {
            Regnum.append("No members found");
            }
        return Regnum.toString();
        }
    }


