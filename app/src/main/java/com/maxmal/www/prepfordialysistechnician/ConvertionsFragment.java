package com.maxmal.www.prepfordialysistechnician;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 */
public class ConvertionsFragment extends Fragment {


    public ConvertionsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       // ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle(R.string.category_conversions);
        View rootView = inflater.inflate(R.layout.words_list,container,false);
        return rootView;
    }

}
