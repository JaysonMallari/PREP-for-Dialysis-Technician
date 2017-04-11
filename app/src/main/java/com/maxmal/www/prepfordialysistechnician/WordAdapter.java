package com.maxmal.www.prepfordialysistechnician;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by My__Boo on 4/3/2017.
 */

public class WordAdapter extends ArrayAdapter<Word> {

   // private int mColorResourceId;

    public WordAdapter(Activity context, ArrayList<Word> words){
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.

        super(context,0,words);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_items, parent, false);
        }

        // Get the {@link Word } object located at this position in the list
        Word currentWord = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView initialTextView = (TextView) listItemView.findViewById(R.id.initial);

        //set the textview
        if (currentWord.hasString()){
            // set this text on the name TextView
            initialTextView.setText(currentWord.getmInitialLetter());

            // initialize the color for the list item
            int color = ContextCompat.getColor(getContext(),currentWord.getmColorResourceId());

            //set the color for the initial TextView
            initialTextView.setTextColor(color);

            //make the textview visible
            initialTextView.setVisibility(View.VISIBLE);
        }
        else{
            //make the textview gone
            initialTextView.setVisibility(View.GONE);
        }

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView mainWordTextView = (TextView) listItemView.findViewById(R.id.main_word);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        mainWordTextView.setText(currentWord.getmMainWord());

        // set the imageView if given
        ImageView pctImage = (ImageView) listItemView.findViewById(R.id.pct_image_list);

        //check if given list has image
        if(currentWord.hasImage()){
            //if given then set the image for pctIMage
            pctImage.setImageResource(currentWord.getmImageResourceId());

            //make sure visibility is set to visible
            pctImage.setVisibility(View.VISIBLE);
        }
        else{
            //if there's no image set the visibility to gone
            pctImage.setVisibility(View.GONE);
        }


        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
