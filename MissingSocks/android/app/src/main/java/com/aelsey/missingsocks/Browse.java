package com.aelsey.missingsocks;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.app.ListActivity;
import android.app.ListFragment;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.*;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import com.melnykov.fab.FloatingActionButton;

import java.util.ArrayList;import java.util.Locale;


public class Browse extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browse);
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        MyFragment fragment = new MyFragment();
        fragmentTransaction.replace(R.id.listfragment, fragment);
        fragmentTransaction.commit();

        ListView listView = (ListView) findViewById(android.R.id.list);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.attachToListView(listView);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_browse, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home: {
                finish();
                break;
            }

            default: {
                break;
            }
        }
        return true;
    }

}