package com.aelsey.missingsocks;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;


public class testimage extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testimage);

        int loader = R.drawable.testsock;
        ImageView image = (ImageView) findViewById(R.id.image);
        String image_url = "http://images.clipartpanda.com/smiley-face-thumbs-up-aiq7yo4iM.jpeg";
        ImageLoader imgLoader = new ImageLoader(getApplicationContext());
        // image_url - is image url path
        // loader - loader image, will be shown before loading image
        // image - is ImageView
        imgLoader.DisplayImage(image_url, loader, image);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_testimage, menu);
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
