package com.au.allotedv5;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Toast;
import android.widget.ToggleButton;

import java.util.Set;
import java.util.TreeSet;

public class Seleectslots extends AppCompatActivity {

    private ToggleButton A1;
    private ToggleButton B1;
    private ToggleButton C1;
    private ToggleButton D1;
    private ToggleButton E1;
    private ToggleButton F1;
    private ToggleButton G1;
    private ToggleButton A11;
    private ToggleButton TA1;
    private ToggleButton B11;
    private ToggleButton C11;
    private ToggleButton C12;
    private ToggleButton TC1;
    private ToggleButton D11;
    private ToggleButton D12;
    private ToggleButton TD1;
    private ToggleButton E11;
    private ToggleButton E12;
    private ToggleButton TE1;
    private ToggleButton F11;
    private ToggleButton F12;
    private ToggleButton TF1;
    private ToggleButton G11;
    private ToggleButton A2;
    private ToggleButton B2;
    private ToggleButton C2;
    private ToggleButton D2;
    private ToggleButton E2;
    private ToggleButton F2;
    private ToggleButton G2;
    private ToggleButton A21;
    private ToggleButton TA2;
    private ToggleButton B21;
    private ToggleButton TB2;
    private ToggleButton C21;
    private ToggleButton C22;
    private ToggleButton TC2;
    private ToggleButton D21;
    private ToggleButton D22;
    private ToggleButton TD2;
    private ToggleButton E21;
    private ToggleButton E22;
    private ToggleButton TE2;
    private ToggleButton F21;
    private ToggleButton F22;
    private ToggleButton TF2;
    private ToggleButton G21;
    private ToggleButton TG2;
    private ToggleButton L1;
    private ToggleButton L2;
    private ToggleButton L3;
    private ToggleButton L4;
    private ToggleButton L5;
    private ToggleButton L6;
    private ToggleButton L7;
    private ToggleButton L8;
    private ToggleButton L9;
    private ToggleButton L10;
    private ToggleButton L11;
    private ToggleButton L12;
    private ToggleButton L13;
    private ToggleButton L14;
    private ToggleButton L15;
    private ToggleButton L19;
    private ToggleButton L20;
    private ToggleButton L21;
    private ToggleButton L22;
    private ToggleButton L23;
    private ToggleButton L24;
    private ToggleButton L25;
    private ToggleButton L26;
    private ToggleButton L27;
    private ToggleButton L28;
    private ToggleButton L29;
    private ToggleButton L30;
    private ToggleButton L31;
    private ToggleButton L32;
    private ToggleButton L33;
    private ToggleButton L34;
    private ToggleButton L35;
    private ToggleButton L36;
    private ToggleButton L37;
    private ToggleButton L38;
    private ToggleButton L39;
    private ToggleButton L40;
    private ToggleButton L41;
    private ToggleButton L42;
    private ToggleButton L43;
    private ToggleButton L44;
    private ToggleButton L45;
    private ToggleButton L46;
    private ToggleButton L47;
    private ToggleButton L48;
    private ToggleButton L49;
    private ToggleButton L50;
    private ToggleButton L51;
    private ToggleButton L52;
    private ToggleButton L53;
    private ToggleButton L54;
    private ToggleButton L55;
    private ToggleButton L56;
    private ToggleButton L57;
    private ToggleButton L58;
    private ToggleButton L59;
    private ToggleButton L60;
    private Set<String> Takenslot;
    private Button done;
    private ToggleButton Blank1;
    private ToggleButton Blank2;
    private ToggleButton Blank3;
    private ToggleButton Blank4;
    private ToggleButton Blank5;
    private ToggleButton Blank6;
    private ToggleButton Blank7;
    private ToggleButton Blank8;
    private ToggleButton Blank9;



