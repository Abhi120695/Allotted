package com.au.allotedv5;


import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

/**
 * Created by Abhishek-Pc on 29-12-2015.
 */
public class Sortstrings {

    private
   /* String[] Monday= new String[35];
    String[] Tuesday= new String[35];
    String[] Wednesday= new String[35];
    String[] Thursday= new String[35];
    String[] Friday= new String[35];
    */

    /*StringBuilder Monday= new StringBuilder("Monday-");
    StringBuilder Tuesday= new StringBuilder("Tuesday-");
    StringBuilder Wednesday= new StringBuilder("Wednesday-");
    StringBuilder Thursday= new StringBuilder("Thursday-");
    StringBuilder Friday= new StringBuilder("Friday-");

    */
    List<String>  Monday=new ArrayList<>();
    List<String>  Tuesday=new ArrayList<>();
    List<String>  Wednesday=new ArrayList<>();
    List<String>  Thursday=new ArrayList<>();
    List<String>  Friday=new ArrayList<>();
    String MONDAY =new String();
    String TUESDAY =new String();
    String WEDNESDAY =new String();
    String THURSDAY =new String();
    String FRIDAY =new String();
    String Final = new String ();
    String firstpart =new String();
    String Secondpart = new String();
    String KEY=new String();
    String Taken =new String();

    public String getTaken() {
        return Taken;
    }

    public void setTaken(String taken) {
        Taken = taken;
    }



    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    String NAME=new String();

    public String getNAME() {
        return NAME;
    }




    public void setId(long id) {
        this.id = id;
    }

    long id ;
    public long getId() {
        return id;
    }


    public String getMONDAY() {return MONDAY;}

    public String getTUESDAY() {
        return TUESDAY;
    }

    public String getTHURSDAY() {
        return THURSDAY;
    }

    public String getWEDNESDAY() {
        return WEDNESDAY;
    }

    public String getFRIDAY() {
        return FRIDAY;
    }
    public String getKEY(){return KEY;}

    public void setKEY(String KEY) {
        this.KEY = KEY.toUpperCase();
    }

    public void setMONDAY(String MONDAY) {
        this.MONDAY = MONDAY;
    }

    public void setTUESDAY(String TUESDAY) {
        this.TUESDAY = TUESDAY;
    }

    public void setWEDNESDAY(String WEDNESDAY) {
        this.WEDNESDAY = WEDNESDAY;
    }

    public void setTHURSDAY(String THURSDAY) {
        this.THURSDAY = THURSDAY;
    }

    public void setFRIDAY(String FRIDAY) {
        this.FRIDAY = FRIDAY;
    }

    public void stringsort(String Name, String Freetimings, String taken, String key, Datasource mDatasource){
        Final="";

        KEY=key.toUpperCase();
        String Freetimings2[] = Freetimings.split(",");
       int j=0,k=0,l=0,m=0,n=0;
        int i;
        for(i=0;i<Freetimings2.length;i++) {
            String[] parttion = Freetimings2[i].split("=");
            //int k = parttion.length;
            //Final=Integer.toString(k);
            firstpart = parttion[0];
            Secondpart = parttion[1];
            switch (Secondpart)
            {

                case "Monday":
                  //  Monday[j] = firstpart + ",";
                    //j++;
                    //Monday.append(firstpart+",");
                    Monday.add(firstpart);
                    break;
                case "Tuesday":
                   // Tuesday[k] = firstpart + ",";
                    //k++;
                    Tuesday.add(firstpart);
                    //Tuesday.append(firstpart +",");
                    break;
                case "Wednesday":
                    //Wednesday[l] = firstpart + ",";
                    //l++;
                    Wednesday.add(firstpart);
                    // Wednesday.append(firstpart+",");
                    break;
                case "Thursday":
                    //Thursday[m] = firstpart + ",";
                   // m++;
                    Thursday.add(firstpart);
                    // Thursday.append(firstpart +",");
                    break;
                case "Friday":
                   // Friday[n] = firstpart + ",";
                    //n++;
                    Friday.add(firstpart );
                    // Friday.append(firstpart + ",");
                    break;
                case "Free":
                   // Wednesday[l] = "during Seminar on Wednesdays" + ",";
                    //l++;
                    Wednesday.add(firstpart);
                    // Wednesday.append("during Seminar on Wednesdays"+",");
                    break;


            }
            Wednesday.add("11-2");


       }

        Monday = new ArrayList<String>(new LinkedHashSet<String>(Monday));
        Tuesday = new ArrayList<String>(new LinkedHashSet<String>(Tuesday));
        Wednesday = new ArrayList<String>(new LinkedHashSet<String>(Wednesday));
        Thursday = new ArrayList<String>(new LinkedHashSet<String>(Thursday));
        Friday= new ArrayList<String>(new LinkedHashSet<String>(Friday));
        Collections.sort(Monday);
        Collections.sort(Tuesday);
        Collections.sort(Wednesday);
        Collections.sort(Thursday);
        Collections.sort(Friday);




        MONDAY="Monday:\n"+Monday.toString().replaceAll("[\\[\\]]","");
        TUESDAY="Tuesday:\n"+Tuesday.toString().replaceAll("[\\[\\]]", "");
        WEDNESDAY="Wednesday:\n"+Wednesday.toString().replaceAll("[\\[\\]]", "");
        THURSDAY="Thursday:\n"+Thursday.toString().replaceAll("[\\[\\]]", "");
        FRIDAY="Friday:\n"+Friday.toString().replaceAll("[\\[\\]]","");
        NAME=Name;
        Taken=taken;

       Final=MONDAY + "&" + TUESDAY + "&" + WEDNESDAY + "&" + THURSDAY + "&" + FRIDAY + "&";


       mDatasource.create(this);

         ;

    }



}
