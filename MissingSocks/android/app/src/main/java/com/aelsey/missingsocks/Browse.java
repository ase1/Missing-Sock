package com.aelsey.missingsocks;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;
import org.w3c.dom.Element;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

public class Browse extends ListActivity {
    ListView listView;
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

        listView = (ListView) findViewById(R.id.listView);
        this.setListAdapter(new ArrayAdapter<String>(this, R.layout.list_row, R.id.listView,sockName));

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_browse, menu);
        return true;
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
}