    public static String Selectedslots="sent slots";

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seleectslots);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        String SLOTS=getIntent().getStringExtra("slots");

        Takenslot = new TreeSet<String>();
        done = (Button) findViewById(R.id.button9);
        A1 = (ToggleButton) findViewById(R.id.button);
        B1 = (ToggleButton) findViewById(R.id.button2);
        C1 = (ToggleButton) findViewById(R.id.button3);
        D1 = (ToggleButton) findViewById(R.id.button4);
        E1 = (ToggleButton) findViewById(R.id.button5);
        F1 = (ToggleButton) findViewById(R.id.button6);
        G1 = (ToggleButton) findViewById(R.id.button7);
        F11 = (ToggleButton) findViewById(R.id.toggleButton8);
        F12 = (ToggleButton) findViewById(R.id.toggleButton20);
        A11 = (ToggleButton) findViewById(R.id.toggleButton10);
        B11 = (ToggleButton) findViewById(R.id.toggleButton12);
        C11 = (ToggleButton) findViewById(R.id.toggleButton14);
        C12 = (ToggleButton) findViewById(R.id.toggleButton28);
        D11 = (ToggleButton) findViewById(R.id.toggleButton16);
        D12 = (ToggleButton) findViewById(R.id.toggleButton30);
        E11 = (ToggleButton) findViewById(R.id.toggleButton18);
        E12 = (ToggleButton) findViewById(R.id.toggleButton24);
        G11 = (ToggleButton) findViewById(R.id.toggleButton22);
        TA1 = (ToggleButton) findViewById(R.id.toggleButton26);
        TD1 = (ToggleButton) findViewById(R.id.toggleButton32);
        TF1 = (ToggleButton) findViewById(R.id.toggleButton34);
        TE1 = (ToggleButton) findViewById(R.id.toggleButton36);
        TC1 = (ToggleButton) findViewById(R.id.toggleButton38);
        A2 = (ToggleButton) findViewById(R.id.toggleButton44);
        B2 = (ToggleButton) findViewById(R.id.toggleButton50);
        C2 = (ToggleButton) findViewById(R.id.toggleButton62);
        D2 = (ToggleButton) findViewById(R.id.toggleButton64);
        E2 = (ToggleButton) findViewById(R.id.toggleButton66);
        F2 = (ToggleButton) findViewById(R.id.toggleButton46);
        G2 = (ToggleButton) findViewById(R.id.toggleButton52);
        F21 = (ToggleButton) findViewById(R.id.toggleButton68);
        F22 = (ToggleButton) findViewById(R.id.toggleButton84);
        A21 = (ToggleButton) findViewById(R.id.toggleButton72);
        B21 = (ToggleButton) findViewById(R.id.toggleButton78);
        C21 = (ToggleButton) findViewById(R.id.toggleButton47);
        C22 = (ToggleButton) findViewById(R.id.toggleButton86);
        D21 = (ToggleButton) findViewById(R.id.toggleButton55);
        D22 = (ToggleButton) findViewById(R.id.toggleButton92);
        E21 = (ToggleButton) findViewById(R.id.toggleButton69);
        E22 = (ToggleButton) findViewById(R.id.toggleButton48);
        G21 = (ToggleButton) findViewById(R.id.toggleButton85);
        TA2 = (ToggleButton) findViewById(R.id.toggleButton54);
        TB2 = (ToggleButton) findViewById(R.id.toggleButton70);
        TC2 = (ToggleButton) findViewById(R.id.toggleButton95);
        TD2 = (ToggleButton) findViewById(R.id.toggleButton49);
        TE2 = (ToggleButton) findViewById(R.id.toggleButton87);
        TF2 = (ToggleButton) findViewById(R.id.toggleButton56);
        TG2 = (ToggleButton) findViewById(R.id.toggleButton71);
        L1 = (ToggleButton) findViewById(R.id.toggleButton);
        L2 = (ToggleButton) findViewById(R.id.toggleButton6);
        L3 = (ToggleButton) findViewById(R.id.toggleButton15);
        L4 = (ToggleButton) findViewById(R.id.toggleButton25);
        L5 = (ToggleButton) findViewById(R.id.toggleButton33);
        L6 = (ToggleButton) findViewById(R.id.toggleButton40);
        L7 = (ToggleButton) findViewById(R.id.toggleButton2);
        L8 = (ToggleButton) findViewById(R.id.toggleButton7);
        L9 = (ToggleButton) findViewById(R.id.toggleButton17);
        L10 = (ToggleButton) findViewById(R.id.toggleButton27);
        L11 = (ToggleButton) findViewById(R.id.toggleButton35);
        L12 = (ToggleButton) findViewById(R.id.toggleButton41);
        L13 = (ToggleButton) findViewById(R.id.toggleButton3);
        L14 = (ToggleButton) findViewById(R.id.toggleButton9);
        L15 = (ToggleButton) findViewById(R.id.toggleButton19);
        L19 = (ToggleButton) findViewById(R.id.toggleButton4);
        L20 = (ToggleButton) findViewById(R.id.toggleButton11);
        L21 = (ToggleButton) findViewById(R.id.toggleButton21);
        L22 = (ToggleButton) findViewById(R.id.toggleButton29);
        L23 = (ToggleButton) findViewById(R.id.toggleButton37);
        L24 = (ToggleButton) findViewById(R.id.toggleButtonI42);
        L25 = (ToggleButton) findViewById(R.id.toggleButton5);
        L26 = (ToggleButton) findViewById(R.id.toggleButton13);
        L27 = (ToggleButton) findViewById(R.id.toggleButton23);
        L28 = (ToggleButton) findViewById(R.id.toggleButton31);
        L29 = (ToggleButton) findViewById(R.id.toggleButton39);
        L30 = (ToggleButton) findViewById(R.id.toggleButton43);
        L31 = (ToggleButton) findViewById(R.id.toggleButton45);
        L32 = (ToggleButton) findViewById(R.id.toggleButton81);
        L33 = (ToggleButton) findViewById(R.id.toggleButton82);
        L34 = (ToggleButton) findViewById(R.id.toggleButton83);
        L35 = (ToggleButton) findViewById(R.id.toggleButton57);
        L36 = (ToggleButton) findViewById(R.id.toggleButton42);
        L37 = (ToggleButton) findViewById(R.id.toggleButton51);
        L38 = (ToggleButton) findViewById(R.id.toggleButton53);
        L39 = (ToggleButton) findViewById(R.id.toggleButton58);
        L40 = (ToggleButton) findViewById(R.id.toggleButton59);
        L41 = (ToggleButton) findViewById(R.id.toggleButton60);
        L42 = (ToggleButton) findViewById(R.id.toggleButton61);
        L43 = (ToggleButton) findViewById(R.id.toggleButton63);
        L44 = (ToggleButton) findViewById(R.id.toggleButton73);
        L45 = (ToggleButton) findViewById(R.id.toggleButton74);
        L46 = (ToggleButton) findViewById(R.id.toggleButton75);
        L47 = (ToggleButton) findViewById(R.id.toggleButton76);
        L48 = (ToggleButton) findViewById(R.id.toggleButton77);
        L49 = (ToggleButton) findViewById(R.id.toggleButton65);
        L50 = (ToggleButton) findViewById(R.id.toggleButton79);
        L51 = (ToggleButton) findViewById(R.id.toggleButton89);
        L52 = (ToggleButton) findViewById(R.id.toggleButton90);
        L53 = (ToggleButton) findViewById(R.id.toggleButton91);
        L54 = (ToggleButton) findViewById(R.id.toggleButton94);
        L55 = (ToggleButton) findViewById(R.id.toggleButton67);
        L56 = (ToggleButton) findViewById(R.id.toggleButton80);
        L57 = (ToggleButton) findViewById(R.id.toggleButton88);
        L58 = (ToggleButton) findViewById(R.id.toggleButton93);
        L59 = (ToggleButton) findViewById(R.id.toggleButton96);
        L60 = (ToggleButton) findViewById(R.id.toggleButton97);
        Blank1=(ToggleButton) findViewById(R.id.toggleButton98);
        Blank2=(ToggleButton) findViewById(R.id.toggleButton106);
        Blank3=(ToggleButton) findViewById(R.id.toggleButton105);
        Blank4=(ToggleButton) findViewById(R.id.toggleButton104);
        Blank5=(ToggleButton) findViewById(R.id.toggleButton100);
        Blank6=(ToggleButton) findViewById(R.id.toggleButton99);
        Blank7=(ToggleButton) findViewById(R.id.toggleButton101);
        Blank8=(ToggleButton) findViewById(R.id.toggleButton103);
        Blank9=(ToggleButton) findViewById(R.id.toggleButton102);



        Blank1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                L6.setChecked(true);


                } else {
                    L6.setChecked(false);

                }
            }
        });
        Blank2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    L12.setChecked(true);


                } else {
                    L12.setChecked(false);

                }
            }
        });
        Blank3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    L24.setChecked(true);


                } else {
                    L24.setChecked(false);

                }
            }
        });
        Blank4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    L30.setChecked(true);


                } else {
                    L30.setChecked(false);

                }
            }
        });
        Blank5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    L36.setChecked(true);


                } else {
                    L36.setChecked(false);

                }
            }
        });
        Blank6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    L42.setChecked(true);


                } else {
                    L42.setChecked(false);

                }
            }
        });
        Blank7.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    L48.setChecked(true);


                } else {
                    L48.setChecked(false);

                }
            }
        });
        Blank8.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    L54.setChecked(true);


                } else {
                    L54.setChecked(false);

                }
            }
        });
        Blank9.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    L60.setChecked(true);


                } else {
                    L60.setChecked(false);

                }
            }
        });



        A1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {

                    A11.setChecked(true);
                    L1.setChecked(true);
                    L20.setChecked(true);
                    Takenslot.add("A1");
                    Takenslot.remove("L1");
                    Takenslot.remove("L20");

                } else {
                    A11.setChecked(false);
                    L1.setChecked(false);
                    L20.setChecked(false);
                    Takenslot.remove("A1");
                }
            }
        });
        B1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    B11.setChecked(true);
                    L7.setChecked(true);
                    L26.setChecked(true);
                    Takenslot.add("B1");
                    Takenslot.remove("L7");
                    Takenslot.remove("L26");

                } else {
                    B11.setChecked(false);
                    L7.setChecked(false);
                    L26.setChecked(false);
                    Takenslot.remove("B1");

                }
            }
        });
        C1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    C11.setChecked(true);
                    C12.setChecked(true);
                    L13.setChecked(true);
                    L3.setChecked(true);
                    L22.setChecked(true);
                    Takenslot.add("C1");
                    Takenslot.remove("L3");
                    Takenslot.remove("L13");
                    Takenslot.remove("L22");


                } else {
                    C11.setChecked(false);
                    C12.setChecked(false);
                    L13.setChecked(false);
                    L3.setChecked(false);
                    L22.setChecked(false);
                    Takenslot.remove("C1");

                }
            }
        });
        D1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    D11.setChecked(true);
                    D12.setChecked(true);
                    L19.setChecked(true);
                    L9.setChecked(true);
                    L28.setChecked(true);
                    Takenslot.add("D1");
                    Takenslot.remove("L19");
                    Takenslot.remove("L9");
                    Takenslot.remove("L28");
                } else {
                    D11.setChecked(false);
                    D12.setChecked(false);
                    L19.setChecked(false);
                    L9.setChecked(false);
                    L28.setChecked(false);
                    Takenslot.remove("D1");


                }
            }
        });
        E1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    E11.setChecked(true);
                    E12.setChecked(true);
                    L25.setChecked(true);
                    L15.setChecked(true);
                    L4.setChecked(true);
                    Takenslot.add("E1");
                    Takenslot.remove("L12");
                    Takenslot.remove("L25");
                    Takenslot.remove("L4");

                } else {
                    E11.setChecked(false);
                    E12.setChecked(false);
                    L25.setChecked(false);
                    L15.setChecked(false);
                    L4.setChecked(false);
                    Takenslot.remove("E1");

                }
            }
        });
        F1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    F11.setChecked(true);
                    F12.setChecked(true);
                    L2.setChecked(true);
                    L14.setChecked(true);
                    L21.setChecked(true);
                    Takenslot.add("F1");
                    Takenslot.remove("L2");
                    Takenslot.remove("L21");
                    Takenslot.remove("L14");

                } else {
                    F11.setChecked(false);
                    F12.setChecked(false);
                    L2.setChecked(false);
                    L14.setChecked(false);
                    L21.setChecked(false);
                    Takenslot.remove("F1");


                }
            }
        });
        G1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    G11.setChecked(true);
                    L8.setChecked(true);
                    L27.setChecked(true);
                    Takenslot.add("G1");
                    Takenslot.remove("L8");
                    Takenslot.remove("L27");

                } else {
                    G11.setChecked(false);
                    L8.setChecked(false);
                    L27.setChecked(false);
                    Takenslot.remove("G1");
                }
            }
        });
        A11.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {

                    A1.setChecked(true);
                    L1.setChecked(true);
                    L20.setChecked(true);


                } else {
                    A1.setChecked(false);
                    L1.setChecked(false);
                    L20.setChecked(false);
                }
            }
        });
        TA1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    L10.setChecked(true);
                    Takenslot.add("TA1");
                    Takenslot.remove("L10");
                } else {
                    L10.setChecked(false);
                    Takenslot.remove("TA1");
                }
            }
        });
        B11.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    B1.setChecked(true);
                    L7.setChecked(true);
                    L26.setChecked(true);
                } else {
                    B1.setChecked(false);
                    L7.setChecked(false);
                    L26.setChecked(false);
                }
            }
        });
        C11.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    C1.setChecked(true);
                    C12.setChecked(true);
                    L13.setChecked(true);
                    L3.setChecked(true);
                    L22.setChecked(true);

                } else {
                    C1.setChecked(false);
                    C12.setChecked(false);
                    L13.setChecked(false);
                    L3.setChecked(false);
                    L22.setChecked(false);
                }
            }
        });
        C12.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    C11.setChecked(true);
                    C1.setChecked(true);
                    L13.setChecked(true);
                    L3.setChecked(true);
                    L22.setChecked(true);

                } else {
                    C11.setChecked(false);
                    C1.setChecked(false);
                    L13.setChecked(false);
                    L3.setChecked(false);
                    L22.setChecked(false);
                }
            }
        });
        D11.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    D1.setChecked(true);
                    D12.setChecked(true);
                    L19.setChecked(true);
                    L9.setChecked(true);
                    L28.setChecked(true);
                } else {
                    D1.setChecked(false);
                    D12.setChecked(false);
                    L19.setChecked(false);
                    L9.setChecked(false);
                    L28.setChecked(false);
                }
            }
        });
        D12.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    D11.setChecked(true);
                    D1.setChecked(true);
                    L19.setChecked(true);
                    L9.setChecked(true);
                    L28.setChecked(true);
                } else {
                    D11.setChecked(false);
                    D1.setChecked(false);
                    L19.setChecked(false);
                    L9.setChecked(false);
                    L28.setChecked(false);
                }
            }
        });
        E11.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    E1.setChecked(true);
                    E12.setChecked(true);
                    L25.setChecked(true);
                    L15.setChecked(true);
                    L4.setChecked(true);

                } else {
                    E1.setChecked(false);
                    E12.setChecked(false);
                    L25.setChecked(false);
                    L15.setChecked(false);
                    L4.setChecked(false);

                }
            }
        });
        E12.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    E11.setChecked(true);
                    E1.setChecked(true);
                    L25.setChecked(true);
                    L15.setChecked(true);
                    L4.setChecked(true);

                } else {
                    E11.setChecked(false);
                    E1.setChecked(false);
                    L25.setChecked(false);
                    L15.setChecked(false);
                    L4.setChecked(false);

                }
            }
        });
        F11.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    F1.setChecked(true);
                    F12.setChecked(true);
                    L2.setChecked(true);
                    L14.setChecked(true);
                    L21.setChecked(true);

                } else {
                    F1.setChecked(false);
                    F12.setChecked(false);
                    L2.setChecked(false);
                    L14.setChecked(false);
                    L21.setChecked(false);


                }
            }
        });
        F12.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    F11.setChecked(true);
                    F1.setChecked(true);
                    L2.setChecked(true);
                    L14.setChecked(true);
                    L21.setChecked(true);

                } else {
                    F11.setChecked(false);
                    F1.setChecked(false);
                    L2.setChecked(false);
                    L14.setChecked(false);
                    L21.setChecked(false);


                }
            }
        });
        G11.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    G1.setChecked(true);
                    L8.setChecked(true);
                    L27.setChecked(true);
                } else {
                    G1.setChecked(false);
                    L8.setChecked(false);
                    L27.setChecked(false);
                }
            }
        });
        TD1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    L5.setChecked(true);
                    Takenslot.add("TD1");
                    Takenslot.remove("L5");
                } else {
                    L5.setChecked(false);
                    Takenslot.remove("L5");
                }
            }
        });
        TE1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    L23.setChecked(true);
                    Takenslot.add("TE1");
                    Takenslot.remove("L23");
                } else {
                    L23.setChecked(false);
                    Takenslot.remove("L5");
                }
            }
        });
        TF1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    L11.setChecked(true);
                    Takenslot.add("TF1");
                    Takenslot.remove("L11");
                } else {
                    L11.setChecked(false);
                    Takenslot.remove("TF1");
                }
            }
        });
        TC1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    L29.setChecked(true);
                    Takenslot.add("TC1");
                    Takenslot.remove("L29");
                } else {
                    L29.setChecked(false);
                    Takenslot.remove("TC1");

                }
            }
        });
        A2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    A21.setChecked(true);
                    L31.setChecked(true);
                    L50.setChecked(true);
                    Takenslot.add("A2");
                    Takenslot.remove("L31");
                    Takenslot.remove("L50");
                } else {
                    A21.setChecked(false);
                    L31.setChecked(false);
                    L50.setChecked(false);
                    Takenslot.remove("A2");
                }
            }
        });
        B2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    B21.setChecked(true);
                    L37.setChecked(true);
                    L56.setChecked(true);
                    Takenslot.add("B2");
                    Takenslot.remove("L37");
                    Takenslot.remove("L56");

                } else {
                    B21.setChecked(false);
                    L37.setChecked(false);
                    L56.setChecked(false);
                    Takenslot.remove("B2");

                }
            }
        });
        C2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    C21.setChecked(true);
                    C22.setChecked(true);
                    L43.setChecked(true);
                    L33.setChecked(true);
                    L52.setChecked(true);
                    Takenslot.add("C2");
                    Takenslot.remove("L43");
                    Takenslot.remove("L33");
                    Takenslot.remove("L52");
                } else {
                    C21.setChecked(false);
                    C22.setChecked(false);
                    L43.setChecked(false);
                    L33.setChecked(false);
                    L52.setChecked(false);
                    Takenslot.remove("C2");

                }
            }
        });
        D2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    D21.setChecked(true);
                    D22.setChecked(true);
                    L49.setChecked(true);
                    L39.setChecked(true);
                    L58.setChecked(true);
                    Takenslot.add("D2");
                    Takenslot.remove("L49");
                    Takenslot.remove("L39");
                    Takenslot.remove("L58");
                } else {
                    D21.setChecked(false);
                    D22.setChecked(false);
                    L49.setChecked(false);
                    L39.setChecked(false);
                    L58.setChecked(false);
                    Takenslot.remove("D2");
                }
            }
        });
        E2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    E21.setChecked(true);
                    E22.setChecked(true);
                    L55.setChecked(true);
                    L45.setChecked(true);
                    L34.setChecked(true);
                    Takenslot.add("E2");
                    Takenslot.remove("L55");
                    Takenslot.remove("L45");
                    Takenslot.remove("L34");
                } else {
                    E21.setChecked(false);
                    E22.setChecked(false);
                    L55.setChecked(false);
                    L45.setChecked(false);
                    L34.setChecked(false);
                    Takenslot.remove("E2");
                }
            }
        });
        F2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    F21.setChecked(true);
                    F22.setChecked(true);
                    L51.setChecked(true);
                    L44.setChecked(true);
                    L32.setChecked(true);
                    Takenslot.add("F2");
                    Takenslot.remove("L51");
                    Takenslot.remove("L44");
                    Takenslot.remove("L32");
                } else {
                    F21.setChecked(false);
                    F22.setChecked(false);
                    L51.setChecked(false);
                    L44.setChecked(false);
                    L32.setChecked(false);
                    Takenslot.remove("F2");
                }
            }
        });
        G2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    G21.setChecked(true);
                    L38.setChecked(true);
                    L57.setChecked(true);
                    Takenslot.add("G2");
                    Takenslot.remove("L38");
                    Takenslot.remove("L57");
                } else {
                    G21.setChecked(false);
                    L38.setChecked(false);
                    L57.setChecked(false);
                    Takenslot.remove("G2");
                }
            }
        });
        A21.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    A2.setChecked(true);
                    L31.setChecked(true);
                    L50.setChecked(true);
                } else {
                    A2.setChecked(false);
                    L31.setChecked(false);
                    L50.setChecked(false);
                }
            }
        });
        B21.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    B2.setChecked(true);
                    L37.setChecked(true);
                    L56.setChecked(true);

                } else {
                    B2.setChecked(false);
                    L37.setChecked(false);
                    L56.setChecked(false);

                }
            }
        });
        C21.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    C2.setChecked(true);
                    C22.setChecked(true);
                    L43.setChecked(true);
                    L33.setChecked(true);
                    L52.setChecked(true);
                } else {
                    C2.setChecked(false);
                    C22.setChecked(false);
                    L43.setChecked(false);
                    L33.setChecked(false);
                    L52.setChecked(false);

                }
            }
        });
        C22.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    C21.setChecked(true);
                    C2.setChecked(true);
                    L43.setChecked(true);
                    L33.setChecked(true);
                    L52.setChecked(true);
                } else {
                    C21.setChecked(false);
                    C2.setChecked(false);
                    L43.setChecked(false);
                    L33.setChecked(false);
                    L52.setChecked(false);

                }
            }
        });
        D21.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    D2.setChecked(true);
                    D22.setChecked(true);
                    L49.setChecked(true);
                    L39.setChecked(true);
                    L58.setChecked(true);
                } else {
                    D2.setChecked(false);
                    D22.setChecked(false);
                    L49.setChecked(false);
                    L39.setChecked(false);
                    L58.setChecked(false);
                }
            }
        });
        D22.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    D21.setChecked(true);
                    D2.setChecked(true);
                    L49.setChecked(true);
                    L39.setChecked(true);
                    L58.setChecked(true);
                } else {
                    D21.setChecked(false);
                    D2.setChecked(false);
                    L49.setChecked(false);
                    L39.setChecked(false);
                    L58.setChecked(false);
                }
            }
        });
        E21.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    E2.setChecked(true);
                    E22.setChecked(true);
                    L55.setChecked(true);
                    L45.setChecked(true);
                    L34.setChecked(true);
                } else {
                    E2.setChecked(false);
                    E22.setChecked(false);
                    L55.setChecked(false);
                    L45.setChecked(false);
                    L34.setChecked(false);
                }
            }
        });
        E22.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    E21.setChecked(true);
                    E2.setChecked(true);
                    L55.setChecked(true);
                    L45.setChecked(true);
                    L34.setChecked(true);
                } else {
                    E21.setChecked(false);
                    E2.setChecked(false);
                    L55.setChecked(false);
                    L45.setChecked(false);
                    L34.setChecked(false);
                }
            }
        });
        F21.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    F2.setChecked(true);
                    F22.setChecked(true);
                    L51.setChecked(true);
                    L44.setChecked(true);
                    L32.setChecked(true);
                } else {
                    F2.setChecked(false);
                    F22.setChecked(false);
                    L51.setChecked(false);
                    L44.setChecked(false);
                    L32.setChecked(false);
                }
            }
        });
        F22.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    F21.setChecked(true);
                    F2.setChecked(true);
                    L51.setChecked(true);
                    L44.setChecked(true);
                    L32.setChecked(true);
                } else {
                    F21.setChecked(false);
                    F2.setChecked(false);
                    L51.setChecked(false);
                    L44.setChecked(false);
                    L32.setChecked(false);
                }
            }
        });
        G21.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    G2.setChecked(true);
                    L38.setChecked(true);
                    L57.setChecked(true);
                } else {
                    G2.setChecked(false);
                    L38.setChecked(false);
                    L57.setChecked(false);
                }
            }
        });
        TA2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    L40.setChecked(true);
                    Takenslot.add("TA2");
                    Takenslot.remove("L40");
                } else {
                    L40.setChecked(false);
                    Takenslot.remove("TA2");
                }
            }
        });
        TB2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    L46.setChecked(true);
                    Takenslot.add("TB2");
                    Takenslot.remove("L46");

                } else {
                    L46.setChecked(false);
                    Takenslot.remove("TB2");
                }
            }
        });
        TC2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    L59.setChecked(true);
                    Takenslot.add("TC2");
                    Takenslot.remove("L59");
                } else {
                    L59.setChecked(false);
                    Takenslot.remove("TC2");
                }
            }
        });
        TD2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    L35.setChecked(true);
                    Takenslot.add("TD2");
                    Takenslot.remove("L35");
                } else {
                    L35.setChecked(false);
                    Takenslot.remove("TD2");
                }
            }
        });
        TE2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    L53.setChecked(true);
                    Takenslot.add("TE2");
                    Takenslot.remove("L53");
                } else {
                    L53.setChecked(false);
                    Takenslot.remove("TE2");
                }
            }
        });
        TF2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    L41.setChecked(true);
                    Takenslot.add("TF2");
                    Takenslot.remove("L41");
                } else {
                    L41.setChecked(false);
                    Takenslot.remove("L41");
                }
            }
        });
        TG2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    L47.setChecked(true);
                    Takenslot.add("TG2");
                    Takenslot.remove("L47");
                } else {
                    L47.setChecked(false);
                    Takenslot.remove("TG2");
                }
            }
        });
        L1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    if(!A1.isChecked()) {
                        Takenslot.add("L1");
                    }
                } else {
                    Takenslot.remove("L1");
                }
            }
        });
        L2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    if(!F1.isChecked()) {
                        Takenslot.add("L2");
                    }
                } else {
                    Takenslot.remove("L2");
                }
            }
        });
        L3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    if(!C1.isChecked()) {
                        Takenslot.add("L3");
                    }
                } else {
                    Takenslot.remove("L3");
                }
            }
        });
        L4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    if(!E1.isChecked()) {
                        Takenslot.add("L4");
                    }
                } else {
                    Takenslot.remove("L4");
                }
            }
        });
        L5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    if(!TD1.isChecked()) {
                        Takenslot.add("L5");
                    }
                } else {
                    Takenslot.remove("L5");
                }
            }
        });
        L6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    Takenslot.add("L6");
                    Blank1.setChecked(true);
                } else {
                    Takenslot.remove("L6");
                }
            }
        });
        L7.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    if(!B1.isChecked()) {
                        Takenslot.add("L7");
                    }
                } else {
                    Takenslot.remove("L7");
                }
            }
        });
        L8.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    if(!G1.isChecked()) {
                        Takenslot.add("L8");
                    }
                } else {
                    Takenslot.remove("L8");
                }
            }
        });
        L9.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    if(!D1.isChecked()) {
                        Takenslot.add("L9");
                    }
                } else {
                    Takenslot.remove("L9");
                }
            }
        });
        L10.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    if(!TA1.isChecked()) {
                        Takenslot.add("L10");
                    }
                } else {
                    Takenslot.remove("L10");
                }
            }
        });
        L11.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    if(!TF1.isChecked()) {
                        Takenslot.add("L11");
                    }
                } else {
                    Takenslot.remove("L11");
                }
            }
        });
        L12.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    Takenslot.add("L12");
                    Blank2.setChecked(true);
                } else {
                    Takenslot.remove("L12");
                    Blank2.setChecked(false);
                }
            }
        });
        L13.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    if(!C1.isChecked()) {
                        Takenslot.add("L13");
                    }
                } else {
                    Takenslot.remove("L13");
                }
            }
        });
        L14.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    if(!F1.isChecked()) {
                        Takenslot.add("L14");
                    }
                } else {
                    Takenslot.remove("L14");
                }
            }
        });
        L15.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    if(!E1.isChecked()) {
                        Takenslot.add("L15");
                    }
                } else {
                    Takenslot.remove("L15");
                }
            }
        });
        L19.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    if(!D1.isChecked()) {
                        Takenslot.add("L19");
                    }
                } else {
                    Takenslot.remove("L19");
                }
            }
        });
        L20.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    if(!A1.isChecked()) {
                        Takenslot.add("L20");
                    }
                } else {
                    Takenslot.remove("L20");
                }
            }
        });
        L21.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    if(!F1.isChecked()) {
                        Takenslot.add("L21");
                    }
                } else {
                    Takenslot.remove("L21");
                }
            }
        });
        L22.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    if(!C1.isChecked()) {
                        Takenslot.add("L22");
                    }
                } else {
                    Takenslot.remove("L22");
                }
            }
        });
        L23.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    if(!TE1.isChecked()) {
                        Takenslot.add("L23");
                    }
                } else {
                    Takenslot.remove("L23");
                }
            }
        });
        L24.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    Takenslot.add("L24");
                    Blank3.setChecked(true);
                } else {
                    Takenslot.remove("L24");
                    Blank3.setChecked(true);
                }
            }
        });
        L25.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    if(!E1.isChecked()) {
                        Takenslot.add("L25");
                    }
                } else {
                    Takenslot.remove("L25");
                }
            }
        });
        L26.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    if(!B1.isChecked()) {
                        Takenslot.add("L26");
                    }
                } else {
                    Takenslot.remove("L26");
                }
            }
        });
        L27.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    if(!G1.isChecked()) {
                        Takenslot.add("L27");
                    }
                } else {
                    Takenslot.remove("L27");

                }
            }
        });

        L28.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    if(!D1.isChecked()) {
                        Takenslot.add("L28");
                    }
                } else {
                    Takenslot.remove("L28");
                }
            }
        });
        L29.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    if(!TC1.isChecked()) {
                        Takenslot.add("L29");
                    }
                } else {
                    Takenslot.remove("L29");
                }
            }
        });
        L30.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    Takenslot.add("L30");
                    Blank4.setChecked(true);
                } else {
                    Takenslot.remove("L30");
                    Blank4.setChecked(false);
                }
            }
        });
        L31.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    if(!B2.isChecked()) {
                        Takenslot.add("L31");
                    }
                } else {
                    Takenslot.remove("L31");
                }
            }
        });
        L32.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    if(!F2.isChecked()) {
                        Takenslot.add("L32");
                    }
                } else {
                    Takenslot.remove("L32");
                }
            }
        });
        L33.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    if(!C2.isChecked()) {
                        Takenslot.add("L33");
                    }
                } else {
                    Takenslot.remove("L33");
                }
            }
        });
        L34.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    if(!E2.isChecked()) {
                        Takenslot.add("L34");
                    }
                } else {
                    Takenslot.remove("L34");
                }
            }
        });
        L35.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    if(!TD2.isChecked()) {
                    Takenslot.add("L35");
                    }
                } else {
                    Takenslot.remove("L35");
                }
            }
        });
        L36.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    Takenslot.add("L36");
                    Blank5.setChecked(true);
                } else {
                    Takenslot.remove("L36");
                    Blank5.setChecked(false);
                }
            }
        });
        L37.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    if(!B2.isChecked()) {
                        Takenslot.add("L37");
                    }
                } else {
                    Takenslot.remove("L37");
                }
            }
        });
        L38.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    if(!G2.isChecked()) {
                        Takenslot.add("L38");
                    }
                } else {
                    Takenslot.remove("L38");
                }
            }
        });
        L39.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    if(!D2.isChecked()) {
                        Takenslot.add("L39");
                    }
                } else {
                    Takenslot.remove("L39");
                }
            }
        });
        L40.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    if(!TA2.isChecked()) {
                        Takenslot.add("L40");
                    }
                } else {
                    Takenslot.remove("L40");
                }
            }
        });
        L41.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    if(!TF2.isChecked()) {
                        Takenslot.add("L41");
                    }
                } else {
                    Takenslot.remove("L41");
                }
            }
        });
        L42.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    Takenslot.add("L42");
                    Blank6.setChecked(true);
                } else {
                    Takenslot.remove("L42");
                    Blank6.setChecked(true);
                }
            }
        });
        L43.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    if(!C2.isChecked()) {
                        Takenslot.add("L43");
                    }
                } else {
                    Takenslot.remove("L43");
                }
            }
        });
        L44.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    if(!F2.isChecked()) {
                        Takenslot.add("L44");
                    }
                } else {
                    Takenslot.remove("L44");
                }
            }
        });
        L45.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    if(!E2.isChecked()) {
                        Takenslot.add("L45");
                    }
                } else {
                    Takenslot.remove("L45");
                }
            }
        });
        L46.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    if(!TB2.isChecked()) {
                        Takenslot.add("L46");
                    }
                } else {
                    Takenslot.remove("L46");
                }
            }
        });
        L47.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    if(!TG2.isChecked()) {
                        Takenslot.add("L47");
                    }
                } else {
                    Takenslot.remove("L47");
                }
            }
        });
        L48.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    Takenslot.add("L48");
                    Blank7.setChecked(true);

                } else {
                    Blank7.setChecked(false);
                    Takenslot.remove("L48");
                }
            }
        });
        L49.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    if(!D2.isChecked()) {
                        Takenslot.add("L49");
                    }
                } else {
                    Takenslot.remove("L49");
                }
            }
        });
        L50.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    if(!A2.isChecked()) {
                        Takenslot.add("L50");
                    }
                } else {
                    Takenslot.remove("L50");
                }
            }
        });
        L51.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    if(!F2.isChecked()) {
                        Takenslot.add("L51");
                    }
                } else {
                    Takenslot.remove("L51");
                }
            }
        });
        L52.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    if(!C2.isChecked()) {
                        Takenslot.add("L52");
                    }
                } else {
                    Takenslot.remove("L52");
                }
            }
        });
        L53.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    if(!TE2.isChecked()) {
                        Takenslot.add("L53");
                    }
                } else {
                    Takenslot.remove("L53");
                }
            }
        });
        L54.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    Blank8.setChecked(true);
                    Takenslot.add("L54");
                } else {
                    Blank8.setChecked(false);
                    Takenslot.remove("L54");
                }
            }
        });
        L55.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    if(!E2.isChecked()) {
                        Takenslot.add("L55");
                    }
                } else {
                    Takenslot.remove("L55");
                }
            }
        });
        L56.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    if(!B2.isChecked()) {
                        Takenslot.add("L56");
                    }
                } else {
                    Takenslot.remove("L56");
                }
            }
        });
        L57.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    if(!G2.isChecked()) {
                        Takenslot.add("L57");
                    }
                } else {
                    Takenslot.remove("L57");
                }
            }
        });
        L58.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    if(!D2.isChecked()) {
                        Takenslot.add("L58");
                    }
                } else {
                    Takenslot.remove("L58");
                }
            }
        });
        L59.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    if(!TC2.isChecked()) {
                        Takenslot.add("L59");
                    }
                } else {
                    Takenslot.remove("L59");
                }
            }
        });
        L60.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    Blank9.setChecked(true);
                    Takenslot.add("L60");

                } else {
                    Blank9.setChecked(false);
                    Takenslot.remove("L60");
                }
            }
        });
        String[] slot = SLOTS.split(",|\\+");
        if(!slot.toString().equals("")) {
            for (int i = 0; i < slot.length; i++) {
                switch (slot[i].toUpperCase()) {
                    case "A1":
                        A1.setChecked(true);
                        break;
                    case "B1":
                        B1.setChecked(true);
                        break;
                    case "C1":
                        C1.setChecked(true);
                        break;
                    case "D1":
                        D1.setChecked(true);
                        break;
                    case "E1":
                        E1.setChecked(true);
                        break;
                    case "F1":
                        F1.setChecked(true);
                        break;
                    case "G1":
                        G1.setChecked(true);
                        break;
                    case "A2":
                        A2.setChecked(true);
                        break;
                    case "B2":
                        B2.setChecked(true);
                        break;
                    case "C2":
                        C2.setChecked(true);
                        break;
                    case "D2":
                        D2.setChecked(true);
                        break;
                    case "E2":
                        E2.setChecked(true);
                        break;
                    case "F2":
                        F2.setChecked(true);
                        break;
                    case "G2":
                        G2.setChecked(true);
                        break;
                    case "L1":
                        L1.setChecked(true);
                        break;
                    case "L2":
                        L2.setChecked(true);
                        break;
                    case "L3":
                        L3.setChecked(true);
                        break;
                    case "L4":
                        L4.setChecked(true);
                        break;
                    case "L5":
                        L5.setChecked(true);
                        break;
                    case "L6":
                        L6.setChecked(true);
                        break;
                    case "L7":
                        L7.setChecked(true);
                        break;
                    case "L8":
                        L8.setChecked(true);
                        break;
                    case "L9":
                        L9.setChecked(true);
                        break;
                    case "L10":
                        L10.setChecked(true);
                        break;
                    case "L11":
                        L11.setChecked(true);
                        break;
                    case "L12":
                        L12.setChecked(true);
                        break;
                    case "L13":
                        L13.setChecked(true);
                        break;
                    case "L14":
                        L14.setChecked(true);
                        break;
                    case "L15":
                        L15.setChecked(true);
                        break;
                    case "L19":
                        L19.setChecked(true);
                        break;
                    case "L20":
                        L20.setChecked(true);
                        break;
                    case "L21":
                        L21.setChecked(true);
                        break;
                    case "L22":
                        L22.setChecked(true);
                        break;
                    case "L23":
                        L23.setChecked(true);
                        break;
                    case "L24":
                        L24.setChecked(true);
                        break;
                    case "L25":
                        L25.setChecked(true);
                        break;
                    case "L26":
                        L26.setChecked(true);
                        break;
                    case "L27":
                        L27.setChecked(true);
                        break;
                    case "L28":
                        L28.setChecked(true);
                        break;
                    case "L29":
                        L29.setChecked(true);
                        break;
                    case "L30":
                        L30.setChecked(true);
                        break;
                    case "L31":
                        L31.setChecked(true);
                        break;
                    case "L32":
                        L32.setChecked(true);
                        break;
                    case "L33":
                        L33.setChecked(true);
                        break;
                    case "L34":
                        L34.setChecked(true);
                        break;
                    case "L35":
                        L35.setChecked(true);
                        break;
                    case "L36":
                        L36.setChecked(true);
                        break;
                    case "L37":
                        L37.setChecked(true);
                        break;
                    case "L38":
                        L38.setChecked(true);
                        break;
                    case "L39":
                        L39.setChecked(true);
                        break;
                    case "L40":
                        L40.setChecked(true);
                        break;
                    case "L41":
                        L41.setChecked(true);
                        break;
                    case "L42":
                        L42.setChecked(true);
                        break;
                    case "L43":
                        L43.setChecked(true);
                        break;
                    case "L44":
                        L44.setChecked(true);
                        break;
                    case "L45":
                        L45.setChecked(true);
                        break;
                    case "L46":
                        L46.setChecked(true);
                        break;
                    case "L47":
                        L47.setChecked(true);
                        break;
                    case "L48":
                        L48.setChecked(true);
                        break;
                    case "L49":
                        L49.setChecked(true);
                        break;
                    case "L50":
                        L50.setChecked(true);
                        break;
                    case "L51":
                        L51.setChecked(true);
                        break;
                    case "L52":
                        L52.setChecked(true);
                        break;
                    case "L53":
                        L53.setChecked(true);
                        break;
                    case "L54":
                        L54.setChecked(true);
                        break;
                    case "L55":
                        L55.setChecked(true);
                        break;
                    case "L56":
                        L56.setChecked(true);
                        break;
                    case "L57":
                        L57.setChecked(true);
                        break;
                    case "L58":
                        L58.setChecked(true);
                        break;
                    case "L59":
                        L59.setChecked(true);
                        break;
                    case "L60":
                        L60.setChecked(true);
                        break;
                    case "TA1":
                        TA1.setChecked(true);
                        break;
                    case "TA2":
                        TA2.setChecked(true);
                        break;
                    case "TB2":
                        TB2.setChecked(true);
                        break;
                    case "TC1":
                        TC1.setChecked(true);
                        break;
                    case "TD1":
                        TD1.setChecked(true);
                        break;
                    case "TC2":
                        TC2.setChecked(true);
                        break;
                    case "TD2":
                        TD2.setChecked(true);
                        break;
                    case "TE1":
                        TE1.setChecked(true);
                        break;
                    case "TE2":
                        TE2.setChecked(true);
                        break;
                    case "TF1":
                        TF1.setChecked(true);
                        break;
                    case "TF2":
                        TF2.setChecked(true);
                        break;
                    case "TG2":
                        TG2.setChecked(true);
                        break;


                }
            }
        }

        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), Takenslot.toString().replaceAll("[\\[\\]]", ""), Toast.LENGTH_SHORT).show();
              String Selectedslots1=Takenslot.toString().replaceAll("[\\[\\]\\s]", "");
                Intent iData = new Intent();
                iData.putExtra(
                        Selectedslots,
                        Selectedslots1);

                setResult(
                        Activity.RESULT_OK,
                        iData);


                finish();
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
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

}