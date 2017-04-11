package com.maxmal.www.prepfordialysistechnician;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class PctActivity extends AppCompatActivity {

    ArrayList<Word> words  = new ArrayList<Word>(
            Arrays.asList(
                        new Word(R.drawable.hand_wash,R.string.hand_washing,R.string.hand_washing_meaning),
                        new Word(R.drawable.dialyzer,R.string.maching_priming,R.string.maching_priming_meaning),
                        new Word(R.drawable.phoenix,R.string.phoenix,R.string.phoenix_meaning),
                        new Word(R.drawable.ppe,R.string.ppe,R.string.ppe_meaning),
                        new Word(R.drawable.needle,R.string.cannulation,R.string.cannulation_meaning),
                        new Word(R.drawable.monitoring,R.string.monitoring,R.string.monitoring_meaning),
                        new Word(R.drawable.rinseback,R.string.washback,R.string.washback_meaning),
                        new Word(R.drawable.bleach,R.string.bleach,R.string.bleach_meaning)

            ));


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pct);

        LinearLayout profile = (LinearLayout) findViewById(R.id.manny_jordan_profile);

        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(PctActivity.this);
                builder.setMessage(R.string.pct_description).setCancelable(false).setPositiveButton("Done", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                AlertDialog alertDialog = builder.create();
                alertDialog.setTitle("Description");
                alertDialog.show();
            }
        });

        //Construct a new Word adapter.
        WordAdapter adapter = new WordAdapter(this,words);

        // Cast and find the listview
        ListView pctList = (ListView) findViewById(R.id.pct_list);

        //set the listView with the new constructed adapter
        pctList.setAdapter(adapter);

    }
}
