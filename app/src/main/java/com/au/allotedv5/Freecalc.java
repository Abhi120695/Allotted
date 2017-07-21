package com.au.allotedv5;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;


/**
 * Created by Abhishek-Pc on 10-12-2015.
 */
public class Freecalc {
    private int Total[] = new int[71];

    int i;


    String Freeslots=new String();
    String Freeslots2=new String();
    Getstudent mGetstudent=new Getstudent();
    FreecovertString mFreecovertString= new FreecovertString();
    public void setFreeslots(String freeslots) {
        Freeslots = freeslots;
    }

    public String calc1(String Name ,String key, String taken,Datasource mdatasource) {
        ArrayList<Integer> Totallist1 =new ArrayList<>();

        for (int i = 0; i < 71; i++) {
            Total[i] = i;
            Totallist1.add(i);

        }

        String Taken[] = taken.split(",|\\+");

        Set<Integer> Taken2=new HashSet<Integer>();
        int j = 0;

        for (i = 0; i < Taken.length; i++) {
            char firstchar = Taken[i].charAt(0);
            char secondchar = Taken[i].charAt(1);

            if ((firstchar >= 'a' && firstchar <= 'h') || (firstchar >= 'A' && firstchar <= 'H')) {
                switch (Character.toUpperCase(firstchar)) {
                    case 'A':
                        switch (secondchar) {
                            case '1':
                                //Taken1[j] = 0;
                                //j++;
                                Taken2.add(0);
                                Taken2.add(38);
                                Taken2.add(40);
                                break;
                            case '2':
                                //Taken1[j] = 7;
                                //j++;
                                Taken2.add(7);
                                Taken2.add(56);
                                Taken2.add(63);
                                break;
                            default:
                                Freeslots2 = Taken[i] + "\t Does not Exists ,Please Enter correct slot";
                                return Freeslots2;

                        }
                        break;
                    case 'B':
                        switch (secondchar) {
                            case '1':
                                //Taken1[j] = 1;
                                //j++;
                                Taken2.add(1);
                                Taken2.add(39);
                                Taken2.add(66);
                                break;
                            case '2':
                                //Taken1[j] = 8;
                                //j++;
                                Taken2.add(8);
                                Taken2.add(36);
                                Taken2.add(57);
                                break;
                            default:
                                Freeslots2 = Taken[i] + "\t Does not Exists ,Please Enter correct slot";
                                return Freeslots2;
                        }
                        break;
                    case 'C':
                        switch (secondchar) {
                            case '1':
                                //Taken1[j] = 2;
                                //j++;
                                Taken2.add(2);
                                Taken2.add(41);
                                Taken2.add(42);
                                Taken2.add(48);
                                break;
                            case '2':
                                //Taken1[j] = 9;
                                //j++;
                                Taken2.add(9);
                                Taken2.add(65);
                                Taken2.add(30);
                                Taken2.add(61);
                                break;
                            default:
                                Freeslots2 = Taken[i] + "\t Does not Exists ,Please Enter correct slot";
                                return Freeslots2;
                        }
                        break;

                    case 'D':
                        switch (secondchar) {
                            case '1':
                                //Taken1[j] = 3;
                                //j++;
                                Taken2.add(3);
                                Taken2.add(43);
                                Taken2.add(44);
                                Taken2.add(54);
                                break;
                            case '2':
                                //Taken1[j] = 10;
                                //j++;
                                Taken2.add(10);
                                Taken2.add(59);
                                Taken2.add(31);
                                Taken2.add(35);
                                break;
                            default:
                                Freeslots2 = Taken[i] + "\t Does not Exists ,Please Enter correct slot";
                                return Freeslots2;
                        }
                        break;

                    case 'E':
                        switch (secondchar) {
                            case '1':
                                //Taken1[j] = 4;
                                //j++;
                                Taken2.add(4);
                                Taken2.add(45);
                                Taken2.add(46);
                                Taken2.add(47);
                                break;
                            case '2':
                                //Taken1[j] = 11;
                                //j++;
                                Taken2.add(11);
                                Taken2.add(32);
                                Taken2.add(55);
                                Taken2.add(62);
                                break;
                            default:
                                Freeslots2 = Taken[i] + "\t Does not Exists ,Please Enter correct slot";
                                return Freeslots2;
                        }
                        break;
                    case 'F':
                        switch (secondchar) {
                            case '1':
                                //Taken1[j] = 5;
                                //j++;
                                Taken2.add(5);
                                Taken2.add(28);
                                Taken2.add(49);
                                Taken2.add(50);
                                break;
                            case '2':
                                //Taken1[j] = 12;
                                //j++;
                                Taken2.add(12);
                                Taken2.add(33);
                                Taken2.add(53);
                                Taken2.add(69);
                                break;
                            default:
                                Freeslots2 = Taken[i] + "\t Does not Exists ,Please Enter correct slot";
                                return Freeslots2;
                        }
                        break;
                    case 'G':
                        switch (secondchar) {
                            case '1':
                                //Taken1[j] = 6;
                                //j++;
                                Taken2.add(6);
                                Taken2.add(29);
                                Taken2.add(51);
                                break;
                            case '2':
                                //Taken1[j] = 13;
                                //j++;
                                Taken2.add(13);
                                Taken2.add(34);
                                Taken2.add(67);
                                break;
                            default:
                                Freeslots2 = Taken[i] + "\t Does not Exists ,Please Enter correct slot";
                                return Freeslots2;
                        }
                        break;

                }


            } else if ((firstchar == 't') || (firstchar == 'T')) {
                char thirdchar = Taken[i].charAt(2);
                switch (Character.toUpperCase(secondchar)) {
                    case 'A':
                        switch (thirdchar) {
                            case '1':
                                //Taken1[j] = 14;
                                //j++;
                                Taken2.add(14);
                                break;
                            case '2':
                                //Taken1[j] = 21;
                                //j++;
                                Taken2.add(19);
                                break;
                            default:
                                Freeslots2 = Taken[i] + "\t Does not Exists ,Please Enter correct slot";
                                return Freeslots2;


                        }

                        break;
                    case 'B':
                        switch (thirdchar) {
                            case '1':
                                //Taken1[j] = 15;
                                //j++;
                                Taken2.add(15);
                                break;
                            case '2':
                                //Taken1[j] = 22;
                                //j++;
                                Taken2.add(20);
                                break;
                            default:
                                Freeslots2 = Taken[i] + "\t Does not Exists ,Please Enter correct slot";
                                return Freeslots2;
                        }
                        break;
                    case 'C':
                        switch (thirdchar) {
                            case '1':
                                //Taken1[j] = 16;
                                //j++;
                                Taken2.add(15);
                                break;
                            case '2':
                                //Taken1[j] = 23;
                                //j++;
                                Taken2.add(21);
                                break;
                            default:
                                Freeslots2 = Taken[i] + "\t Does not Exists ,Please Enter correct slot";
                                return Freeslots2;
                        }
                        break;
                    case 'D':
                        switch (thirdchar) {
                            case '1':
                                //Taken1[j] = 17;
                                //j++;
                                Taken2.add(16);
                                break;
                            case '2':
                                //Taken1[j] = 24;
                                //j++;
                                Taken2.add(22);
                                break;
                            default:
                                Freeslots2 = Taken[i] + "\t Does not Exists ,Please Enter correct slot";
                                return Freeslots2;
                        }
                        break;
                    case 'E':
                        switch (thirdchar) {
                            case '1':
                                //Taken1[j] = 18;
                                //j++;
                                Taken2.add(17);
                                break;
                            case '2':
                                //Taken1[j] = 25;
                                //j++;
                                Taken2.add(23);
                                break;
                            default:
                                Freeslots2 = Taken[i] + "\t Does not Exists ,Please Enter correct slot";
                                return Freeslots2;
                        }
                        break;
                    case 'F':
                        switch (thirdchar) {
                            case '1':
                                //Taken1[j] = 19;
                                //j++;
                                Taken2.add(18);
                                break;
                            case '2':
                                //Taken1[j] = 26;
                                //j++;
                                Taken2.add(24);
                                break;
                            default:
                                Freeslots2 = Taken[i] + "\t Does not Exists ,Please Enter correct slot";
                                return Freeslots2;
                        }
                        break;
                    case 'G':
                        switch (thirdchar) {
                            case '1':
                                //Taken1[j] = 20;
                                //j++;
                                Freeslots2 = Taken[i] + "\t Does not Exists ,Please Enter correct slot";
                                return Freeslots2;

                            case '2':
                                //Taken1[j] = 27;
                                //j++;
                                Taken2.add(25);
                                break;
                            default:
                                Freeslots2 = Taken[i] + "\t Does not Exists ,Please Enter correct slot";
                                return Freeslots2;
                        }
                        break;

                }

            } else if ((firstchar == 'L') || (firstchar == 'l')) {
                if (Taken[i].length() == 2) {
                    String LabString = Character.toString(secondchar);
                    switch (LabString) {
                        case "1":
                            //Taken1[j] = 0;
                            //j++;
                            Taken2.add(0);
                            Taken2.add(38);
                            break;
                        case "2":
                            //Taken1[j] = 5;
                            //j++;
                            Taken2.add(5);
                            Taken2.add(49);
                            break;

                        case "3":
                            //Taken1[j] = 2;
                            //j++;
                            Taken2.add(2);
                            Taken2.add(41);
                            break;
                        case "4":
                            //Taken1[j] = 4;
                            //j++;
                            Taken2.add(4);
                            Taken2.add(46);
                            break;
                        case "5":
                            //Taken1[j] = 4;
                            //j++;
                            Taken2.add(16);
                            break;
                        case "6":
                            //Taken1[j] = 6;
                            //j++;
                            Taken2.add(26);
                            break;
                        case "7":
                            //Taken1[j] = 1;
                            //j++;
                            Taken2.add(1);
                            Taken2.add(39);
                            break;
                        case "8":
                            //Taken1[j] = 6;
                            //j++;
                            Taken2.add(6);
                            Taken2.add(51);
                            break;
                        case "9":
                            //Taken1[j] = 3;
                            //j++;
                            Taken2.add(3);
                            Taken2.add(44);
                            break;

                    }

                } else if (Taken[i].length() == 3) {
                    char thirdchar = Taken[i].charAt(2);
                    String Labstring1 = Character.toString(secondchar) + Character.toString(thirdchar);
                    switch (Labstring1) {
                        case "10":
                            //Taken1[j] = 14;
                            //j++;
                            Taken2.add(14);
                            break;
                        case "11":
                            //Taken1[j] = 18;
                            //j++;
                            Taken2.add(18);
                            break;
                        case "12":
                            //Taken1[j] = 27;
                            //j++;
                            Taken2.add(27);
                            break;
                        case "13":
                            //Taken1[j] = 2;
                            //j++;
                            Taken2.add(2);
                            Taken2.add(42);
                            break;
                        case "14":
                            //Taken1[j] = 5;
                            //j++;
                            Taken2.add(5);
                            Taken2.add(50);
                            break;
                        case "15":
                            //Taken1[j] = 4;
                            //j++;
                            Taken2.add(4);
                            Taken2.add(47);
                            break;
                        case "16":
                            Freeslots2 = Taken[i] + "\t Does not Exists ,Please Enter correct slot";
                            return Freeslots2;

                        case "17":
                            Freeslots2 = Taken[i] + "\t Does not Exists ,Please Enter correct slot";
                            return Freeslots2;

                        case "18":
                            Freeslots2 = Taken[i] + "\t Does not Exists ,Please Enter correct slot";
                            return Freeslots2;
                        case "19":
                            //Taken1[j] = 2;
                            //j++;
                            Taken2.add(3);
                            Taken2.add(43);
                            break;
                        case "20":
                            //Taken1[j] = 17;
                            //j++;
                            Taken2.add(0);
                            Taken2.add(40);
                            break;
                        case "21":
                            //Taken1[j] = 28;
                            //j++;
                            Taken2.add(28);
                            Taken2.add(5);
                            break;
                        case "22":
                            //Taken1[j] = 4;
                            //j++;
                            Taken2.add(2);
                            Taken2.add(48);
                            break;
                        case "23":
                            //Taken1[j] = 1;
                            //j++;
                            Taken2.add(17);
                            break;
                        case "24":
                            //Taken1[j] = 6;
                            //j++;
                            Taken2.add(6);
                            Taken2.add(52);
                            break;
                        case "25":
                            //Taken1[j] = 3;
                            //j++;
                            Taken2.add(45);
                            Taken2.add(4);

                            break;

                        case "26":
                            //Taken1[j] = 15;
                            //j++;
                            Taken2.add(66);
                            Taken2.add(1);
                            break;
                        case "27":
                            //Taken1[j] = 29;
                            //j++;
                            Taken2.add(29);
                            Taken2.add(6);
                            break;
                        case "28":
                            //Taken1[j] = 7;
                            //j++;
                            Taken2.add(3);
                            Taken2.add(54);
                            break;
                        case "29":
                            //Taken1[j] = 12;
                            //j++;
                            Taken2.add(15);
                            break;
                        case "30":
                            //Taken1[j] = 9;
                            //j++;
                            Taken2.add(58);
                            break;
                        case "31":
                            //Taken1[j] = 11;
                            //j++;
                            Taken2.add(7);
                            Taken2.add(63);
                            break;
                        case "32":
                            //Taken1[j] = 22;
                            //j++;
                            Taken2.add(12);
                            Taken2.add(69);
                            break;
                        case "33":
                            //Taken1[j] = 30;
                            //j++;
                            Taken2.add(30);
                            Taken2.add(9);
                            break;
                        case "34":
                            //Taken1[j] = 8;
                            //j++;
                            Taken2.add(11);
                            Taken2.add(55);
                            break;
                        case "35":
                            //Taken1[j] = 13;
                            //j++;
                            Taken2.add(22);
                            break;
                        case "36":
                            //Taken1[j] = 10;
                            //j++;
                            Taken2.add(60);
                            break;
                        case "37":
                            //Taken1[j] = 19;
                            //j++;
                            Taken2.add(8);
                            Taken2.add(57);
                            break;
                        case "38":
                            Taken2.add(67);
                            Taken2.add(13);
                        case "39":
                            //Taken1[j] = 31;
                            //j++;
                            Taken2.add(31);
                            Taken2.add(10);
                            break;
                        case "40":
                            //Taken1[j] = 9;
                            //j++;
                            Taken2.add(19);
                            break;
                        case "41":
                            //Taken1[j] = 12;
                            //j++;
                            Taken2.add(24);
                            break;
                        case "42":
                            //Taken1[j] = 11;
                            //j++;
                            Taken2.add(64);
                            break;
                        case "43":
                            //Taken1[j] = 20;
                            //j++;
                            Taken2.add(61);
                            Taken2.add(9);
                            break;
                        case "44":
                            //Taken1[j] = 25;
                            //j++;
                            Taken2.add(12);
                            Taken2.add(53);
                            break;
                        case "45":
                            //Taken1[j] = 32;
                            //j++;
                            Taken2.add(32);
                            Taken2.add(11);
                            break;
                        case "46":
                            //Taken1[j] = 10;
                            //j++;
                            Taken2.add(20);
                            break;
                        case "47":
                            //Taken1[j] = 7;
                            //j++;
                            Taken2.add(25);
                            break;
                        case "48":
                            //Taken1[j] = 12;
                            //j++;
                            Taken2.add(68);
                            break;
                        case "49":
                            //Taken1[j] = 9;
                            //j++;
                            Taken2.add(10);
                            Taken2.add(59);
                            break;
                        case "50":
                            //Taken1[j] = 23;
                            //j++;
                            Taken2.add(56);
                            Taken2.add(7);
                            break;
                        case "51":
                            //Taken1[j] = 33;
                            //j++;
                            Taken2.add(33);
                            Taken2.add(12);
                            break;
                        case "52":
                            //Taken1[j] = 11;
                            //j++;
                            Taken2.add(65);
                            Taken2.add(9);
                            break;
                        case "53":
                            //Taken1[j] = 8;
                            //j++;
                            Taken2.add(23);
                            break;
                        case "54":
                            //Taken1[j] = 13;
                            //j++;

                            Taken2.add(70);
                            break;
                        case "55":
                            //Taken1[j] = 10;
                            //j++;
                            Taken2.add(11);
                            Taken2.add(62);
                            break;
                        case "56":
                            //Taken1[j] = 21;
                            //j++;
                            Taken2.add(36);
                            Taken2.add(8);
                            break;
                        case "57":
                            //Taken1[j] = 34;
                            //j++;
                            Taken2.add(34);
                            Taken2.add(13);
                            break;
                        case "58":
                            //Taken1[j] = 34;
                            //j++;
                            Taken2.add(35);
                            Taken2.add(10);
                            break;
                        case "59":
                            //Taken1[j] = 34;
                            //j++;
                            Taken2.add(21);
                            break;
                        case "60":
                            //Taken1[j] = 34;
                            //j++;
                            Taken2.add(37);
                            break;
                        default:
                            Freeslots2 = Taken[i] + "\t Does not Exists ,Please Enter correct slot";
                            return Freeslots2;


                    }
                }
                else {
                    return Taken[i] + "\t Does not Exists ,Please Enter correct slot";
                }
            }

            else
            {
                return Taken[i]+"\t Does not Exists ,Please Enter correct slot";
            }
        }


        Totallist1.removeAll(Taken2);
        int[] Free1 = new int[Totallist1.size()];
        for(int i = 0;i < Free1.length;i++){
            Free1[i] = Totallist1.get(i);
        }




      mFreecovertString.Converttostring(Name,Free1,taken,key,mdatasource);
          Freeslots=mdatasource.getFree();
        return Freeslots;
        }


    }

