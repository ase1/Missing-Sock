package com.aelsey.missingsocks;

import android.app.ListActivity;
import android.app.ActionBar;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import java.util.ArrayList;

public class Browse extends ListActivity implements ActionBar.OnNavigationListener {
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_browse, menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browse);

        //get sock info
        ArrayList<String> sockName = new ArrayList<String>();
        sockName.add("White Crew Sock");
        sockName.add("Black Ankle Sock");
        sockName.add("Pink Knee-High Sock");

        ArrayList<String> location = new ArrayList<String>();
        location.add("Duncan");
        location.add("Hanszen");
        location.add("WRC");

        ArrayList<String> submitted = new ArrayList<String>();
        submitted.add("Submitted today by Roshni");
        submitted.add("Submitted two days ago by Andrew");
        submitted.add("Submitted a week ago by Mohith");

        ArrayList<String> found = new ArrayList<String>();
        found.add("Found");
        found.add("Lost");
        found.add("Lost");
        found.add("Lost");
        found.add("Lost");
        found.add("Lost");
        found.add("Lost");
        found.add("Lost");
        found.add("Lost");
        found.add("Lost");
        found.add("Lost");
        found.add("Lost");
        found.add("Lost");
        found.add("Lost");
        found.add("Lost");

        this.setListAdapter(new ArrayAdapter<String>(this, R.layout.list_row, R.id.sockname,sockName));
        this.setListAdapter(new ArrayAdapter<String>(this, R.layout.list_row, R.id.location,location));
        this.setListAdapter(new ArrayAdapter<String>(this, R.layout.list_row, R.id.submitted,submitted));
        this.setListAdapter(new ArrayAdapter<String>(this, R.layout.list_row, R.id.found,found));
    }




    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onNavigationItemSelected(int i, long l) {
        return true;
    }
}
