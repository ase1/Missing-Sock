package com.aelsey.missingsocks;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.HashMap;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import com.aelsey.missingsocks.LazyAdapter;

public class Browse extends ActionBarActivity {
    // All static variables
    static final String URL = "http://api.androidhive.info/music/music.xml";
    // XML node keys
    static final String KEY_SONG = "song"; // parent node
    static final String KEY_ID = "id";
    static final String KEY_SOCKNAME = "sock name";
    static final String KEY_LOCATION = "location";
    static final String KEY_SUBMITTED = "submitted";
    //static final String KEY_THUMB_URL = "thumb_url";

    ListView listView;
    LazyAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browse);

        //get sock info
        ArrayList<String> sockName = {"White Crew Sock", "Black Ankle Sock", "Pink Knee-High Sock"};
        ArrayList<String> location = {"Duncan", "Hanszen", "WRC"};
        ArrayList<String> submitted = {"Submitted today by Roshni", "Submitted two days ago by Andrew", "Submitted a week ago by Mohith"};
        // looping through
        for (int i = 0; i < sockName.size(); i++) {
            HashMap<String, String> map = new HashMap<String, String>();
            Element e = (Element) nl.item(i);
            // adding each child node to HashMap key > value
            map.put(KEY_ID, parser.getValue(e, KEY_ID));
            map.put(KEY_SOCKNAME, parser.getValue(e, KEY_SOCKNAME));
            map.put(KEY_LOCATION, parser.getValue(e, KEY_LOCATION));
            map.put(KEY_SUBMITTED, parser.getValue(e, KEY_SUBMITTED));
            //map.put(KEY_THUMB_URL, parser.getValue(e, KEY_THUMB_URL));

            // adding HashList to ArrayList
            songsList.add(map);
        }

        listView = (ListView) findViewById(R.id.listView);
        // Getting adapter by passing xml data ArrayList
        adapter=new LazyAdapter(this, songsList);
        listView.setAdapter(adapter);

        // Click event for single list row
        listView.setOnItemClickListener(new OnItemClickListener() {
           @Override
            public void onItemClick(AdapterView<?>parent, View view,int position, long id)
            {
            }
        }
        String[] values = new String[] { "White Crew Sock\nJones Laundry Room\nSubmitted Yesterday", "list item 2"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, values);
        listView.setAdapter(adapter);
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
*/