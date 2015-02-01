package com.aelsey.missingsocks;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.*;



public class Browse extends ActionBarActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browse);
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        MyFragment fragment = new MyFragment();
        fragmentTransaction.replace(R.id.listfragment, fragment);
        fragmentTransaction.commit();

        setTitle("Browse Socks");

    }

    public void addASock(View view)
    {
        Intent intent = new Intent(this, add_edit_sock.class);
        startActivity(intent);
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
            case R.id.filterbutton: {
                Intent intent = new Intent(this, Filter.class);
                startActivity(intent);
                return true;
            }
            case R.id.profilebutton: {
                Intent intent = new Intent(this, profile.class);
                startActivity(intent);
                return true;
            }
            default: {
                return false;
            }
        }
    }

}