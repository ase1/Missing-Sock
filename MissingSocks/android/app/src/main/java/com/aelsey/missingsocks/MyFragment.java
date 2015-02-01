package com.aelsey.missingsocks;

import android.app.ListFragment;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.aelsey.missingsocks.R;
import java.util.ArrayList;

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


        this.setListAdapter(new ArrayAdapter<String>(getActivity().getApplicationContext(), R.layout.list_row, R.id.sockname,sockName));
        this.setListAdapter(new ArrayAdapter<String>(getActivity().getApplicationContext(), R.layout.list_row, R.id.location,location));
        this.setListAdapter(new ArrayAdapter<String>(getActivity().getApplicationContext(), R.layout.list_row, R.id.submitted,submitted));
        this.setListAdapter(new ArrayAdapter<String>(getActivity().getApplicationContext(), R.layout.list_row, R.id.found,found));
    }

    public void onListItemClick(ListView listView, View view, int position, long id) {

    }
}

