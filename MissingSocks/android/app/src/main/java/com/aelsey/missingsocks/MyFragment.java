/*package com.aelsey.missingsocks;

import android.app.ListFragment;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.aelsey.missingsocks.R;
import java.util.ArrayList;
import com.aelsey.missingsocks.Sock;

public class MyFragment extends ListFragment {

    public void onActivityCreated(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        
        //get sock info
        ArrayList<String> sockName = new ArrayList<String>();
        sockName.add("White Crew Sock");
        sockName.add("Black Ankle Sock");
        sockName.add("Pink Knee-High Sock");
        sockName.add("Black Crew Sock");
        sockName.add("Brown Ankle Sock");
        sockName.add("White Ankle Sock");
        sockName.add("Multi/Other Crew Sock");
        sockName.add("White Ankle Sock");
        sockName.add("Green Ankle Sock");

        ArrayList<String> location = new ArrayList<String>();
        location.add("Duncan");
        location.add("Hanszen");
        location.add("Will Rice");
        location.add("Will Rice");
        location.add("Baker");
        location.add("Brown");
        location.add("Hanszen");
        location.add("Sid Rich");
        location.add("Baker");
        location.add("Will Rice");

        ArrayList<String> submitted = new ArrayList<String>();
        submitted.add("Submitted 20 minutes ago by Josiah");
        submitted.add("Submitted 4 hours ago by Andrew");
        submitted.add("Submitted 5 hours ago by Matthew");
        submitted.add("Submitted 12 hours ago by Megan");
        submitted.add("Submitted 15 hours ago by Stephenie");
        submitted.add("Submitted 21 hours ago by Lucia");
        submitted.add("Submitted 2 days ago by David");
        submitted.add("Submitted 2 days ago by Aloysius");

        ArrayList<String> found = new ArrayList<String>();
        found.add("Found");
        found.add("Found");
        found.add("Lost");
        found.add("Found");
        found.add("Lost");
        found.add("Lost");
        found.add("Lost");
        found.add("Found");
        found.add("Found");
        found.add("Lost");

        String [][] from = {location.toString(),submitted.toString(),found.toString(),sockName.toString()};
        int [] to = {R.id.location,R.id.subdetails,R.id.found,R.id.sockname};
        for (int i = 1; i<8; i++)
            this.setListAdapter(new ArrayAdapter<String>(getActivity().getApplicationContext(), R.layout.list_row,to,from));
    }

    public void onListItemClick(ListView listView, View view, int position, long id) {

    }
}

*/

package com.aelsey.missingsocks;

import android.app.ListFragment;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

import com.aelsey.missingsocks.R;

import java.util.ArrayList;
import com.aelsey.missingsocks.Sock;

public class MyFragment extends ListFragment {

    public void onActivityCreated(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ArrayList<String> color = new ArrayList<String>();
        color.add("White");
        color.add("Black");
        color.add("Gray");
        color.add("Pink");
        color.add("Black");
        color.add("Brown");
        color.add("White");
        color.add("Multi/Other");
        color.add("White");
        color.add("Green");

        ArrayList<String> style = new ArrayList<String>();
        style.add("Crew Sock");
        style.add("Ankle Sock");
        style.add("Knee-High Sock");
        style.add("Crew Sock");
        style.add("Ankle Sock");
        style.add("Ankle Sock");
        style.add("Crew Sock");
        style.add("Ankle Sock");
        style.add("Crew Sock");
        style.add("Ankle Sock");

        ArrayList<String> location = new ArrayList<String>();
        location.add("Duncan");
        location.add("Hanszen");
        location.add("Will Rice");
        location.add("Will Rice");
        location.add("Baker");
        location.add("Brown");
        location.add("Hanszen");
        location.add("Sid Rich");
        location.add("Baker");
        location.add("Will Rice");

        ArrayList<CharSequence> date = new ArrayList<CharSequence>();
        date.add("20 minutes ago");
        date.add("3 hours ago");
        date.add("4 hours ago");
        date.add("5 hours ago");
        date.add("12 hours ago");
        date.add("12 hours ago");
        date.add("15 hours ago");
        date.add("21 hours ago");
        date.add("2 days ago");
        date.add("2 days ago");

        ArrayList<CharSequence> firstname = new ArrayList<CharSequence>();
        firstname.add("Josiah");
        firstname.add("Andrew");
        firstname.add("Matthew");
        firstname.add("Megan");
        firstname.add("Stephenie");
        firstname.add("Haibo");
        firstname.add("Lily");
        firstname.add("Lucia");
        firstname.add("David");
        firstname.add("Aloysius");

        ArrayList<Boolean> found = new ArrayList<Boolean>();
        for (int i=0; i<10; i++)
            found.add(Math.random()>.5);

        ArrayList<Sock> socks = new ArrayList<Sock>();
        for (int i=0; i<10; i++)
        {
            socks.add(new Sock(date.get(i), found.get(i), "Rice", location.get(i), color.get(i),
                    style.get(i), "", "", new Person(firstname.get(i), "", "", "", true, i, "")));
        }
        ArrayList<String> sockName= new ArrayList<String>();
        ArrayList<String> subDetails= new ArrayList<String>();
        System.out.println("working");
        ArrayList<String> lostfound= new ArrayList<String>();
        for (int i=0;i<10;i++)
        {
            System.out.println(i);
            sockName.add(socks.get(i).sockName().toString());
            subDetails.add(socks.get(i).subDetails().toString());
            if (socks.get(i).getLostFound())
                lostfound.add("Lost");
            else
                lostfound.add("Found");

            //String [] from_vals = {location.get(i).toString(),subDetails.get(i).toString(),lostfound.get(i)toString(),sockName.get(i).toString()};

        }

        int [] to = {R.id.location,R.id.subdetails,R.id.found,R.id.sockname};
        /*for (int i = 1; i<8; i++) {
            this.setListAdapter(new ArrayAdapter<String>(getActivity().getApplicationContext(), R.layout.list_row, to, from_vals[i]));
            mCursor = this.getContentResolver().query(People.CONTENT_URI, null, null, null, null);
            startManagingCursor(mCursor);

            ListAdapter adapter = new SimpleCursorAdapter(
                    this, // Context.
                    android.R.layout.two_line_list_item,  // Specify the row template to use (here, two columns bound to the two retrieved cursor
                    mCursor,                                              // Pass in the cursor to bind to.
            from_vals[i],           // Array of cursor columns to bind to.
            to;

            setListAdapter(adapter);*/

    }


    public void onListItemClick(ListView listView, View view, int position, long id) {

    }
}

