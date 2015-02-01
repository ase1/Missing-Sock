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

        this.setListAdapter(new ArrayAdapter<String>(getActivity().getApplicationContext(), R.layout.list_row, R.id.sockname,sockName));
        this.setListAdapter(new ArrayAdapter<String>(getActivity().getApplicationContext(), R.layout.list_row, R.id.location,location));
        this.setListAdapter(new ArrayAdapter<String>(getActivity().getApplicationContext(), R.layout.list_row, R.id.submitted,submitted));
        this.setListAdapter(new ArrayAdapter<String>(getActivity().getApplicationContext(), R.layout.list_row, R.id.found,found));
    }

    public void onListItemClick(ListView listView, View view, int position, long id) {

    }
}

