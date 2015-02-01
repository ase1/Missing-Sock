package com.aelsey.missingsocks;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;

import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONException;
import org.json.JSONObject;


public class add_edit_sock extends ActionBarActivity {

    final Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_edit_sock);
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

    public void testClick(View v) {
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
        View radbutton=  findViewById(selectedId);
        String radio1_longstring = radbutton.toString();
        int idx = radio1_longstring.indexOf("id/");
        String radio1_selected = radio1_longstring.substring(idx+3, radio1_longstring.length() - 1);
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


        JSONObject json = new JSONObject();
        try {
            json.put("someKey", "someValue");
        }
        catch(JSONException e) {
            System.out.println("JSON error");
        }

        HttpClient httpClient = new DefaultHttpClient();

        try {
            HttpPost request = new HttpPost("http://yoururl");
            StringEntity params = new StringEntity(json.toString());
            request.addHeader("content-type", "application/json");
            request.setEntity(params);
            httpClient.execute(request);
        // handle response here...
        } catch (Exception ex) {
            // handle exception here
        } finally {
            httpClient.getConnectionManager().shutdown();
        }

        /*if (date_val == null){
            alertmessage("Blank Date");
        }*/

    }
    /*public void alertmessage(String message) {

        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
                context);

        // set title
        alertDialogBuilder.setTitle("Invalid Input");

        // set dialog message
        alertDialogBuilder
                .setMessage(message)
                .setCancelable(false)
                .setNegativeButton("Ok",new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog,int id) {
                        // if this button is clicked, just close
                        // the dialog box and do nothing
                        dialog.cancel();
                    }
                });

        // create alert dialog
        AlertDialog alertDialog = alertDialogBuilder.create();

        // show it
        alertDialog.show();
    }*/
}
