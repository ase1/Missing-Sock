package com.aelsey.missingsocks;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.support.v7.app.*;
import android.os.AsyncTask;
import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.ProgressBar;

import com.microsoft.windowsazure.mobileservices.*;

import java.net.MalformedURLException;
import com.google.gson.GsonBuilder;

public class Browse extends ActionBarActivity {
    private MobileServiceClient mClient;
    private MobileServiceTable<Person> personTable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browse);
        try {
            mClient = new MobileServiceClient("https://sockharmony.azure-mobile.net/", "iDufFyBapaBzJKXngUllgyaUoDzhTV32", this);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        MyFragment fragment = new MyFragment();
        fragmentTransaction.replace(R.id.listfragment, fragment);
        fragmentTransaction.commit();

        setTitle("Browse Socks");


        Person adam = new Person("thefirstperson", "Andrew", "Elsey", "ase1@rice.edu", "727-432-0804", true, 5, "google.com");
        Person eve = new Person("thesecondperson", "Andrew", "Elsey", "elsey.andrew@gmail.com", "727-432-0804", true, 5, "aelsey.com");

        mClient.getTable(Person.class).insert(eve, new TableOperationCallback<Person>() {
            public void onCompleted(Person entity, Exception exception, ServiceFilterResponse response) {
                if (exception == null) {
                    System.out.println("SUCCESS");
                } else {
                    System.out.println("Failure.");
                }
            }
        });
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