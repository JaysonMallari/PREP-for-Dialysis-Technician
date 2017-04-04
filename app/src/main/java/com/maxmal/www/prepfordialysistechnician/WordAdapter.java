package com.maxmal.www.prepfordialysistechnician;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
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

        // Get the {@link AndroidFlavor} object located at this position in the list
        Word currentWord = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView initialTextView = (TextView) listItemView.findViewById(R.id.initial);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        initialTextView.setText(currentWord.getmInitialLetter());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView mainWordTextView = (TextView) listItemView.findViewById(R.id.main_word);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        mainWordTextView.setText(currentWord.getmMainWord());

        // Find the ImageView in the list_item.xml layout with the ID list_item_icon


        //set the theme color for the list item
        //View themeColor = listItemView.findViewById(R.id.list_background_color);
        //find the color that resource ID maps
         int color = ContextCompat.getColor(getContext(),currentWord.getmColorResourceId());
        // set background color of the list view
       // themeColor.setBackgroundColor(color);

        // set color to the initial textview
        initialTextView.setTextColor(color);


        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
