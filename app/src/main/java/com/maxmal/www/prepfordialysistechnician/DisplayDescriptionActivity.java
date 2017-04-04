package com.maxmal.www.prepfordialysistechnician;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

public class DisplayDescriptionActivity extends AppCompatActivity {
    private TextView label;
    private TextView description;

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        super.onOptionsItemSelected(item);
        switch (item.getItemId()){
            case android.R.id.home:
                finish();
                break;
        }
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_description);

        // display up button
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);


        // get the textviews ID's on where to display our retrieve data
        label = (TextView) findViewById(R.id.meaning_label);
        description = (TextView)findViewById(R.id.meaning_description);

        // initialize the get intent data
        Intent intent = getIntent();

        // get the string value of the data from our fragments
        int databackground = intent.getIntExtra("background",0);
        String dataLabel = intent.getStringExtra("label");
        String dataDescription = intent.getStringExtra("description");

        // set ttest to out textview using thr retrieve data
        label.setText(String.valueOf(dataLabel));
        label.setBackgroundColor(databackground);
        description.setText(String.valueOf(dataDescription));
    }
}
