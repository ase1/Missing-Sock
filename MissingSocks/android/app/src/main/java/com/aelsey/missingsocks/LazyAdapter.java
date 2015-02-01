package com.aelsey.missingsocks;

import android.widget.BaseAdapter;
import java.util.ArrayList;
import java.util.HashMap;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


public class LazyAdapter extends BaseAdapter {
    private Activity activity;
    private ArrayList<HashMap> data;
    private static LayoutInflater inflater=null;
    //ImageLoaderConfiguration config = new ImageLoaderConfiguration.Builder(this).build();
    //ImageLoader.getInstance().init(config);

    //public ImageLoader imageLoader;
    public LazyAdapter(Activity a, ArrayList<HashMap> d) {
        activity = a;
        data = d;
        inflater = (LayoutInflater)activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        //imageLoader=new ImageLoader(activity.getApplicationContext());
    }

    public int getCount() {
        return data.size();
    }

    public Object getItem(int position) {
        return position;
    }

    public long getItemId(int position) {
        return position;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View vi=convertView;
        if(convertView==null)
            vi = inflater.inflate(R.layout.list_row, null);
        TextView sockname = (TextView)vi.findViewById(R.id.sockname); // title
        TextView location = (TextView)vi.findViewById(R.id.location); // artist name
        TextView submitted = (TextView)vi.findViewById(R.id.submitted); // artist name
        ImageView thumb_image=(ImageView)vi.findViewById(R.id.list_image); // thumb image
        HashMap<String, String> song = new HashMap<String, String>();
        song = data.get(position);
        // Setting all values in listview
        sockname.setText(song.get(CustomizedListView.KEY_SOCKNAME));
        location.setText(song.get(CustomizedListView.KEY_LOCATION));
        submitted.setText(song.get(CustomizedListView.KEY_SUBMITTED));
        //lost/found goes here
        //imageLoader.DisplayImage(song.get(CustomizedListView.KEY_THUMB_URL), thumb_image);
        return vi;
        }
}