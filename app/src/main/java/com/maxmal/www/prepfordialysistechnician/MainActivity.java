package com.maxmal.www.prepfordialysistechnician;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //enable upbutton
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);

        // start new activity
        nextActivity();
    }

    public void nextActivity(){
        // find the button with the id "learn"
        Button learnButton =(Button) findViewById(R.id.learn);

        // set onclick listener on the learn button
        learnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            // Start learn activity onclick
            public void onClick(View v) {
                Intent learnIntent = new Intent(MainActivity.this,LearnActivity.class);
                startActivity(learnIntent);
            }
        });

        // find the button with the id test
        Button testButton = (Button) findViewById(R.id.test);

        // set the onclick listener for test button
        testButton.setOnClickListener(new View.OnClickListener() {
            // start the test activity onclick
            @Override
            public void onClick(View v) {
                Intent testIntent = new Intent(MainActivity.this,TestActivity.class);
                startActivity(testIntent);
            }
        });

        // find the button with the id pct
        Button pctButton = (Button) findViewById(R.id.pct);

        //set onclick listener for the button pct
        pctButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // start pct activity onclick
                Intent pctIntent = new Intent(MainActivity.this,PctActivity.class);
                startActivity(pctIntent);
            }
        });
    }
}
