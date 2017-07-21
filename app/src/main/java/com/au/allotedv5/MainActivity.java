package com.au.allotedv5;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.NavigationView;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private static final String TAG ="level400" ;
    public static final int MY_REQUEST_CODE = 123;
    private static final int MY_REQUEST_CODE2 =124 ;
    DrawerLayout mDrawerLayout;
    NavigationView mNavigationView;
    FragmentManager mFragmentManager;
    FragmentTransaction mFragmentTransaction;
    Tabfragment mTabfragment;
    private static final long DRAWER_CLOSE_DELAY_MS = 10;
    private static final String NAV_ITEM_ID = "navItemId";
   // private ActionBarDrawerToggle mDrawerToggle;
    private final Handler mDrawerActionHandler = new Handler();

    public ViewDatabase mViewDatabase=new ViewDatabase();
    public Getstudents mGetstudents=new Getstudents();
    Datasource mDatasource;
    Database mDatabase;
    String Clubname;
    private TextView club;
    private int mNavItemId;
    private ActionBarDrawerToggle mDrawerToggle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        mDatasource=new Datasource(this);
        mDatabase=new Database(this);
        mDatasource.open();

        Intent intent = getIntent();

        Clubname=intent.getStringExtra("club");


        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);
        mNavigationView = (NavigationView) findViewById(R.id.shitstuff) ;
        club = (TextView) mNavigationView.inflateHeaderView(R.layout.header).findViewById(R.id.textView9);
        club.setText(Clubname);
        if (null == savedInstanceState) {
            mNavItemId = R.id.data_manager;
        } else {
            mNavItemId = savedInstanceState.getInt(NAV_ITEM_ID);
        }





        /**
         * Lets inflate the very first fragment
         * Here , we are inflating the TabFragment as the first Fragment
         */

        mFragmentManager = getSupportFragmentManager();
       // mFragmentTransaction = mFragmentManager.beginTransaction();
        //mFragmentTransaction.replace(R.id.containerView,new Tabfragment()).commit();

        mNavigationView.setNavigationItemSelectedListener(this);

        // select the correct nav menu item
        mNavigationView.getMenu().findItem(mNavItemId).setChecked(true);



        // set up the hamburger icon to open and close the drawer







        /**
         * Setup click events on the Navigation View Items.
         */
        /*

        mNavigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {
                mDrawerLayout.closeDrawers();

                if(menuItem.getItemId()==R.id.data_manager){
                    FragmentTransaction fragmentTransaction = mFragmentManager.beginTransaction();
                    fragmentTransaction.replace(R.id.containerView,new Tabfragment()).commit();
                    //fab.setVisibility(View.VISIBLE);
                }

                if(menuItem.getItemId()==R.id.Settings)
                {
                    FragmentTransaction fragmentTransaction = mFragmentManager.beginTransaction();
                    fragmentTransaction.replace(R.id.containerView,new Settings()).commit();
                   // fab.setVisibility(View.INVISIBLE);

                }
                if(menuItem.getItemId()==R.id.About)
                {
                    FragmentTransaction fragmentTransaction = mFragmentManager.beginTransaction();
                    fragmentTransaction.replace(R.id.containerView,new About()).commit();
                    //fab.setVisibility(View.INVISIBLE);

                }







                return false;
            }

        });
        */


        /**
         * Setup Drawer Toggle of the Toolbar
         */

        android.support.v7.widget.Toolbar toolbar1 = (android.support.v7.widget.Toolbar) findViewById(R.id.toolbar);
        mDrawerToggle = new ActionBarDrawerToggle(this,mDrawerLayout, toolbar,R.string.app_name,
                R.string.app_name);

        mDrawerLayout.setDrawerListener(mDrawerToggle);

        mDrawerToggle.syncState();
        navigate(mNavItemId);


    }
    private void navigate(final int itemId) {
        switch (itemId) {
            case R.id.data_manager:
                mFragmentManager
                        .beginTransaction().replace(R.id.containerView, new Tabfragment()).commit();
                //fab.setVisibility(View.VISIBLE);
            break;

            case R.id.Settings:

                mFragmentManager
                        .beginTransaction().replace(R.id.containerView, new Settings()).add(new Settings(),"settings").addToBackStack("settings").commit();
                // fab.setVisibility(View.INVISIBLE);
              break;

            case R.id.About:

                mFragmentManager
                        .beginTransaction().replace(R.id.containerView, new About()).add(new About(), "About").addToBackStack("About").commit();
                //fab.setVisibility(View.INVISIBLE);

            break;

        }
    }
    @Override
    public boolean onNavigationItemSelected(final MenuItem menuItem) {
        // update highlighted item in the navigation menu
        menuItem.setChecked(true);
        mNavItemId = menuItem.getItemId();

        // allow some time after closing the drawer before performing real navigation
        // so the user can see what is happening
        mDrawerLayout.closeDrawer(GravityCompat.START);
        mDrawerActionHandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                navigate(menuItem.getItemId());
            }
        }, DRAWER_CLOSE_DELAY_MS);
        return true;
    }
    @Override
    public void onConfigurationChanged(final Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        mDrawerToggle.onConfigurationChanged(newConfig);
    }

    @Override
    public boolean onOptionsItemSelected(final MenuItem item) {
        if (item.getItemId() == android.support.v7.appcompat.R.id.home) {
            return mDrawerToggle.onOptionsItemSelected(item);
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {

        if (mDrawerLayout.isDrawerOpen(GravityCompat.START)) {
            mDrawerLayout.closeDrawer(GravityCompat.START);
        } else {

        }
        if (getFragmentManager().getBackStackEntryCount() > 0) {
            getFragmentManager().popBackStackImmediate();
        } else {
            super.onBackPressed();
        }


    }

    @Override
    protected void onSaveInstanceState(final Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(NAV_ITEM_ID, mNavItemId);
    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        // Inflate the menu; this adds items to the action bar if it is present.


        return true;
    }
/*
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.

        return super.onOptionsItemSelected(item);
    }
    */

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
      //  super.onActivityResult(requestCode, resultCode, data);
        Log.v(TAG, "Retrieved Value zData is " + "working");
        if ( requestCode==MY_REQUEST_CODE)
        {
            Log.v(TAG, "Retrieved Value zData is " +"workingq");
            if (resultCode == Activity.RESULT_OK )
            {
                final String zData = data.getExtras().getString( Seleectslots.Selectedslots );
                Log.v(TAG, "Retrieved Value zData is " + zData);

               Getstudents.Taken.setText(zData);






            }
        }
        if ( requestCode==MY_REQUEST_CODE2)
        {
            Log.v(TAG, "Retrieved Value zData is " +"workingq");
            if (resultCode == Activity.RESULT_OK )
            {
                final String zData = data.getExtras().getString( Seleectslots.Selectedslots );
                Log.v(TAG, "Retrieved Value zData is " + zData);

                ViewDatabase.newslots.setText(zData);






            }
        }

    }
    private static final int REQUEST_EXTERNAL_STORAGE = 1;
    private static String[] PERMISSIONS_STORAGE = {
            Manifest.permission.READ_EXTERNAL_STORAGE,
            Manifest.permission.WRITE_EXTERNAL_STORAGE
    };

    /**
     * Checks if the app has permission to write to device storage
     *
     * If the app does not has permission then the user will be prompted to grant permissions
     *
     * @param activity
     */
    public static void verifyStoragePermissions(Activity activity) {
        // Check if we have write permission
        int permission = ActivityCompat.checkSelfPermission(activity, Manifest.permission.WRITE_EXTERNAL_STORAGE);

        if (permission != PackageManager.PERMISSION_GRANTED) {
            // We don't have permission so prompt the user
            ActivityCompat.requestPermissions(
                    activity,
                    PERMISSIONS_STORAGE,
                    REQUEST_EXTERNAL_STORAGE
            );
        }
    }

    public void selectSlots(View view) {

        Intent intent =new Intent(this,Seleectslots.class);
        String TEXt = mGetstudents.Taken.getText().toString();
        intent.putExtra("slots",TEXt);
        startActivityForResult(intent,MY_REQUEST_CODE);
    }

    public void selectSlots2(View view) {
        Intent intent =new Intent(this,Seleectslots.class);
        String TEXt = mViewDatabase.newslots.getText().toString();
        intent.putExtra("slots",TEXt);
        startActivityForResult(intent,MY_REQUEST_CODE2);
    }

    @Override
    protected void onResume() {
        club.setText(Clubname);
        super.onResume();
    }
}

