package com.au.allotedv5;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import java.util.Arrays;

/**
 * Created by Abhishek-Pc on 04-03-2016.
 */
public class time {
    private sortretriveddata2 mSortretriveddata2;

    private StringBuilder slot1=new StringBuilder();
    private int[] time;
    String List1;
    String[] slot;
    public String calctime(Context mcontext, String day, String Time){
        mSortretriveddata2=new sortretriveddata2(mcontext);
       String[] T= Time.split("-");
        int i=Integer.parseInt(T[0]);
        int j=Integer.parseInt(T[1]);
        int k=0;
        if((j-i)!=0&&j>i) {
            time = new int[j - i + 1];
            for (i=Integer.parseInt(T[0]); i <= j; i++) {
                if(i<=12) {
                    time[k] = i;
                    k++;
                }
                else{
                   // i=
                    time[k]=i-12;
                    k++;
                }
            }
            int m;
            i=Integer.parseInt(T[0]);
            for (int l = 0; l < j - i; l++) {
                m = l + 1;
                String curr = time[l] + "-" + time[m] + ",";
                slot1.append(curr);
                slot = slot1.toString().split(",");


            }
        }
        else if(i==j||i>j){
            //Toast.makeText(mcontext,"please select a proper time frame",Toast.LENGTH_LONG).show();
            return "please select a proper time frame";
        }


            List1 = mSortretriveddata2.Sortdata(day, slot);
            Log.v("Tage", slot1.toString());
            Log.v("tag2", List1);
            Log.v("tag2", slot[0]);
            slot1 = new StringBuilder();


        return List1;
     //   slot.toString();
       // Toast.makeText(mcontext,slot.toString(),Toast.LENGTH_LONG).show();
    }

}
