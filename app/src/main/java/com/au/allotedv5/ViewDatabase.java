package com.au.allotedv5;


import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by Abhishek-Pc on 10-01-2016.
 */
public class ViewDatabase extends Fragment {

    Datasource mDatasource;
    public ListView List;
    private String Free= new String();
    private String Free2= new String();
    private String mon = new String();
    private String tue = new String();
    private String wed = new String();
    private String thur = new String();
    private String fri = new String();
    private String Newslots = new String();
    private String NewName = new String();
    private String NewRegno = new String();

    private String NewFree=new String();
    private String Regno=new String();
    private String Taken=new String();
    private String name=new String();
    private String Name= "Name:";
    private String Takenslots="Taken Slots:";
    private String FreeTimings="Free Timings:";
    private String RegistrationNumber="Registration Number:";
    ArrayAdapter<Retriveddata> Students;
    public SearchView Search;
    Freecalc F2 = new Freecalc();
    public static EditText newslots;
    private EditText newname;
    private EditText newregno;
    private Button select2;

    private Button Update;



    private List<Retriveddata> retriveddatas;
    public static final String Timings="Timings";
    public static final String Timings2="Timings2";
    public static ViewDatabase newInstance() {
        ViewDatabase fragment = new ViewDatabase();
        return fragment;
    }
    public ViewDatabase() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

         View rootView = inflater.inflate(R.layout.viewdatabase, container, false);
        super.onCreate(savedInstanceState);
        List= (ListView)rootView.findViewById(R.id.listView);

        newslots=(EditText)rootView.findViewById(R.id.editText4);
        newname=(EditText)rootView.findViewById(R.id.editText42);
        newregno=(EditText)rootView.findViewById(R.id.editText41);
        select2=(Button)rootView.findViewById(R.id.button60);
        Update=(Button)rootView.findViewById(R.id.button6);
        // setSupportActionBar(toolbar);
        Bundle args = getArguments();

