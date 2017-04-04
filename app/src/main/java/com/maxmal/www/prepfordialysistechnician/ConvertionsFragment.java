package com.maxmal.www.prepfordialysistechnician;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * A simple {@link Fragment} subclass.
 */
public class ConvertionsFragment extends Fragment {

    ArrayList<Word> words  = new ArrayList<Word>(
            Arrays.asList(
                    new Word("L",R.string.length_measures,R.string.length_measures_measurement_meaning,R.color.l),
                    new Word("L",R.string.linear_measures,R.string.linear_measures_measurement_meaning,R.color.l),
                    new Word("L",R.string.liquid_measurement,R.string.liquid_measurement_meaning,R.color.l),

                    new Word("M",R.string.metric_cubic_measures,R.string.metric_liquid_measures_measurement_meaning,R.color.m),
                    new Word("M",R.string.metric_liquid_measures,R.string.metric_liquid_measures_measurement_meaning,R.color.m),
                    new Word("M",R.string.metric_square_measures,R.string.metric_square_measures_measurement_meaning,R.color.m),
                    new Word("L",R.string.metric_weight_measures,R.string.metric_liquid_measures_measurement_meaning,R.color.m),

                    new Word("T",R.string.temp_measures,R.string.temp_measures_measurement_meaning,R.color.t),

                    new Word("W",R.string.weight_measures,R.string.weight_measures_measurement_meaning,R.color.w)

            ));



    public ConvertionsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       // ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle(R.string.category_conversions);
        View rootView = inflater.inflate(R.layout.words_list,container,false);

        // call the setNumberAdapter onCreate method
        setConversionAdapter(rootView);

        return rootView;
    }

    public void setConversionAdapter(View rV){

        // Construct a new word adapter
        WordAdapter adapter  = new WordAdapter(getActivity(), words);

        // cast the listview
        ListView listView = (ListView) rV.findViewById(R.id.list);

        //set the adapter to the listview
        listView.setAdapter(adapter);
    }


}
