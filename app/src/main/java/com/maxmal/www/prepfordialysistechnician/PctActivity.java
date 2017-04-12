package com.maxmal.www.prepfordialysistechnician;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;

public class PctActivity extends AppCompatActivity {

    ArrayList<Word> words  = new ArrayList<Word>(
            Arrays.asList(
                        new Word(R.drawable.hand_wash,R.string.hand_washing,R.string.hand_washing_meaning, R.string.hand_wash_youtube),
                        new Word(R.drawable.dialyzer,R.string.maching_priming,R.string.maching_priming_meaning, R.string.priming_youtube),
                        new Word(R.drawable.phoenix,R.string.phoenix,R.string.phoenix_meaning, R.string.phoenix_youtube),
                        new Word(R.drawable.ppe,R.string.ppe,R.string.ppe_meaning, R.string.ppe_youtube),
                        new Word(R.drawable.needle,R.string.cannulation,R.string.cannulation_meaning, R.string.needle_youtube),
                        new Word(R.drawable.monitoring,R.string.monitoring,R.string.monitoring_meaning, R.string.monitoring_youtube),
                        new Word(R.drawable.rinseback,R.string.washback,R.string.washback_meaning, R.string.rinseback_youtube),
                        new Word(R.drawable.bleach,R.string.bleach,R.string.bleach_meaning, R.string.bleach_youtube)

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

        // set the listview onclicklistener
        pctList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                final Word word = words.get(position);

                //Create customize dialog box
                final Dialog dialog  = new Dialog(PctActivity.this);
                // set the content view to pct_popup layout
                dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog.setContentView(R.layout.pct_popup);

                // set the image to the title icon
                ImageView pctTitleImage  = (ImageView) dialog.findViewById(R.id.pct_popup_title_image);
                pctTitleImage.setImageResource(word.getmImageResourceId());

                // set the text to the title text
                TextView pctTitleText = (TextView) dialog.findViewById(R.id.pct_popup_title_text);
                pctTitleText.setText(word.getmMainWord());

                //set text to the description
                TextView pctPopupDescription = (TextView) dialog.findViewById(R.id.pct_popup_description);
                pctPopupDescription.setText(word.getmMeaningResourceId());

                //cast and find id for the button youtube
                Button youtubeButton = (Button) dialog.findViewById(R.id.youtube);

                //set youtube button onclick listener
                youtubeButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse
                                ("http://www.youtube.com/watch?v="+ getResources().getString(word.getmYoutubeId()))));

                    }
                });


                //cast and find id for the button youtube
                Button closeButton = (Button) dialog.findViewById(R.id.pct_close_popup);

                //set onlick listener for popup close
                closeButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.cancel();
                    }
                });



                //show the custom dialog
                dialog.show();
            }

        });

    }

}
