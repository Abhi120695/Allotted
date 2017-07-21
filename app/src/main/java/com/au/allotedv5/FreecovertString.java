package com.au.allotedv5;

/**
 * Created by Abhishek-Pc on 24-12-2015.
 */
public class FreecovertString {

    public String mFreetimings = new String();
    String mFreetimings2 = new String();
    StringBuilder Timingbuilder=new StringBuilder();
    Sortstrings S = new Sortstrings();
    public void Converttostring(String Name, int Free1[], String taken, String key, Datasource mdatasource){
        for (int i=0;i<Free1.length;i++){

             switch(Free1[i])
             {
                 case 0:
                     Timingbuilder.append("8-9=Monday,9-10=Thursday,");
                     break;
                 case 1:
                     Timingbuilder.append("8-9=Tuesday,9-10=Friday,");
                     break;
                 case 2:
                     Timingbuilder.append("10-11=Monday,8-9=Wednesday,11-12=Thursday,");
                     break;
                 case 3:
                     Timingbuilder.append("8-9=Thursday,10-11=Tuesday,11-12=Friday,");
                     break;
                 case 4:
                     Timingbuilder.append("8-9=Friday,10-11=Wednesday,11-12=Monday,");
                     break;
                 case 5:
                     Timingbuilder.append("9-10=Monday,9-10=Wednesday,10-11=Thursday,");
                     break;
                 case 6:
                     Timingbuilder.append("9-10=Tuesday,10-11=Friday,");
                     break;
                 case 7:
                     Timingbuilder.append("2-3=Monday,3-4=Thursday,");
                     break;
                 case 8:
                     Timingbuilder.append("2-3=Tuesday,3-4=Friday,");
                     break;
                 case 9:
                     Timingbuilder.append("2-3=Wednesday,4-5=Monday,5-6=Thursday,");
                     break;
                 case 10:
                     Timingbuilder.append("2-3=Thursday,4-5=Tuesday,5-6=Friday,");
                     break;
                 case 11:
                     Timingbuilder.append("2-3=Friday,4-5=Wednesday,5-6=Monday,");
                     break;
                 case 12:
                     Timingbuilder.append("3-4=Wednesday,3-4=Monday,4-5=Thursday,");
                     break;
                 case 13:
                     Timingbuilder.append("3-4=Tuesday,4-5=Friday,");
                     break;
                 case 14:
                     Timingbuilder.append( "11-12=Tuesday,");
                     break;
                 case 15:
                     Timingbuilder.append("12-1=Friday,");
                     break;
                 case 16:
                     Timingbuilder.append("12-1=Monday,");
                     break;
                 case 17:
                     Timingbuilder.append("12-1=Thursday,");
                     break;
                 case 18:
                     Timingbuilder.append("12-1=Tuesday,");
                     break;
                 case 19:
                     Timingbuilder.append("5-6=Tuesday,");
                     break;
                 case 20:
                     Timingbuilder.append("5-6=Wednesday,");
                     break;
                 case 21:
                     Timingbuilder.append( "6-7=Friday,");
                     break;
                 case 22:
                     Timingbuilder.append("6-7=Monday,");
                     break;
                 case 23:
                     Timingbuilder.append("6-7=Thursday,");
                     break;
                 case 24:
                     Timingbuilder.append("6-7=Tuesday,");
                     break;
                 case 25:
                     Timingbuilder.append("6-7=Wednesday,");
                     break;
                 case 26:
                     Timingbuilder.append("1-2=Monday,");
                     break;
                 case 27:
                     Timingbuilder.append("1-2=Tuesday,");

                     break;
                 case 28:
                     Timingbuilder.append("10-11=Thursday,");
                     break;
                 case 29:
                     Timingbuilder.append("10-11=Friday,");
                     break;
                 case 30:
                     Timingbuilder.append("4-5=Monday,");
                     break;
                 case 31:
                     Timingbuilder.append("4-5=Tuesday,");
                     break;
                 case 32:
                     Timingbuilder.append("4-5=Wednesday,");
                     break;
                 case 33:
                     Timingbuilder.append("4-5=Thursday,");
                     break;
                 case 34:
                     Timingbuilder.append("4-5=Friday,");
                     break;
                 case 35:
                     Timingbuilder.append("5-6=Friday,");
                     break;
                 case 36:
                     Timingbuilder.append("3-4=Friday,");
                     break;
                 case 37:
                     Timingbuilder.append("7-8=Friday,");
                     break;
                 case 38:
                     Timingbuilder.append("8-9=Monday,");
                     break;
                 case 39:
                     Timingbuilder.append("8-9=Tuesday,");
                     break;
                 case 40:
                     Timingbuilder.append("9-10=Thursday,");
                     break;
                 case 41:
                     Timingbuilder.append("10-11=Monday,");
                     break;
                 case 42:
                     Timingbuilder.append("8-9=Wednesday,");
                     break;
                 case 43:
                     Timingbuilder.append("8-9=Thursday,");
                     break;
                 case 44:
                     Timingbuilder.append("10-11=Tuesday,");
                     break;
                 case 45:
                     Timingbuilder.append("8-9=Friday,");
                     break;
                 case 46:
                     Timingbuilder.append("11-12=Monday,");
                     break;
                 case 47:
                     Timingbuilder.append("10-11=Wednesday,");
                     break;
                 case 48:
                     Timingbuilder.append("11-12=Thursday,");
                     break;
                 case 49:
                     Timingbuilder.append("9-10=Monday,");
                     break;
                 case 50:
                     Timingbuilder.append("9-10=Wednesday,");
                     break;
                 case 51:
                     Timingbuilder.append("9-10=Tuesday,");
                     break;
                 case 52:
                     Timingbuilder.append("1-2=Thursday,");
                     break;
                 case 53:
                     Timingbuilder.append("3-4=Wednesday,");
                     break;
                 case 54:
                     Timingbuilder.append("11-12=Friday,");
                     break;
                 case 55:
                     Timingbuilder.append("5-6=Monday,");
                     break;
                 case 56:
                     Timingbuilder.append("3-4=Thursday,");
                     break;
                 case 57:
                     Timingbuilder.append("2-3=Tuesday,");
                     break;
                 case 58:
                     Timingbuilder.append("1-2=Friday,");
                     break;
                 case 59:
                     Timingbuilder.append("2-3=Thursday,");
                     break;
                 case 60:
                     Timingbuilder.append("7-8=Monday,");
                     break;
                 case 61:
                     Timingbuilder.append("2-3=Wednesday,");
                     break;
                 case 62:
                     Timingbuilder.append("2-3=Friday,");
                     break;
                 case 63:
                     Timingbuilder.append("2-3=Monday,");
                     break;
                 case 64:
                     Timingbuilder.append("7-8=Tuesday,");
                     break;
                 case 65:
                     Timingbuilder.append("5-6=Thursday,");
                     break;
                 case 66:
                     Timingbuilder.append("9-10=Friday,");
                     break;
                 case 67:
                     Timingbuilder.append("3-4=Tuesday,");
                     break;
                 case 68:
                     Timingbuilder.append("7-8=Wednesday,");
                     break;
                 case 69:
                     Timingbuilder.append("3-4=Monday,");
                     break;
                 case 70:
                     Timingbuilder.append("7-8=Thursday,");
                     break;



            }
            //Timingbuilder.append("&");
        }
        mFreetimings=Timingbuilder.toString();

        Timingbuilder= new StringBuilder();
      S.stringsort(Name,mFreetimings,taken,key,mdatasource);

    }

}
