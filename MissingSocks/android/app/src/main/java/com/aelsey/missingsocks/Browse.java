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

/*
import org.apache.http.Header;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.*;
import com.loopj.android.http.*;
*/


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


        /*try {
            getPublicTimeline();
        }
        catch (Exception ex){
            ex.printStackTrace();
        }*/
    }

    public void addASock(View view)
    {
        Intent intent = new Intent(this, add_edit_sock.class);
        startActivity(intent);
    }


    /*public void getPublicTimeline() throws JSONException {
        RequestParams params = new RequestParams();
        params.put("userId","username");
        TwitterRestClient.post("check/", params, new JsonHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, JSONObject response) {
                System.out.println(statusCode + ">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
                System.out.println(response.toString());
                // If the response is JSONObject instead of expected JSONArray
            }

            @Override
            public void onSuccess(int statusCode, Header[] headers, JSONArray timeline) {
                System.out.println(statusCode + ">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

                System.out.println(timeline.toString());
            }
        });
    }*/


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