        mDatasource=new Datasource(getActivity());
        mDatasource.open();

//        createData();
          retriveddatas = new Datasource(getActivity()).getall();
        if (retriveddatas.size()==0){
            createData();
           retriveddatas = new Datasource(getActivity()).getall();

        }
        Students= new ArrayAdapter<Retriveddata>(getActivity(),R.layout.customlayout,retriveddatas);
        //setListAdapter(Students);
        List.setAdapter(Students);
        List.setTextFilterEnabled(true);
        Search = (SearchView)rootView.findViewById(R.id.searchView);
        Search.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {

                Students.getFilter().filter(s);
                return true;
            }
        });






        List.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //  Retriveddata mRetriveddata=retriveddatas.get(i);
                mon = retriveddatas.get(i).getMonday();
                tue = retriveddatas.get(i).getTuesday();
                wed = retriveddatas.get(i).getWenesday();
                thur = retriveddatas.get(i).getThursday();
                fri = retriveddatas.get(i).getFriday();
                Regno=retriveddatas.get(i).getRegistration_Number();
                Taken=retriveddatas.get(i).getTaken();
                name=retriveddatas.get(i).getNAME();



                Free =name+"\n"+Regno+"\n"+Takenslots+Taken+"\n"+FreeTimings;
                Free2=mon + "\n" + tue + "\n" + wed + "\n" + thur + "\n" + fri;
                displaydetails(Free,Free2);

            }


        });
        registerForContextMenu(List);
        return rootView;
        //List.setOnItemLongClickListener();

    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        menu.add(0, v.getId(), 0, "View");//groupId, itemId, order, title
        menu.add(0, v.getId(), 0, "Delete");
        menu.add(0, v.getId(), 0, "Update");

    }
    @Override
    public boolean onContextItemSelected(MenuItem item){
        AdapterView.AdapterContextMenuInfo info = (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();
        final int i= info.position;
        if(item.getTitle()=="View"){

            mon = retriveddatas.get(i).getMonday();
            tue = retriveddatas.get(i).getTuesday();
            wed = retriveddatas.get(i).getWenesday();
            thur = retriveddatas.get(i).getThursday();
            fri = retriveddatas.get(i).getFriday();


            Regno=retriveddatas.get(i).getRegistration_Number();
            Taken=retriveddatas.get(i).getTaken();
            name=retriveddatas.get(i).getNAME();



            Free =name+"\n"+Regno+"\n"+Takenslots+Taken+"\n"+FreeTimings;
            Free2=mon + "\n" + tue + "\n" + wed + "\n" + thur + "\n" + fri;
            displaydetails(Free,Free2);
        }
        else if(item.getTitle()=="Delete") {
            new AlertDialog.Builder(getActivity()).setTitle("Confirm Delete")
                    .setMessage("Are you sure you want delete this Data?")
                    .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int which) {
                            mDatasource.DeleteData(retriveddatas.get(i));
                            retriveddatas.get(i).delete(retriveddatas.get(i));
                            retriveddatas.remove(i);
                            Students.notifyDataSetChanged();
                           // Toast.makeText(getContext(),"Data has been Deleted",Toast.LENGTH_LONG).show();
                            Snackbar sb =Snackbar.make(getView(),"Data has been Deleted",Snackbar.LENGTH_LONG);
                            sb.show();



                        }
                    })
                    .setNeutralButton("Cancel", null)
                    .create()
                    .show();
        }
        else if (item.getTitle()=="Update"){
            List.setVisibility(View.INVISIBLE);
            update(retriveddatas.get(i),i);

            return false;
        }
        return true;
    }

    private void update(final Retriveddata retriveddata, final int i) {
        final String Key =retriveddata.getRegistration_Number();
        final String Name= retriveddata.getNAME();
        final String Taken=retriveddata.getTaken();

        newname.setVisibility(View.VISIBLE);
        newregno.setVisibility(View.VISIBLE);
        newslots.setVisibility(View.VISIBLE);
        select2.setVisibility(View.VISIBLE);

        newname.setText(Name);
        newregno.setText(Key);
        newslots.setText(Taken);
        Update.setVisibility(View.VISIBLE);
        Update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Newslots=newslots.getText().toString();
                NewName=newname.getText().toString();
                NewRegno=newregno.getText().toString();

                if(Newslots.equals("")||NewName.equals("")||NewRegno.equals("")) {

                  Toast.makeText(getActivity(),"invalid entry",Toast.LENGTH_LONG).show();
                }
                else {
                    retriveddatas.get(i).delete(retriveddata);
                    mDatasource.DeleteData(retriveddata);
                    retriveddatas.remove(i);
                    F2.calc1(NewName, NewRegno, Newslots, mDatasource);
                    boolean flag = mDatasource.getflag();
                    if (flag) {
                        Toast.makeText(getContext(), "Data was updated", Toast.LENGTH_LONG).show();
                    } else {
                        Toast.makeText(getContext(), "Data not updated", Toast.LENGTH_LONG).show();
                    }
                }

                retriveddatas = new Datasource(getActivity()).getall();
                Students= new ArrayAdapter<Retriveddata>(getActivity(),android.R.layout.simple_list_item_1,retriveddatas);
                List.setAdapter(Students);
                //Students.notifyDataSetChanged();
                newslots.clearFocus();
                newslots.setText("");
                newslots.setVisibility(View.INVISIBLE);
                newname.setVisibility(View.INVISIBLE);
                newregno.setVisibility(View.INVISIBLE);
                Update.setVisibility(View.INVISIBLE);
                select2.setVisibility(View.INVISIBLE);
                List.setVisibility(View.VISIBLE);
               // Toast.makeText(getActivity(),"Database has been updated",Toast.LENGTH_LONG).show();




            }
        });

    }


    private void createData() {
        Sortstrings mretriveddata =new Sortstrings();
        Retriveddata mR=new Retriveddata();
        mretriveddata.setMONDAY("sample Monday Free timings");
        mretriveddata.setTUESDAY("sample Tuesday Free timings");
        mretriveddata.setWEDNESDAY("sample Wednesday Free timings");
        mretriveddata.setTHURSDAY("sample Thursday Free timings");
        mretriveddata.setFRIDAY("sample Friday Free timings");
        mretriveddata.setKEY("SAMPLE REG NO");
        mretriveddata.setNAME("SAMPLE NAME");
        mDatasource.create(mretriveddata);

    }

    private void displaydetails(String free ,String free2) {
        Intent intent =new Intent(getActivity(),ViewFreeslots.class);

        intent.putExtra(Timings, free);
        intent.putExtra(Timings2, free2);
        getActivity().startActivity(intent);
    }



}

