package com.aelsey.missingsocks;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.StrictMode;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONException;
import org.json.JSONObject;
import org.xml.sax.InputSource;
import org.xml.sax.XMLReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;


public class add_edit_sock extends ActionBarActivity {

    final Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_edit_sock);

        setTitle("Add/Edit Sock");

        int loader = R.drawable.insert_pic_icon;
        ImageView image = (ImageView) findViewById(R.id.imageButton);
        String image_url = "http://travel.spotcoolstuff.com/wp-content/uploads/2010/12/best-socks-mismatched.jpg";
        ImageLoader imgLoader = new ImageLoader(getApplicationContext());
        // image_url - is image url path
        // loader - loader image, will be shown before loading image
        // image - is ImageView
        imgLoader.DisplayImage(image_url, loader, image);
    }

    public void backToBrowse(View view) {
        Intent intent = new Intent(this, Browse.class);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_add_edit_sock, menu);
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

/*
    public class DownloadTask extends AsyncTask<String, Void, String> {

        @Override
        protected String doInBackground(String... urls) {
            try {
                return loadFromNetwork(urls[0]);
            } catch (IOException e) {
                return "ConnectionError";
            }
        }

        /**
         * Uses the logging framework to display the output of the fetch
         * operation in the log fragment.
         */
        //@Override
        //protected void onPostExecute(String result) {
        //Log.i(TAG, result);
        //}*/
    /*}

    /**
     * Initiates the fetch operation.
     *//*
    public String loadFromNetwork(String urlString) throws IOException {
        InputStream stream = null;
        String str = "";

        try {
            stream = downloadUrl(urlString);
            str = readIt(stream, 500);
        } finally {
            if (stream != null) {
                stream.close();
            }
        }
        return str;
    }

    public void testClick(View v) throws IOException {
        // The code to be executed on click

        EditText date_obj = (EditText) findViewById(R.id.date);
        CharSequence date_val = date_obj.getText();
        System.out.println(date_val);

        Switch switch_obj = (Switch) findViewById(R.id.lostfound);
        Boolean switch_val = switch_obj.isChecked();
        System.out.println(switch_val);

        Spinner university_obj = (Spinner) findViewById(R.id.universities);
        String university_val = university_obj.getSelectedItem().toString();
        System.out.println(university_val);

        Spinner laundryroom_obj = (Spinner) findViewById(R.id.laundryrooms);
        String laundryroom_val = laundryroom_obj.getSelectedItem().toString();
        System.out.println(laundryroom_val);

        RadioGroup radio1_obj = (RadioGroup) findViewById(R.id.radiogroup);
        int selectedId = radio1_obj.getCheckedRadioButtonId();
        View radbutton = findViewById(selectedId);
        String radio1_longstring = radbutton.toString();
        int idx = radio1_longstring.indexOf("id/");
        String radio1_selected = radio1_longstring.substring(idx + 3, radio1_longstring.length() - 1);
        System.out.println(radio1_selected);

        Spinner style_obj = (Spinner) findViewById(R.id.style_dropdown);
        String style_val = style_obj.getSelectedItem().toString();
        System.out.println(style_val);

        Spinner gender_obj = (Spinner) findViewById(R.id.gender_dropdown);
        String gender_val = gender_obj.getSelectedItem().toString();
        System.out.println(gender_val);

        EditText description_obj = (EditText) findViewById(R.id.descriptiontext);
        CharSequence description_val = description_obj.getText();
        System.out.println(description_val);
    }*/
        /*
        URL url;
        HttpURLConnection conn;
        BufferedReader rd;
        String line;
        String urlToRead = "http://www.google.com";
        String result = "";
        try {
            url = new URL(urlToRead);
            conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            while ((line = rd.readLine()) != null) {
                result += line;
            }
            rd.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }*/

    /**
     * Given a string representation of a URL, sets up a connection and gets
     * an input stream.
     *
     * @param urlString A string representation of a URL.
     * @return An InputStream retrieved from a successful HttpURLConnection.
     * @throws java.io.IOException
     *//*
    public InputStream downloadUrl(String urlString) throws IOException {
        // BEGIN_INCLUDE(get_inputstream)
        URL url = new URL(urlString);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setReadTimeout(10000 /* milliseconds */
        //conn.setConnectTimeout(15000 /* milliseconds */);
        //conn.setRequestMethod("GET");
        //conn.setDoInput(true);
        // Start the query
        //conn.connect();
        //InputStream stream = conn.getInputStream();
        //return stream;
        // END_INCLUDE(get_inputstream)
    }

