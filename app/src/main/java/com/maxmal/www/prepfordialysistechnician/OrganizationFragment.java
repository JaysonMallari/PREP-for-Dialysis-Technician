package com.maxmal.www.prepfordialysistechnician;


import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * A simple {@link Fragment} subclass.
 */
public class OrganizationFragment extends Fragment {

    ArrayList<Word> words  = new ArrayList<Word>(
            Arrays.asList(
                    new Word("A",R.string.aakp,R.string.aakp_meaning,R.color.a),
                    new Word("A",R.string.aami,R.string.aami_meaning,R.color.a),
                    new Word("A",R.string.ada,R.string.ada_meaning,R.color.a),
                    new Word("A",R.string.afk,R.string.afk_meaning,R.color.a),
                    new Word("A",R.string.anna,R.string.anna_meaning,R.color.a),
                    new Word("A",R.string.asn,R.string.asn_meaning,R.color.a),

                    new Word("B",R.string.bonent,R.string.bonent_meaning,R.color.b),

                    new Word("C",R.string.cbnt,R.string.cbnt_meaning,R.color.c),
                    new Word("C",R.string.ccht,R.string.ccht_meaning,R.color.c),
                    new Word("C",R.string.ccnt,R.string.ccnt_meaning,R.color.c),
                    new Word("C",R.string.cms,R.string.cms_meaning,R.color.c),

                    new Word("D",R.string.dfc,R.string.dfc_meaning,R.color.d),

                    new Word("F",R.string.fda,R.string.fda_meaning,R.color.f),

                    new Word("K",R.string.kdigo,R.string.kdigo_meaning,R.color.k),
                    new Word("K",R.string.kdoqi,R.string.kdoqi_meaning,R.color.k),

                    new Word("N",R.string.nant,R.string.nant_meaning,R.color.n),
                    new Word("N",R.string.nfa,R.string.nfa_meaning,R.color.n),

                    new Word("P",R.string.pkd,R.string.pkd_meaning,R.color.p),

                    new Word("R",R.string.rpa,R.string.rpa_meaning,R.color.r),
                    new Word("R",R.string.rsn,R.string.rsn_meaning,R.color.r),

                    new Word("U",R.string.unos,R.string.unos_meaning,R.color.u),
                    new Word("U",R.string.usrds,R.string.usrds_meaning,R.color.u)



            ));



    public OrganizationFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       // ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle(R.string.category_organiztions);
       View rootView = inflater.inflate(R.layout.words_list,container, false);

        // call the setNumberAdapter onCreate method
        setLAcronymAdapter(rootView);

        return rootView;
    }

    public void setLAcronymAdapter(View rV){

        // Construct a new word adapter
        WordAdapter adapter  = new WordAdapter(getActivity(), words);

        // cast the listview
        ListView listView = (ListView) rV.findViewById(R.id.list);

        //set the adapter to the listview
        listView.setAdapter(adapter);


        //set the listview items onclick listener
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Word word = words.get(position);

                // convert the position label and description data to string for transfer
                String label = getResources().getString(word.getmMainWord());
                String description = getResources().getString(word.getmMeaningResourceId());

                //get color from the current position
                int color = ContextCompat.getColor(getContext(),word.getmColorResourceId());

                AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                builder.setMessage(description).setCancelable(false).setPositiveButton("Done", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                AlertDialog alertDialog = builder.create();
                alertDialog.setTitle(label);
                alertDialog.show();

                // toast the meaning
                Toast toast = Toast.makeText(getContext(),"You have selected "+ label+ " .",Toast.LENGTH_SHORT);
                toast.show();
            }
        });

    }


}
